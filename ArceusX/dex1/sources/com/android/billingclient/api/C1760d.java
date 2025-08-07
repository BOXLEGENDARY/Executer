package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.C1760d;
import com.android.billingclient.api.C1763g;
import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import com.google.android.gms.internal.play_billing.C2145t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class C1760d {

    private boolean f13457a;

    private String f13458b;

    private String f13459c;

    private c f13460d;

    private AbstractC2057e0 f13461e;

    private ArrayList f13462f;

    private boolean f13463g;

    public static class a {

        private String f13464a;

        private String f13465b;

        private List f13466c;

        private ArrayList f13467d;

        private boolean f13468e;

        private c.a f13469f;

        a(e2.w wVar) {
            c.a aVarA = c.a();
            c.a.b(aVarA);
            this.f13469f = aVarA;
        }

        public C1760d a() {
            ArrayList arrayList = this.f13467d;
            boolean z7 = true;
            boolean z8 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f13466c;
            boolean z9 = (list == null || list.isEmpty()) ? false : true;
            if (!z8 && !z9) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z8 && z9) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            e2.w wVar = null;
            if (!z8) {
                this.f13466c.forEach(new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        if (((C1760d.b) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f13467d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f13467d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f13467d.get(0);
                    String strB = skuDetails.b();
                    ArrayList arrayList2 = this.f13467d;
                    int size = arrayList2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i7);
                        if (!strB.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !strB.equals(skuDetails2.b())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strF = skuDetails.f();
                    ArrayList arrayList3 = this.f13467d;
                    int size2 = arrayList3.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i8);
                        if (!strB.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !strF.equals(skuDetails3.f())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            C1760d c1760d = new C1760d(wVar);
            if ((!z8 || ((SkuDetails) this.f13467d.get(0)).f().isEmpty()) && (!z9 || ((b) this.f13466c.get(0)).b().f().isEmpty())) {
                z7 = false;
            }
            c1760d.f13457a = z7;
            c1760d.f13458b = this.f13464a;
            c1760d.f13459c = this.f13465b;
            c1760d.f13460d = this.f13469f.a();
            ArrayList arrayList4 = this.f13467d;
            c1760d.f13462f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            c1760d.f13463g = this.f13468e;
            List list2 = this.f13466c;
            c1760d.f13461e = list2 != null ? AbstractC2057e0.q(list2) : AbstractC2057e0.r();
            return c1760d;
        }

        public a b(String str) {
            this.f13464a = str;
            return this;
        }

        public a c(String str) {
            this.f13465b = str;
            return this;
        }

        public a d(List<b> list) {
            this.f13466c = new ArrayList(list);
            return this;
        }
    }

    public static final class b {

        private final C1763g f13470a;

        private final String f13471b;

        public static class a {

            private C1763g f13472a;

            private String f13473b;

            a(e2.w wVar) {
            }

            public b a() {
                C2145t.c(this.f13472a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f13472a.e() != null) {
                    C2145t.c(this.f13473b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f13473b = str;
                return this;
            }

            public a c(C1763g c1763g) {
                this.f13472a = c1763g;
                if (c1763g.b() != null) {
                    c1763g.b().getClass();
                    C1763g.b bVarB = c1763g.b();
                    if (bVarB.e() != null) {
                        this.f13473b = bVarB.e();
                    }
                }
                return this;
            }
        }

        b(a aVar, e2.w wVar) {
            this.f13470a = aVar.f13472a;
            this.f13471b = aVar.f13473b;
        }

        public static a a() {
            return new a(null);
        }

        public final C1763g b() {
            return this.f13470a;
        }

        public final String c() {
            return this.f13471b;
        }
    }

    public static class c {

        private String f13474a;

        private String f13475b;

        private int f13476c = 0;

        public static class a {

            private String f13477a;

            private String f13478b;

            private boolean f13479c;

            private int f13480d = 0;

            a(e2.w wVar) {
            }

            static a b(a aVar) {
                aVar.f13479c = true;
                return aVar;
            }

            public c a() {
                boolean z7 = true;
                e2.w wVar = null;
                if (TextUtils.isEmpty(this.f13477a) && TextUtils.isEmpty(null)) {
                    z7 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f13478b);
                if (z7 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f13479c && !z7 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(wVar);
                cVar.f13474a = this.f13477a;
                cVar.f13476c = this.f13480d;
                cVar.f13475b = this.f13478b;
                return cVar;
            }
        }

        c(e2.w wVar) {
        }

        public static a a() {
            return new a(null);
        }

        final int b() {
            return this.f13476c;
        }

        final String c() {
            return this.f13474a;
        }

        final String d() {
            return this.f13475b;
        }
    }

    C1760d(e2.w wVar) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f13460d.b();
    }

    final C1761e c() {
        if (this.f13461e.isEmpty()) {
            return J.f13359l;
        }
        b bVar = (b) this.f13461e.get(0);
        for (int i7 = 1; i7 < this.f13461e.size(); i7++) {
            b bVar2 = (b) this.f13461e.get(i7);
            if (!bVar2.b().d().equals(bVar.b().d()) && !bVar2.b().d().equals("play_pass_subs")) {
                return J.a(5, "All products should have same ProductType.");
            }
        }
        String strF = bVar.b().f();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        AbstractC2057e0 abstractC2057e0 = this.f13461e;
        int size = abstractC2057e0.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar3 = (b) abstractC2057e0.get(i8);
            bVar3.b().d().equals("subs");
            if (hashSet.contains(bVar3.b().c())) {
                return J.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.b().c()));
            }
            hashSet.add(bVar3.b().c());
            if (!bVar.b().d().equals("play_pass_subs") && !bVar3.b().d().equals("play_pass_subs") && !strF.equals(bVar3.b().f())) {
                return J.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                return J.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        C1763g.b bVarB = bVar.b().b();
        return (bVarB == null || bVarB.d() == null) ? J.f13359l : J.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    public final String d() {
        return this.f13458b;
    }

    public final String e() {
        return this.f13459c;
    }

    public final String f() {
        return this.f13460d.c();
    }

    public final String g() {
        return this.f13460d.d();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f13462f);
        return arrayList;
    }

    public final List i() {
        return this.f13461e;
    }

    public final boolean q() {
        return this.f13463g;
    }

    final boolean r() {
        return (this.f13458b == null && this.f13459c == null && this.f13460d.d() == null && this.f13460d.b() == 0 && !this.f13461e.stream().anyMatch(new Predicate() {
            @Override
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f13457a && !this.f13463g) ? false : true;
    }
}
