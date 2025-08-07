package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new s();

    static final Scope[] f14233H = new Scope[0];

    static final Feature[] f14234I = new Feature[0];

    Account f14235A;

    Feature[] f14236B;

    Feature[] f14237C;

    final boolean f14238D;

    final int f14239E;

    boolean f14240F;

    private final String f14241G;

    final int f14242d;

    final int f14243e;

    final int f14244i;

    String f14245v;

    IBinder f14246w;

    Scope[] f14247y;

    Bundle f14248z;

    GetServiceRequest(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z7, int i10, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f14233H : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f14234I : featureArr;
        featureArr2 = featureArr2 == null ? f14234I : featureArr2;
        this.f14242d = i7;
        this.f14243e = i8;
        this.f14244i = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f14245v = "com.google.android.gms";
        } else {
            this.f14245v = str;
        }
        if (i7 < 2) {
            this.f14235A = iBinder != null ? a.V0(e.a.O0(iBinder)) : null;
        } else {
            this.f14246w = iBinder;
            this.f14235A = account;
        }
        this.f14247y = scopeArr;
        this.f14248z = bundle;
        this.f14236B = featureArr;
        this.f14237C = featureArr2;
        this.f14238D = z7;
        this.f14239E = i10;
        this.f14240F = z8;
        this.f14241G = str2;
    }

    public final String l() {
        return this.f14241G;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        s.a(this, parcel, i7);
    }
}
