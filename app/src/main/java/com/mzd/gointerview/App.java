package com.mzd.gointerview;

import android.content.Context;
import android.support.multidex.MultiDex;


import com.mzd.gointerview.daggerBase.DaggerAppComponent;

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
        super.onCreate();
        context = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
