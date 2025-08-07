package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class q {

    private final c f23869a;

    private static final class b implements c {

        private final List<k> f23872a;

        private final CameraCaptureSession.StateCallback f23873b;

        private final Executor f23874c;

        private final int f23875d;

        private j f23876e = null;

        private CaptureRequest f23877f = null;

        b(int i7, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f23875d = i7;
            this.f23872a = Collections.unmodifiableList(new ArrayList(list));
            this.f23873b = stateCallback;
            this.f23874c = executor;
        }

        @Override
        public Executor a() {
            return this.f23874c;
        }

        @Override
        public j b() {
            return this.f23876e;
        }

        @Override
        public CameraCaptureSession.StateCallback c() {
            return this.f23873b;
        }

        @Override
        public Object d() {
            return null;
        }

        @Override
        public void e(j jVar) {
            if (this.f23875d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f23876e = jVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f23876e, bVar.f23876e) && this.f23875d == bVar.f23875d && this.f23872a.size() == bVar.f23872a.size()) {
                    for (int i7 = 0; i7 < this.f23872a.size(); i7++) {
                        if (!this.f23872a.get(i7).equals(bVar.f23872a.get(i7))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public int f() {
            return this.f23875d;
        }

        @Override
        public List<k> g() {
            return this.f23872a;
        }

        @Override
        public void h(CaptureRequest captureRequest) {
            this.f23877f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f23872a.hashCode() ^ 31;
            int i7 = (iHashCode << 5) - iHashCode;
            j jVar = this.f23876e;
            int iHashCode2 = (jVar == null ? 0 : jVar.hashCode()) ^ i7;
            return this.f23875d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    private interface c {
        Executor a();

        j b();

        CameraCaptureSession.StateCallback c();

        Object d();

        void e(j jVar);

        int f();

        List<k> g();

        void h(CaptureRequest captureRequest);
    }

    public q(int i7, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f23869a = new b(i7, list, executor, stateCallback);
        } else {
            this.f23869a = new a(i7, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> h(List<k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().i());
        }
        return arrayList;
    }

    static List<k> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k.j(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f23869a.a();
    }

    public j b() {
        return this.f23869a.b();
    }

    public List<k> c() {
        return this.f23869a.g();
    }

    public int d() {
        return this.f23869a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f23869a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f23869a.equals(((q) obj).f23869a);
        }
        return false;
    }

    public void f(j jVar) {
        this.f23869a.e(jVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f23869a.h(captureRequest);
    }

    public int hashCode() {
        return this.f23869a.hashCode();
    }

    public Object j() {
        return this.f23869a.d();
    }

    private static final class a implements c {

        private final SessionConfiguration f23870a;

        private final List<k> f23871b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f23870a = sessionConfiguration;
            this.f23871b = Collections.unmodifiableList(q.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override
        public Executor a() {
            return this.f23870a.getExecutor();
        }

        @Override
        public j b() {
            return j.b(this.f23870a.getInputConfiguration());
        }

        @Override
        public CameraCaptureSession.StateCallback c() {
            return this.f23870a.getStateCallback();
        }

        @Override
        public Object d() {
            return this.f23870a;
        }

        @Override
        public void e(j jVar) {
            this.f23870a.setInputConfiguration((InputConfiguration) jVar.a());
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f23870a, ((a) obj).f23870a);
            }
            return false;
        }

        @Override
        public int f() {
            return this.f23870a.getSessionType();
        }

        @Override
        public List<k> g() {
            return this.f23871b;
        }

        @Override
        public void h(CaptureRequest captureRequest) {
            this.f23870a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f23870a.hashCode();
        }

        a(int i7, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i7, q.h(list), executor, stateCallback));
        }
    }
}
