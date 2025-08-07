package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import n3.C2649g;
import o3.C2679b;

public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new r();

    private final Attachment f14496d;

    private final Boolean f14497e;

    private final zzay f14498i;

    private final ResidentKeyRequirement f14499v;

    public static class a {

        private Attachment f14500a;

        private Boolean f14501b;

        private ResidentKeyRequirement f14502c;

        public AuthenticatorSelectionCriteria a() {
            Attachment attachment = this.f14500a;
            String string = attachment == null ? null : attachment.toString();
            Boolean bool = this.f14501b;
            ResidentKeyRequirement residentKeyRequirement = this.f14502c;
            return new AuthenticatorSelectionCriteria(string, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        public a b(Attachment attachment) {
            this.f14500a = attachment;
            return this;
        }

        public a c(Boolean bool) {
            this.f14501b = bool;
            return this;
        }

        public a d(ResidentKeyRequirement residentKeyRequirement) {
            this.f14502c = residentKeyRequirement;
            return this;
        }
    }

    AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentC;
        ResidentKeyRequirement residentKeyRequirementC = null;
        if (str == null) {
            attachmentC = null;
        } else {
            try {
                attachmentC = Attachment.c(str);
            } catch (C3.n | Attachment.a | ResidentKeyRequirement.a e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f14496d = attachmentC;
        this.f14497e = bool;
        this.f14498i = str2 == null ? null : zzay.c(str2);
        if (str3 != null) {
            residentKeyRequirementC = ResidentKeyRequirement.c(str3);
        }
        this.f14499v = residentKeyRequirementC;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return C2649g.b(this.f14496d, authenticatorSelectionCriteria.f14496d) && C2649g.b(this.f14497e, authenticatorSelectionCriteria.f14497e) && C2649g.b(this.f14498i, authenticatorSelectionCriteria.f14498i) && C2649g.b(o(), authenticatorSelectionCriteria.o());
    }

    public int hashCode() {
        return C2649g.c(this.f14496d, this.f14497e, this.f14498i, o());
    }

    public String l() {
        Attachment attachment = this.f14496d;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean n() {
        return this.f14497e;
    }

    public ResidentKeyRequirement o() {
        ResidentKeyRequirement residentKeyRequirement = this.f14499v;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f14497e;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public String p() {
        if (o() == null) {
            return null;
        }
        return o().toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, l(), false);
        C2679b.d(parcel, 3, n(), false);
        zzay zzayVar = this.f14498i;
        C2679b.u(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        C2679b.u(parcel, 5, p(), false);
        C2679b.b(parcel, iA);
    }
}
