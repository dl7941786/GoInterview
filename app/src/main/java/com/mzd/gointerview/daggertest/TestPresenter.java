package com.mzd.gointerview.daggertest;


import com.mzd.gointerview.daggerBase.ActivityScoped;
import com.mzd.gointerview.mvpbase.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 *
 * Created by zfl on 2018/5/4.
 */
@ActivityScoped
public class TestPresenter extends BasePresenter<TestContract.View, TestContract.Model> implements TestContract.Presenter {


    @Inject
    public TestPresenter(TestModel model) {
        super(model);
    }

    public void getData() {
        //请求数据的方法
        try {
            model.loadData(new Observer<TestBean>(){

                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(TestBean s) {
                    getView().loadData(s.getData().getCountry());
                }

                @Override
                public void onError(Throwable e) {
                }

                @Override
                public void onComplete() {

                }
            });
        } catch (Exception e) {
            getView().onError();//出现异常告诉视图
        }
    }

}
