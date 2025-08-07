package com.google.firebase.analytics;

import W3.t;
import a4.C1576m;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.W0;
import com.google.firebase.installations.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.C2651i;

public final class FirebaseAnalytics {

    private static volatile FirebaseAnalytics f18984b;

    private final W0 f18985a;

    public FirebaseAnalytics(W0 w02) {
        C2651i.l(w02);
        this.f18985a = w02;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f18984b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f18984b == null) {
                        f18984b = new FirebaseAnalytics(W0.t(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f18984b;
    }

    public static t getScionFrontendApiImplementation(Context context, Bundle bundle) {
        W0 w0T = W0.t(context, null, null, null, bundle);
        if (w0T == null) {
            return null;
        }
        return new a(w0T);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) C1576m.b(b.l().k(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e8) {
            throw new IllegalStateException(e8.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f18985a.d(activity, str, str2);
    }
}
