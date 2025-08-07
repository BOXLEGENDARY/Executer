package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new f3.g();

    private final PendingIntent f13956d;

    public SavePasswordResult(PendingIntent pendingIntent) {
        this.f13956d = (PendingIntent) C2651i.l(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return C2649g.b(this.f13956d, ((SavePasswordResult) obj).f13956d);
        }
        return false;
    }

    public int hashCode() {
        return C2649g.c(this.f13956d);
    }

    public PendingIntent l() {
        return this.f13956d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, l(), i7, false);
        C2679b.b(parcel, iA);
    }
}
