package net.com.netdemo.net;

import net.com.netdemo.base.BaseActivity;
import net.com.netdemo.base.BaseView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public class BaseSubscriber<T> implements Observer<T> {
    private BaseView mBaseView;
    public BaseSubscriber(BaseView baseView) {
        this.mBaseView=baseView;
    }

    @Override
    public void onSubscribe(Disposable d) {
        BaseActivity.mDisposables.add(d);

    }

    @Override
    public void onNext(T t) {
    }

    @Override
    public void onError(Throwable e) {
        mBaseView.hideLodoing();
        mBaseView.failedResult(e.getMessage());

    }

    @Override
    public void onComplete() {
        mBaseView.hideLodoing();

    }
}
