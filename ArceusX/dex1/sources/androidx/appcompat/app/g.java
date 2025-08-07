package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.t;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import g0.C2458b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class g {

    static t.a f8601d = new t.a(new t.b());

    private static int f8602e = -100;

    private static u0.i f8603i = null;

    private static u0.i f8604v = null;

    private static Boolean f8605w = null;

    private static boolean f8606y = false;

    private static final C2458b<WeakReference<g>> f8607z = new C2458b<>();

    private static final Object f8599A = new Object();

    private static final Object f8600B = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    g() {
    }

    static void F(g gVar) {
        synchronized (f8599A) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f8599A) {
            try {
                Iterator<WeakReference<g>> it = f8607z.iterator();
                while (it.hasNext()) {
                    g gVar2 = it.next().get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void Q(final Context context) {
        if (v(context)) {
            if (u0.a.c()) {
                if (f8606y) {
                    return;
                }
                f8601d.execute(new Runnable() {
                    @Override
                    public final void run() {
                        g.w(context);
                    }
                });
                return;
            }
            synchronized (f8600B) {
                try {
                    u0.i iVar = f8603i;
                    if (iVar == null) {
                        if (f8604v == null) {
                            f8604v = u0.i.b(t.b(context));
                        }
                        if (f8604v.e()) {
                        } else {
                            f8603i = f8604v;
                        }
                    } else if (!iVar.equals(f8604v)) {
                        u0.i iVar2 = f8603i;
                        f8604v = iVar2;
                        t.a(context, iVar2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(g gVar) {
        synchronized (f8599A) {
            G(gVar);
            f8607z.add(new WeakReference<>(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static u0.i k() {
        if (u0.a.c()) {
            Object objP = p();
            if (objP != null) {
                return u0.i.h(b.a(objP));
            }
        } else {
            u0.i iVar = f8603i;
            if (iVar != null) {
                return iVar;
            }
        }
        return u0.i.d();
    }

    public static int m() {
        return f8602e;
    }

    static Object p() {
        Context contextL;
        Iterator<WeakReference<g>> it = f8607z.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null && (contextL = gVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    static u0.i r() {
        return f8603i;
    }

    static boolean v(Context context) {
        if (f8605w == null) {
            try {
                Bundle bundle = r.a(context).metaData;
                if (bundle != null) {
                    f8605w = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f8605w = Boolean.FALSE;
            }
        }
        return f8605w.booleanValue();
    }

    public static void w(Context context) {
        t.c(context);
        f8606y = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i7);

    public abstract void I(int i7);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public void N(int i7) {
    }

    public abstract void O(CharSequence charSequence);

    public abstract androidx.appcompat.view.b P(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i7);

    public Context l() {
        return null;
    }

    public abstract androidx.appcompat.app.b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract androidx.appcompat.app.a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
