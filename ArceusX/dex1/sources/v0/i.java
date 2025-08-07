package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;
import x0.InterfaceC2984a;
import z.F;

class i {

    static final g0.j<String, Typeface> f24064a = new g0.j<>(16);

    private static final ExecutorService f24065b = l.a("fonts-androidx", 10, 10000);

    static final Object f24066c = new Object();

    static final g0.k<String, ArrayList<InterfaceC2984a<e>>> f24067d = new g0.k<>();

    class a implements Callable<e> {

        final String f24068d;

        final Context f24069e;

        final v0.e f24070i;

        final int f24071v;

        a(String str, Context context, v0.e eVar, int i7) {
            this.f24068d = str;
            this.f24069e = context;
            this.f24070i = eVar;
            this.f24071v = i7;
        }

        @Override
        public e call() {
            return i.c(this.f24068d, this.f24069e, F.a(new Object[]{this.f24070i}), this.f24071v);
        }
    }

    class b implements InterfaceC2984a<e> {

        final v0.a f24072a;

        b(v0.a aVar) {
            this.f24072a = aVar;
        }

        @Override
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f24072a.b(eVar);
        }
    }

    class c implements Callable<e> {

        final String f24073d;

        final Context f24074e;

        final List f24075i;

        final int f24076v;

        c(String str, Context context, List list, int i7) {
            this.f24073d = str;
            this.f24074e = context;
            this.f24075i = list;
            this.f24076v = i7;
        }

        @Override
        public e call() {
            try {
                return i.c(this.f24073d, this.f24074e, this.f24075i, this.f24076v);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements InterfaceC2984a<e> {

        final String f24077a;

        d(String str) {
            this.f24077a = str;
        }

        @Override
        public void accept(e eVar) {
            synchronized (i.f24066c) {
                try {
                    g0.k<String, ArrayList<InterfaceC2984a<e>>> kVar = i.f24067d;
                    ArrayList<InterfaceC2984a<e>> arrayList = kVar.get(this.f24077a);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove(this.f24077a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        arrayList.get(i7).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List<v0.e> list, int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(list.get(i8).d());
            sb.append("-");
            sb.append(i7);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static int b(k.a aVar) {
        int i7 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        k.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i7 = 0;
            for (k.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i7;
    }

    static e c(String str, Context context, List<v0.e> list, int i7) {
        h1.a.a("getFontSync");
        try {
            g0.j<String, Typeface> jVar = f24064a;
            Typeface typefaceD = jVar.d(str);
            if (typefaceD != null) {
                return new e(typefaceD);
            }
            k.a aVarE = v0.d.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? androidx.core.graphics.f.b(context, null, aVarE.c(), i7) : androidx.core.graphics.f.c(context, null, aVarE.d(), i7);
            if (typefaceB == null) {
                return new e(-3);
            }
            jVar.f(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            h1.a.b();
        }
    }

    static Typeface d(Context context, List<v0.e> list, int i7, Executor executor, v0.a aVar) {
        String strA = a(list, i7);
        Typeface typefaceD = f24064a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(aVar);
        synchronized (f24066c) {
            try {
                g0.k<String, ArrayList<InterfaceC2984a<e>>> kVar = f24067d;
                ArrayList<InterfaceC2984a<e>> arrayList = kVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC2984a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                kVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i7);
                if (executor == null) {
                    executor = f24065b;
                }
                l.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, v0.e eVar, v0.a aVar, int i7, int i8) {
        String strA = a(F.a(new Object[]{eVar}), i7);
        Typeface typefaceD = f24064a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        if (i8 == -1) {
            e eVarC = c(strA, context, F.a(new Object[]{eVar}), i7);
            aVar.b(eVarC);
            return eVarC.f24078a;
        }
        try {
            e eVar2 = (e) l.d(f24065b, new a(strA, context, eVar, i7), i8);
            aVar.b(eVar2);
            return eVar2.f24078a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        final Typeface f24078a;

        final int f24079b;

        e(int i7) {
            this.f24078a = null;
            this.f24079b = i7;
        }

        boolean a() {
            return this.f24079b == 0;
        }

        e(Typeface typeface) {
            this.f24078a = typeface;
            this.f24079b = 0;
        }
    }
}
