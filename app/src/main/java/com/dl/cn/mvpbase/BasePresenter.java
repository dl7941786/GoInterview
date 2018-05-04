package com.dl.cn.mvpbase;

import com.dl.cn.daggerBase.ActivityScoped;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

/**
 * Created by zfl on 2018/5/4.
 */
public abstract class BasePresenter<T extends MVPView, V extends MVPModel> implements MVPPresenter<T> {

    private WeakReference<T> weakReference;
    public final V model;

    public BasePresenter(V model) {
        this.model = model;
    }

    /**
     * 弱引用与view建立绑定
     *
     * @param t
     */
    public void attach(T t) {
        weakReference = new WeakReference<T>(t);
    }

    /**
     * 弱引用与view解除绑定
     *
     * @param
     */
    public void detach() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    public T getView() {
        return weakReference == null ? null : weakReference.get();
    }

}
