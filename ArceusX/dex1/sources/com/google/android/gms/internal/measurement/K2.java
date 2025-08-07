package com.google.android.gms.internal.measurement;

import android.util.Log;

final class K2 extends P2<Double> {
    K2(M2 m22, String str, Double d7, boolean z7) {
        super(m22, "measurement.test.double_flag", d7, true, null);
    }

    @Override
    final Double a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String strC = super.c();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(strC);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
