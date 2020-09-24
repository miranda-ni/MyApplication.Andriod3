package com.example.myapplicationandriod3;

import android.app.Application;

import com.example.myapplicationandriod3.data.local.PreferenceUtils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PreferenceUtils.init(this);
    }

}
