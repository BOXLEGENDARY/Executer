package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import java.util.HashSet;
import java.util.List;

public final class C1764h {

    private final AbstractC2057e0 f13521a;

    public static class a {

        private AbstractC2057e0 f13522a;

        a(e2.D d7) {
        }

        public C1764h a() {
            if (this.f13522a != null) {
                return new C1764h(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f13522a = AbstractC2057e0.q(list);
            return this;
        }
    }

    public static class b {

        private final String f13523a;

        private final String f13524b;

        public static class a {

            private String f13525a;

            private String f13526b;

            a(e2.D d7) {
            }

            public b a() {
                if ("first_party".equals(this.f13526b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f13525a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f13526b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f13525a = str;
                return this;
            }

            public a c(String str) {
                this.f13526b = str;
                return this;
            }
        }

        b(a aVar, e2.D d7) {
            this.f13523a = aVar.f13525a;
            this.f13524b = aVar.f13526b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f13523a;
        }

        public final String c() {
            return this.f13524b;
        }
    }

    C1764h(a aVar, e2.D d7) {
        this.f13521a = aVar.f13522a;
    }

    public static a a() {
        return new a(null);
    }

    public final AbstractC2057e0 b() {
        return this.f13521a;
    }

    public final String c() {
        return ((b) this.f13521a.get(0)).c();
    }
}
