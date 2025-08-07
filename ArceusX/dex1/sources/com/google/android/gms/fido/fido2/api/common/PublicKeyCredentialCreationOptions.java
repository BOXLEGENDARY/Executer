package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import java.util.Arrays;
import java.util.List;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new c();

    private final Integer f14528A;

    private final TokenBinding f14529B;

    private final AttestationConveyancePreference f14530C;

    private final AuthenticationExtensions f14531D;

    private final PublicKeyCredentialRpEntity f14532d;

    private final PublicKeyCredentialUserEntity f14533e;

    private final byte[] f14534i;

    private final List f14535v;

    private final Double f14536w;

    private final List f14537y;

    private final AuthenticatorSelectionCriteria f14538z;

    public static final class a {

        private PublicKeyCredentialRpEntity f14539a;

        private PublicKeyCredentialUserEntity f14540b;

        private byte[] f14541c;

        private List f14542d;

        private Double f14543e;

        private List f14544f;

        private AuthenticatorSelectionCriteria f14545g;

        private Integer f14546h;

        private TokenBinding f14547i;

        private AttestationConveyancePreference f14548j;

        private AuthenticationExtensions f14549k;

        public PublicKeyCredentialCreationOptions a() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f14539a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f14540b;
            byte[] bArr = this.f14541c;
            List list = this.f14542d;
            Double d7 = this.f14543e;
            List list2 = this.f14544f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f14545g;
            Integer num = this.f14546h;
            TokenBinding tokenBinding = this.f14547i;
            AttestationConveyancePreference attestationConveyancePreference = this.f14548j;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d7, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f14549k);
        }

        public a b(AttestationConveyancePreference attestationConveyancePreference) {
            this.f14548j = attestationConveyancePreference;
            return this;
        }

        public a c(AuthenticationExtensions authenticationExtensions) {
            this.f14549k = authenticationExtensions;
            return this;
        }

        public a d(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f14545g = authenticatorSelectionCriteria;
            return this;
        }

        public a e(byte[] bArr) {
            this.f14541c = (byte[]) C2651i.l(bArr);
            return this;
        }

        public a f(List<PublicKeyCredentialDescriptor> list) {
            this.f14544f = list;
            return this;
        }

        public a g(List<PublicKeyCredentialParameters> list) {
            this.f14542d = (List) C2651i.l(list);
            return this;
        }

        public a h(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f14539a = (PublicKeyCredentialRpEntity) C2651i.l(publicKeyCredentialRpEntity);
            return this;
        }

        public a i(Double d7) {
            this.f14543e = d7;
            return this;
        }

        public a j(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.f14540b = (PublicKeyCredentialUserEntity) C2651i.l(publicKeyCredentialUserEntity);
            return this;
        }
    }

    PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d7, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        this.f14532d = (PublicKeyCredentialRpEntity) C2651i.l(publicKeyCredentialRpEntity);
        this.f14533e = (PublicKeyCredentialUserEntity) C2651i.l(publicKeyCredentialUserEntity);
        this.f14534i = (byte[]) C2651i.l(bArr);
        this.f14535v = (List) C2651i.l(list);
        this.f14536w = d7;
        this.f14537y = list2;
        this.f14538z = authenticatorSelectionCriteria;
        this.f14528A = num;
        this.f14529B = tokenBinding;
        if (str != null) {
            try {
                this.f14530C = AttestationConveyancePreference.c(str);
            } catch (AttestationConveyancePreference.a e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f14530C = null;
        }
        this.f14531D = authenticationExtensions;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return C2649g.b(this.f14532d, publicKeyCredentialCreationOptions.f14532d) && C2649g.b(this.f14533e, publicKeyCredentialCreationOptions.f14533e) && Arrays.equals(this.f14534i, publicKeyCredentialCreationOptions.f14534i) && C2649g.b(this.f14536w, publicKeyCredentialCreationOptions.f14536w) && this.f14535v.containsAll(publicKeyCredentialCreationOptions.f14535v) && publicKeyCredentialCreationOptions.f14535v.containsAll(this.f14535v) && (((list = this.f14537y) == null && publicKeyCredentialCreationOptions.f14537y == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f14537y) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f14537y.containsAll(this.f14537y))) && C2649g.b(this.f14538z, publicKeyCredentialCreationOptions.f14538z) && C2649g.b(this.f14528A, publicKeyCredentialCreationOptions.f14528A) && C2649g.b(this.f14529B, publicKeyCredentialCreationOptions.f14529B) && C2649g.b(this.f14530C, publicKeyCredentialCreationOptions.f14530C) && C2649g.b(this.f14531D, publicKeyCredentialCreationOptions.f14531D);
    }

    public int hashCode() {
        return C2649g.c(this.f14532d, this.f14533e, Integer.valueOf(Arrays.hashCode(this.f14534i)), this.f14535v, this.f14536w, this.f14537y, this.f14538z, this.f14528A, this.f14529B, this.f14530C, this.f14531D);
    }

    public String l() {
        AttestationConveyancePreference attestationConveyancePreference = this.f14530C;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions n() {
        return this.f14531D;
    }

    public AuthenticatorSelectionCriteria o() {
        return this.f14538z;
    }

    public byte[] p() {
        return this.f14534i;
    }

    public List<PublicKeyCredentialDescriptor> q() {
        return this.f14537y;
    }

    public List<PublicKeyCredentialParameters> r() {
        return this.f14535v;
    }

    public Integer s() {
        return this.f14528A;
    }

    public PublicKeyCredentialRpEntity t() {
        return this.f14532d;
    }

    public Double v() {
        return this.f14536w;
    }

    public TokenBinding w() {
        return this.f14529B;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 2, t(), i7, false);
        C2679b.s(parcel, 3, x(), i7, false);
        C2679b.f(parcel, 4, p(), false);
        C2679b.y(parcel, 5, r(), false);
        C2679b.i(parcel, 6, v(), false);
        C2679b.y(parcel, 7, q(), false);
        C2679b.s(parcel, 8, o(), i7, false);
        C2679b.p(parcel, 9, s(), false);
        C2679b.s(parcel, 10, w(), i7, false);
        C2679b.u(parcel, 11, l(), false);
        C2679b.s(parcel, 12, n(), i7, false);
        C2679b.b(parcel, iA);
    }

    public PublicKeyCredentialUserEntity x() {
        return this.f14533e;
    }
}
