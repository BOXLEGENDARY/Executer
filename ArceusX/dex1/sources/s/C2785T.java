package s;

import C.AbstractC0345p;
import C.InterfaceC0334j0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import android.view.C1707u;
import android.view.InterfaceC1710x;
import android.view.LiveData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import t.C2894g;
import u.C2926g;
import z.AbstractC3062q;
import z.C3043d0;
import z.C3070z;

public final class C2785T implements C.I {

    private final String f23158a;

    private final t.B f23159b;

    private final y.h f23160c;

    private C2852u f23162e;

    private final a<AbstractC3062q> f23165h;

    private final C.R0 f23167j;

    private final InterfaceC0334j0 f23168k;

    private final t.O f23169l;

    private final Object f23161d = new Object();

    private a<Integer> f23163f = null;

    private a<z.J0> f23164g = null;

    private List<Pair<AbstractC0345p, Executor>> f23166i = null;

    static class a<T> extends C1707u<T> {

        private LiveData<T> f23170m;

        private final T f23171n;

        a(T t7) {
            this.f23171n = t7;
        }

        @Override
        public T f() {
            LiveData<T> liveData = this.f23170m;
            return liveData == null ? this.f23171n : liveData.f();
        }

        void r(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f23170m;
            if (liveData2 != null) {
                super.q(liveData2);
            }
            this.f23170m = liveData;
            super.p(liveData, new InterfaceC1710x() {
                @Override
                public final void a(Object obj) {
                    this.f23154a.o(obj);
                }
            });
        }
    }

    public C2785T(String str, t.O o2) throws C2894g {
        String str2 = (String) x0.g.g(str);
        this.f23158a = str2;
        this.f23169l = o2;
        t.B bC = o2.c(str2);
        this.f23159b = bC;
        this.f23160c = new y.h(this);
        C.R0 r0A = androidx.camera.camera2.internal.compat.quirk.a.a(str, bC);
        this.f23167j = r0A;
        this.f23168k = new C2771G0(str, r0A);
        this.f23165h = new a<>(AbstractC3062q.a(AbstractC3062q.b.CLOSED));
    }

    private void w() {
        x();
    }

    private void x() {
        String str;
        int iU = u();
        if (iU == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iU == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iU == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iU == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iU != 4) {
            str = "Unknown value: " + iU;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C3043d0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override
    public int a() {
        return l(0);
    }

    @Override
    public Set<C3070z> b() {
        return C2926g.a(this.f23159b).c();
    }

    @Override
    public boolean c() {
        int[] iArr = (int[]) this.f23159b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String d() {
        return this.f23158a;
    }

    @Override
    public LiveData<Integer> e() {
        synchronized (this.f23161d) {
            try {
                C2852u c2852u = this.f23162e;
                if (c2852u == null) {
                    if (this.f23163f == null) {
                        this.f23163f = new a<>(0);
                    }
                    return this.f23163f;
                }
                a<Integer> aVar = this.f23163f;
                if (aVar != null) {
                    return aVar;
                }
                return c2852u.Q().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void g(Executor executor, AbstractC0345p abstractC0345p) {
        synchronized (this.f23161d) {
            try {
                C2852u c2852u = this.f23162e;
                if (c2852u != null) {
                    c2852u.A(executor, abstractC0345p);
                    return;
                }
                if (this.f23166i == null) {
                    this.f23166i = new ArrayList();
                }
                this.f23166i.add(new Pair<>(abstractC0345p, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public int h() {
        Integer num = (Integer) this.f23159b.a(CameraCharacteristics.LENS_FACING);
        x0.g.b(num != null, "Unable to get the lens facing of the camera.");
        return B1.a(num.intValue());
    }

    @Override
    public C.h1 i() {
        Integer num = (Integer) this.f23159b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        x0.g.g(num);
        return num.intValue() != 1 ? C.h1.UPTIME : C.h1.REALTIME;
    }

    @Override
    public String j() {
        return u() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override
    public List<Size> k(int i7) {
        Size[] sizeArrA = this.f23159b.b().a(i7);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.emptyList();
    }

    @Override
    public int l(int i7) {
        return E.c.a(E.c.b(i7), t(), 1 == h());
    }

    @Override
    public void m(AbstractC0345p abstractC0345p) {
        synchronized (this.f23161d) {
            try {
                C2852u c2852u = this.f23162e;
                if (c2852u != null) {
                    c2852u.l0(abstractC0345p);
                    return;
                }
                List<Pair<AbstractC0345p, Executor>> list = this.f23166i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<AbstractC0345p, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == abstractC0345p) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public InterfaceC0334j0 n() {
        return this.f23168k;
    }

    @Override
    public C.R0 o() {
        return this.f23167j;
    }

    @Override
    public List<Size> p(int i7) {
        Size[] sizeArrC = this.f23159b.b().c(i7);
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.emptyList();
    }

    @Override
    public LiveData<z.J0> q() {
        synchronized (this.f23161d) {
            try {
                C2852u c2852u = this.f23162e;
                if (c2852u == null) {
                    if (this.f23164g == null) {
                        this.f23164g = new a<>(o2.h(this.f23159b));
                    }
                    return this.f23164g;
                }
                a<z.J0> aVar = this.f23164g;
                if (aVar != null) {
                    return aVar;
                }
                return c2852u.S().j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y.h r() {
        return this.f23160c;
    }

    public t.B s() {
        return this.f23159b;
    }

    int t() {
        Integer num = (Integer) this.f23159b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        x0.g.g(num);
        return num.intValue();
    }

    int u() {
        Integer num = (Integer) this.f23159b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        x0.g.g(num);
        return num.intValue();
    }

    void v(C2852u c2852u) {
        synchronized (this.f23161d) {
            try {
                this.f23162e = c2852u;
                a<z.J0> aVar = this.f23164g;
                if (aVar != null) {
                    aVar.r(c2852u.S().j());
                }
                a<Integer> aVar2 = this.f23163f;
                if (aVar2 != null) {
                    aVar2.r(this.f23162e.Q().f());
                }
                List<Pair<AbstractC0345p, Executor>> list = this.f23166i;
                if (list != null) {
                    for (Pair<AbstractC0345p, Executor> pair : list) {
                        this.f23162e.A((Executor) pair.second, (AbstractC0345p) pair.first);
                    }
                    this.f23166i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w();
    }

    void y(LiveData<AbstractC3062q> liveData) {
        this.f23165h.r(liveData);
    }
}
