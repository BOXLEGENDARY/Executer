package com.google.android.gms.auth.api.signin;

import S9.Gvmm.CAqKeu;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n3.C2651i;
import o3.C2679b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v3.h;
import z3.AdxZ.bpTQi;

@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    public static final v3.e f13968G = h.c();

    private final long f13969A;

    private final String f13970B;

    final List f13971C;

    private final String f13972D;

    private final String f13973E;

    private final Set f13974F = new HashSet();

    final int f13975d;

    private final String f13976e;

    private final String f13977i;

    private final String f13978v;

    private final String f13979w;

    private final Uri f13980y;

    private String f13981z;

    GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f13975d = i7;
        this.f13976e = str;
        this.f13977i = str2;
        this.f13978v = str3;
        this.f13979w = str4;
        this.f13980y = uri;
        this.f13981z = str5;
        this.f13969A = j7;
        this.f13970B = str6;
        this.f13971C = list;
        this.f13972D = str7;
        this.f13973E = str8;
    }

    public static GoogleSignInAccount w(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), C2651i.f(str7), new ArrayList((Collection) C2651i.l(set)), str5, str6);
    }

    public static GoogleSignInAccount x(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j7 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String str2 = CAqKeu.mUJ;
        GoogleSignInAccount googleSignInAccountW = w(strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, jSONObject.has(str2) ? jSONObject.optString(str2) : null, uri, Long.valueOf(j7), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountW.f13981z = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountW;
    }

    public final String C() {
        return this.f13970B;
    }

    public final String D() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (q() != null) {
                jSONObject.put("id", q());
            }
            if (r() != null) {
                jSONObject.put("tokenId", r());
            }
            if (n() != null) {
                jSONObject.put("email", n());
            }
            if (l() != null) {
                jSONObject.put("displayName", l());
            }
            if (p() != null) {
                jSONObject.put("givenName", p());
            }
            if (o() != null) {
                jSONObject.put("familyName", o());
            }
            Uri uriS = s();
            if (uriS != null) {
                jSONObject.put("photoUrl", uriS.toString());
            }
            if (v() != null) {
                jSONObject.put("serverAuthCode", v());
            }
            jSONObject.put(bpTQi.CxOfzuWUOs, this.f13969A);
            jSONObject.put("obfuscatedIdentifier", this.f13970B);
            JSONArray jSONArray = new JSONArray();
            List list = this.f13971C;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).l().compareTo(((Scope) obj2).l());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.l());
            }
            jSONObject.put(ZJZXBWla.RXwW, jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f13970B.equals(this.f13970B) && googleSignInAccount.t().equals(t());
    }

    public int hashCode() {
        return ((this.f13970B.hashCode() + 527) * 31) + t().hashCode();
    }

    public Account k() {
        String str = this.f13978v;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String l() {
        return this.f13979w;
    }

    public String n() {
        return this.f13978v;
    }

    public String o() {
        return this.f13973E;
    }

    public String p() {
        return this.f13972D;
    }

    public String q() {
        return this.f13976e;
    }

    public String r() {
        return this.f13977i;
    }

    public Uri s() {
        return this.f13980y;
    }

    public Set<Scope> t() {
        HashSet hashSet = new HashSet(this.f13971C);
        hashSet.addAll(this.f13974F);
        return hashSet;
    }

    public String v() {
        return this.f13981z;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f13975d);
        C2679b.u(parcel, 2, q(), false);
        C2679b.u(parcel, 3, r(), false);
        C2679b.u(parcel, 4, n(), false);
        C2679b.u(parcel, 5, l(), false);
        C2679b.s(parcel, 6, s(), i7, false);
        C2679b.u(parcel, 7, v(), false);
        C2679b.q(parcel, 8, this.f13969A);
        C2679b.u(parcel, 9, this.f13970B, false);
        C2679b.y(parcel, 10, this.f13971C, false);
        C2679b.u(parcel, 11, p(), false);
        C2679b.u(parcel, 12, o(), false);
        C2679b.b(parcel, iA);
    }
}
