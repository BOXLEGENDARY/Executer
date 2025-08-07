package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import o3.C2678a;
import o3.C2679b;

public final class s implements Parcelable.Creator {
    static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, getServiceRequest.f14242d);
        C2679b.m(parcel, 2, getServiceRequest.f14243e);
        C2679b.m(parcel, 3, getServiceRequest.f14244i);
        C2679b.u(parcel, 4, getServiceRequest.f14245v, false);
        C2679b.l(parcel, 5, getServiceRequest.f14246w, false);
        C2679b.x(parcel, 6, getServiceRequest.f14247y, i7, false);
        C2679b.e(parcel, 7, getServiceRequest.f14248z, false);
        C2679b.s(parcel, 8, getServiceRequest.f14235A, i7, false);
        C2679b.x(parcel, 10, getServiceRequest.f14236B, i7, false);
        C2679b.x(parcel, 11, getServiceRequest.f14237C, i7, false);
        C2679b.c(parcel, 12, getServiceRequest.f14238D);
        C2679b.m(parcel, 13, getServiceRequest.f14239E);
        C2679b.c(parcel, 14, getServiceRequest.f14240F);
        C2679b.u(parcel, 15, getServiceRequest.l(), false);
        C2679b.b(parcel, iA);
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Scope[] scopeArr = GetServiceRequest.f14233H;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f14234I;
        Feature[] featureArr2 = featureArr;
        String strG = null;
        IBinder iBinderU = null;
        Account account = null;
        String strG2 = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zN = false;
        int iV4 = 0;
        boolean zN2 = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 3:
                    iV3 = C2678a.v(parcel, iT);
                    break;
                case 4:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 5:
                    iBinderU = C2678a.u(parcel, iT);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2678a.j(parcel, iT, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C2678a.a(parcel, iT);
                    break;
                case 8:
                    account = (Account) C2678a.f(parcel, iT, Account.CREATOR);
                    break;
                case 9:
                default:
                    C2678a.B(parcel, iT);
                    break;
                case 10:
                    featureArr = (Feature[]) C2678a.j(parcel, iT, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C2678a.j(parcel, iT, Feature.CREATOR);
                    break;
                case 12:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 13:
                    iV4 = C2678a.v(parcel, iT);
                    break;
                case 14:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 15:
                    strG2 = C2678a.g(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new GetServiceRequest(iV, iV2, iV3, strG, iBinderU, scopeArr, bundle, account, featureArr, featureArr2, zN, iV4, zN2, strG2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GetServiceRequest[i7];
    }
}
