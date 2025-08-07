package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    private final boolean f13894A;

    private final PasswordRequestOptions f13895d;

    private final GoogleIdTokenRequestOptions f13896e;

    private final String f13897i;

    private final boolean f13898v;

    private final int f13899w;

    private final PasskeysRequestOptions f13900y;

    private final PasskeyJsonRequestOptions f13901z;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new d();

        private final boolean f13902d;

        private final String f13903e;

        private final String f13904i;

        private final boolean f13905v;

        private final String f13906w;

        private final List f13907y;

        private final boolean f13908z;

        public static final class a {

            private boolean f13909a = false;

            private String f13910b = null;

            private String f13911c = null;

            private boolean f13912d = true;

            private String f13913e = null;

            private List f13914f = null;

            private boolean f13915g = false;

            public a a(String str, List<String> list) {
                this.f13913e = (String) C2651i.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f13914f = list;
                return this;
            }

            public GoogleIdTokenRequestOptions b() {
                return new GoogleIdTokenRequestOptions(this.f13909a, this.f13910b, this.f13911c, this.f13912d, this.f13913e, this.f13914f, this.f13915g);
            }

            public a c(boolean z7) {
                this.f13912d = z7;
                return this;
            }

            public a d(String str) {
                this.f13911c = str;
                return this;
            }

            @Deprecated
            public a e(boolean z7) {
                this.f13915g = z7;
                return this;
            }

            public a f(String str) {
                this.f13910b = C2651i.f(str);
                return this;
            }

            public a g(boolean z7) {
                this.f13909a = z7;
                return this;
            }
        }

        GoogleIdTokenRequestOptions(boolean z7, String str, String str2, boolean z8, String str3, List list, boolean z9) {
            boolean z10 = true;
            if (z8 && z9) {
                z10 = false;
            }
            C2651i.b(z10, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f13902d = z7;
            if (z7) {
                C2651i.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f13903e = str;
            this.f13904i = str2;
            this.f13905v = z8;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f13907y = arrayList;
            this.f13906w = str3;
            this.f13908z = z9;
        }

        public static a l() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f13902d == googleIdTokenRequestOptions.f13902d && C2649g.b(this.f13903e, googleIdTokenRequestOptions.f13903e) && C2649g.b(this.f13904i, googleIdTokenRequestOptions.f13904i) && this.f13905v == googleIdTokenRequestOptions.f13905v && C2649g.b(this.f13906w, googleIdTokenRequestOptions.f13906w) && C2649g.b(this.f13907y, googleIdTokenRequestOptions.f13907y) && this.f13908z == googleIdTokenRequestOptions.f13908z;
        }

        public int hashCode() {
            return C2649g.c(Boolean.valueOf(this.f13902d), this.f13903e, this.f13904i, Boolean.valueOf(this.f13905v), this.f13906w, this.f13907y, Boolean.valueOf(this.f13908z));
        }

        public boolean n() {
            return this.f13905v;
        }

        public List<String> o() {
            return this.f13907y;
        }

        public String p() {
            return this.f13906w;
        }

        public String q() {
            return this.f13904i;
        }

        public String r() {
            return this.f13903e;
        }

        public boolean s() {
            return this.f13902d;
        }

        @Deprecated
        public boolean t() {
            return this.f13908z;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            int iA = C2679b.a(parcel);
            C2679b.c(parcel, 1, s());
            C2679b.u(parcel, 2, r(), false);
            C2679b.u(parcel, 3, q(), false);
            C2679b.c(parcel, 4, n());
            C2679b.u(parcel, 5, p(), false);
            C2679b.w(parcel, 6, o(), false);
            C2679b.c(parcel, 7, t());
            C2679b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new e();

        private final boolean f13916d;

        private final String f13917e;

        public static final class a {

            private boolean f13918a = false;

            private String f13919b;

            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f13918a, this.f13919b);
            }

            public a b(String str) {
                this.f13919b = str;
                return this;
            }

            public a c(boolean z7) {
                this.f13918a = z7;
                return this;
            }
        }

        PasskeyJsonRequestOptions(boolean z7, String str) {
            if (z7) {
                C2651i.l(str);
            }
            this.f13916d = z7;
            this.f13917e = str;
        }

        public static a l() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f13916d == passkeyJsonRequestOptions.f13916d && C2649g.b(this.f13917e, passkeyJsonRequestOptions.f13917e);
        }

        public int hashCode() {
            return C2649g.c(Boolean.valueOf(this.f13916d), this.f13917e);
        }

        public String n() {
            return this.f13917e;
        }

        public boolean o() {
            return this.f13916d;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            int iA = C2679b.a(parcel);
            C2679b.c(parcel, 1, o());
            C2679b.u(parcel, 2, n(), false);
            C2679b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new f();

        private final boolean f13920d;

        private final byte[] f13921e;

        private final String f13922i;

        public static final class a {

            private boolean f13923a = false;

            private byte[] f13924b;

            private String f13925c;

            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f13923a, this.f13924b, this.f13925c);
            }

            public a b(byte[] bArr) {
                this.f13924b = bArr;
                return this;
            }

            public a c(String str) {
                this.f13925c = str;
                return this;
            }

            public a d(boolean z7) {
                this.f13923a = z7;
                return this;
            }
        }

        PasskeysRequestOptions(boolean z7, byte[] bArr, String str) {
            if (z7) {
                C2651i.l(bArr);
                C2651i.l(str);
            }
            this.f13920d = z7;
            this.f13921e = bArr;
            this.f13922i = str;
        }

        public static a l() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f13920d == passkeysRequestOptions.f13920d && Arrays.equals(this.f13921e, passkeysRequestOptions.f13921e) && Objects.equals(this.f13922i, passkeysRequestOptions.f13922i);
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f13920d), this.f13922i) * 31) + Arrays.hashCode(this.f13921e);
        }

        public byte[] n() {
            return this.f13921e;
        }

        public String o() {
            return this.f13922i;
        }

        public boolean p() {
            return this.f13920d;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            int iA = C2679b.a(parcel);
            C2679b.c(parcel, 1, p());
            C2679b.f(parcel, 2, n(), false);
            C2679b.u(parcel, 3, o(), false);
            C2679b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new g();

        private final boolean f13926d;

        public static final class a {

            private boolean f13927a = false;

            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f13927a);
            }

            public a b(boolean z7) {
                this.f13927a = z7;
                return this;
            }
        }

        PasswordRequestOptions(boolean z7) {
            this.f13926d = z7;
        }

        public static a l() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f13926d == ((PasswordRequestOptions) obj).f13926d;
        }

        public int hashCode() {
            return C2649g.c(Boolean.valueOf(this.f13926d));
        }

        public boolean n() {
            return this.f13926d;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            int iA = C2679b.a(parcel);
            C2679b.c(parcel, 1, n());
            C2679b.b(parcel, iA);
        }
    }

    @Deprecated
    public static final class a {

        private PasswordRequestOptions f13928a;

        private GoogleIdTokenRequestOptions f13929b;

        private PasskeysRequestOptions f13930c;

        private PasskeyJsonRequestOptions f13931d;

        private String f13932e;

        private boolean f13933f;

        private int f13934g;

        private boolean f13935h;

        public a() {
            PasswordRequestOptions.a aVarL = PasswordRequestOptions.l();
            aVarL.b(false);
            this.f13928a = aVarL.a();
            GoogleIdTokenRequestOptions.a aVarL2 = GoogleIdTokenRequestOptions.l();
            aVarL2.g(false);
            this.f13929b = aVarL2.b();
            PasskeysRequestOptions.a aVarL3 = PasskeysRequestOptions.l();
            aVarL3.d(false);
            this.f13930c = aVarL3.a();
            PasskeyJsonRequestOptions.a aVarL4 = PasskeyJsonRequestOptions.l();
            aVarL4.c(false);
            this.f13931d = aVarL4.a();
        }

        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f13928a, this.f13929b, this.f13932e, this.f13933f, this.f13934g, this.f13930c, this.f13931d, this.f13935h);
        }

        public a b(boolean z7) {
            this.f13933f = z7;
            return this;
        }

        public a c(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f13929b = (GoogleIdTokenRequestOptions) C2651i.l(googleIdTokenRequestOptions);
            return this;
        }

        public a d(PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f13931d = (PasskeyJsonRequestOptions) C2651i.l(passkeyJsonRequestOptions);
            return this;
        }

        @Deprecated
        public a e(PasskeysRequestOptions passkeysRequestOptions) {
            this.f13930c = (PasskeysRequestOptions) C2651i.l(passkeysRequestOptions);
            return this;
        }

        public a f(PasswordRequestOptions passwordRequestOptions) {
            this.f13928a = (PasswordRequestOptions) C2651i.l(passwordRequestOptions);
            return this;
        }

        public a g(boolean z7) {
            this.f13935h = z7;
            return this;
        }

        public final a h(String str) {
            this.f13932e = str;
            return this;
        }

        public final a i(int i7) {
            this.f13934g = i7;
            return this;
        }
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z7, int i7, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z8) {
        this.f13895d = (PasswordRequestOptions) C2651i.l(passwordRequestOptions);
        this.f13896e = (GoogleIdTokenRequestOptions) C2651i.l(googleIdTokenRequestOptions);
        this.f13897i = str;
        this.f13898v = z7;
        this.f13899w = i7;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a aVarL = PasskeysRequestOptions.l();
            aVarL.d(false);
            passkeysRequestOptions = aVarL.a();
        }
        this.f13900y = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a aVarL2 = PasskeyJsonRequestOptions.l();
            aVarL2.c(false);
            passkeyJsonRequestOptions = aVarL2.a();
        }
        this.f13901z = passkeyJsonRequestOptions;
        this.f13894A = z8;
    }

    public static a l() {
        return new a();
    }

    public static a t(BeginSignInRequest beginSignInRequest) {
        C2651i.l(beginSignInRequest);
        a aVarL = l();
        aVarL.c(beginSignInRequest.n());
        aVarL.f(beginSignInRequest.q());
        aVarL.e(beginSignInRequest.p());
        aVarL.d(beginSignInRequest.o());
        aVarL.b(beginSignInRequest.f13898v);
        aVarL.i(beginSignInRequest.f13899w);
        aVarL.g(beginSignInRequest.f13894A);
        String str = beginSignInRequest.f13897i;
        if (str != null) {
            aVarL.h(str);
        }
        return aVarL;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return C2649g.b(this.f13895d, beginSignInRequest.f13895d) && C2649g.b(this.f13896e, beginSignInRequest.f13896e) && C2649g.b(this.f13900y, beginSignInRequest.f13900y) && C2649g.b(this.f13901z, beginSignInRequest.f13901z) && C2649g.b(this.f13897i, beginSignInRequest.f13897i) && this.f13898v == beginSignInRequest.f13898v && this.f13899w == beginSignInRequest.f13899w && this.f13894A == beginSignInRequest.f13894A;
    }

    public int hashCode() {
        return C2649g.c(this.f13895d, this.f13896e, this.f13900y, this.f13901z, this.f13897i, Boolean.valueOf(this.f13898v), Integer.valueOf(this.f13899w), Boolean.valueOf(this.f13894A));
    }

    public GoogleIdTokenRequestOptions n() {
        return this.f13896e;
    }

    public PasskeyJsonRequestOptions o() {
        return this.f13901z;
    }

    public PasskeysRequestOptions p() {
        return this.f13900y;
    }

    public PasswordRequestOptions q() {
        return this.f13895d;
    }

    public boolean r() {
        return this.f13894A;
    }

    public boolean s() {
        return this.f13898v;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, q(), i7, false);
        C2679b.s(parcel, 2, n(), i7, false);
        C2679b.u(parcel, 3, this.f13897i, false);
        C2679b.c(parcel, 4, s());
        C2679b.m(parcel, 5, this.f13899w);
        C2679b.s(parcel, 6, p(), i7, false);
        C2679b.s(parcel, 7, o(), i7, false);
        C2679b.c(parcel, 8, r());
        C2679b.b(parcel, iA);
    }
}
