package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new n();

    private final zzag f14459A;

    private final GoogleThirdPartyPaymentExtension f14460B;

    private final zzai f14461C;

    private final FidoAppIdExtension f14462d;

    private final zzs f14463e;

    private final UserVerificationMethodExtension f14464i;

    private final zzz f14465v;

    private final zzab f14466w;

    private final zzad f14467y;

    private final zzu f14468z;

    public static final class a {

        private FidoAppIdExtension f14469a;

        private UserVerificationMethodExtension f14470b;

        private zzs f14471c;

        private zzz f14472d;

        private zzab f14473e;

        private zzad f14474f;

        private zzu f14475g;

        private zzag f14476h;

        private GoogleThirdPartyPaymentExtension f14477i;

        private zzai f14478j;

        public AuthenticationExtensions a() {
            return new AuthenticationExtensions(this.f14469a, this.f14471c, this.f14470b, this.f14472d, this.f14473e, this.f14474f, this.f14475g, this.f14476h, this.f14477i, this.f14478j);
        }

        public a b(FidoAppIdExtension fidoAppIdExtension) {
            this.f14469a = fidoAppIdExtension;
            return this;
        }

        public a c(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f14477i = googleThirdPartyPaymentExtension;
            return this;
        }

        public a d(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.f14470b = userVerificationMethodExtension;
            return this;
        }
    }

    AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.f14462d = fidoAppIdExtension;
        this.f14464i = userVerificationMethodExtension;
        this.f14463e = zzsVar;
        this.f14465v = zzzVar;
        this.f14466w = zzabVar;
        this.f14467y = zzadVar;
        this.f14468z = zzuVar;
        this.f14459A = zzagVar;
        this.f14460B = googleThirdPartyPaymentExtension;
        this.f14461C = zzaiVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return C2649g.b(this.f14462d, authenticationExtensions.f14462d) && C2649g.b(this.f14463e, authenticationExtensions.f14463e) && C2649g.b(this.f14464i, authenticationExtensions.f14464i) && C2649g.b(this.f14465v, authenticationExtensions.f14465v) && C2649g.b(this.f14466w, authenticationExtensions.f14466w) && C2649g.b(this.f14467y, authenticationExtensions.f14467y) && C2649g.b(this.f14468z, authenticationExtensions.f14468z) && C2649g.b(this.f14459A, authenticationExtensions.f14459A) && C2649g.b(this.f14460B, authenticationExtensions.f14460B) && C2649g.b(this.f14461C, authenticationExtensions.f14461C);
    }

    public int hashCode() {
        return C2649g.c(this.f14462d, this.f14463e, this.f14464i, this.f14465v, this.f14466w, this.f14467y, this.f14468z, this.f14459A, this.f14460B, this.f14461C);
    }

    public FidoAppIdExtension l() {
        return this.f14462d;
    }

    public UserVerificationMethodExtension n() {
        return this.f14464i;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 2, l(), i7, false);
        C2679b.s(parcel, 3, this.f14463e, i7, false);
        C2679b.s(parcel, 4, n(), i7, false);
        C2679b.s(parcel, 5, this.f14465v, i7, false);
        C2679b.s(parcel, 6, this.f14466w, i7, false);
        C2679b.s(parcel, 7, this.f14467y, i7, false);
        C2679b.s(parcel, 8, this.f14468z, i7, false);
        C2679b.s(parcel, 9, this.f14459A, i7, false);
        C2679b.s(parcel, 10, this.f14460B, i7, false);
        C2679b.s(parcel, 11, this.f14461C, i7, false);
        C2679b.b(parcel, iA);
    }
}
