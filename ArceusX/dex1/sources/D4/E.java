package D4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class E {

    private final Context f898a;

    public E(Context context) {
        this.f898a = context;
    }

    private final SharedPreferences e() {
        return this.f898a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (E.class) {
            try {
                hashSet = e().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void b() {
        synchronized (E.class) {
            e().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    final void c(Collection collection) {
        synchronized (E.class) {
            HashSet hashSet = new HashSet(a());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    final void d(Collection collection) {
        synchronized (E.class) {
            Set<String> setA = a();
            HashSet hashSet = new HashSet();
            boolean z7 = false;
            for (String str : setA) {
                if (collection.contains(str)) {
                    z7 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z7) {
                try {
                    e().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
