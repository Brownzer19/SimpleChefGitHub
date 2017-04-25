package com.bignerdranch.android.simplechefgithub.Helper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Bradley on 4/19/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = DatabaseHelper.class.getName();

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "contactsManager";

    // Table STORAGE
    private static final String TABLE_STORAGE = "storage";

    // STORAGE TABLE - column names
    private static final String KEY_RECIPE_NAME = "recipe_name";
    private static final String KEY_ROW_ID = "row_id";
    private static final String KEY_QUANTITY = "quantity";
    private static final String KEY_MEASUREMENT = "measurement";
    private static final String KEY_INGREDIENT = "ingredient";
    private static final String KEY_TABLE_ID = "table_id";

    // Table Create Statements
    // STORAGE table create statement
    private static final String CREATE_TABLE_STORAGE = "CREATE TABLE "
            + TABLE_STORAGE + "(" + KEY_TABLE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_RECIPE_NAME + " STRING," + KEY_ROW_ID
            + " INTEGER," + KEY_QUANTITY + " INTEGER," + KEY_MEASUREMENT
            + " STRING," + KEY_INGREDIENT + " STRING" + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_STORAGE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STORAGE);

        // create new tables
        onCreate(db);
    }

    // ------------------------ "instructions" table methods ----------------//

    /**
     * Creating a recipe in the database
     */
    public long createRecipe(Storage storage/*, long[] row_ids*/) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RECIPE_NAME, storage.getRecipe_name());
        values.put(KEY_ROW_ID, storage.getRow_id());
        values.put(KEY_QUANTITY, storage.getQuantity());
        values.put(KEY_MEASUREMENT, storage.getMeasurement());
        values.put(KEY_INGREDIENT, storage.getIngredient());
        values.put(KEY_TABLE_ID, storage.getTable_id());

        // insert row
        long row_id = db.insert(TABLE_STORAGE, null, values);

        // insert recname_ids
      //  for (long recname_id : row_ids) {
    //        createTodoTag(instruction_id, recname_id);
  //      }
//
        //return instruction_id;
        return row_id;
    }

    /**
     * get single recinstruction
     */
    public Storage getStorage(long table_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectRowQuery = "SELECT  * FROM " + TABLE_STORAGE + " WHERE "
                + KEY_TABLE_ID + " = " + table_id;

        Log.e(LOG, selectRowQuery);

        Cursor c = db.rawQuery(selectRowQuery, null);

        if (c != null)
            c.moveToFirst();

        Storage st = new Storage();
        st.setRecipe_name(c.getString(c.getColumnIndex(KEY_RECIPE_NAME)));
        st.setRow_id((c.getInt(c.getColumnIndex(KEY_ROW_ID))));
        st.setQuantity(c.getInt(c.getColumnIndex(KEY_QUANTITY)));
        st.setMeasurement(c.getString(c.getColumnIndex(KEY_MEASUREMENT)));
        st.setIngredient(c.getString(c.getColumnIndex(KEY_INGREDIENT)));
        st.setTable_id(c.getInt(c.getColumnIndex(KEY_TABLE_ID)));

        return st;
    }
/* which one do I need?
    public Storage getStorage(long name_recipe) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectNameQuery = "SELECT * FROM " + TABLE_STORAGE + " WHERE "
                + KEY_RECIPE_NAME + " = " + name_recipe;

        Log.e(LOG, selectNameQuery);

        Cursor w = db.rawQuery(selectNameQuery, null);

        if (w != null)
            w.moveToFirst();

        Storage ge = new Storage();
        ge.setRecipe_name(w.getString(w.getColumnIndex(KEY_RECIPE_NAME)));
        ge.setRow_id((w.getInt(w.getColumnIndex(KEY_ROW_ID))));
        ge.setQuantity(w.getInt(w.getColumnIndex(KEY_QUANTITY)));
        ge.setMeasurement(w.getString(w.getColumnIndex(KEY_MEASUREMENT)));
        ge.setIngredient(w.getString(w.getColumnIndex(KEY_INGREDIENT)));

        return ge;
    }
*/
    /**
     * getting all recipes
     * */
    public List<Storage> getAllStorage() {
        List<Storage> storage = new ArrayList<Storage>();
        String selectQuery = "SELECT  * FROM " + TABLE_STORAGE;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Storage st = new Storage();
                st.setRecipe_name(c.getString(c.getColumnIndex(KEY_RECIPE_NAME)));
                st.setRow_id((c.getInt(c.getColumnIndex(KEY_ROW_ID))));
                st.setQuantity(c.getInt(c.getColumnIndex(KEY_QUANTITY)));
                st.setMeasurement(c.getString(c.getColumnIndex(KEY_MEASUREMENT)));
                st.setIngredient(c.getString(c.getColumnIndex(KEY_INGREDIENT)));
                st.setTable_id(c.getInt(c.getColumnIndex(KEY_TABLE_ID)));

                // adding to recinstruction list
                storage.add(st);
            } while (c.moveToNext());
        }

        return storage;
    }

    /**
     * getting all rows under recipe
     * */
    public List<Storage> getAllRowsByRecipe(String recipe_name) {
        List<Storage> storage = new ArrayList<Storage>();

        String selectQuery = "SELECT  * FROM " + TABLE_STORAGE + " st."
                + KEY_RECIPE_NAME + " = " + recipe_name + "rn";

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Storage st = new Storage();
                st.setRecipe_name(c.getString(c.getColumnIndex(KEY_RECIPE_NAME)));
                st.setRow_id((c.getInt(c.getColumnIndex(KEY_ROW_ID))));
                st.setQuantity(c.getInt(c.getColumnIndex(KEY_QUANTITY)));
                st.setMeasurement(c.getString(c.getColumnIndex(KEY_MEASUREMENT)));
                st.setIngredient(c.getString(c.getColumnIndex(KEY_INGREDIENT)));
                st.setTable_id(c.getInt(c.getColumnIndex(KEY_TABLE_ID)));

                // adding to recinstruction list
                storage.add(st);
            } while (c.moveToNext());
        }

        return storage;
    }

    /**
     * getting recinstruction count
     */
