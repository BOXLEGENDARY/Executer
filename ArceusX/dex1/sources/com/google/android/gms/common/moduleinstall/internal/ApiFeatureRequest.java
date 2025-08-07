package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import l3.InterfaceC2534i;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;
import r3.C2746d;
import s3.C2873c;

public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C2873c();

    private static final Comparator f14372w = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.l() > feature2.l() ? 1 : (feature.l() == feature2.l() ? 0 : -1));
        }
    };

    private final List f14373d;

    private final boolean f14374e;

    private final String f14375i;

    private final String f14376v;

    public ApiFeatureRequest(List list, boolean z7, String str, String str2) {
        C2651i.l(list);
        this.f14373d = list;
        this.f14374e = z7;
        this.f14375i = str;
        this.f14376v = str2;
    }

    public static ApiFeatureRequest l(C2746d c2746d) {
        return o(c2746d.a(), true);
    }

    static ApiFeatureRequest o(List list, boolean z7) {
        TreeSet treeSet = new TreeSet(f14372w);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC2534i) it.next()).b());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z7, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f14374e == apiFeatureRequest.f14374e && C2649g.b(this.f14373d, apiFeatureRequest.f14373d) && C2649g.b(this.f14375i, apiFeatureRequest.f14375i) && C2649g.b(this.f14376v, apiFeatureRequest.f14376v);
    }

    public final int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14374e), this.f14373d, this.f14375i, this.f14376v);
    }

    public List<Feature> n() {
        return this.f14373d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.y(parcel, 1, n(), false);
        C2679b.c(parcel, 2, this.f14374e);
        C2679b.u(parcel, 3, this.f14375i, false);
        C2679b.u(parcel, 4, this.f14376v, false);
        C2679b.b(parcel, iA);
    }
}
