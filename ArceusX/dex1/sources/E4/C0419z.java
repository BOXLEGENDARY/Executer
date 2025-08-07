package E4;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

final class C0419z implements InterfaceC0409o {
    C0419z() {
    }

    static void c(ClassLoader classLoader, Set set) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0415v.c(classLoader, set, new C0417x());
    }

    static boolean d(ClassLoader classLoader, File file, File file2, boolean z7) {
        return C0412s.d(classLoader, file, file2, z7, new C0413t(), "path", new C0418y());
    }

    @Override
    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z7) {
        return d(classLoader, file, file2, z7);
    }

    @Override
    public final void b(ClassLoader classLoader, Set set) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c(classLoader, set);
    }
}
