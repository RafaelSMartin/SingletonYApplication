package com.example.singletonyapplication;

import android.content.Context;

/**
 * Created by Indogroup02 on 02/03/2018.
 */

public class MySingleton {

    private static MySingleton instance;
//    private Context context;
    private int variable;


    public static synchronized MySingleton getInstance(Context context){
        if (instance == null)
            instance = new MySingleton(context.getApplicationContext());
//            instance = new MySingleton(context);

        return instance;
    }

    private MySingleton(Context context){
        // Use context to initialize the variables.
//        this.context = context;
    }

    public void miMetodoSingleton(){

    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}
