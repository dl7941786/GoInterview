package com.mzd.gointerview.daggertest;

import com.mzd.gointerview.mvpbase.MVPModel;
import com.mzd.gointerview.mvpbase.MVPPresenter;
import com.mzd.gointerview.mvpbase.MVPView;

import io.reactivex.Observer;

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
