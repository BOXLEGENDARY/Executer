package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;
import o3.C2679b;
import r3.C2751i;

public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new C2751i();

    private final int f14364d;

    private final int f14365e;

    private final Long f14366i;

    private final Long f14367v;

    private final int f14368w;

    private final a f14369y;

    public static class a {

        private final long f14370a;

        private final long f14371b;

        a(long j7, long j8) {
            C2651i.o(j8);
            this.f14370a = j7;
            this.f14371b = j8;
        }
    }

    public ModuleInstallStatusUpdate(int i7, int i8, Long l7, Long l8, int i9) {
        this.f14364d = i7;
        this.f14365e = i8;
        this.f14366i = l7;
        this.f14367v = l8;
        this.f14368w = i9;
        this.f14369y = (l7 == null || l8 == null || l8.longValue() == 0) ? null : new a(l7.longValue(), l8.longValue());
    }

    public int l() {
        return this.f14368w;
    }

    public int n() {
        return this.f14365e;
    }

    public int o() {
        return this.f14364d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, o());
        C2679b.m(parcel, 2, n());
        C2679b.r(parcel, 3, this.f14366i, false);
        C2679b.r(parcel, 4, this.f14367v, false);
        C2679b.m(parcel, 5, l());
        C2679b.b(parcel, iA);
    }
}
