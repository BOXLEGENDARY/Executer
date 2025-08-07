package androidx.camera.lifecycle;

import C.V0;
import H.f;
import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1701o;
import android.view.InterfaceC1711y;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.g;
import z.AbstractC3056k;
import z.G0;
import z.I0;

final class LifecycleCameraRepository {

    private final Object f9528a = new Object();

    private final Map<a, LifecycleCamera> f9529b = new HashMap();

    private final Map<LifecycleCameraRepositoryObserver, Set<a>> f9530c = new HashMap();

    private final ArrayDeque<InterfaceC1701o> f9531d = new ArrayDeque<>();

    A.a f9532e;

    private static class LifecycleCameraRepositoryObserver implements InterfaceC1700n {

        private final LifecycleCameraRepository f9533d;

        private final InterfaceC1701o f9534e;

        LifecycleCameraRepositoryObserver(InterfaceC1701o interfaceC1701o, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f9534e = interfaceC1701o;
            this.f9533d = lifecycleCameraRepository;
        }

        InterfaceC1701o a() {
            return this.f9534e;
        }

        @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
        public void onDestroy(InterfaceC1701o interfaceC1701o) {
            this.f9533d.m(interfaceC1701o);
        }

        @InterfaceC1711y(AbstractC1694h.a.ON_START)
        public void onStart(InterfaceC1701o interfaceC1701o) {
            this.f9533d.h(interfaceC1701o);
        }

        @InterfaceC1711y(AbstractC1694h.a.ON_STOP)
        public void onStop(InterfaceC1701o interfaceC1701o) {
            this.f9533d.i(interfaceC1701o);
        }
    }

    static abstract class a {
        a() {
        }

        static a a(InterfaceC1701o interfaceC1701o, f.b bVar) {
            return new androidx.camera.lifecycle.a(interfaceC1701o, bVar);
        }

        public abstract f.b b();

        public abstract InterfaceC1701o c();
    }

    LifecycleCameraRepository() {
    }

    private LifecycleCameraRepositoryObserver d(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f9530c.keySet()) {
                    if (interfaceC1701o.equals(lifecycleCameraRepositoryObserver.a())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean f(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(interfaceC1701o);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return false;
                }
                Iterator<a> it = this.f9530c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    if (!((LifecycleCamera) g.g(this.f9529b.get(it.next()))).v().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(LifecycleCamera lifecycleCamera) {
        synchronized (this.f9528a) {
            try {
                InterfaceC1701o interfaceC1701oT = lifecycleCamera.t();
                a aVarA = a.a(interfaceC1701oT, f.B((V0) lifecycleCamera.c(), (V0) lifecycleCamera.u()));
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(interfaceC1701oT);
                Set<a> hashSet = lifecycleCameraRepositoryObserverD != null ? this.f9530c.get(lifecycleCameraRepositoryObserverD) : new HashSet<>();
                hashSet.add(aVarA);
                this.f9529b.put(aVarA, lifecycleCamera);
                if (lifecycleCameraRepositoryObserverD == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(interfaceC1701oT, this);
                    this.f9530c.put(lifecycleCameraRepositoryObserver, hashSet);
                    interfaceC1701oT.getLifecycle().a(lifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void j(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(interfaceC1701o);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return;
                }
                Iterator<a> it = this.f9530c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    ((LifecycleCamera) g.g(this.f9529b.get(it.next()))).x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                Iterator<a> it = this.f9530c.get(d(interfaceC1701o)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.f9529b.get(it.next());
                    if (!((LifecycleCamera) g.g(lifecycleCamera)).v().isEmpty()) {
                        lifecycleCamera.A();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(LifecycleCamera lifecycleCamera, I0 i02, List<AbstractC3056k> list, Collection<G0> collection, A.a aVar) {
        synchronized (this.f9528a) {
            try {
                g.a(!collection.isEmpty());
                this.f9532e = aVar;
                InterfaceC1701o interfaceC1701oT = lifecycleCamera.t();
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(interfaceC1701oT);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return;
                }
                Set<a> set = this.f9530c.get(lifecycleCameraRepositoryObserverD);
                A.a aVar2 = this.f9532e;
                if (aVar2 == null || aVar2.b() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) g.g(this.f9529b.get(it.next()));
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.v().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    lifecycleCamera.s().d0(i02);
                    lifecycleCamera.s().b0(list);
                    lifecycleCamera.r(collection);
                    if (interfaceC1701oT.getLifecycle().getState().e(AbstractC1694h.b.STARTED)) {
                        h(interfaceC1701oT);
                    }
                } catch (f.a e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    LifecycleCamera b(InterfaceC1701o interfaceC1701o, f fVar) {
        synchronized (this.f9528a) {
            try {
                g.b(this.f9529b.get(a.a(interfaceC1701o, fVar.D())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                LifecycleCamera lifecycleCamera = new LifecycleCamera(interfaceC1701o, fVar);
                if (fVar.J().isEmpty()) {
                    lifecycleCamera.x();
                }
                if (interfaceC1701o.getLifecycle().getState() == AbstractC1694h.b.DESTROYED) {
                    return lifecycleCamera;
                }
                g(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    LifecycleCamera c(InterfaceC1701o interfaceC1701o, f.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f9528a) {
            lifecycleCamera = this.f9529b.get(a.a(interfaceC1701o, bVar));
        }
        return lifecycleCamera;
    }

    Collection<LifecycleCamera> e() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.f9528a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f9529b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void h(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                if (f(interfaceC1701o)) {
                    if (this.f9531d.isEmpty()) {
                        this.f9531d.push(interfaceC1701o);
                    } else {
                        A.a aVar = this.f9532e;
                        if (aVar == null || aVar.b() != 2) {
                            InterfaceC1701o interfaceC1701oPeek = this.f9531d.peek();
                            if (!interfaceC1701o.equals(interfaceC1701oPeek)) {
                                j(interfaceC1701oPeek);
                                this.f9531d.remove(interfaceC1701o);
                                this.f9531d.push(interfaceC1701o);
                            }
                        }
                    }
                    n(interfaceC1701o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void i(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                this.f9531d.remove(interfaceC1701o);
                j(interfaceC1701o);
                if (!this.f9531d.isEmpty()) {
                    n(this.f9531d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k(Collection<G0> collection) {
        synchronized (this.f9528a) {
            try {
                Iterator<a> it = this.f9529b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.f9529b.get(it.next());
                    boolean zIsEmpty = lifecycleCamera.v().isEmpty();
                    lifecycleCamera.y(collection);
                    if (!zIsEmpty && lifecycleCamera.v().isEmpty()) {
                        i(lifecycleCamera.t());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void l() {
        synchronized (this.f9528a) {
            try {
                Iterator<a> it = this.f9529b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.f9529b.get(it.next());
                    lifecycleCamera.z();
                    i(lifecycleCamera.t());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void m(InterfaceC1701o interfaceC1701o) {
        synchronized (this.f9528a) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserverD = d(interfaceC1701o);
                if (lifecycleCameraRepositoryObserverD == null) {
                    return;
                }
                i(interfaceC1701o);
                Iterator<a> it = this.f9530c.get(lifecycleCameraRepositoryObserverD).iterator();
                while (it.hasNext()) {
                    this.f9529b.remove(it.next());
                }
                this.f9530c.remove(lifecycleCameraRepositoryObserverD);
                lifecycleCameraRepositoryObserverD.a().getLifecycle().d(lifecycleCameraRepositoryObserverD);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
