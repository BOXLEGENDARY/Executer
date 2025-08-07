package S4;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g<T> {

    private final T f7347a;

    private final c<T> f7348b;

    private static class b implements c<Context> {

        private final Class<? extends Service> f7349a;

        private Bundle b(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f7349a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f7349a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override
        public List<String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f7349a = cls;
        }
    }

    interface c<T> {
        List<String> a(T t7);
    }

    g(T t7, c<T> cVar) {
        this.f7347a = t7;
        this.f7348b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    public static i d(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e7) {
            throw new v(String.format("Could not instantiate %s.", str), e7);
        } catch (InstantiationException e8) {
            throw new v(String.format("Could not instantiate %s.", str), e8);
        } catch (NoSuchMethodException e9) {
            throw new v(String.format("Could not instantiate %s", str), e9);
        } catch (InvocationTargetException e10) {
            throw new v(String.format("Could not instantiate %s", str), e10);
        }
    }

    public List<c5.b<i>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f7348b.a(this.f7347a)) {
            arrayList.add(new c5.b() {
                @Override
                public final Object get() {
                    return g.d(str);
                }
            });
        }
        return arrayList;
    }
}
