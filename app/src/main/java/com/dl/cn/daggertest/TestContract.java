package com.dl.cn.daggertest;

import com.dl.cn.mvpbase.MVPModel;
import com.dl.cn.mvpbase.MVPPresenter;
import com.dl.cn.mvpbase.MVPView;

import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

/**
 * Created by zfl on 2018/5/4.
 */

public interface TestContract {
    interface View extends MVPView {
        void loadData(String testBean);

        void onError();
    }

    interface Model extends MVPModel {
        void loadData(Observer<TestBean> observer);
    }

    interface Presenter extends MVPPresenter<View> {

    }
}
