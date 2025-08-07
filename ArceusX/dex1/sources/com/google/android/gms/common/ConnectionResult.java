package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class ConnectionResult extends AbstractSafeParcelable {

    final int f14035d;

    private final int f14036e;

    private final PendingIntent f14037i;

    private final String f14038v;

    public static final ConnectionResult f14034w = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new o();

    ConnectionResult(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f14035d = i7;
        this.f14036e = i8;
        this.f14037i = pendingIntent;
        this.f14038v = str;
    }

    static String r(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i7 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f14036e == connectionResult.f14036e && C2649g.b(this.f14037i, connectionResult.f14037i) && C2649g.b(this.f14038v, connectionResult.f14038v);
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f14036e), this.f14037i, this.f14038v);
    }

    public int l() {
        return this.f14036e;
    }

    public String n() {
        return this.f14038v;
    }

    public PendingIntent o() {
        return this.f14037i;
    }

    public boolean p() {
        return (this.f14036e == 0 || this.f14037i == null) ? false : true;
    }

    public boolean q() {
        return this.f14036e == 0;
    }

    public String toString() {
        C2649g.a aVarD = C2649g.d(this);
        aVarD.a("statusCode", r(this.f14036e));
        aVarD.a("resolution", this.f14037i);
        aVarD.a("message", this.f14038v);
        return aVarD.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14035d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.m(parcel, 2, l());
        C2679b.s(parcel, 3, o(), i7, false);
        C2679b.u(parcel, 4, n(), false);
        C2679b.b(parcel, iA);
    }

    public ConnectionResult(int i7) {
        this(i7, null, null);
    }

    public ConnectionResult(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public ConnectionResult(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }
}
