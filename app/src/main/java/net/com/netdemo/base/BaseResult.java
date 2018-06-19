package net.com.netdemo.base;

/**
 * Created by Administrator on 2018/5/31 0031.
 * 基类返回的结果
 */

public class BaseResult<T> {
//    public int status;
    public int code;
    public String msg;
    public T data;
}
