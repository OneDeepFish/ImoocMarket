package com.imooc.imoocmarket;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * author : 3S
 * date : 2019/12/7
 * version: 1.0
 */
public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
