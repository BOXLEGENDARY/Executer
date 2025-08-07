package com.google.android.gms.internal.play_billing;

final class k5 extends E1 {
    k5() {
        super(null);
    }

    @Override
    final void a(l5 l5Var, l5 l5Var2) {
        l5Var.f16088b = l5Var2;
    }

    @Override
    final void b(l5 l5Var, Thread thread) {
        l5Var.f16087a = thread;
    }

    @Override
    final boolean c(n5 n5Var, I3 i32, I3 i33) {
        synchronized (n5Var) {
            try {
                if (n5Var.f16100e != i32) {
                    return false;
                }
                n5Var.f16100e = i33;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    final boolean d(n5 n5Var, Object obj, Object obj2) {
        synchronized (n5Var) {
            try {
                if (n5Var.f16099d != obj) {
                    return false;
                }
                n5Var.f16099d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    final boolean e(n5 n5Var, l5 l5Var, l5 l5Var2) {
        synchronized (n5Var) {
            try {
                if (n5Var.f16101i != l5Var) {
                    return false;
                }
                n5Var.f16101i = l5Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
