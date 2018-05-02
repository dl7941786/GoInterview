package com.example.dinglong.gointerview;


import android.support.multidex.MultiDexApplication;

/**
 * author zfl
 * Created by zfl on 2018/4/26.
 */

public class BaseApp extends MultiDexApplication {
    public static BaseApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
