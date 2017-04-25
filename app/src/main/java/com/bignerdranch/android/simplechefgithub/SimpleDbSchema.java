package com.bignerdranch.android.simplechefgithub;

/**
 * Created by Kauff on 4/7/2017.
 */

public class SimpleDbSchema {
    public static final class SimpleTable {
        public static final String NAME = "recipes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String QUANT = "quantity";
            public static final String MEAS = "measurement";
            public static final String INGR = "ingredient";
        }
    }
}
////////////////////////////////////////