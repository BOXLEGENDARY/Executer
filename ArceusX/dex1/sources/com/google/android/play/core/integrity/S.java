package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.InterfaceC2320c;

final class S extends InterfaceC2320c.a.AbstractC0164a {

    private long f18814a;

    private byte f18815b;

    S() {
    }

    @Override
    public final InterfaceC2320c.a a() {
        if (this.f18815b == 3) {
            return new T(this.f18814a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18815b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f18815b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override
    public final InterfaceC2320c.a.AbstractC0164a b(long j7) {
        this.f18814a = j7;
        this.f18815b = (byte) (this.f18815b | 1);
        return this;
    }

    public final InterfaceC2320c.a.AbstractC0164a c(int i7) {
        this.f18815b = (byte) (this.f18815b | 2);
        return this;
    }
}
