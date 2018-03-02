package com.example.singletonyapplication;

import android.content.Context;

/**
 * Created by Indogroup02 on 02/03/2018.
 */

public class OtherSingleton {

    private static final OtherSingleton instance = new OtherSingleton();

    public static OtherSingleton getInstance() {
        return instance;
    }

    private OtherSingleton() {
    }

    public void miMetodoOtherSingleton(){

    }


}
