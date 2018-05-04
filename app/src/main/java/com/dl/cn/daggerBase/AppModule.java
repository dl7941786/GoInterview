package com.dl.cn.daggerBase;

import android.app.Application;
import android.content.Context;

import com.dl.cn.daggertest.TestModel;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by zfl on 2018/5/3.
 */
@Module
public abstract class AppModule {
    @Binds
    abstract Context bindContext(Application application);
//
//    @Provides
//    @Singleton
//    static TestModel attachModel() {
//        return new TestModel();
//    }
}
