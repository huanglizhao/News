package com.example.administrator.xutilsdemo.app;

import android.app.Application;

import org.xutils.x;

/**
 * l类描述
 * 创建人：黄礼钊
 * 时间：$data$ $time$
 */,

public class XutilsAcitivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
