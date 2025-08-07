package com.google.android.gms.internal.measurement;

public class C1870f4 {

    private static final G3 f15155c = G3.a();

    protected volatile InterfaceC2021y4 f15156a;

    private volatile AbstractC1980t3 f15157b;

    public final int a() {
        if (this.f15157b != null) {
            return ((C1964r3) this.f15157b).f15296w.length;
        }
        if (this.f15156a != null) {
            return this.f15156a.a();
        }
        return 0;
    }

    public final AbstractC1980t3 b() {
        if (this.f15157b != null) {
            return this.f15157b;
        }
        synchronized (this) {
            try {
                if (this.f15157b != null) {
                    return this.f15157b;
                }
                if (this.f15156a == null) {
                    this.f15157b = AbstractC1980t3.f15325e;
                } else {
                    this.f15157b = this.f15156a.d();
                }
                return this.f15157b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void c(InterfaceC2021y4 interfaceC2021y4) {
        if (this.f15156a != null) {
            return;
        }
        synchronized (this) {
            if (this.f15156a == null) {
                try {
                    this.f15156a = interfaceC2021y4;
                    this.f15157b = AbstractC1980t3.f15325e;
                } catch (C1854d4 unused) {
                    this.f15156a = interfaceC2021y4;
                    this.f15157b = AbstractC1980t3.f15325e;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1870f4)) {
            return false;
        }
        C1870f4 c1870f4 = (C1870f4) obj;
        InterfaceC2021y4 interfaceC2021y4 = this.f15156a;
        InterfaceC2021y4 interfaceC2021y42 = c1870f4.f15156a;
        if (interfaceC2021y4 == null && interfaceC2021y42 == null) {
            return b().equals(c1870f4.b());
        }
        if (interfaceC2021y4 != null && interfaceC2021y42 != null) {
            return interfaceC2021y4.equals(interfaceC2021y42);
        }
        if (interfaceC2021y4 != null) {
            c1870f4.c(interfaceC2021y4.e());
            return interfaceC2021y4.equals(c1870f4.f15156a);
        }
        c(interfaceC2021y42.e());
        return this.f15156a.equals(interfaceC2021y42);
    }

    public int hashCode() {
        return 1;
    }
}
