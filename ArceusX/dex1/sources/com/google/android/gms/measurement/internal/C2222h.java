package com.google.android.gms.measurement.internal;

import S9.Gvmm.CAqKeu;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import ka.oik.UJEa;

final class C2222h extends SQLiteOpenHelper {

    final C2227i f16812d;

    C2222h(C2227i c2227i, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f16812d = c2227i;
    }

    @Override
    public final SQLiteDatabase getWritableDatabase() {
        P3 p32 = this.f16812d.f16831e;
        this.f16812d.f16818a.z();
        if (!p32.c(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.f16812d.f16831e.b();
            this.f16812d.f16818a.b().r().a("Opening the database failed, dropping and recreating it");
            this.f16812d.f16818a.z();
            if (!this.f16812d.f16818a.f().getDatabasePath("google_app_measurement.db").delete()) {
                this.f16812d.f16818a.b().r().b("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                this.f16812d.f16831e.a();
                return writableDatabase;
            } catch (SQLiteException e7) {
                this.f16812d.f16818a.b().r().b("Failed to open freshly created database", e7);
                throw e7;
            }
        }
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2232j.b(this.f16812d.f16818a.b(), sQLiteDatabase);
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C2227i.f16822f);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C2227i.f16823g);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C2227i.f16824h);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C2227i.f16826j);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "raw_events", CAqKeu.WIgDKTJ, "app_id,name,timestamp,metadata_fingerprint,data", C2227i.f16825i);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", UJEa.UVBtaXWalF, C2227i.f16827k);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C2227i.f16828l);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C2227i.f16829m);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C2232j.a(this.f16812d.f16818a.b(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
