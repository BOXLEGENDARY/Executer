package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

final class C2171x1 {

    private final C2157v f16162a = new C2157v();

    private final String f16163b;

    private volatile Logger f16164c;

    C2171x1(Class cls) {
        this.f16163b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f16164c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f16162a) {
            try {
                Logger logger2 = this.f16164c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f16163b);
                this.f16164c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
