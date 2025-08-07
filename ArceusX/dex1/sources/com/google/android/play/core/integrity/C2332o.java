package com.google.android.play.core.integrity;

import z4.C3077c;

final class C2332o extends IntegrityTokenRequest {

    private final String f18870a;

    private final Long f18871b;

    private final Object f18872c = null;

    C2332o(String str, Long l7, Object obj, C3077c c3077c) {
        this.f18870a = str;
        this.f18871b = l7;
    }

    private static boolean c() {
        return true;
    }

    @Override
    public final Long a() {
        return this.f18871b;
    }

    @Override
    public final String b() {
        return this.f18870a;
    }

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.C2332o.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f18870a.hashCode() ^ 1000003;
        Long l7 = this.f18871b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l7 == null ? 0 : l7.hashCode());
        return c() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f18870a + ", cloudProjectNumber=" + this.f18871b;
        if (c()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
