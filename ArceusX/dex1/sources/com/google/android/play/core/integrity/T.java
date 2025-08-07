package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.InterfaceC2320c;
import z4.C3080f;

final class T extends InterfaceC2320c.a {

    private final long f18816a;

    T(long j7, int i7, C3080f c3080f) {
        this.f18816a = j7;
    }

    @Override
    final int a() {
        return 0;
    }

    @Override
    public final long b() {
        return this.f18816a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2320c.a) {
            InterfaceC2320c.a aVar = (InterfaceC2320c.a) obj;
            if (this.f18816a == aVar.b()) {
                aVar.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f18816a;
        return (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f18816a + ", webViewRequestMode=0}";
    }
}
