package com.birbit.android.jobqueue.network;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface NetworkUtil {
    public static final int DISCONNECTED = 0;
    public static final int METERED = 1;
    public static final int UNMETERED = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkStatus {
    }

    int getNetworkStatus(Context context);
}
