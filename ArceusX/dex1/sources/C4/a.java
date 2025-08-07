package C4;

import D4.E;
import D4.U;
import D4.X;
import D4.Y;
import D4.d0;
import E4.C0403i;
import E4.C0406l;
import E4.C0408n;
import E4.C0410p;
import E4.D;
import E4.InterfaceC0409o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.room.kU.HguUe;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import w7.Jld.EZYiRMRTxKdo;

public class a {

    private static final AtomicReference f820e = new AtomicReference(null);

    public static final int f821f = 0;

    private final f f822a;

    private final E f823b;

    private final Set f824c = new HashSet();

    private final b f825d;

    private a(Context context) {
        try {
            f fVar = new f(context);
            this.f822a = fVar;
            this.f825d = new b(fVar);
            this.f823b = new E(context);
        } catch (PackageManager.NameNotFoundException e7) {
            throw new D(EZYiRMRTxKdo.UhYcLzIaIJysF, e7);
        }
    }

    public static boolean a(Context context) {
        return k(context, false);
    }

    public static boolean b(Context context) {
        if (l()) {
            return false;
        }
        a aVar = (a) f820e.get();
        if (aVar != null) {
            return aVar.f825d.b(context, aVar.h());
        }
        if (context.getApplicationContext() != null) {
            a(context.getApplicationContext());
        }
        return a(context);
    }

    public static boolean f(Context context) {
        return k(context, true);
    }

    public static boolean g() {
        return f820e.get() != null;
    }

    public final Set h() {
        HashSet hashSet;
        synchronized (this.f824c) {
            hashSet = new HashSet(this.f824c);
        }
        return hashSet;
    }

    public final void i(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.l(this.f822a.g((String) it.next()));
        }
        this.f823b.b();
    }

    private final synchronized void j(Context context, boolean z7) throws IOException {
        ZipFile zipFile;
        try {
            if (z7) {
                this.f822a.k();
            } else {
                e.a().execute(new r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<u> setJ = this.f822a.j();
                Set setA = this.f823b.a();
                HashSet hashSet = new HashSet();
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    String strB = ((u) it.next()).b();
                    if (arrayList.contains(strB) || setA.contains(Y.b(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z7) {
                    i(hashSet);
                } else if (!hashSet.isEmpty()) {
                    e.a().execute(new s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setJ.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((u) it2.next()).b();
                    if (!Y.e(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!Y.e(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<u> hashSet3 = new HashSet(setJ.size());
                for (u uVar : setJ) {
                    String strB3 = uVar.b();
                    int i7 = Y.f926d;
                    if (strB3.startsWith("config.") || hashSet2.contains(Y.b(uVar.b()))) {
                        hashSet3.add(uVar);
                    }
                }
                o oVar = new o(this.f822a);
                InterfaceC0409o interfaceC0409oA = C0410p.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z7) {
                    interfaceC0409oA.b(classLoader, oVar.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setB = oVar.b((u) it3.next());
                        if (setB == null) {
                            it3.remove();
                        } else {
                            interfaceC0409oA.b(classLoader, setB);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (u uVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(uVar2.a());
                    } catch (IOException e7) {
                        e = e7;
                        zipFile = null;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry == null || interfaceC0409oA.a(classLoader, this.f822a.a(uVar2.b()), uVar2.a(), z7)) {
                            hashSet4.add(uVar2.a());
                        } else {
                            Log.w("SplitCompat", wtzgsqRsIZB.MfcKp.concat(uVar2.a().toString()));
                        }
                    } catch (IOException e8) {
                        e = e8;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException e9) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e9);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw e;
                    }
                }
                this.f825d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (u uVar3 : hashSet3) {
                    if (hashSet4.contains(uVar3.a())) {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation emulated");
                        hashSet5.add(uVar3.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f824c) {
                    this.f824c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IOException(String.format(tAjeAKSIqDqzNP.dKeKgd, packageName), e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean k(final Context context, boolean z7) {
        boolean z8;
        if (l()) {
            return false;
        }
        AtomicReference atomicReference = f820e;
        a aVar = new a(context);
        while (true) {
            if (a0.g.a(atomicReference, null, aVar)) {
                z8 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z8 = false;
                break;
            }
        }
        a aVar2 = (a) f820e.get();
        if (z8) {
            U.INSTANCE.c(new C0406l(context, e.a(), new C0408n(context, aVar2.f822a, new C0403i()), aVar2.f822a, new t()));
            X.b(new q(aVar2));
            e.a().execute(new Runnable() {
                @Override
                public final void run() {
                    Context context2 = context;
                    int i7 = a.f821f;
                    try {
                        d0.h(context2).c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", HguUe.NPhEXZF);
                    }
                }
            });
        }
        try {
            aVar2.j(context, z7);
            return true;
        } catch (Exception e7) {
            Log.e("SplitCompat", "Error installing additional splits", e7);
            return false;
        }
    }

    private static boolean l() {
        return false;
    }
}
