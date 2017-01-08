package com.coolweather.android.collection.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/1/8.
 */

public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
