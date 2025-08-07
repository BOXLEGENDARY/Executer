package com.google.android.gms.internal.measurement;

import android.util.Log;

final class J2 extends P2<Boolean> {
    J2(M2 m22, String str, Boolean bool, boolean z7) {
        super(m22, str, bool, true, null);
    }

    @Override
    final Boolean a(Object obj) {
        if (C1948p2.f15246c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (C1948p2.f15247d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String strC = super.c();
        String str = (String) obj;
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(strC);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
