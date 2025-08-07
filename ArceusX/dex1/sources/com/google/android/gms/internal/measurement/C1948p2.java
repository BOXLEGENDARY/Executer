package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class C1948p2 {

    static HashMap<String, String> f15249f;

    private static Object f15254k;

    private static boolean f15255l;

    public static final Uri f15244a = Uri.parse("content://com.google.android.gsf.gservices");

    public static final Uri f15245b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    public static final Pattern f15246c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    public static final Pattern f15247d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    private static final AtomicBoolean f15248e = new AtomicBoolean();

    static final HashMap<String, Boolean> f15250g = new HashMap<>();

    static final HashMap<String, Integer> f15251h = new HashMap<>();

    static final HashMap<String, Long> f15252i = new HashMap<>();

    static final HashMap<String, Float> f15253j = new HashMap<>();

    static final String[] f15256m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C1948p2.class) {
            try {
                if (f15249f == null) {
                    f15248e.set(false);
                    f15249f = new HashMap<>();
                    f15254k = new Object();
                    f15255l = false;
                    contentResolver.registerContentObserver(f15244a, true, new C1940o2(null));
                } else if (f15248e.getAndSet(false)) {
                    f15249f.clear();
                    f15250g.clear();
                    f15251h.clear();
                    f15252i.clear();
                    f15253j.clear();
                    f15254k = new Object();
                    f15255l = false;
                }
                Object obj = f15254k;
                if (f15249f.containsKey(str)) {
                    String str3 = f15249f.get(str);
                    if (str3 != null) {
                        str = str3;
                    }
                    return str;
                }
                int length = f15256m.length;
                Cursor cursorQuery = contentResolver.query(f15244a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    return string != null ? string : null;
                } finally {
                    cursorQuery.close();
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (C1948p2.class) {
            try {
                if (obj == f15254k) {
                    f15249f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
