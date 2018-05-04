package com.dl.cn.net;

import com.dl.cn.daggertest.TestBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zfl on 2018/5/4.
 */

public interface Api {
    @GET("getIpInfo.php")
    Observable<TestBean> getIPInfo(@Query("ip")String ip);
}
