package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new b();

    private final int f13937d;

    public static final class a {
        a(f3.f fVar) {
        }

        public GetPhoneNumberHintIntentRequest a() {
            return new GetPhoneNumberHintIntentRequest(0);
        }
    }

    GetPhoneNumberHintIntentRequest(int i7) {
        this.f13937d = i7;
    }

    public static a l() {
        return new a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return C2649g.b(Integer.valueOf(this.f13937d), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f13937d));
        }
        return false;
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f13937d));
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13937d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.b(parcel, iA);
    }
}
