package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class C2199c1 extends SQLiteOpenHelper {

    final C2204d1 f16724d;

    C2199c1(C2204d1 c2204d1, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f16724d = c2204d1;
    }

    @Override
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e7) {
            throw e7;
        } catch (SQLiteException unused) {
            this.f16724d.f16818a.b().r().a("Opening the local database failed, dropping and recreating it");
            this.f16724d.f16818a.z();
            if (!this.f16724d.f16818a.f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f16724d.f16818a.b().r().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e8) {
                this.f16724d.f16818a.b().r().b("Failed to open local database. Events will bypass local storage", e8);
                return null;
            }
        }
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2232j.b(this.f16724d.f16818a.b(), sQLiteDatabase);
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C2232j.a(this.f16724d.f16818a.b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
