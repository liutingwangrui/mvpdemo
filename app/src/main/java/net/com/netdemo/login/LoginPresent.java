package net.com.netdemo.login;

import android.app.Activity;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.com.netdemo.R;
import net.com.netdemo.base.BasePresent;
import net.com.netdemo.base.BaseResult;
import net.com.netdemo.login.bean.LoginInfo;
import net.com.netdemo.net.BaseExt;
import net.com.netdemo.net.BaseSubscriber;
import net.com.netdemo.net.ResultApi;
import net.com.netdemo.util.ResultStatusUtil;


/**
 * Created by Administrator on 2018/5/31 0031.
 * 登录的P层
 */

public class LoginPresent extends BasePresent<LoginView> {
    private ResultApi resultApi=new ResultApi();
    public static boolean isClick;
    /**
     * 登录按钮颜色的改变
     */
    public void checkInfo(final EditText editUSER, final EditText editPWD, final Button button){
        check(editPWD.getText().toString(),editPWD.getText().toString());
        editPWD.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editPWD.getText().toString().length()>0&&editUSER.getText().toString().length()>0){
                    button.setBackgroundColor(Color.RED);
                    mView.onListener(true);
                }else{
                    button.setBackgroundColor(Color.WHITE);
                    mView.onListener(false);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void check(String user, String pwd) {

    }


    //登录的方法
    public void login(String userName,String pwd){
        //业务逻辑的处理
        BaseExt.ext(resultApi.loginApi(userName, pwd),new BaseSubscriber<BaseResult<LoginInfo>>(mView){
            @Override
            public void onNext(BaseResult<LoginInfo> loginInfoBaseResult) {
                if (ResultStatusUtil.resultStatus(mView,loginInfoBaseResult.code,loginInfoBaseResult.msg)){//返回true
                    Toast.makeText((Activity)mView,loginInfoBaseResult.msg,Toast.LENGTH_SHORT).show();
                    mView.onLoginResult(loginInfoBaseResult.data);
                }
            }
        });

    }

}
