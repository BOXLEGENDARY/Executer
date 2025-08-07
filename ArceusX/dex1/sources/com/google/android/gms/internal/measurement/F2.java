package com.google.android.gms.internal.measurement;

import android.net.Uri;
import g0.C2457a;

public final class F2 {

    private static final C2457a<String, Uri> f14718a = new C2457a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        try {
            C2457a<String, Uri> c2457a = f14718a;
            uri = c2457a.get("com.google.android.gms.measurement");
            if (uri == null) {
                String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
                c2457a.put("com.google.android.gms.measurement", uri);
            }
        } catch (Throwable th) {
            throw th;
        }
        return uri;
    }
}
