package com.google.android.gms.measurement.internal;

import U.Gw.oeVkjmfPcLbWm;
import W0.JWp.kNUgEaOjcPdX;
import Y3.qE.KpBmp;
import Z.tNT.PexNRiLSd;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.appcompat.app.FN.krlBPZZeK;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.room.kU.HguUe;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.gms.internal.measurement.C1920l6;
import f6.ck.ZJZXBWla;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.BAKp.xAQOwX;
import ka.oik.UJEa;
import n3.C2651i;
import t4.gYZ.uCYQMIHsy;
import y0.xyyu.hkVlaTTCDY;

final class C2227i extends T3 {

    private static final String[] f16822f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    private static final String[] f16823g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    private static final String[] f16824h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", oeVkjmfPcLbWm.xQNT, "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    private static final String[] f16825i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    private static final String[] f16826j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    private static final String[] f16827k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    private static final String[] f16828l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    private static final String[] f16829m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    private final C2222h f16830d;

    private final P3 f16831e;

    C2227i(c4 c4Var) {
        super(c4Var);
        this.f16831e = new P3(this.f16818a.c());
        this.f16818a.z();
        this.f16830d = new C2222h(this, this.f16818a.f(), "google_app_measurement.db");
    }

    static final void J(ContentValues contentValues, String str, Object obj) {
        C2651i.f("value");
        C2651i.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = R().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                this.f16818a.b().r().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long M(String str, String[] strArr, long j7) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = R().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j7;
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                this.f16818a.b().r().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void I(String str, long j7, long j8, b4 b4Var) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        Cursor cursorRawQuery;
        String string;
        String str2;
        String[] strArr;
        C2651i.l(b4Var);
        h();
        i();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR = R();
                IsEmpty = TextUtils.isEmpty(null);
                String str3 = BuildConfig.FLAVOR;
                try {
                    if (IsEmpty != 0) {
                        String[] strArr2 = j8 != -1 ? new String[]{String.valueOf(j8), String.valueOf(j7)} : new String[]{String.valueOf(j7)};
                        if (j8 != -1) {
                            str3 = "rowid <= ? and ";
                        }
                        StringBuilder sb = new StringBuilder(str3.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str3);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseR.rawQuery(sb.toString(), strArr2);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j8 != -1 ? new String[]{null, String.valueOf(j8)} : new String[]{null};
                        if (j8 != -1) {
                            str3 = " and rowid <= ?";
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str3);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseR.rawQuery(sb2.toString(), strArr3);
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str4 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseR.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.f16818a.b().r().b("Raw event metadata record is missing. appId", C2234j1.z(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                com.google.android.gms.internal.measurement.R1 r1L = ((com.google.android.gms.internal.measurement.Q1) e4.D(com.google.android.gms.internal.measurement.R1.J1(), cursorQuery.getBlob(0))).l();
                                if (cursorQuery.moveToNext()) {
                                    this.f16818a.b().w().b("Get multiple raw event metadata records, expected one. appId", C2234j1.z(string2));
                                }
                                cursorQuery.close();
                                C2651i.l(r1L);
                                b4Var.f16718a = r1L;
                                if (j8 != -1) {
                                    str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    strArr = new String[]{string2, str4, String.valueOf(j8)};
                                } else {
                                    str2 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{string2, str4};
                                }
                                Cursor cursorQuery2 = sQLiteDatabaseR.query(krlBPZZeK.KadMkrFof, new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                if (!cursorQuery2.moveToFirst()) {
                                    this.f16818a.b().w().b("Raw event data disappeared while in transaction. appId", C2234j1.z(string2));
                                    cursorQuery2.close();
                                    return;
                                }
                                do {
                                    long j9 = cursorQuery2.getLong(0);
                                    try {
                                        com.google.android.gms.internal.measurement.G1 g12 = (com.google.android.gms.internal.measurement.G1) e4.D(com.google.android.gms.internal.measurement.H1.B(), cursorQuery2.getBlob(3));
                                        g12.C(cursorQuery2.getString(1));
                                        g12.G(cursorQuery2.getLong(2));
                                        if (!b4Var.a(j9, g12.l())) {
                                            cursorQuery2.close();
                                            return;
                                        }
                                    } catch (IOException e7) {
                                        this.f16818a.b().r().c("Data loss. Failed to merge raw event. appId", C2234j1.z(string2), e7);
                                    }
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                            } catch (IOException e8) {
                                this.f16818a.b().r().c("Data loss. Failed to merge raw event metadata. appId", C2234j1.z(string2), e8);
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e9) {
                            e = e9;
                            IsEmpty = cursorQuery;
                            this.f16818a.b().r().c("Data loss. Error selecting raw event. appId", C2234j1.z(string2), e);
                            if (IsEmpty != 0) {
                                IsEmpty.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursorQuery;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        IsEmpty = cursor3;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
            }
        } catch (SQLiteException e12) {
            e = e12;
            IsEmpty = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final int K(String str, String str2) {
        C2651i.f(str);
        C2651i.f(str2);
        h();
        i();
        try {
            return R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            this.f16818a.b().r().d("Error deleting conditional property", C2234j1.z(str), this.f16818a.D().f(str2), e7);
            return 0;
        }
    }

    protected final long N(String str, String str2) {
        SQLiteException e7;
        long jM;
        ContentValues contentValues;
        C2651i.f(str);
        C2651i.f("first_open_count");
        h();
        i();
        SQLiteDatabase sQLiteDatabaseR = R();
        sQLiteDatabaseR.beginTransaction();
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                jM = M(sb.toString(), new String[]{str}, -1L);
                if (jM == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseR.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f16818a.b().r().c(uCYQMIHsy.zXGbIHRl, C2234j1.z(str), "first_open_count");
                        return -1L;
                    }
                    jM = 0;
                }
            } catch (SQLiteException e8) {
                e7 = e8;
                jM = 0;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + jM));
            } catch (SQLiteException e9) {
                e7 = e9;
                this.f16818a.b().r().d("Error inserting column. appId", C2234j1.z(str), "first_open_count", e7);
                return jM;
            }
            if (sQLiteDatabaseR.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f16818a.b().r().c("Failed to update column (got 0). appId", C2234j1.z(str), "first_open_count");
                return -1L;
            }
            sQLiteDatabaseR.setTransactionSuccessful();
            return jM;
        } finally {
            sQLiteDatabaseR.endTransaction();
        }
    }

    public final long O() {
        return M("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long P() {
        return M("select max(timestamp) from raw_events", null, 0L);
    }

    public final long Q(String str) {
        C2651i.f(str);
        return M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase R() {
        h();
        try {
            return this.f16830d.getWritableDatabase();
        } catch (SQLiteException e7) {
            this.f16818a.b().w().b("Error opening database", e7);
            throw e7;
        }
    }

    public final android.os.Bundle S(java.lang.String r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.S(java.lang.String):android.os.Bundle");
    }

    public final com.google.android.gms.measurement.internal.S1 T(java.lang.String r34) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.T(java.lang.String):com.google.android.gms.measurement.internal.S1");
    }

    public final com.google.android.gms.measurement.internal.zzab U(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    public final C2217g V(long j7, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return W(j7, str, 1L, false, false, z9, false, z11);
    }

    public final C2217g W(long j7, String str, long j8, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C2651i.f(str);
        h();
        i();
        String[] strArr = {str};
        C2217g c2217g = new C2217g();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR = R();
                Cursor cursorQuery = sQLiteDatabaseR.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.f16818a.b().w().b("Not updating daily counts, app is not known. appId", C2234j1.z(str));
                    cursorQuery.close();
                    return c2217g;
                }
                if (cursorQuery.getLong(0) == j7) {
                    c2217g.f16791b = cursorQuery.getLong(1);
                    c2217g.f16790a = cursorQuery.getLong(2);
                    c2217g.f16792c = cursorQuery.getLong(3);
                    c2217g.f16793d = cursorQuery.getLong(4);
                    c2217g.f16794e = cursorQuery.getLong(5);
                }
                if (z7) {
                    c2217g.f16791b += j8;
                }
                if (z8) {
                    c2217g.f16790a += j8;
                }
                if (z9) {
                    c2217g.f16792c += j8;
                }
                if (z10) {
                    c2217g.f16793d += j8;
                }
                if (z11) {
                    c2217g.f16794e += j8;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j7));
                contentValues.put("daily_public_events_count", Long.valueOf(c2217g.f16790a));
                contentValues.put("daily_events_count", Long.valueOf(c2217g.f16791b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2217g.f16792c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2217g.f16793d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2217g.f16794e));
                sQLiteDatabaseR.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c2217g;
            } catch (SQLiteException e7) {
                this.f16818a.b().r().c("Error updating daily counts. appId", C2234j1.z(str), e7);
                if (0 != 0) {
                    cursor.close();
                }
                return c2217g;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final com.google.android.gms.measurement.internal.C2257o X(java.lang.String r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    public final com.google.android.gms.measurement.internal.g4 Z(java.lang.String r11, java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g4");
    }

    final Object a0(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            this.f16818a.b().r().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            this.f16818a.b().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f16818a.b().r().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final java.lang.String b0() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.b0():java.lang.String");
    }

    public final List<zzab> c0(String str, String str2, String str3) {
        C2651i.f(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return d0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final java.util.List<com.google.android.gms.measurement.internal.zzab> d0(java.lang.String r28, java.lang.String[] r29) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<g4> e0(String str) {
        C2651i.f(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.f16818a.z();
                cursorQuery = R().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.FLAVOR;
                    }
                    String str2 = string2;
                    long j7 = cursorQuery.getLong(2);
                    Object objA0 = a0(cursorQuery, 3);
                    if (objA0 == null) {
                        this.f16818a.b().r().b("Read invalid user property value, ignoring it. appId", C2234j1.z(str));
                    } else {
                        arrayList.add(new g4(str, str2, string, j7, objA0));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e7) {
                this.f16818a.b().r().c("Error querying user properties. appId", C2234j1.z(str), e7);
                List<g4> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final java.util.List<com.google.android.gms.measurement.internal.g4> f0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void g0() {
        i();
        R().beginTransaction();
    }

    public final void h0(List<Long> list) {
        C2651i.l(list);
        h();
        i();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i7).longValue());
        }
        sb.append(")");
        int iDelete = R().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            this.f16818a.b().r().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final void i0() {
        i();
        R().endTransaction();
    }

    final void j0(List<Long> list) throws SQLException {
        h();
        i();
        C2651i.l(list);
        C2651i.n(list.size());
        if (w()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append(JmBUOGMwkkxg.RwFi);
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (L(sb2.toString(), null) > 0) {
                this.f16818a.b().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseR = R();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < ");
                sb3.append(Integer.MAX_VALUE);
                sb3.append(")");
                sQLiteDatabaseR.execSQL(sb3.toString());
            } catch (SQLiteException e7) {
                this.f16818a.b().r().b("Error incrementing retry count. error", e7);
            }
        }
    }

    @Override
    protected final boolean l() {
        return false;
    }

    final void m() {
        h();
        i();
        if (w()) {
            long jA = this.f16519b.d0().f16256g.a();
            long jB = this.f16818a.c().b();
            long jAbs = Math.abs(jB - jA);
            this.f16818a.z();
            if (jAbs > Y0.f16656z.a(null).longValue()) {
                this.f16519b.d0().f16256g.b(jB);
                h();
                i();
                if (w()) {
                    SQLiteDatabase sQLiteDatabaseR = R();
                    String strValueOf = String.valueOf(this.f16818a.c().a());
                    this.f16818a.z();
                    int iDelete = sQLiteDatabaseR.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C2212f.i())});
                    if (iDelete > 0) {
                        this.f16818a.b().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final void n(String str, String str2) {
        C2651i.f(str);
        C2651i.f(str2);
        h();
        i();
        try {
            R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            this.f16818a.b().r().d("Error deleting user property. appId", C2234j1.z(str), this.f16818a.D().f(str2), e7);
        }
    }

    final void o(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.Z0> r25) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2227i.o(java.lang.String, java.util.List):void");
    }

    public final void p() {
        i();
        R().setTransactionSuccessful();
    }

    public final void q(S1 s1) {
        C2651i.l(s1);
        h();
        i();
        String strE0 = s1.e0();
        C2651i.l(strE0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(UJEa.dsrdbxRyPbAsvVD, strE0);
        contentValues.put("app_instance_id", s1.f0());
        contentValues.put("gmp_app_id", s1.k0());
        contentValues.put(kNUgEaOjcPdX.piBxHpZM, s1.b());
        contentValues.put("last_bundle_index", Long.valueOf(s1.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(s1.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(s1.Y()));
        contentValues.put("app_version", s1.h0());
        contentValues.put("app_store", s1.g0());
        contentValues.put(sMlEMqrxoGI.PhfM, Long.valueOf(s1.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(s1.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(s1.K()));
        contentValues.put(hkVlaTTCDY.YclEJZWQ, Long.valueOf(s1.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(s1.R()));
        contentValues.put("daily_events_count", Long.valueOf(s1.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(s1.O()));
        contentValues.put("config_fetched_time", Long.valueOf(s1.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(s1.W()));
        contentValues.put("app_version_int", Long.valueOf(s1.M()));
        contentValues.put("firebase_instance_id", s1.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(s1.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(s1.S()));
        contentValues.put("health_monitor_sample", s1.a());
        contentValues.put("android_id", Long.valueOf(s1.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(s1.J()));
        contentValues.put("admob_app_id", s1.c0());
        contentValues.put("dynamite_version", Long.valueOf(s1.V()));
        List<String> listC = s1.c();
        if (listC != null) {
            if (listC.size() == 0) {
                this.f16818a.b().w().b(PexNRiLSd.PMxHrzfFRv, strE0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listC));
            }
        }
        C1920l6.b();
        if (this.f16818a.z().B(strE0, Y0.f16615e0)) {
            contentValues.put("ga_app_id", s1.j0());
        }
        try {
            SQLiteDatabase sQLiteDatabaseR = R();
            if (sQLiteDatabaseR.update("apps", contentValues, "app_id = ?", new String[]{strE0}) == 0 && sQLiteDatabaseR.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f16818a.b().r().b("Failed to insert/update app (got -1). appId", C2234j1.z(strE0));
            }
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c("Error storing app. appId", C2234j1.z(strE0), e7);
        }
    }

    public final void r(C2257o c2257o) {
        C2651i.l(c2257o);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KpBmp.ddScHUbZgyVqSQI, c2257o.f16931a);
        contentValues.put("name", c2257o.f16932b);
        contentValues.put("lifetime_count", Long.valueOf(c2257o.f16933c));
        contentValues.put("current_bundle_count", Long.valueOf(c2257o.f16934d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2257o.f16936f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2257o.f16937g));
        contentValues.put("last_bundled_day", c2257o.f16938h);
        contentValues.put("last_sampled_complex_event_id", c2257o.f16939i);
        contentValues.put("last_sampling_rate", c2257o.f16940j);
        contentValues.put("current_session_count", Long.valueOf(c2257o.f16935e));
        Boolean bool = c2257o.f16941k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (R().insertWithOnConflict(HguUe.CXTtvv, null, contentValues, 5) == -1) {
                this.f16818a.b().r().b("Failed to insert/update event aggregates (got -1). appId", C2234j1.z(c2257o.f16931a));
            }
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c(ZJZXBWla.aDKeomaOhNU, C2234j1.z(c2257o.f16931a), e7);
        }
    }

    public final void s(String str, byte[] bArr, String str2) {
        C2651i.f(str);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (R().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f16818a.b().r().b("Failed to update remote config (got 0). appId", C2234j1.z(str));
            }
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c("Error storing remote config. appId", C2234j1.z(str), e7);
        }
    }

    public final boolean t() {
        return L("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean u() {
        return L("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean v() {
        return L("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean w() {
        Context contextF = this.f16818a.f();
        this.f16818a.z();
        return contextF.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean x(String str, Long l7, long j7, com.google.android.gms.internal.measurement.H1 h12) {
        h();
        i();
        C2651i.l(h12);
        C2651i.f(str);
        C2651i.l(l7);
        byte[] bArrJ = h12.j();
        this.f16818a.b().v().c("Saving complex main event, appId, data size", this.f16818a.D().d(str), Integer.valueOf(bArrJ.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", bArrJ);
        try {
            if (R().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f16818a.b().r().b(KwdswzaUHE.TbjwmfGSkkCpR, C2234j1.z(str));
            return false;
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c("Error storing complex main event. appId", C2234j1.z(str), e7);
            return false;
        }
    }

    public final boolean y(zzab zzabVar) {
        C2651i.l(zzabVar);
        h();
        i();
        String str = zzabVar.f17134d;
        C2651i.l(str);
        if (Z(str, zzabVar.f17136i.f17147e) == null) {
            long jL = L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f16818a.z();
            if (jL >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzabVar.f17135e);
        contentValues.put("name", zzabVar.f17136i.f17147e);
        J(contentValues, "value", C2651i.l(zzabVar.f17136i.l()));
        contentValues.put("active", Boolean.valueOf(zzabVar.f17138w));
        contentValues.put("trigger_event_name", zzabVar.f17139y);
        contentValues.put("trigger_timeout", Long.valueOf(zzabVar.f17130A));
        contentValues.put("timed_out_event", this.f16818a.N().c0(zzabVar.f17140z));
        contentValues.put(HguUe.KJtEFHmIyc, Long.valueOf(zzabVar.f17137v));
        contentValues.put("triggered_event", this.f16818a.N().c0(zzabVar.f17131B));
        contentValues.put("triggered_timestamp", Long.valueOf(zzabVar.f17136i.f17148i));
        contentValues.put("time_to_live", Long.valueOf(zzabVar.f17132C));
        contentValues.put("expired_event", this.f16818a.N().c0(zzabVar.f17133D));
        try {
            if (R().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.f16818a.b().r().b("Failed to insert/update conditional user property (got -1)", C2234j1.z(str));
            return true;
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c(xAQOwX.oZYOg, C2234j1.z(str), e7);
            return true;
        }
    }

    public final boolean z(g4 g4Var) {
        C2651i.l(g4Var);
        h();
        i();
        if (Z(g4Var.f16807a, g4Var.f16809c) == null) {
            if (i4.W(g4Var.f16809c)) {
                if (L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{g4Var.f16807a}) >= this.f16818a.z().p(g4Var.f16807a, Y0.f16587H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(g4Var.f16809c)) {
                long jL = L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{g4Var.f16807a, g4Var.f16808b});
                this.f16818a.z();
                if (jL >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g4Var.f16807a);
        contentValues.put("origin", g4Var.f16808b);
        contentValues.put("name", g4Var.f16809c);
        contentValues.put("set_timestamp", Long.valueOf(g4Var.f16810d));
        J(contentValues, "value", g4Var.f16811e);
        try {
            if (R().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f16818a.b().r().b("Failed to insert/update user property (got -1). appId", C2234j1.z(g4Var.f16807a));
            return true;
        } catch (SQLiteException e7) {
            this.f16818a.b().r().c("Error storing user property. appId", C2234j1.z(g4Var.f16807a), e7);
            return true;
        }
    }
}
