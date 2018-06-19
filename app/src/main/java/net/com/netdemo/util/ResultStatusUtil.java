package net.com.netdemo.util;

import android.app.Activity;

import net.com.netdemo.base.BaseView;

/**
 * Created by Administrator on 2018/5/31 0031.
 * 返回结果处理的封装
 */

public class ResultStatusUtil {
    public static boolean resultStatus(BaseView mView, int status, String msg){
        if (status==200){
           return true;
        }
        if (status==0){
            mView.failedResult(msg);
            return false;
        }
        if (status==-1){
            mView.tokenFaile((Activity)mView);
            return false;
        }
      return false;
    }
}
