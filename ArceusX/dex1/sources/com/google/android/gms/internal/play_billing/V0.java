package com.google.android.gms.internal.play_billing;

final class V0 extends P0 {
    V0(C2064f1 c2064f1) {
        super(null);
    }

    @Override
    final S0 a(AbstractC2034a1 abstractC2034a1, S0 s02) {
        S0 s03;
        synchronized (abstractC2034a1) {
            try {
                s03 = abstractC2034a1.f15992e;
                if (s03 != s02) {
                    abstractC2034a1.f15992e = s02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s03;
    }

    @Override
    final Z0 b(AbstractC2034a1 abstractC2034a1, Z0 z02) {
        Z0 z03;
        synchronized (abstractC2034a1) {
            try {
                z03 = abstractC2034a1.f15993i;
                if (z03 != z02) {
                    abstractC2034a1.f15993i = z02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z03;
    }

    @Override
    final void c(Z0 z02, Z0 z03) {
        z02.f15966b = z03;
    }

    @Override
    final void d(Z0 z02, Thread thread) {
        z02.f15965a = thread;
    }

    @Override
    final boolean e(AbstractC2034a1 abstractC2034a1, S0 s02, S0 s03) {
        synchronized (abstractC2034a1) {
            try {
                if (abstractC2034a1.f15992e != s02) {
                    return false;
                }
                abstractC2034a1.f15992e = s03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    final boolean f(AbstractC2034a1 abstractC2034a1, Object obj, Object obj2) {
        synchronized (abstractC2034a1) {
            try {
                if (abstractC2034a1.f15991d != obj) {
                    return false;
                }
                abstractC2034a1.f15991d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    final boolean g(AbstractC2034a1 abstractC2034a1, Z0 z02, Z0 z03) {
        synchronized (abstractC2034a1) {
            try {
                if (abstractC2034a1.f15993i != z02) {
                    return false;
                }
                abstractC2034a1.f15993i = z03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
