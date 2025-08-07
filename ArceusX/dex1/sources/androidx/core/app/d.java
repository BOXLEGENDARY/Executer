package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class d {

    protected static final Class<?> f10362a;

    protected static final Field f10363b;

    protected static final Field f10364c;

    protected static final Method f10365d;

    protected static final Method f10366e;

    protected static final Method f10367f;

    private static final Handler f10368g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        final C0082d f10369d;

        final Object f10370e;

        a(C0082d c0082d, Object obj) {
            this.f10369d = c0082d;
            this.f10370e = obj;
        }

        @Override
        public void run() {
            this.f10369d.f10375d = this.f10370e;
        }
    }

    class b implements Runnable {

        final Application f10371d;

        final C0082d f10372e;

        b(Application application, C0082d c0082d) {
            this.f10371d = application;
            this.f10372e = c0082d;
        }

        @Override
        public void run() {
            this.f10371d.unregisterActivityLifecycleCallbacks(this.f10372e);
        }
    }

    class c implements Runnable {

        final Object f10373d;

        final Object f10374e;

        c(Object obj, Object obj2) {
            this.f10373d = obj;
            this.f10374e = obj2;
        }

        @Override
        public void run() {
            try {
                Method method = d.f10365d;
                if (method != null) {
                    method.invoke(this.f10373d, this.f10374e, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f10366e.invoke(this.f10373d, this.f10374e, Boolean.FALSE);
                }
            } catch (RuntimeException e7) {
                if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                    throw e7;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class C0082d implements Application.ActivityLifecycleCallbacks {

        Object f10375d;

        private Activity f10376e;

        private final int f10377i;

        private boolean f10378v = false;

        private boolean f10379w = false;

        private boolean f10380y = false;

        C0082d(Activity activity) {
            this.f10376e = activity;
            this.f10377i = activity.hashCode();
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            if (this.f10376e == activity) {
                this.f10376e = null;
                this.f10379w = true;
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (!this.f10379w || this.f10380y || this.f10378v || !d.h(this.f10375d, this.f10377i, activity)) {
                return;
            }
            this.f10380y = true;
            this.f10375d = null;
        }

        @Override
        public void onActivityResumed(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStarted(Activity activity) {
            if (this.f10376e == activity) {
                this.f10378v = true;
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f10362a = clsA;
        f10363b = b();
        f10364c = f();
        f10365d = d(clsA);
        f10366e = c(clsA);
        f10367f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 26 || i7 == 27;
    }

    protected static boolean h(Object obj, int i7, Activity activity) {
        try {
            Object obj2 = f10364c.get(activity);
            if (obj2 == obj && activity.hashCode() == i7) {
                f10368g.postAtFrontOfQueue(new c(f10363b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f10367f == null) {
            return false;
        }
        if (f10366e == null && f10365d == null) {
            return false;
        }
        try {
            Object obj2 = f10364c.get(activity);
            if (obj2 == null || (obj = f10363b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0082d c0082d = new C0082d(activity);
            application.registerActivityLifecycleCallbacks(c0082d);
            Handler handler = f10368g;
            handler.post(new a(c0082d, obj2));
            try {
                if (g()) {
                    Method method = f10367f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0082d));
                return true;
            } catch (Throwable th) {
                f10368g.post(new b(application, c0082d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
