package com.android.billingclient.api;

import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.play_billing.C2046c1;
import ya.HnSi.PLHvHoayk;

public final class C1761e {

    private int f13481a;

    private String f13482b;

    public static class a {

        private int f13483a;

        private String f13484b = BuildConfig.FLAVOR;

        a(e2.x xVar) {
        }

        public C1761e a() {
            C1761e c1761e = new C1761e();
            c1761e.f13481a = this.f13483a;
            c1761e.f13482b = this.f13484b;
            return c1761e;
        }

        public a b(String str) {
            this.f13484b = str;
            return this;
        }

        public a c(int i7) {
            this.f13483a = i7;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f13482b;
    }

    public int b() {
        return this.f13481a;
    }

    public String toString() {
        return PLHvHoayk.ItNdrEYlACfrW + C2046c1.g(this.f13481a) + HguUe.HZWFfFGfuU + this.f13482b;
    }
}
