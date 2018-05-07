package com.mzd.gointerview.net;

import com.mzd.gointerview.daggertest.TestBean;

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
