package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j3.C2492a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l3.C2526a;
import n3.C2651i;
import o3.C2679b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements C2526a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    public static final GoogleSignInOptions f13982E;

    public static final GoogleSignInOptions f13983F;

    public static final Scope f13984G = new Scope("profile");

    public static final Scope f13985H = new Scope("email");

    public static final Scope f13986I = new Scope("openid");

    public static final Scope f13987J;

    public static final Scope f13988K;

    private static final Comparator f13989L;

    private String f13990A;

    private ArrayList f13991B;

    private String f13992C;

    private Map f13993D;

    final int f13994d;

    private final ArrayList f13995e;

    private Account f13996i;

    private boolean f13997v;

    private final boolean f13998w;

    private final boolean f13999y;

    private String f14000z;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f13987J = scope;
        f13988K = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f13982E = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f13983F = aVar2.a();
        CREATOR = new e();
        f13989L = new d();
    }

    public static Map O(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.l()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public static GoogleSignInOptions v(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public final String D() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f13995e, f13989L);
            Iterator it = this.f13995e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).l());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f13996i;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f13997v);
            jSONObject.put("forceCodeForRefreshToken", this.f13999y);
            jSONObject.put("serverAuthRequested", this.f13998w);
            if (!TextUtils.isEmpty(this.f14000z)) {
                jSONObject.put("serverClientId", this.f14000z);
            }
            if (!TextUtils.isEmpty(this.f13990A)) {
                jSONObject.put("hostedDomain", this.f13990A);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public boolean equals(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f13995e;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).l());
        }
        Collections.sort(arrayList);
        C2492a c2492a = new C2492a();
        c2492a.a(arrayList);
        c2492a.a(this.f13996i);
        c2492a.a(this.f14000z);
        c2492a.c(this.f13999y);
        c2492a.c(this.f13997v);
        c2492a.c(this.f13998w);
        c2492a.a(this.f13992C);
        return c2492a.b();
    }

    public Account k() {
        return this.f13996i;
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> l() {
        return this.f13991B;
    }

    public String n() {
        return this.f13992C;
    }

    public ArrayList<Scope> o() {
        return new ArrayList<>(this.f13995e);
    }

    public String p() {
        return this.f14000z;
    }

    public boolean q() {
        return this.f13999y;
    }

    public boolean r() {
        return this.f13997v;
    }

    public boolean s() {
        return this.f13998w;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13994d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.y(parcel, 2, o(), false);
        C2679b.s(parcel, 3, k(), i7, false);
        C2679b.c(parcel, 4, r());
        C2679b.c(parcel, 5, s());
        C2679b.c(parcel, 6, q());
        C2679b.u(parcel, 7, p(), false);
        C2679b.u(parcel, 8, this.f13990A, false);
        C2679b.y(parcel, 9, l(), false);
        C2679b.u(parcel, 10, n(), false);
        C2679b.b(parcel, iA);
    }

    public static final class a {

        private Set f14001a;

        private boolean f14002b;

        private boolean f14003c;

        private boolean f14004d;

        private String f14005e;

        private Account f14006f;

        private String f14007g;

        private Map f14008h;

        private String f14009i;

        public a() {
            this.f14001a = new HashSet();
            this.f14008h = new HashMap();
        }

        public GoogleSignInOptions a() {
            if (this.f14001a.contains(GoogleSignInOptions.f13988K)) {
                Set set = this.f14001a;
                Scope scope = GoogleSignInOptions.f13987J;
                if (set.contains(scope)) {
                    this.f14001a.remove(scope);
                }
            }
            if (this.f14004d && (this.f14006f == null || !this.f14001a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f14001a), this.f14006f, this.f14004d, this.f14002b, this.f14003c, this.f14005e, this.f14007g, this.f14008h, this.f14009i);
        }

        public a b() {
            this.f14001a.add(GoogleSignInOptions.f13986I);
            return this;
        }

        public a c() {
            this.f14001a.add(GoogleSignInOptions.f13984G);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.f14001a.add(scope);
            this.f14001a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.f14009i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f14001a = new HashSet();
            this.f14008h = new HashMap();
            C2651i.l(googleSignInOptions);
            this.f14001a = new HashSet(googleSignInOptions.f13995e);
            this.f14002b = googleSignInOptions.f13998w;
            this.f14003c = googleSignInOptions.f13999y;
            this.f14004d = googleSignInOptions.f13997v;
            this.f14005e = googleSignInOptions.f14000z;
            this.f14006f = googleSignInOptions.f13996i;
            this.f14007g = googleSignInOptions.f13990A;
            this.f14008h = GoogleSignInOptions.O(googleSignInOptions.f13991B);
            this.f14009i = googleSignInOptions.f13992C;
        }
    }

    GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z7, boolean z8, boolean z9, String str, String str2, ArrayList arrayList2, String str3) {
        this(i7, arrayList, account, z7, z8, z9, str, str2, O(arrayList2), str3);
    }

    private GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z7, boolean z8, boolean z9, String str, String str2, Map map, String str3) {
        this.f13994d = i7;
        this.f13995e = arrayList;
        this.f13996i = account;
        this.f13997v = z7;
        this.f13998w = z8;
        this.f13999y = z9;
        this.f14000z = str;
        this.f13990A = str2;
        this.f13991B = new ArrayList(map.values());
        this.f13993D = map;
        this.f13992C = str3;
    }
}
