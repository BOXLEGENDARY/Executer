package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class O {

    private final b f23717a;

    private final Map<String, B> f23718b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        private final Executor f23719a;

        final CameraManager.AvailabilityCallback f23720b;

        private final Object f23721c = new Object();

        private boolean f23722d = false;

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f23719a = executor;
            this.f23720b = availabilityCallback;
        }

        public void d() {
            C2893f.a(this.f23720b);
        }

        public void e(String str) {
            this.f23720b.onCameraAvailable(str);
        }

        public void f(String str) {
            this.f23720b.onCameraUnavailable(str);
        }

        void g() {
            synchronized (this.f23721c) {
                this.f23722d = true;
            }
        }

        @Override
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f23721c) {
                try {
                    if (!this.f23722d) {
                        this.f23719a.execute(new Runnable() {
                            @Override
                            public final void run() {
                                this.f23714d.d();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void onCameraAvailable(final String str) {
            synchronized (this.f23721c) {
                try {
                    if (!this.f23722d) {
                        this.f23719a.execute(new Runnable() {
                            @Override
                            public final void run() {
                                this.f23712d.e(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void onCameraUnavailable(final String str) {
            synchronized (this.f23721c) {
                try {
                    if (!this.f23722d) {
                        this.f23719a.execute(new Runnable() {
                            @Override
                            public final void run() {
                                this.f23715d.f(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        static b d(Context context, Handler handler) {
            int i7 = Build.VERSION.SDK_INT;
            return i7 >= 30 ? new S(context) : i7 >= 29 ? new Q(context) : i7 >= 28 ? P.i(context) : T.h(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str) throws C2894g;

        Set<Set<String>> e() throws C2894g;

        void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C2894g;

        String[] g() throws C2894g;
    }

    private O(b bVar) {
        this.f23717a = bVar;
    }

    public static O a(Context context) {
        return b(context, E.l.a());
    }

    public static O b(Context context, Handler handler) {
        return new O(b.d(context, handler));
    }

    public B c(String str) throws C2894g {
        B bE;
        synchronized (this.f23718b) {
            bE = this.f23718b.get(str);
            if (bE == null) {
                try {
                    bE = B.e(this.f23717a.c(str), str);
                    this.f23718b.put(str, bE);
                } catch (AssertionError e7) {
                    throw new C2894g(10002, e7.getMessage(), e7);
                }
            }
        }
        return bE;
    }

    public String[] d() throws C2894g {
        return this.f23717a.g();
    }

    public Set<Set<String>> e() throws C2894g {
        return this.f23717a.e();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C2894g {
        this.f23717a.f(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f23717a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f23717a.b(availabilityCallback);
    }
}
