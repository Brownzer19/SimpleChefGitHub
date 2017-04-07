package com.bignerdranch.android.simplechefgithub;

/**
 * Created by Bradley on 3/29/17.
 */

/**
public class MultipliedFragment {

    private int mrowNumber = 0;
    private int mlastrow = getrow;
    //item, instruction, measurement, title, multipledValue, mmultipledString and quantity declared in another file

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.multiplied_recipe, container, false);

        minstruction.setText(recipe.get(instructions));
        mtitle = setText(recipe.get(Title) + mmultipledString);

        For(mrowNumber <= mlastrow) {

            mitem.setText(recipe.get(Item));
            mmeasurement.setSpinner(recipe.get(measurement));
            mquantity = recipe.get(quantity) * mmultipliedValue;

            mrowNumber = mrowNumber + 1;
        };

        return v;
    };
}
*/