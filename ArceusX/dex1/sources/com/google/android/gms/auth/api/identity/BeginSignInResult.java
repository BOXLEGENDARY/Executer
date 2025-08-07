package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f3.C2444d;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C2444d();

    private final PendingIntent f13936d;

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f13936d = (PendingIntent) C2651i.l(pendingIntent);
    }

    public PendingIntent l() {
        return this.f13936d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, l(), i7, false);
        C2679b.b(parcel, iA);
    }
}
