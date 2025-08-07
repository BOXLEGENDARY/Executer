package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new c();

    private final String f13938d;

    private final String f13939e;

    private final String f13940i;

    private final String f13941v;

    private final boolean f13942w;

    private final int f13943y;

    public static final class a {

        private String f13944a;

        private String f13945b;

        private String f13946c;

        private String f13947d;

        private boolean f13948e;

        private int f13949f;

        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f13944a, this.f13945b, this.f13946c, this.f13947d, this.f13948e, this.f13949f);
        }

        public a b(String str) {
            this.f13945b = str;
            return this;
        }

        public a c(String str) {
            this.f13947d = str;
            return this;
        }

        @Deprecated
        public a d(boolean z7) {
            this.f13948e = z7;
            return this;
        }

        public a e(String str) {
            C2651i.l(str);
            this.f13944a = str;
            return this;
        }

        public final a f(String str) {
            this.f13946c = str;
            return this;
        }

        public final a g(int i7) {
            this.f13949f = i7;
            return this;
        }
    }

    GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z7, int i7) {
        C2651i.l(str);
        this.f13938d = str;
        this.f13939e = str2;
        this.f13940i = str3;
        this.f13941v = str4;
        this.f13942w = z7;
        this.f13943y = i7;
    }

    public static a l() {
        return new a();
    }

    public static a r(GetSignInIntentRequest getSignInIntentRequest) {
        C2651i.l(getSignInIntentRequest);
        a aVarL = l();
        aVarL.e(getSignInIntentRequest.p());
        aVarL.c(getSignInIntentRequest.o());
        aVarL.b(getSignInIntentRequest.n());
        aVarL.d(getSignInIntentRequest.f13942w);
        aVarL.g(getSignInIntentRequest.f13943y);
        String str = getSignInIntentRequest.f13940i;
        if (str != null) {
            aVarL.f(str);
        }
        return aVarL;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return C2649g.b(this.f13938d, getSignInIntentRequest.f13938d) && C2649g.b(this.f13941v, getSignInIntentRequest.f13941v) && C2649g.b(this.f13939e, getSignInIntentRequest.f13939e) && C2649g.b(Boolean.valueOf(this.f13942w), Boolean.valueOf(getSignInIntentRequest.f13942w)) && this.f13943y == getSignInIntentRequest.f13943y;
    }

    public int hashCode() {
        return C2649g.c(this.f13938d, this.f13939e, this.f13941v, Boolean.valueOf(this.f13942w), Integer.valueOf(this.f13943y));
    }

    public String n() {
        return this.f13939e;
    }

    public String o() {
        return this.f13941v;
    }

    public String p() {
        return this.f13938d;
    }

    @Deprecated
    public boolean q() {
        return this.f13942w;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, p(), false);
        C2679b.u(parcel, 2, n(), false);
        C2679b.u(parcel, 3, this.f13940i, false);
        C2679b.u(parcel, 4, o(), false);
        C2679b.c(parcel, 5, q());
        C2679b.m(parcel, 6, this.f13943y);
        C2679b.b(parcel, iA);
    }
}
