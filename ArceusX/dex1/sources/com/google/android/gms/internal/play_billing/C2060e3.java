package com.google.android.gms.internal.play_billing;

public class C2060e3 {

    protected volatile InterfaceC2155u3 f16035a;

    private volatile AbstractC2131q2 f16036b;

    public final int a() {
        if (this.f16036b != null) {
            return ((C2119o2) this.f16036b).f16107i.length;
        }
        if (this.f16035a != null) {
            return this.f16035a.h();
        }
        return 0;
    }

    public final AbstractC2131q2 b() {
        if (this.f16036b != null) {
            return this.f16036b;
        }
        synchronized (this) {
            try {
                if (this.f16036b != null) {
                    return this.f16036b;
                }
                if (this.f16035a == null) {
                    this.f16036b = AbstractC2131q2.f16138e;
                } else {
                    this.f16036b = this.f16035a.c();
                }
                return this.f16036b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC2155u3 c(InterfaceC2155u3 interfaceC2155u3) {
        InterfaceC2155u3 interfaceC2155u32 = this.f16035a;
        this.f16036b = null;
        this.f16035a = interfaceC2155u3;
        return interfaceC2155u32;
    }

    protected final void d(InterfaceC2155u3 interfaceC2155u3) {
        if (this.f16035a != null) {
            return;
        }
        synchronized (this) {
            if (this.f16035a != null) {
                return;
            }
            try {
                this.f16035a = interfaceC2155u3;
                this.f16036b = AbstractC2131q2.f16138e;
            } catch (Y2 unused) {
                this.f16035a = interfaceC2155u3;
                this.f16036b = AbstractC2131q2.f16138e;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2060e3)) {
            return false;
        }
        C2060e3 c2060e3 = (C2060e3) obj;
        InterfaceC2155u3 interfaceC2155u3 = this.f16035a;
        InterfaceC2155u3 interfaceC2155u32 = c2060e3.f16035a;
        if (interfaceC2155u3 == null && interfaceC2155u32 == null) {
            return b().equals(c2060e3.b());
        }
        if (interfaceC2155u3 != null && interfaceC2155u32 != null) {
            return interfaceC2155u3.equals(interfaceC2155u32);
        }
        if (interfaceC2155u3 != null) {
            c2060e3.d(interfaceC2155u3.e());
            return interfaceC2155u3.equals(c2060e3.f16035a);
        }
        d(interfaceC2155u32.e());
        return this.f16035a.equals(interfaceC2155u32);
    }

    public int hashCode() {
        return 1;
    }
}
