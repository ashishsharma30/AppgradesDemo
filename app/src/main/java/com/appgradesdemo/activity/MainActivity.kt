package com.appgradesdemo.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.appgradesdemo.R
import io.appgrades.sdk.Appgrades
import io.appgrades.sdk.core.logger.LogLevel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Appgrades.logger.setLogLevel(LogLevel.VERBOSE);
        Appgrades.logger.setLogLevel(LogLevel.INFO);
        Appgrades.logger.setLogLevel(LogLevel.WARNING);
        Appgrades.logger.setLogLevel(LogLevel.ERROR);
        Appgrades.logger.setLogLevel(LogLevel.NONE);
    }
}
