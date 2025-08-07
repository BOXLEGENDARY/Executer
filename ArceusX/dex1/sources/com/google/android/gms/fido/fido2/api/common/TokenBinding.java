package com.google.android.gms.fido.fido2.api.common;

import K3.C0483p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2651i;
import o3.C2679b;

public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new h();

    public static final TokenBinding f14571i = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    public static final TokenBinding f14572v = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    private final TokenBindingStatus f14573d;

    private final String f14574e;

    public enum TokenBindingStatus implements Parcelable {
        f14575e("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new g();

        private final String f14579d;

        TokenBindingStatus(String str) {
            this.f14579d = str;
        }

        public static TokenBindingStatus c(String str) throws a {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.f14579d)) {
                    return tokenBindingStatus;
                }
            }
            throw new a(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public String toString() {
            return this.f14579d;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f14579d);
        }
    }

    public static class a extends Exception {
        public a(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    TokenBinding(String str, String str2) {
        C2651i.l(str);
        try {
            this.f14573d = TokenBindingStatus.c(str);
            this.f14574e = str2;
        } catch (a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return C0483p.a(this.f14573d, tokenBinding.f14573d) && C0483p.a(this.f14574e, tokenBinding.f14574e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14573d, this.f14574e});
    }

    public String l() {
        return this.f14574e;
    }

    public String n() {
        return this.f14573d.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, n(), false);
        C2679b.u(parcel, 3, l(), false);
        C2679b.b(parcel, iA);
    }
}
