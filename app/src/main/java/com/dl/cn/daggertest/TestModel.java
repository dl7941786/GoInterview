package com.dl.cn.daggertest;


import com.dl.cn.daggerBase.ActivityScoped;
import com.dl.cn.net.Api;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by zfl on 2018/5/4.
 */
@ActivityScoped
public class TestModel implements TestContract.Model {
    @Inject
    public TestModel() {
    }

    @Override
    public void loadData(Observer<TestBean> observer) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://ip.taobao.com/service/")
                .client(new OkHttpClient().newBuilder().build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Observable<TestBean> ipInfo = api.getIPInfo("202.202.32.202");
        ipInfo.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);


    }
}
