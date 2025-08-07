package com.google.firebase.iid;

import a4.C1574k;
import android.text.TextUtils;
import g0.C2457a;
import java.util.Map;

final class n {

    private int f19061a = 0;

    private final Map<Integer, C1574k<Void>> f19062b = new C2457a();

    private final k f19063c;

    n(k kVar) {
        this.f19063c = kVar;
    }

    private static boolean c(com.google.firebase.iid.FirebaseInstanceId r6, java.lang.String r7) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n.c(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }

    private final String d() {
        String strB;
        synchronized (this.f19063c) {
            strB = this.f19063c.b();
        }
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        String[] strArrSplit = strB.split(",");
        if (strArrSplit.length <= 1 || TextUtils.isEmpty(strArrSplit[1])) {
            return null;
        }
        return strArrSplit[1];
    }

    private final synchronized boolean e(String str) {
        synchronized (this.f19063c) {
            try {
                String strB = this.f19063c.b();
                String strValueOf = String.valueOf(str);
                if (!strB.startsWith(strValueOf.length() != 0 ? ",".concat(strValueOf) : new String(","))) {
                    return false;
                }
                String strValueOf2 = String.valueOf(str);
                this.f19063c.d(strB.substring((strValueOf2.length() != 0 ? ",".concat(strValueOf2) : new String(",")).length()));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final synchronized boolean a() {
        return d() != null;
    }

    final boolean b(com.google.firebase.iid.FirebaseInstanceId r5) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n.b(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }
}
