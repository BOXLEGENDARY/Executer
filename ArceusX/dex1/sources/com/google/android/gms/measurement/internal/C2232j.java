package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public final class C2232j {
    static void a(com.google.android.gms.measurement.internal.C2234j1 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2232j.a(com.google.android.gms.measurement.internal.j1, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    static void b(C2234j1 c2234j1, SQLiteDatabase sQLiteDatabase) {
        if (c2234j1 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c2234j1.w().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c2234j1.w().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c2234j1.w().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c2234j1.w().a("Failed to turn on database write permission for owner");
    }
}
