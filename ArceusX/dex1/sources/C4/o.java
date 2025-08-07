package C4;

import android.os.Build;
import android.util.Log;
import g1.kQwt.YGBtcyQ;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class o {

    private static final Pattern f846b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    private final f f847a;

    o(f fVar) throws IOException {
        this.f847a = fVar;
    }

    static Set a(o oVar, Set set, u uVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        oVar.f(uVar, set, new k(oVar, hashSet, uVar, zipFile));
        return hashSet;
    }

    private static void e(u uVar, l lVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(uVar.a());
        } catch (IOException e7) {
            e = e7;
            zipFile = null;
        }
        try {
            String strB = uVar.b();
            HashMap map = new HashMap();
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = f846b.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                    Set hashSet = (Set) map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new n(zipEntryNextElement, strGroup2));
                }
            }
            HashMap map2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (map.containsKey(str)) {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                    for (n nVar : (Set) map.get(str)) {
                        if (map2.containsKey(nVar.f844a)) {
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", nVar.f844a, str));
                        } else {
                            map2.put(nVar.f844a, nVar);
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", nVar.f844a, str));
                        }
                    }
                } else {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                }
            }
            lVar.a(zipFile, new HashSet(map2.values()));
            zipFile.close();
        } catch (IOException e8) {
            e = e8;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e9) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e9);
                }
            }
            throw e;
        }
    }

    public final void f(u uVar, Set set, m mVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            File fileC = this.f847a.c(uVar.b(), nVar.f844a);
            boolean z7 = false;
            if (fileC.exists() && fileC.length() == nVar.f845b.getSize() && f.p(fileC)) {
                z7 = true;
            }
            mVar.a(nVar, fileC, z7);
        }
    }

    final Set b(u uVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(uVar, new i(this, uVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    final Set c() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<u> setJ = this.f847a.j();
        for (String str : this.f847a.h()) {
            Iterator it = setJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f847a.n(str);
                    break;
                }
                if (((u) it.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (u uVar : setJ) {
            HashSet hashSet2 = new HashSet();
            e(uVar, new j(this, hashSet2, uVar));
            for (File file : this.f847a.i(uVar.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format(YGBtcyQ.owEuVqvg, file.getAbsolutePath(), uVar.b(), uVar.a().getAbsolutePath()));
                    this.f847a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
