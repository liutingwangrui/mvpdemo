package net.com.netdemo.net.api;

import net.com.netdemo.base.BaseResult;
import net.com.netdemo.login.bean.LoginInfo;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public interface UserAPI {
//    @POST("Api/AppCrmServer/login")
    @POST("app/login")
    Observable<BaseResult<LoginInfo>> login(@Body HashMap<String, String> hashMap);
}
