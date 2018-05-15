package com.appgradesdemo.application;

import android.app.Application;

import com.appgradesdemo.R;

import io.appgrades.sdk.Appgrades;

public class AppgradesApplicationInJava extends Application {

    public static AppgradesApplicationInJava instance;

    @Override
    public void onCreate() {
        super.onCreate();
        Appgrades.run(getString(R.string.appgrades_developer_key), this.getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static AppgradesApplicationInJava get() {
        return instance;
    }
}
