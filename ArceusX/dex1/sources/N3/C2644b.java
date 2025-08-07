package n3;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import g0.C2458b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l3.C2526a;

public final class C2644b {

    private final Account f22259a;

    private final Set f22260b;

    private final Set f22261c;

    private final Map f22262d;

    private final int f22263e;

    private final View f22264f;

    private final String f22265g;

    private final String f22266h;

    private final X3.a f22267i;

    private Integer f22268j;

    public static final class a {

        private Account f22269a;

        private C2458b f22270b;

        private String f22271c;

        private String f22272d;

        private final X3.a f22273e = X3.a.f7907C;

        public C2644b a() {
            return new C2644b(this.f22269a, this.f22270b, null, 0, null, this.f22271c, this.f22272d, this.f22273e, false);
        }

        public a b(String str) {
            this.f22271c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f22270b == null) {
                this.f22270b = new C2458b();
            }
            this.f22270b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f22269a = account;
            return this;
        }

        public final a e(String str) {
            this.f22272d = str;
            return this;
        }
    }

    public C2644b(Account account, Set set, Map map, int i7, View view, String str, String str2, X3.a aVar, boolean z7) {
        this.f22259a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f22260b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f22262d = map;
        this.f22264f = view;
        this.f22263e = i7;
        this.f22265g = str;
        this.f22266h = str2;
        this.f22267i = aVar == null ? X3.a.f7907C : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C2661s) it.next()).f22290a);
        }
        this.f22261c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f22259a;
    }

    @Deprecated
    public String b() {
        Account account = this.f22259a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f22259a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.f22261c;
    }

    public Set<Scope> e(C2526a<?> c2526a) {
        C2661s c2661s = (C2661s) this.f22262d.get(c2526a);
        if (c2661s == null || c2661s.f22290a.isEmpty()) {
            return this.f22260b;
        }
        HashSet hashSet = new HashSet(this.f22260b);
        hashSet.addAll(c2661s.f22290a);
        return hashSet;
    }

    public String f() {
        return this.f22265g;
    }

    public Set<Scope> g() {
        return this.f22260b;
    }

    public final X3.a h() {
        return this.f22267i;
    }

    public final Integer i() {
        return this.f22268j;
    }

    public final String j() {
        return this.f22266h;
    }

    public final void k(Integer num) {
        this.f22268j = num;
    }
}
