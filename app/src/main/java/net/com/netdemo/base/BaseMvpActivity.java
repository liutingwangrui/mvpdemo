package net.com.netdemo.base;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import net.com.netdemo.MainActivity;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public abstract class BaseMvpActivity<T extends BasePresent> extends BaseActivity implements BaseView {
    /**
     * 显示加载对话框
     */
    @Override
    public void showLoading() {

    }

    /**
     * 隐藏加载对话框
     */
    @Override
    public void hideLodoing() {

    }

    /**
     * 失败回调
     * @param s
     */
    @Override
    public void failedResult(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }

    /**
     * token失效
     */
    @Override
    public void tokenFaile( Activity activity) {
        //跳转到登陆界面
        startActivity(new Intent(activity, MainActivity.class));
        activity.finish();

    }



}
