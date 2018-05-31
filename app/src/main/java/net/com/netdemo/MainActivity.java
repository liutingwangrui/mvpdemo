package net.com.netdemo;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.com.netdemo.base.BaseMvpActivity;
import net.com.netdemo.login.LoginPresent;
import net.com.netdemo.login.LoginView;
import net.com.netdemo.login.bean.LoginInfo;

import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<LoginPresent> implements LoginView {
    @BindView(R.id.editUSER)
    EditText editUSER;
    @BindView(R.id.editPWD)
    EditText editPWD;
    @BindView(R.id.but)
    Button button;

    private LoginPresent loginPresent=new LoginPresent();

    @Override
    protected void initView() {
        loginPresent.mView=this;
        loginPresent.checkInfo(editUSER, editPWD, button);

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

    @Override
    public void onListener(final boolean isClick) {
        Log.e("zzzzzzzzzzzzz",isClick+"---------");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isClick) {
                        loginPresent.login(editUSER.getText().toString(), editPWD.getText().toString());
                    }
                }
            });

    }


}
