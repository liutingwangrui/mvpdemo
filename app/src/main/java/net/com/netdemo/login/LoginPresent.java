package net.com.netdemo.login;

import android.app.Activity;
import android.widget.Toast;

import net.com.netdemo.base.BasePresent;
import net.com.netdemo.base.BaseResult;
import net.com.netdemo.login.bean.LoginInfo;
import net.com.netdemo.net.BaseExt;
import net.com.netdemo.net.BaseSubscriber;
import net.com.netdemo.net.ResultApi;
import net.com.netdemo.util.ResultStatusUtil;


/**
 * Created by Administrator on 2018/5/31 0031.
 */

public class LoginPresent extends BasePresent<LoginView> {
    private ResultApi resultApi=new ResultApi();
    //登录的方法
    public void login(String userName,String pwd){
        //业务逻辑的处理
        BaseExt.ext(resultApi.loginApi(userName, pwd),new BaseSubscriber<BaseResult<LoginInfo>>(mView){
            @Override
            public void onNext(BaseResult<LoginInfo> loginInfoBaseResult) {
                if (ResultStatusUtil.resultStatus(mView,loginInfoBaseResult.status,loginInfoBaseResult.msg)){//返回true
                    Toast.makeText((Activity)mView,loginInfoBaseResult.msg,Toast.LENGTH_SHORT).show();
                    mView.onLoginResult(loginInfoBaseResult.data);
                }
            }
        });

    }
}
