package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class C2167w3 {

    private static final char[] f16159a;

    static {
        char[] cArr = new char[80];
        f16159a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC2155u3 interfaceC2155u3, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC2155u3, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(Q3.a(new C2119o2(((String) obj).getBytes(W2.f15950a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2131q2) {
            sb.append(": \"");
            sb.append(Q3.a((AbstractC2131q2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof R2) {
            sb.append(" {");
            d((R2) obj, sb, i7 + 2);
            sb.append("\n");
            c(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i9 = i7 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i9, "key", entry.getKey());
        b(sb, i9, "value", entry.getValue());
        sb.append("\n");
        c(i7, sb);
        sb.append("}");
    }

    private static void c(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f16159a, 0, i8);
            i7 -= i8;
        }
    }

    private static void d(com.google.android.gms.internal.play_billing.InterfaceC2155u3 r18, java.lang.StringBuilder r19, int r20) throws java.lang.SecurityException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2167w3.d(com.google.android.gms.internal.play_billing.u3, java.lang.StringBuilder, int):void");
    }
}
