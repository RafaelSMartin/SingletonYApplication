package com.example.singletonyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySingleton.getInstance(this).miMetodoSingleton();
        OtherSingleton.getInstance().miMetodoOtherSingleton();

        String appTagStatic = App.APP_TAG_STATIC;
        String appTag = App.getInstance().getAppTag();
        App.getInstance().setAppTag("OTRO_TAG");

        MySingleton.getInstance(this).setVariable(8);
        int variableMain = MySingleton.getInstance(this).getVariable();


    }
}
