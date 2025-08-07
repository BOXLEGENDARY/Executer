package E4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class C0412s implements InterfaceC0409o {
    static Object c(ClassLoader classLoader) {
        return G.b(classLoader, "pathList", Object.class).a();
    }

    static boolean d(ClassLoader classLoader, File file, File file2, boolean z7, r rVar, String str, InterfaceC0411q interfaceC0411q) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        E eA = G.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) eA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) G.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z7 && !interfaceC0411q.a(objC, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        eA.d(Arrays.asList(rVar.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        D d7 = new D("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            IOException iOException = (IOException) arrayList.get(i7);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(d7, iOException);
            } catch (Exception unused) {
            }
        }
        G.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw d7;
    }
}
