package E4;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class C0415v implements InterfaceC0409o {
    public static void c(ClassLoader classLoader, Set set, InterfaceC0414u interfaceC0414u) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = C0412s.c(classLoader);
        F fB = G.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (D4.T.class) {
            ArrayList arrayList = new ArrayList((Collection) fB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            fB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = interfaceC0414u.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (D4.T.class) {
                G.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        D d7 = new D("Error in makePathElements");
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(d7, (IOException) arrayList2.get(i7));
            } catch (Exception unused) {
            }
        }
        throw d7;
    }
}
