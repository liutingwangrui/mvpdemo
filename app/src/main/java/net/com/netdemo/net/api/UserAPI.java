package net.com.netdemo.net.api;

import net.com.netdemo.base.BaseResult;
import net.com.netdemo.login.bean.LoginInfo;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/5/31 0031.
 * API
 */

public interface UserAPI {

    //登录
    @FormUrlEncoded
    @POST("app/login")
//    @POST("Api/AppCrmServer/login")
    Observable<BaseResult<LoginInfo>> login(@FieldMap HashMap<String ,String> hashMap);
}
