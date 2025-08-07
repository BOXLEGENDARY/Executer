package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s.P1;
import t.C2889b;
import t.C2891d;

final class a2 extends P1.c {

    private final List<P1.c> f23268a;

    a2(List<P1.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f23268a = arrayList;
        arrayList.addAll(list);
    }

    static P1.c w(P1.c... cVarArr) {
        return new a2(Arrays.asList(cVarArr));
    }

    @Override
    public void o(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().o(p1);
        }
    }

    @Override
    public void p(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().p(p1);
        }
    }

    @Override
    public void q(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().q(p1);
        }
    }

    @Override
    public void r(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().r(p1);
        }
    }

    @Override
    public void s(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().s(p1);
        }
    }

    @Override
    public void t(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().t(p1);
        }
    }

    @Override
    void u(P1 p1) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().u(p1);
        }
    }

    @Override
    public void v(P1 p1, Surface surface) {
        Iterator<P1.c> it = this.f23268a.iterator();
        while (it.hasNext()) {
            it.next().v(p1, surface);
        }
    }

    static class a extends P1.c {

        private final CameraCaptureSession.StateCallback f23269a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f23269a = stateCallback;
        }

        @Override
        public void o(P1 p1) {
            this.f23269a.onActive(p1.h().c());
        }

        @Override
        public void p(P1 p1) {
            C2891d.a(this.f23269a, p1.h().c());
        }

        @Override
        public void q(P1 p1) {
            this.f23269a.onClosed(p1.h().c());
        }

        @Override
        public void r(P1 p1) {
            this.f23269a.onConfigureFailed(p1.h().c());
        }

        @Override
        public void s(P1 p1) {
            this.f23269a.onConfigured(p1.h().c());
        }

        @Override
        public void t(P1 p1) {
            this.f23269a.onReady(p1.h().c());
        }

        @Override
        void u(P1 p1) {
        }

        @Override
        public void v(P1 p1, Surface surface) {
            C2889b.a(this.f23269a, p1.h().c(), surface);
        }

        a(List<CameraCaptureSession.StateCallback> list) {
            this(M0.a(list));
        }
    }
}
