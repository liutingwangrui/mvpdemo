package net.com.netdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import net.com.netdemo.util.StatusUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Administrator on 2018/5/31 0031.
 * 基类Activity
 */

public abstract class BaseActivity extends AppCompatActivity {
    public static final CompositeDisposable mDisposables = new CompositeDisposable();

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        StatusUtil.setStatusBarColor(this, android.R.color.white);
        StatusUtil.setStatue(this, true);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    protected abstract void initView();

    protected abstract int getLayoutID();

    @Override
    protected void onDestroy() {
        if (unbinder!=null){
            unbinder.unbind();
            unbinder=null;
        }
        super.onDestroy();
        if (mDisposables!=null){
            mDisposables.clear();
        }

    }
}
