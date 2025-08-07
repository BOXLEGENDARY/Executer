package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import g0.C2457a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C1995v2 implements InterfaceC2027z2 {

    private static final Map<Uri, C1995v2> f15350g = new C2457a();

    public static final String[] f15351h = {"key", "value"};

    private final ContentResolver f15352a;

    private final Uri f15353b;

    private final ContentObserver f15354c;

    private final Object f15355d;

    private volatile Map<String, String> f15356e;

    private final List<InterfaceC2003w2> f15357f;

    private C1995v2(ContentResolver contentResolver, Uri uri) {
        C1979t2 c1979t2 = new C1979t2(this, null);
        this.f15354c = c1979t2;
        this.f15355d = new Object();
        this.f15357f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f15352a = contentResolver;
        this.f15353b = uri;
        contentResolver.registerContentObserver(uri, false, c1979t2);
    }

    public static C1995v2 a(ContentResolver contentResolver, Uri uri) {
        C1995v2 c1995v2;
        synchronized (C1995v2.class) {
            Map<Uri, C1995v2> map = f15350g;
            c1995v2 = map.get(uri);
            if (c1995v2 == null) {
                try {
                    C1995v2 c1995v22 = new C1995v2(contentResolver, uri);
                    try {
                        map.put(uri, c1995v22);
                    } catch (SecurityException unused) {
                    }
                    c1995v2 = c1995v22;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1995v2;
    }

    static synchronized void d() {
        try {
            for (C1995v2 c1995v2 : f15350g.values()) {
                c1995v2.f15352a.unregisterContentObserver(c1995v2.f15354c);
            }
            f15350g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3 = this.f15356e;
        Map<String, String> map4 = map3;
        if (map3 == null) {
            synchronized (this.f15355d) {
                Map<String, String> map5 = this.f15356e;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) C2011x2.a(new InterfaceC2019y2() {
                                @Override
                                public final Object zza() {
                                    return this.f15311a.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map2 = null;
                        }
                        this.f15356e = map2;
                        threadPolicyAllowThreadDiskReads = map2;
                        map = threadPolicyAllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            map4 = map;
        }
        return map4 != null ? map4 : Collections.emptyMap();
    }

    final Map c() {
        Cursor cursorQuery = this.f15352a.query(this.f15353b, f15351h, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c2457a = count <= 256 ? new C2457a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c2457a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c2457a;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.f15355d) {
            this.f15356e = null;
            P2.e();
        }
        synchronized (this) {
            try {
                Iterator<InterfaceC2003w2> it = this.f15357f.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final Object u(String str) {
        return b().get(str);
    }
}
