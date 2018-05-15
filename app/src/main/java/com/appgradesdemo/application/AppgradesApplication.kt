package com.appgradesdemo.application

import android.app.Application
import com.appgradesdemo.R
import io.appgrades.sdk.Appgrades

class AppgradesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Appgrades.run(getString(R.string.appgrades_developer_key), this.getApplicationContext());
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    companion object {

        var instance: AppgradesApplication? = null

        fun get(): AppgradesApplication? {
            return instance
        }
    }
}