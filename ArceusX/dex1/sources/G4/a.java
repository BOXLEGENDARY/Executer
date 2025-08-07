package G4;

import D4.AbstractC0374e;
import D4.C0370a;
import D4.C0373d;
import D4.InterfaceC0371b;
import D4.InterfaceC0375f;
import D4.L;
import D4.P;
import D4.U;
import D4.Y;
import E4.O;
import E4.T;
import E4.V;
import E4.q0;
import a4.C1576m;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class a implements InterfaceC0371b {

    private static final long f1368p = TimeUnit.SECONDS.toMillis(1);

    public static final int f1369q = 0;

    private final Handler f1370a;

    private final Context f1371b;

    private final Y f1372c;

    private final V f1373d;

    private final O f1374e;

    private final q0 f1375f;

    private final q0 f1376g;

    private final Executor f1377h;

    private final L f1378i;

    private final File f1379j;

    private final AtomicReference f1380k;

    private final Set f1381l;

    private final Set f1382m;

    private final AtomicBoolean f1383n;

    private final k f1384o;

    a(Context context, File file, Y y7, V v7) {
        Executor executorA = C4.e.a();
        O o2 = new O(context);
        k kVar = new Object() {
        };
        this.f1370a = new Handler(Looper.getMainLooper());
        this.f1380k = new AtomicReference();
        this.f1381l = Collections.synchronizedSet(new HashSet());
        this.f1382m = Collections.synchronizedSet(new HashSet());
        this.f1383n = new AtomicBoolean(false);
        this.f1371b = context;
        this.f1379j = file;
        this.f1372c = y7;
        this.f1373d = v7;
        this.f1377h = executorA;
        this.f1374e = o2;
        this.f1384o = kVar;
        this.f1376g = new q0();
        this.f1375f = new q0();
        this.f1378i = U.INSTANCE;
    }

    private final Task o(final int i7) {
        r(new s() {
            @Override
            public final AbstractC0374e a(AbstractC0374e abstractC0374e) {
                int i8 = i7;
                int i9 = a.f1369q;
                if (abstractC0374e == null) {
                    return null;
                }
                return AbstractC0374e.b(abstractC0374e.h(), 6, i8, abstractC0374e.a(), abstractC0374e.j(), abstractC0374e.f(), abstractC0374e.e());
            }
        });
        return C1576m.e(new C0370a(i7));
    }

    private final P p() throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        try {
            P pA = this.f1372c.a(this.f1371b.getPackageManager().getPackageInfo(this.f1371b.getPackageName(), 128).applicationInfo.metaData);
            if (pA != null) {
                return pA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e7) {
            throw new IllegalStateException("App is not found in PackageManager", e7);
        }
    }

    private final AbstractC0374e q() {
        return (AbstractC0374e) this.f1380k.get();
    }

    private final synchronized AbstractC0374e r(s sVar) {
        AbstractC0374e abstractC0374eQ = q();
        AbstractC0374e abstractC0374eA = sVar.a(abstractC0374eQ);
        AtomicReference atomicReference = this.f1380k;
        while (!a0.g.a(atomicReference, abstractC0374eQ, abstractC0374eA)) {
            if (atomicReference.get() != abstractC0374eQ) {
                return null;
            }
        }
        return abstractC0374eA;
    }

    private static String s(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    public final void t(List list, List list2, List list3, long j7, boolean z7) {
        this.f1378i.zza().a(list, new r(this, list2, list3, j7, z7, list));
    }

    private final void u(final AbstractC0374e abstractC0374e) {
        this.f1370a.post(new Runnable() {
            @Override
            public final void run() {
                this.f1397d.k(abstractC0374e);
            }
        });
    }

    public final void v(List list, List list2, long j7) {
        this.f1381l.addAll(list);
        this.f1382m.addAll(list2);
        Long lValueOf = Long.valueOf(j7);
        w(5, 0, lValueOf, lValueOf, null, null, null);
    }

    public final boolean w(final int i7, final int i8, final Long l7, final Long l8, final List list, final Integer num, final List list2) {
        AbstractC0374e abstractC0374eR = r(new s() {
            @Override
            public final AbstractC0374e a(AbstractC0374e abstractC0374e) {
                Integer num2 = num;
                int i9 = i7;
                int i10 = i8;
                Long l9 = l7;
                Long l10 = l8;
                List<String> list3 = list;
                List<String> list4 = list2;
                int i11 = a.f1369q;
                AbstractC0374e abstractC0374eB = abstractC0374e == null ? AbstractC0374e.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : abstractC0374e;
                return AbstractC0374e.b(num2 == null ? abstractC0374eB.h() : num2.intValue(), i9, i10, l9 == null ? abstractC0374eB.a() : l9.longValue(), l10 == null ? abstractC0374eB.j() : l10.longValue(), list3 == null ? abstractC0374eB.f() : list3, list4 == null ? abstractC0374eB.e() : list4);
            }
        });
        if (abstractC0374eR == null) {
            return false;
        }
        u(abstractC0374eR);
        return true;
    }

    @Override
    public final Task<Void> a(List<String> list) {
        return C1576m.e(new C0370a(-5));
    }

    @Override
    public final void b(InterfaceC0375f interfaceC0375f) {
        this.f1376g.a(interfaceC0375f);
    }

    @Override
    public final Set<String> c() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f1372c.c());
        hashSet.addAll(this.f1381l);
        return hashSet;
    }

    @Override
    public final Task<Void> d(final int i7) {
        try {
            AbstractC0374e abstractC0374eR = r(new s() {
                @Override
                public final AbstractC0374e a(final AbstractC0374e abstractC0374e) {
                    final int i8 = i7;
                    return (AbstractC0374e) E4.U.c(new Callable() {
                        @Override
                        public final Object call() throws C0370a {
                            int i9;
                            AbstractC0374e abstractC0374e2 = abstractC0374e;
                            int i10 = i8;
                            int i11 = a.f1369q;
                            if (abstractC0374e2 != null && i10 == abstractC0374e2.h() && ((i9 = abstractC0374e2.i()) == 1 || i9 == 2 || i9 == 8 || i9 == 9 || i9 == 7)) {
                                return AbstractC0374e.b(i10, 7, abstractC0374e2.c(), abstractC0374e2.a(), abstractC0374e2.j(), abstractC0374e2.f(), abstractC0374e2.e());
                            }
                            throw new C0370a(-3);
                        }
                    });
                }
            });
            if (abstractC0374eR != null) {
                u(abstractC0374eR);
            }
            return C1576m.f(null);
        } catch (E4.U e7) {
            return C1576m.e(e7.b(C0370a.class));
        }
    }

    @Override
    public final Task<Integer> e(final C0373d c0373d) {
        Integer numA;
        int i7;
        File[] fileArr;
        int i8;
        try {
            AbstractC0374e abstractC0374eR = r(new s() {
                @Override
                public final AbstractC0374e a(final AbstractC0374e abstractC0374e) {
                    final C0373d c0373d2 = c0373d;
                    return (AbstractC0374e) E4.U.c(new Callable() {
                        @Override
                        public final Object call() throws C0370a {
                            AbstractC0374e abstractC0374e2 = abstractC0374e;
                            C0373d c0373d3 = c0373d2;
                            int i9 = a.f1369q;
                            if (abstractC0374e2 == null || abstractC0374e2.d()) {
                                return AbstractC0374e.b(abstractC0374e2 != null ? 1 + abstractC0374e2.h() : 1, 1, 0, 0L, 0L, c0373d3.b(), new ArrayList());
                            }
                            throw new C0370a(-1);
                        }
                    });
                }
            });
            if (abstractC0374eR == null) {
                return o(-100);
            }
            int iH = abstractC0374eR.h();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = c0373d.a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f1379j.listFiles(new FileFilter() {
                @Override
                public final boolean accept(File file) {
                    int i9 = a.f1369q;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return o(-5);
            }
            int i9 = 0;
            long length = 0;
            while (i9 < fileArrListFiles.length) {
                File file = fileArrListFiles[i9];
                String strA = T.a(file);
                String strS = s(strA);
                hashSet.add(strA);
                if (c0373d.b().contains(strS)) {
                    String strS2 = s(strA);
                    HashSet hashSet2 = new HashSet(this.f1374e.a());
                    Map mapA = p().a(Arrays.asList(strS2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapA.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        File[] fileArr2 = fileArrListFiles;
                        String str = (String) it3.next();
                        Iterator it4 = it3;
                        if (str.contains("_")) {
                            i8 = iH;
                            str = str.split("_", -1)[0];
                        } else {
                            i8 = iH;
                        }
                        hashSet4.add(str);
                        it3 = it4;
                        fileArrListFiles = fileArr2;
                        iH = i8;
                    }
                    i7 = iH;
                    fileArr = fileArrListFiles;
                    hashSet4.addAll(this.f1382m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapA.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strA) || hashSet5.contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i9++;
                    fileArrListFiles = fileArr;
                    iH = i7;
                } else {
                    i7 = iH;
                    fileArr = fileArrListFiles;
                }
                List<Locale> listA = c0373d.a();
                ArrayList arrayList3 = new ArrayList(this.f1381l);
                arrayList3.addAll(Arrays.asList(BuildConfig.FLAVOR, "base"));
                Map mapA2 = p().a(arrayList3);
                for (Locale locale : listA) {
                    if (mapA2.containsKey(locale.getLanguage()) && ((Set) mapA2.get(locale.getLanguage())).contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i9++;
                fileArrListFiles = fileArr;
                iH = i7;
            }
            int i10 = iH;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(c0373d.b()));
            if (c0373d.b().size() != 1 || (numA = (Integer) ((v) this.f1373d.zza()).b().get(c0373d.b().get(0))) == null) {
                numA = ((v) this.f1373d.zza()).a();
            }
            if (numA != null) {
                return o(numA.intValue());
            }
            if (!hashSet.containsAll(new HashSet(c0373d.b()))) {
                return o(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List<String> listB = c0373d.b();
            Integer numValueOf = Integer.valueOf(i10);
            w(1, 0, 0L, lValueOf, listB, numValueOf, arrayList);
            this.f1377h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f1415d.m(arrayList2, arrayList);
                }
            });
            return C1576m.f(numValueOf);
        } catch (E4.U e7) {
            return o(((C0370a) e7.b(C0370a.class)).c());
        }
    }

    @Override
    public final Task<Void> f(List<String> list) {
        return C1576m.e(new C0370a(-5));
    }

    @Override
    public final void g(InterfaceC0375f interfaceC0375f) {
        this.f1376g.b(interfaceC0375f);
    }

    final void j(final long j7, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            jMin = Math.min(j7, jMin + (j7 / 3));
            w(2, 0, Long.valueOf(jMin), Long.valueOf(j7), null, null, null);
            SystemClock.sleep(f1368p);
            AbstractC0374e abstractC0374eQ = q();
            if (abstractC0374eQ.i() == 9 || abstractC0374eQ.i() == 7 || abstractC0374eQ.i() == 6) {
                return;
            }
        }
        this.f1377h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f1392d.l(list, list2, list3, j7);
            }
        });
    }

    final void k(AbstractC0374e abstractC0374e) {
        this.f1375f.c(abstractC0374e);
        this.f1376g.c(abstractC0374e);
    }

    final void l(List list, List list2, List list3, long j7) {
        if (this.f1383n.get()) {
            w(6, -6, null, null, null, null, null);
        } else if (this.f1378i.zza() != null) {
            t(list, list2, list3, j7, false);
        } else {
            v(list2, list3, j7);
        }
    }

    final void m(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strA = T.a(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.f1371b.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", s(strA));
            intent.putExtra("split_id", strA);
            arrayList.add(intent);
            arrayList2.add(s(T.a(file)));
        }
        AbstractC0374e abstractC0374eQ = q();
        if (abstractC0374eQ == null) {
            return;
        }
        final long j7 = abstractC0374eQ.j();
        this.f1377h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f1407d.j(j7, arrayList, arrayList2, list2);
            }
        });
    }
}
