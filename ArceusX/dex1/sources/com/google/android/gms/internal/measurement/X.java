package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

public final class X {

    private static final Method f15071a;

    private static final Method f15072b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        f15071a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f15072b = declaredMethod2;
    }

    public static int a(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.X.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
