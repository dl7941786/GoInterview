package com.example.dinglong.gointerview;

import android.content.Context;
import android.support.multidex.MultiDex;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by dinglong on 2018/5/2.
 * 类说明:
 */

public class App extends DaggerApplication {
    public static App context = null;



    @Override
    public void onCreate() {
        context = this;
        injectModule();
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

    private void injectModule() {

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
