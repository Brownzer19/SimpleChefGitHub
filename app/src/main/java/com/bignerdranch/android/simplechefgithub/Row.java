package com.bignerdranch.android.simplechefgithub;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Kauff on 4/7/2017.
 */

// setters and getters for the DB

public class Row {
        private UUID mId;
        private int mQuant;
        private String mIngr;
        private int mMeas;

        public Row() {
            // Generate unique identifier
            this(UUID.randomUUID());
        }

        public Row(UUID id) {
            mId = id;
        }

        public UUID getId() {
            return mId;
        }

        public String getIngr() {
            return mIngr;
        }

        public void setIngr(String ingr) {
            mIngr = ingr;
        }

        public int getMeas() {
            return mMeas;
        }

        public void setMeas(int meas) {
            mMeas = meas;
        }

        public int getQuant() {
            return mQuant;
        }

        public void setQuant(int quant){
            mQuant = quant;
        }

    }
////////////////////////////////////////////