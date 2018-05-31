package net.com.netdemo.base;

import android.app.Activity;

/**
 * Created by Administrator on 2018/5/31 0031.
 */

public interface BaseView {
     void showLoading();
     void hideLodoing();
     void failedResult(String s);
     void tokenFaile(Activity activity);
}
