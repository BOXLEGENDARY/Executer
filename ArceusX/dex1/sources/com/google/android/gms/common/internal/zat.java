package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new h();

    final int f14341d;

    private final Account f14342e;

    private final int f14343i;

    private final GoogleSignInAccount f14344v;

    zat(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f14341d = i7;
        this.f14342e = account;
        this.f14343i = i8;
        this.f14344v = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14341d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.s(parcel, 2, this.f14342e, i7, false);
        C2679b.m(parcel, 3, this.f14343i);
        C2679b.s(parcel, 4, this.f14344v, i7, false);
        C2679b.b(parcel, iA);
    }

    public zat(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }
}
