package com.mzd.gointerview.mvpbase;

/**
 * Created by zfl on 2018/5/4.
 */

public interface MVPPresenter<T> {
    void attach(T view);

    void detach();
}
