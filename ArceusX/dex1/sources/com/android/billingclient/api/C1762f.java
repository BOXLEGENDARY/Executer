package com.android.billingclient.api;

public final class C1762f {

    private final boolean f13485a;

    private final boolean f13486b;

    public static final class a {

        private boolean f13487a;

        private boolean f13488b;

        private a() {
        }

        public C1762f a() {
            if (!this.f13487a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C1762f(true, this.f13488b);
        }

        public a b() {
            this.f13487a = true;
            return this;
        }
    }

    private C1762f(boolean z7, boolean z8) {
        this.f13485a = z7;
        this.f13486b = z8;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f13485a;
    }

    boolean b() {
        return this.f13486b;
    }
}
