package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.AbstractBinderC2642S;
import o3.C2679b;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new D();

    private final String f14415d;

    private final w f14416e;

    private final boolean f14417i;

    private final boolean f14418v;

    zzs(String str, w wVar, boolean z7, boolean z8) {
        this.f14415d = str;
        this.f14416e = wVar;
        this.f14417i = z7;
        this.f14418v = z8;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14415d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        w wVar = this.f14416e;
        if (wVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            wVar = null;
        }
        C2679b.l(parcel, 2, wVar, false);
        C2679b.c(parcel, 3, this.f14417i);
        C2679b.c(parcel, 4, this.f14418v);
        C2679b.b(parcel, iA);
    }

    zzs(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f14415d = str;
        x xVar = null;
        if (iBinder != null) {
            try {
                InterfaceC3023a interfaceC3023aD = AbstractBinderC2642S.O0(iBinder).d();
                byte[] bArr = interfaceC3023aD == null ? null : (byte[]) BinderC3024b.V0(interfaceC3023aD);
                if (bArr != null) {
                    xVar = new x(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f14416e = xVar;
        this.f14417i = z7;
        this.f14418v = z8;
    }
}
