package com.google.android.gms.internal.measurement;

import android.util.Log;

final class I2 extends P2<Long> {
    I2(M2 m22, String str, Long l7, boolean z7) {
        super(m22, str, l7, true, null);
    }

    @Override
    final Long a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String strC = super.c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(strC);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
