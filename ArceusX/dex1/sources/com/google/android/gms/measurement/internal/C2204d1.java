package com.google.android.gms.measurement.internal;

import Z.tNT.PexNRiLSd;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

public final class C2204d1 extends AbstractC2298w1 {

    private final C2199c1 f16761c;

    private boolean f16762d;

    C2204d1(N1 n1) {
        super(n1);
        Context contextF = this.f16818a.f();
        this.f16818a.z();
        this.f16761c = new C2199c1(this, contextF, "google_app_measurement_local.db");
    }

    private final boolean x(int r17, byte[] r18) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2204d1.x(int, byte[]):boolean");
    }

    @Override
    protected final boolean n() {
        return false;
    }

    final SQLiteDatabase o() throws SQLiteException {
        if (this.f16762d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16761c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f16762d = true;
        return null;
    }

    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> p(int r23) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2204d1.p(int):java.util.List");
    }

    public final void q() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseO = o();
            if (sQLiteDatabaseO == null || (iDelete = sQLiteDatabaseO.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f16818a.b().v().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e7) {
            this.f16818a.b().r().b("Error resetting local analytics data. error", e7);
        }
    }

    public final boolean r() {
        return x(3, new byte[0]);
    }

    final boolean s() {
        Context contextF = this.f16818a.f();
        this.f16818a.z();
        return contextF.getDatabasePath(PexNRiLSd.LKsnvRRIz).exists();
    }

    public final boolean t() {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2204d1.t():boolean");
    }

    public final boolean u(zzab zzabVar) {
        byte[] bArrC0 = this.f16818a.N().c0(zzabVar);
        if (bArrC0.length <= 131072) {
            return x(2, bArrC0);
        }
        this.f16818a.b().t().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean v(zzat zzatVar) {
        Parcel parcelObtain = Parcel.obtain();
        r.a(zzatVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(0, bArrMarshall);
        }
        this.f16818a.b().t().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean w(zzkv zzkvVar) {
        Parcel parcelObtain = Parcel.obtain();
        f4.a(zzkvVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(1, bArrMarshall);
        }
        this.f16818a.b().t().a("User property too long for local database. Sending directly to service");
        return false;
    }
}
