package com.appgradesdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.appgradesdemo.R;

import io.appgrades.sdk.Appgrades;
import io.appgrades.sdk.core.logger.LogLevel;

public class MainActivityInJava extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Appgrades.logger.setLogLevel(LogLevel.VERBOSE);
        Appgrades.logger.setLogLevel(LogLevel.INFO);
        Appgrades.logger.setLogLevel(LogLevel.WARNING);
        Appgrades.logger.setLogLevel(LogLevel.ERROR);
        Appgrades.logger.setLogLevel(LogLevel.NONE);
    }
}
