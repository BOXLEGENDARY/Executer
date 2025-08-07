package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import t2.Dbl.hgESaf;

abstract class O3<T extends G3> {

    private static final Logger f14978a = Logger.getLogger(B3.class.getName());

    private static final String f14979b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    O3() {
    }

    static <T extends G3> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = O3.class.getClassLoader();
        if (cls.equals(G3.class)) {
            str = f14979b;
        } else {
            if (!cls.getPackage().equals(O3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    return cls.cast(((O3) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (InstantiationException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(O3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((O3) it.next()).a()));
                } catch (ServiceConfigurationError e11) {
                    Logger logger = f14978a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", hgESaf.xTeGLsyfLfHaVx, simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException(e14);
            }
        }
    }

    protected abstract T a();
}
