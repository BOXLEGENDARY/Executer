package m3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import g0.C2457a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class FragmentC2569J extends Fragment implements InterfaceC2575f {

    private static final WeakHashMap f22009v = new WeakHashMap();

    private final Map f22010d = Collections.synchronizedMap(new C2457a());

    private int f22011e = 0;

    private Bundle f22012i;

    public static FragmentC2569J e(Activity activity) {
        FragmentC2569J fragmentC2569J;
        WeakHashMap weakHashMap = f22009v;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC2569J = (FragmentC2569J) weakReference.get()) != null) {
            return fragmentC2569J;
        }
        try {
            FragmentC2569J fragmentC2569J2 = (FragmentC2569J) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC2569J2 == null || fragmentC2569J2.isRemoving()) {
                fragmentC2569J2 = new FragmentC2569J();
                activity.getFragmentManager().beginTransaction().add(fragmentC2569J2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC2569J2));
            return fragmentC2569J2;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
        }
    }

    @Override
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22010d.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22010d.put(str, lifecycleCallback);
        if (this.f22011e > 0) {
            new J3.i(Looper.getMainLooper()).post(new RunnableC2568I(this, lifecycleCallback, str));
        }
    }

    @Override
    public final <T extends LifecycleCallback> T d(String str, Class<T> cls) {
        return cls.cast(this.f22010d.get(str));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22010d.values().iterator();
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
        Iterator it = this.f22010d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i7, i8, intent);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22011e = 1;
        this.f22012i = bundle;
        for (Map.Entry entry : this.f22010d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.f22011e = 5;
        Iterator it = this.f22010d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f22011e = 3;
        Iterator it = this.f22010d.values().iterator();
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
        for (Map.Entry entry : this.f22010d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        this.f22011e = 2;
        Iterator it = this.f22010d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        this.f22011e = 4;
        Iterator it = this.f22010d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
