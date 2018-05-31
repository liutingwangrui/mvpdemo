package net.com.netdemo;

import net.com.netdemo.base.BaseMvpActivity;
import net.com.netdemo.login.LoginPresent;
import net.com.netdemo.login.LoginView;
import net.com.netdemo.login.bean.LoginInfo;

public class MainActivity extends BaseMvpActivity<LoginPresent> implements LoginView {
    private LoginPresent loginPresent=new LoginPresent();

    @Override
    protected void initView() {
        loginPresent.mView=this;
        loginPresent.login("testzy","123456");

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    /**
     * 数据返回结构的处理
     * @param loginInfo
     */
    @Override
    public void onLoginResult(LoginInfo loginInfo) {
            //登录成功后逻辑的处理
    }





}
