package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o3.C2679b;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new e();

    private final List<LocationRequest> f16216d;

    private final boolean f16217e;

    private final boolean f16218i;

    private zzbj f16219v;

    public static final class a {

        private final ArrayList<LocationRequest> f16220a = new ArrayList<>();

        private boolean f16221b = false;

        private boolean f16222c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f16220a.add(locationRequest);
            }
            return this;
        }

        public LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.f16220a, this.f16221b, this.f16222c, null);
        }

        public a c(boolean z7) {
            this.f16221b = z7;
            return this;
        }
    }

    LocationSettingsRequest(List<LocationRequest> list, boolean z7, boolean z8, zzbj zzbjVar) {
        this.f16216d = list;
        this.f16217e = z7;
        this.f16218i = z8;
        this.f16219v = zzbjVar;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.y(parcel, 1, Collections.unmodifiableList(this.f16216d), false);
        C2679b.c(parcel, 2, this.f16217e);
        C2679b.c(parcel, 3, this.f16218i);
        C2679b.s(parcel, 5, this.f16219v, i7, false);
        C2679b.b(parcel, iA);
    }
}
