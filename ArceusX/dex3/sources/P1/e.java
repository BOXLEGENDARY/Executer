package P1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.w;

public class e {
    private static final Map<String, com.airbnb.lottie.b<P1.d>> a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    class a implements P1.g<P1.d> {
        final String a;

        a(String str) {
            this.a = str;
        }

        @Override
        public void onResult(P1.d dVar) {
            e.a.remove(this.a);
        }
    }

    class b implements P1.g<Throwable> {
        final String a;

        b(String str) {
            this.a = str;
        }

        @Override
        public void onResult(Throwable th) {
            e.a.remove(this.a);
        }
    }

    class c implements Callable<k<P1.d>> {
        final Context d;
        final String e;
        final String i;

        c(Context context, String str, String str2) {
            this.d = context;
            this.e = str;
            this.i = str2;
        }

        @Override
        public k<P1.d> call() {
            k<P1.d> kVarC = P1.c.d(this.d).c(this.e, this.i);
            if (this.i != null && kVarC.b() != null) {
                U1.g.b().c(this.i, kVarC.b());
            }
            return kVarC;
        }
    }

    class d implements Callable<k<P1.d>> {
        final Context d;
        final String e;
        final String i;

        d(Context context, String str, String str2) {
            this.d = context;
            this.e = str;
            this.i = str2;
        }

        @Override
        public k<P1.d> call() {
            return e.g(this.d, this.e, this.i);
        }
    }

    class CallableC0042e implements Callable<k<P1.d>> {
        final WeakReference d;
        final Context e;
        final int i;
        final String v;

        CallableC0042e(WeakReference weakReference, Context context, int i, String str) {
            this.d = weakReference;
            this.e = context;
            this.i = i;
            this.v = str;
        }

        @Override
        public k<P1.d> call() {
            Context context = (Context) this.d.get();
            if (context == null) {
                context = this.e;
            }
            return e.p(context, this.i, this.v);
        }
    }

    class f implements Callable<k<P1.d>> {
        final InputStream d;
        final String e;

        f(InputStream inputStream, String str) {
            this.d = inputStream;
            this.e = str;
        }

        @Override
        public k<P1.d> call() {
            return e.i(this.d, this.e);
        }
    }

    class g implements Callable<k<P1.d>> {
        final P1.d d;

        g(P1.d dVar) {
            this.d = dVar;
        }

        @Override
        public k<P1.d> call() {
            return new k<>(this.d);
        }
    }

    private static com.airbnb.lottie.b<P1.d> b(String str, Callable<k<P1.d>> callable) {
        P1.d dVarA = str == null ? null : U1.g.b().a(str);
        if (dVarA != null) {
            return new com.airbnb.lottie.b<>(new g(dVarA));
        }
        if (str != null) {
            Map<String, com.airbnb.lottie.b<P1.d>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.airbnb.lottie.b<P1.d> bVar = new com.airbnb.lottie.b<>(callable);
        if (str != null) {
            bVar.f(new a(str));
            bVar.e(new b(str));
            a.put(str, bVar);
        }
        return bVar;
    }

    private static P1.f c(P1.d dVar, String str) {
        for (P1.f fVar : dVar.j().values()) {
            if (fVar.b().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.b<P1.d> d(Context context, String str) {
        return e(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.b<P1.d> e(Context context, String str, String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    public static k<P1.d> f(Context context, String str) {
        return g(context, str, "asset_" + str);
    }

    public static k<P1.d> g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return i(context.getAssets().open(str), str2);
            }
            return s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new k<>((Throwable) e);
        }
    }

    public static com.airbnb.lottie.b<P1.d> h(InputStream inputStream, String str) {
        return b(str, new f(inputStream, str));
    }

    public static k<P1.d> i(InputStream inputStream, String str) {
        return j(inputStream, str, true);
    }

    private static k<P1.d> j(InputStream inputStream, String str, boolean z) throws IOException {
        try {
            return k(a2.c.Z(w.d(w.l(inputStream))), str);
        } finally {
            if (z) {
                b2.h.c(inputStream);
            }
        }
    }

    public static k<P1.d> k(a2.c cVar, String str) {
        return l(cVar, str, true);
    }

    private static k<P1.d> l(a2.c cVar, String str, boolean z) throws IOException {
        try {
            try {
                P1.d dVarA = Z1.w.a(cVar);
                if (str != null) {
                    U1.g.b().c(str, dVarA);
                }
                k<P1.d> kVar = new k<>(dVarA);
                if (z) {
                    b2.h.c(cVar);
                }
                return kVar;
            } catch (Exception e) {
                k<P1.d> kVar2 = new k<>(e);
                if (z) {
                    b2.h.c(cVar);
                }
                return kVar2;
            }
        } catch (Throwable th) {
            if (z) {
                b2.h.c(cVar);
            }
            throw th;
        }
    }

    public static com.airbnb.lottie.b<P1.d> m(Context context, int i) {
        return n(context, i, w(context, i));
    }

    public static com.airbnb.lottie.b<P1.d> n(Context context, int i, String str) {
        return b(str, new CallableC0042e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    public static k<P1.d> o(Context context, int i) {
        return p(context, i, w(context, i));
    }

    public static k<P1.d> p(Context context, int i, String str) {
        try {
            okio.g gVarD = w.d(w.l(context.getResources().openRawResource(i)));
            return v(gVarD).booleanValue() ? s(new ZipInputStream(gVarD.w1()), str) : i(gVarD.w1(), str);
        } catch (Resources.NotFoundException e) {
            return new k<>((Throwable) e);
        }
    }

    public static com.airbnb.lottie.b<P1.d> q(Context context, String str) {
        return r(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.b<P1.d> r(Context context, String str, String str2) {
        return b(str2, new c(context, str, str2));
    }

    public static k<P1.d> s(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return t(zipInputStream, str);
        } finally {
            b2.h.c(zipInputStream);
        }
    }

    private static k<P1.d> t(ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            P1.d dVarB = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVarB = l(a2.c.Z(w.d(w.l(zipInputStream))), null, false).b();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    map.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVarB == null) {
                return new k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                P1.f fVarC = c(dVarB, (String) entry.getKey());
                if (fVarC != null) {
                    fVarC.f(b2.h.l((Bitmap) entry.getValue(), fVarC.e(), fVarC.c()));
                }
            }
            for (Map.Entry<String, P1.f> entry2 : dVarB.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new k<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                U1.g.b().c(str, dVarB);
            }
            return new k<>(dVarB);
        } catch (IOException e) {
            return new k<>((Throwable) e);
        }
    }

    private static boolean u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean v(okio.g gVar) {
        try {
            okio.g gVarPeek = gVar.peek();
            for (byte b3 : b) {
                if (gVarPeek.readByte() != b3) {
                    return Boolean.FALSE;
                }
            }
            gVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            b2.d.b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    private static String w(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(u(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
