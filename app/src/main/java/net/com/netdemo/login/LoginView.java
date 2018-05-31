package net.com.netdemo.login;

import net.com.netdemo.base.BaseView;
import net.com.netdemo.login.bean.LoginInfo;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public interface LoginView extends BaseView {
     void onLoginResult(LoginInfo loginInfo);
     void onListener(boolean isClick);
}
