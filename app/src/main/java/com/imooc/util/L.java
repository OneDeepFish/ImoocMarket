package com.imooc.util;

import android.util.Log;

import com.imooc.imoocmarket.BuildConfig;

/**
 * author : 3S
 * date : 2019/12/5
 * version: 1.0
 */
public class L {
    private static boolean isDebug = BuildConfig.DEBUG;

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d( tag, msg );
        }
    }
}
