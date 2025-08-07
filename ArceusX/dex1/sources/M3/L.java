package m3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import g0.C2457a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class L extends Fragment implements InterfaceC2575f {

    private static final WeakHashMap f22016v = new WeakHashMap();

    private final Map f22017d = Collections.synchronizedMap(new C2457a());

    private int f22018e = 0;

    private Bundle f22019i;

    public static L t(ActivityC1663h activityC1663h) {
        L l7;
        WeakHashMap weakHashMap = f22016v;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC1663h);
        if (weakReference != null && (l7 = (L) weakReference.get()) != null) {
            return l7;
        }
        try {
            L l8 = (L) activityC1663h.getSupportFragmentManager().k0("SupportLifecycleFragmentImpl");
            if (l8 == null || l8.isRemoving()) {
                l8 = new L();
                activityC1663h.getSupportFragmentManager().p().d(l8, "SupportLifecycleFragmentImpl").h();
            }
            weakHashMap.put(activityC1663h, new WeakReference(l8));
            return l8;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Override
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22017d.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22017d.put(str, lifecycleCallback);
        if (this.f22018e > 0) {
            new J3.i(Looper.getMainLooper()).post(new K(this, lifecycleCallback, str));
        }
    }

    @Override
    public final <T extends LifecycleCallback> T d(String str, Class<T> cls) {
        return cls.cast(this.f22017d.get(str));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final Activity g() {
        return getActivity();
    }

    @Override
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i7, i8, intent);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22018e = 1;
        this.f22019i = bundle;
        for (Map.Entry entry : this.f22017d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.f22018e = 5;
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f22018e = 3;
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f22017d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        this.f22018e = 2;
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f22018e = 4;
        Iterator it = this.f22017d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
