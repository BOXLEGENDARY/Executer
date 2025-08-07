package com.google.android.play.core.integrity;

final class C2341y extends M {

    private String f18884a;

    private i0 f18885b;

    C2341y() {
    }

    @Override
    final M a(i0 i0Var) {
        this.f18885b = i0Var;
        return this;
    }

    @Override
    final M b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f18884a = str;
        return this;
    }

    @Override
    final N c() {
        i0 i0Var;
        String str = this.f18884a;
        if (str != null && (i0Var = this.f18885b) != null) {
            return new N(str, i0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18884a == null) {
            sb.append(" token");
        }
        if (this.f18885b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
