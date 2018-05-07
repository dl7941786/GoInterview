package com.mzd.gointerview.daggertest;

import com.mzd.gointerview.daggerBase.ActivityScoped;
import com.mzd.gointerview.mvpbase.BasePresenter;


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
