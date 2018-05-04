package com.dl.cn.daggertest;

import com.dl.cn.daggerBase.ActivityScoped;
import com.dl.cn.mvpbase.BasePresenter;


import dagger.Binds;
import dagger.Module;

/**
 * Created by zfl on 2018/5/3.
 */
@Module
public abstract class TestModule {

    @ActivityScoped
    @Binds
    abstract BasePresenter taskPresenter(TestPresenter presenter);
}
