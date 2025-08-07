package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import l3.C2529d;
import l3.InterfaceC2540o;
import n3.C2649g;
import o3.C2679b;

public final class Status extends AbstractSafeParcelable implements InterfaceC2540o, ReflectedParcelable {

    private final int f14062d;

    private final String f14063e;

    private final PendingIntent f14064i;

    private final ConnectionResult f14065v;

    public static final Status f14059w = new Status(-1);

    public static final Status f14060y = new Status(0);

    public static final Status f14061z = new Status(14);

    public static final Status f14054A = new Status(8);

    public static final Status f14055B = new Status(15);

    public static final Status f14056C = new Status(16);

    public static final Status f14058E = new Status(17);

    public static final Status f14057D = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i7, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f14062d = i7;
        this.f14063e = str;
        this.f14064i = pendingIntent;
        this.f14065v = connectionResult;
    }

    @Override
    public Status d() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f14062d == status.f14062d && C2649g.b(this.f14063e, status.f14063e) && C2649g.b(this.f14064i, status.f14064i) && C2649g.b(this.f14065v, status.f14065v);
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f14062d), this.f14063e, this.f14064i, this.f14065v);
    }

    public ConnectionResult l() {
        return this.f14065v;
    }

    public PendingIntent n() {
        return this.f14064i;
    }

    @ResultIgnorabilityUnspecified
    public int o() {
        return this.f14062d;
    }

    public String p() {
        return this.f14063e;
    }

    public boolean q() {
        return this.f14064i != null;
    }

    public boolean r() {
        return this.f14062d <= 0;
    }

    public final String s() {
        String str = this.f14063e;
        return str != null ? str : C2529d.a(this.f14062d);
    }

    public String toString() {
        C2649g.a aVarD = C2649g.d(this);
        aVarD.a("statusCode", s());
        aVarD.a("resolution", this.f14064i);
        return aVarD.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, o());
        C2679b.u(parcel, 2, p(), false);
        C2679b.s(parcel, 3, this.f14064i, i7, false);
        C2679b.s(parcel, 4, l(), i7, false);
        C2679b.b(parcel, iA);
    }

    public Status(int i7) {
        this(i7, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i7, String str) {
        this(i7, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str, int i7) {
        this(i7, str, connectionResult.o(), connectionResult);
    }

    public Status(int i7, String str, PendingIntent pendingIntent) {
        this(i7, str, pendingIntent, null);
    }
}
