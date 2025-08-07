package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new h();

    private final SignInPassword f13950d;

    private final String f13951e;

    private final int f13952i;

    @Deprecated
    public static final class a {

        private SignInPassword f13953a;

        private String f13954b;

        private int f13955c;

        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f13953a, this.f13954b, this.f13955c);
        }

        public a b(SignInPassword signInPassword) {
            this.f13953a = signInPassword;
            return this;
        }

        public final a c(String str) {
            this.f13954b = str;
            return this;
        }

        public final a d(int i7) {
            this.f13955c = i7;
            return this;
        }
    }

    SavePasswordRequest(SignInPassword signInPassword, String str, int i7) {
        this.f13950d = (SignInPassword) C2651i.l(signInPassword);
        this.f13951e = str;
        this.f13952i = i7;
    }

    public static a l() {
        return new a();
    }

    public static a o(SavePasswordRequest savePasswordRequest) {
        C2651i.l(savePasswordRequest);
        a aVarL = l();
        aVarL.b(savePasswordRequest.n());
        aVarL.d(savePasswordRequest.f13952i);
        String str = savePasswordRequest.f13951e;
        if (str != null) {
            aVarL.c(str);
        }
        return aVarL;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return C2649g.b(this.f13950d, savePasswordRequest.f13950d) && C2649g.b(this.f13951e, savePasswordRequest.f13951e) && this.f13952i == savePasswordRequest.f13952i;
    }

    public int hashCode() {
        return C2649g.c(this.f13950d, this.f13951e);
    }

    public SignInPassword n() {
        return this.f13950d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, n(), i7, false);
        C2679b.u(parcel, 2, this.f13951e, false);
        C2679b.m(parcel, 3, this.f13952i);
        C2679b.b(parcel, iA);
    }
}
