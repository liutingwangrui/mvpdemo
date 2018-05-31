package net.com.netdemo.net;

import net.com.netdemo.base.BaseResult;
import net.com.netdemo.login.bean.LoginInfo;
import net.com.netdemo.net.api.UserAPI;

import java.util.HashMap;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public class ResultApi {
    //登录
    public Observable<BaseResult<LoginInfo>> loginApi(String userName, String pwd){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("user_name",userName);
//        hashMap.put("username",userName);
        hashMap.put("password",pwd);
       return RetrofitFactory.getInstance().create(UserAPI.class).login(hashMap);
    }
}
