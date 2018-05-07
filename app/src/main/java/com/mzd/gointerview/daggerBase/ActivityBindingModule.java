package com.mzd.gointerview.daggerBase;

import com.mzd.gointerview.daggertest.DaggerTestActivity;
import com.mzd.gointerview.daggertest.TestModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by zfl on 2018/5/3.
 */
@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = TestModule.class)
    abstract DaggerTestActivity daggerActivity();
//
//    @ActivityScoped
//    @ContributesAndroidInjector(modules = AddEditTaskModule.class)
//    abstract AddEditTaskActivity addEditTaskActivity();
//
//    @ActivityScoped
//    @ContributesAndroidInjector(modules = StatisticsModule.class)
//    abstract StatisticsActivity statisticsActivity();
//
//    @ActivityScoped
//    @ContributesAndroidInjector(modules = TaskDetailPresenterModule.class)
//    abstract TaskDetailActivity taskDetailActivity();
}
