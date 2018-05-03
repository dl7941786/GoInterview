package com.example.dinglong.gointerview.daggerBase;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by zfl on 2018/5/3.
 */
@Module
public abstract class AppModule {
    @Binds
    abstract Context bindContext(Application application);
}
