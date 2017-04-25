package com.bignerdranch.android.simplechefgithub.Helper;

import java.sql.RowId;

/**
 * Created by Bradley on 4/19/17.
 */

public class Storage {

    String recipe_name;
    int row_id;
    int quantity;
    String measurement;
    String ingredient;
    int table_id;

    //constructors
    public Storage() {
    }

    public Storage(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public Storage(String recipe_name, int row_id) {
        this.recipe_name = recipe_name;
        this.row_id = row_id;
    }

    public Storage(String recipe_name, int row_id, int quantity) {
        this.recipe_name = recipe_name;
        this.row_id = row_id;
        this.quantity = quantity;
    }

    public Storage(String recipe_name, int row_id, int quantity,
                   String measurement) {
        this.recipe_name = recipe_name;
        this.row_id = row_id;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public Storage(String recipe_name, int row_id, int quantity,
                   String measurement, String ingredient) {
        this.recipe_name = recipe_name;
        this.row_id = row_id;
        this.quantity = quantity;
        this.measurement = measurement;
        this.ingredient = ingredient;
    }

    public Storage(String recipe_name, int row_id, int quantity,
                   String measurement, String ingredient, int table_id) {
        this.recipe_name = recipe_name;
        this.row_id = row_id;
        this.quantity = quantity;
        this.measurement = measurement;
        this.ingredient = ingredient;
        this.table_id = table_id;
    }

    //setters
    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public void setRow_id(int row_id) {
        this.row_id = row_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    //getters
    public String getRecipe_name() {
        return recipe_name;
    }

    public int getRow_id() {
        return row_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasurement() {
        return measurement;
    }

    public String getIngredient() {
        return ingredient;
    }

    public int getTable_id() {
        return table_id;
    }
}
/*
public class RecName {

    int id;
    String name;
    int status;
    String created_at;

    //constructors
    public RecName() {
    }

    public RecName(String name, int status) {
        this.name = name;
        this.status = status;
    }

    public RecName(int id, String name, int status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    //getters
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getStatus() {
        return this.status;
    }
}
*/