/*
    public int getRecInstructionCount() {
        String countQuery = "SELECT  * FROM " + TABLE_RECINSTRUCTIONS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();

        // return count
        return count;
    }
*/
    /**
     * Updating a recipe
     */
    public int updateStorage(Storage storage) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RECIPE_NAME, storage.getRecipe_name());
        values.put(KEY_ROW_ID, storage.getRow_id());
        values.put(KEY_QUANTITY, storage.getQuantity());
        values.put(KEY_MEASUREMENT, storage.getMeasurement());
        values.put(KEY_INGREDIENT, storage.getIngredient());

        // updating row
        return db.update(TABLE_STORAGE, values, KEY_TABLE_ID + " = ?",
                new String[] { String.valueOf(storage.getTable_id()) });
    }

    /**
     * Deleting a recinstruction
     */
    public void deleteStorage(long table_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_STORAGE, table_id + " = ?",
                new String[] { String.valueOf(table_id) });
    }

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }

    // ------------------------ "recnames" table methods ----------------//

    /**
     * Creating tag
     */
/*
    public long createTag(Tag tag) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RECNAME_NAME, tag.getTagName());
        values.put(KEY_CREATED_AT, getDateTime());

        // insert row
        long recname_id = db.insert(TABLE_RECNAME, null, values);

        return recname_id;
    }
*/
    /**
     * getting all recname
     * */
/*
    public List<Tag> getAllRecNames() {
        List<Tag> recnames = new ArrayList<Tag>();
        String selectQuery = "SELECT  * FROM " + TABLE_RECNAME;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Tag t = new Tag();
                t.setId(c.getInt((c.getColumnIndex(KEY_ID))));
                t.setTagName(c.getString(c.getColumnIndex(KEY_RECNAME_NAME)));

                // adding to recnames list
                recnames.add(t);
            } while (c.moveToNext());
        }
        return recnames;
    }
*/
    /**
     * Updating a tag
     */
/*
    public int updateTag(Tag tag) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RECNAME_NAME, tag.getTagName());

        // updating row
        return db.update(TABLE_RECNAME, values, KEY_ID + " = ?",
                new String[] { String.valueOf(tag.getId()) });
    }
*/
    /**
     * Deleting a tag
     */
/*
    public void deleteTag(Tag tag, boolean should_delete_all_tag_todos) {
        SQLiteDatabase db = this.getWritableDatabase();

        // before deleting tag
        // check if instructions under this tag should also be deleted
        if (should_delete_all_tag_todos) {
            // get all instructions under this tag
            List<RecInstruction> allTagInstructions = getAllInstructionsByTag(tag.getTagName());

            // delete all instructions
            for (RecInstruction recinstruction : allTagInstructions) {
                // delete recinstruction
                deleteRecInstruction(recinstruction.getId());
            }
        }

        // now delete the tag
        db.delete(TABLE_RECNAME, KEY_ID + " = ?",
                new String[] { String.valueOf(tag.getId()) });
    }
*/
    // ------------------------ "recinstructions_recnames" table methods ----------------//

    /**
     * Creating todo_tag
     */
/*
    public long createTodoTag(long instruction_id, long recname_id) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_INSTRUCTION_ID, instruction_id);
        values.put(KEY_RECNAME_ID, recname_id);
        values.put(KEY_CREATED_AT, getDateTime());

        long id = db.insert(TABLE_RECINSTRUCTION_RECNAME, null, values);

        return id;
    }
*/
    /**
     * Updating a recinstruction tag
     */
/*
    public int updateNoteTag(long id, long recname_id) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_RECNAME_ID, recname_id);

        // updating row
        return db.update(TABLE_RECINSTRUCTIONS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
    }
*/
    /**
     * Deleting a recinstruction tag
     */
/*
    public void deleteRecInstructionTag(long id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_RECINSTRUCTIONS, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
    }

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
*/
    /**
     * get datetime
     * */
/*
    private String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }
*/
}