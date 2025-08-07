package t2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k implements e {

    private final a f23811a;

    private final i f23812b;

    private final Map<String, m> f23813c;

    static class a {

        private final Context f23814a;

        private Map<String, String> f23815b = null;

        a(Context context) {
            this.f23814a = context;
        }

        private Map<String, String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> c() {
            if (this.f23815b == null) {
                this.f23815b = a(this.f23814a);
            }
            return this.f23815b;
        }

        private static Bundle d(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e7) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e7);
                return null;
            } catch (IllegalAccessException e8) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e8);
                return null;
            } catch (InstantiationException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override
    public synchronized m a(String str) {
        if (this.f23813c.containsKey(str)) {
            return this.f23813c.get(str);
        }
        d dVarB = this.f23811a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f23812b.a(str));
        this.f23813c.put(str, mVarCreate);
        return mVarCreate;
    }

    k(a aVar, i iVar) {
        this.f23813c = new HashMap();
        this.f23811a = aVar;
        this.f23812b = iVar;
    }
}
