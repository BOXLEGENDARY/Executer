package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import l3.InterfaceC2540o;
import o3.C2679b;

public final class zag extends AbstractSafeParcelable implements InterfaceC2540o {
    public static final Parcelable.Creator<zag> CREATOR = new Y3.d();

    private final List f17183d;

    private final String f17184e;

    public zag(List list, String str) {
        this.f17183d = list;
        this.f17184e = str;
    }

    @Override
    public final Status d() {
        return this.f17184e != null ? Status.f14060y : Status.f14056C;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f17183d;
        int iA = C2679b.a(parcel);
        C2679b.w(parcel, 1, list, false);
        C2679b.u(parcel, 2, this.f17184e, false);
        C2679b.b(parcel, iA);
    }
}
