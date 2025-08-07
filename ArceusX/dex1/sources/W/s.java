package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import n.InterfaceC2621a;
import s.C2786U;

public class s {

    private final boolean f24216a;

    private final List<com.google.common.util.concurrent.p<Void>> f24217b = Collections.synchronizedList(new ArrayList());

    static class a extends CameraCaptureSession.CaptureCallback {

        final com.google.common.util.concurrent.p<Void> f24218a = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f24215a.c(aVar);
            }
        });

        c.a<Void> f24219b;

        a() {
        }

        private void b() {
            c.a<Void> aVar = this.f24219b;
            if (aVar != null) {
                aVar.c(null);
                this.f24219b = null;
            }
        }

        public Object c(c.a aVar) throws Exception {
            this.f24219b = aVar;
            return "RequestCompleteListener[" + this + "]";
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
            b();
        }

        @Override
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j7) {
            b();
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
            b();
        }
    }

    public s(boolean z7) {
        this.f24216a = z7;
    }

    private CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final com.google.common.util.concurrent.p<Void> pVar = aVar.f24218a;
        this.f24217b.add(pVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        pVar.c(new Runnable() {
            @Override
            public final void run() {
                this.f24212d.f(aVar, pVar);
            }
        }, F.a.a());
        return aVar;
    }

    public void f(a aVar, com.google.common.util.concurrent.p pVar) {
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + this);
        this.f24217b.remove(pVar);
    }

    public static Void g(List list) {
        return null;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return h() ? C2786U.b(c(), captureCallback) : captureCallback;
    }

    public com.google.common.util.concurrent.p<Void> e() {
        return this.f24217b.isEmpty() ? G.n.p(null) : G.n.B(G.n.G(G.n.F(new ArrayList(this.f24217b)), new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return s.g((List) obj);
            }
        }, F.a.a()));
    }

    public boolean h() {
        return this.f24216a;
    }

    public void i() {
        LinkedList linkedList = new LinkedList(this.f24217b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) linkedList.poll();
            Objects.requireNonNull(pVar);
            pVar.cancel(true);
        }
    }
}
