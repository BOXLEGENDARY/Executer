package com.roblox.client.flags;

import android.content.SharedPreferences;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import h7.l;
import j6.InterfaceC2504b;
import j6.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class c {

    private static c f19997f = new c();

    private final Set<String> f19998a = new HashSet();

    private boolean f19999b = false;

    private final Map<String, Boolean> f20000c = new HashMap();

    private boolean f20001d = false;

    private final InterfaceC2504b f20002e = d.a();

    c() {
    }

    public static c c() {
        if (f19997f == null) {
            synchronized (c.class) {
                try {
                    if (f19997f == null) {
                        f19997f = new c();
                    }
                } finally {
                }
            }
        }
        return f19997f;
    }

    public synchronized void a(SharedPreferences sharedPreferences) {
        if (this.f19999b) {
            l.k("Roblox.UniversalFlagCenter", "Duplicate cacheAndLoadServerFlags call! Please file a ticket to NFDN component to report this log.");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<Map.Entry<String, a>> it = this.f20002e.G1().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value.a()) {
                Boolean bool = (Boolean) value.i(value.e());
                boolean zBooleanValue = bool.booleanValue();
                String strB = value.b();
                editorEdit.putBoolean(strB, zBooleanValue);
                l.g("Roblox.UniversalFlagCenter", GObvYfBKohxpYX.xkkD + strB + " to SharedPreference with value " + zBooleanValue);
                if (this.f19998a.contains(strB)) {
                    l.g("Roblox.UniversalFlagCenter", "Won't update " + strB + " in memory since it's been read before.");
                } else {
                    this.f20000c.put(strB, bool);
                }
            }
        }
        editorEdit.apply();
        this.f19999b = true;
    }

    protected synchronized boolean b(String str) {
        try {
            if (!this.f19999b) {
                this.f19998a.add(str);
            }
            Boolean bool = this.f20000c.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            l.d("Roblox.UniversalFlagCenter", "UniversalFlagCenter doesn't contain " + str + ". Did you add it into UniversalFlagCenter.java?");
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(SharedPreferences sharedPreferences) {
        try {
            if (this.f20001d) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Iterator<Map.Entry<String, a>> it = this.f20002e.G1().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value.a()) {
                    boolean zBooleanValue = ((Boolean) value.i(value.e())).booleanValue();
                    String strB = value.b();
                    this.f20000c.put(strB, Boolean.valueOf(sharedPreferences.getBoolean(strB, zBooleanValue)));
                    editorEdit.remove(strB);
                    l.g("Roblox.UniversalFlagCenter", "Loaded and removed flag " + strB + " from SharedPreference with value " + this.f20000c.get(strB));
                }
            }
            editorEdit.commit();
            this.f20001d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e() {
        this.f19999b = false;
    }
}
