package com.roblox.client.provider;

import K6.e;
import K6.f;
import K6.g;
import X5.a;
import X5.c;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import c7.s;
import com.roblox.client.M;
import com.roblox.client.a0;
import j6.d;
import java.util.Objects;

public class ShellConfigurationContentProvider extends ContentProvider {

    private UriMatcher f20165e;

    private c f20167v;

    private c.a f20168w;

    private final String f20164d = "rbx.config";

    private SparseArray<f> f20166i = new SparseArray<>();

    private boolean a() {
        if (!d.a().l2()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith("com.roblox.client") || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    private void e(String str, f fVar) {
        f(str, fVar, fVar.a(f.a.GET));
        f(str, fVar, fVar.a(f.a.POST));
    }

    private void f(String str, f fVar, a aVar) {
        if (aVar != null) {
            this.f20165e.addURI(str, aVar.f7961d, aVar.f7962e);
            this.f20166i.put(aVar.f7962e, fVar);
        }
    }

    private void g() {
        this.f20165e = new UriMatcher(-1);
        String strB = b(getContext());
        e(strB, new e());
        e(strB, new K6.c(this, getContext()));
        e(strB, new g(getContext()));
        e(strB, new K6.d(getContext()));
    }

    public String b(Context context) {
        return context.getPackageName() + context.getString(M.m1);
    }

    public c.a c() {
        return this.f20168w;
    }

    public c d() {
        return this.f20167v;
    }

    @Override
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (!a()) {
            return null;
        }
        f fVar = this.f20166i.get(this.f20165e.match(uri));
        if (fVar != null) {
            fVar.c(uri, contentValues);
        }
        return uri;
    }

    @Override
    public boolean onCreate() {
        Context context = getContext();
        Objects.requireNonNull(context);
        Context applicationContext = context.getApplicationContext();
        J6.c cVar = new J6.c(context);
        this.f20168w = cVar;
        c cVarE = cVar.e();
        this.f20167v = cVarE;
        a0.J0(cVarE);
        s.n().J(applicationContext);
        com.roblox.client.flags.c.c().d(a0.Q(applicationContext));
        s.n().I();
        g();
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!a()) {
            return null;
        }
        f fVar = this.f20166i.get(this.f20165e.match(uri));
        if (fVar != null) {
            return fVar.b(uri);
        }
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
