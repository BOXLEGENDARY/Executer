package com.google.android.play.core.integrity;

final class C2321d extends AbstractC2333p {

    private String f18825a;

    private i0 f18826b;

    C2321d() {
    }

    @Override
    final AbstractC2333p a(i0 i0Var) {
        this.f18826b = i0Var;
        return this;
    }

    @Override
    final AbstractC2333p b(String str) {
        this.f18825a = str;
        return this;
    }

    @Override
    final C2334q c() {
        i0 i0Var;
        String str = this.f18825a;
        if (str != null && (i0Var = this.f18826b) != null) {
            return new C2334q(str, i0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18825a == null) {
            sb.append(" token");
        }
        if (this.f18826b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
