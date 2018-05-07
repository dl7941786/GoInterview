package com.mzd.gointerview.mvpbase;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

/**
 * Created by zfl on 2018/5/4.
 */

public abstract class BaseActivity<T extends BasePresenter> extends DaggerActivity implements MVPView {

    @Inject
    public T presenter;//弱引用

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attach(this);//弱引用建立连接
    }

    /**
     * 在退出时 和 activity 剥离了
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }
}
