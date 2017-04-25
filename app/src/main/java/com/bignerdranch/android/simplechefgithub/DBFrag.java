package com.bignerdranch.android.simplechefgithub;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Bradley on 4/7/17.
 */

public class DBFrag {
    private Context mContext; ///
    private SQLiteDatabase mDatabase; ///

    //
    private DBFrag(Context context) { ///
        mContext = context.getApplicationContext(); ///
        mDatabase = new SimpleBaseHelper(mContext) ///
                .getWritableDatabase(); ///
    } ///

    private static ContentValues getContentValues(Row row) { ///
        ContentValues values = new ContentValues(); ///
        values.put(SimpleDbSchema.SimpleTable.Cols.UUID, row.getId().toString()); ///
        values.put(SimpleDbSchema.SimpleTable.Cols.INGR, row.getIngr()); ///
        values.put(SimpleDbSchema.SimpleTable.Cols.MEAS, row.getMeas()); ///
        values.put(SimpleDbSchema.SimpleTable.Cols.QUANT, row.getQuant()); ///

        return values; ///
    } ///

    public void addRow(Row r) { ///
        ContentValues values = getContentValues(r); ///

        mDatabase.insert(SimpleDbSchema.SimpleTable.NAME, null, values); ///
    } ///

    public void updateRow(Row row) { ///
        String uuidString = row.getId().toString(); ///
        ContentValues values = getContentValues(row); ///

        mDatabase.update(SimpleDbSchema.SimpleTable.NAME, values, ///
                SimpleDbSchema.SimpleTable.Cols.UUID + " = ?", ///
                new String[] {uuidString}); ///
    } ///

}
