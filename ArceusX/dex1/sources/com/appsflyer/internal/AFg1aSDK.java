package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public enum AFg1aSDK {
    application,
    activity,
    other;

    public static AFg1aSDK getRevenue(Context context) {
        return context instanceof Activity ? activity : context instanceof Application ? application : other;
    }
}
