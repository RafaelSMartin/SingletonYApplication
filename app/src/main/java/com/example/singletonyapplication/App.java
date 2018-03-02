package com.example.singletonyapplication;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Podriamos usarla para inicializar
 * Algun handler para que use SharedPrefences
 */

public class App extends MultiDexApplication {

    private static App instance;
    public static String APP_TAG_STATIC ="APP_TAG_STATIC";
    private static String APP_TAG = "APP_TAG";

    public static App getInstance(){
        return  instance;
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;

        initSomething();
    }

    private void initSomething(){
//        something.sdkInit();
    }

    public String getAppTag() {
        return APP_TAG;
    }

    public void setAppTag(String appTag) {
        APP_TAG = appTag;
    }




}
