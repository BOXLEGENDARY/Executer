package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C1819d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f6.ck.ZJZXBWla;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import n3.C2649g;
import n3.C2651i;

public final class DynamiteModule {

    private static Boolean f14425h = null;

    private static String f14426i = null;

    private static boolean f14427j = false;

    private static int f14428k = -1;

    private static Boolean f14429l;

    private static m f14434q;

    private static n f14435r;

    private final Context f14436a;

    private static final ThreadLocal f14430m = new ThreadLocal();

    private static final ThreadLocal f14431n = new com.google.android.gms.dynamite.b();

    private static final b.a f14432o = new c();

    public static final b f14419b = new d();

    public static final b f14420c = new e();

    public static final b f14421d = new f();

    public static final b f14422e = new g();

    public static final b f14423f = new h();

    public static final b f14424g = new i();

    public static final b f14433p = new j();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        a(String str, z3.f fVar) {
            super(str);
        }

        a(String str, Throwable th, z3.f fVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z7) throws a;

            int b(Context context, String str);
        }

        public static class C0153b {

            public int f14437a = 0;

            public int f14438b = 0;

            public int f14439c = 0;
        }

        C0153b a(Context context, String str, a aVar) throws a;
    }

    private DynamiteModule(Context context) {
        C2651i.l(context);
        this.f14436a = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C2649g.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", ZJZXBWla.FdkkUKHFC + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    private static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        n nVar;
        z3.f fVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f14435r = nVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InstantiationException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f14430m.get();
        if (kVar == null || kVar.f14440a != null) {
            return false;
        }
        kVar.f14440a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f14429l)) {
            return true;
        }
        boolean z7 = false;
        if (f14429l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1819d.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z7 = true;
            }
            f14429l = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f14427j = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f14434q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f14434q = mVar;
                    return mVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.f14436a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f14436a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e7, null);
        }
    }
}
