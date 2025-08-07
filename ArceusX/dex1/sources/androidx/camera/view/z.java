package androidx.camera.view;

import K0.wJ.BtcVLuo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.q;
import androidx.camera.view.z;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import x0.InterfaceC2984a;
import z.C3043d0;
import z.F0;

final class z extends q {

    SurfaceView f9724e;

    final b f9725f;

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        private Size f9727d;

        private F0 f9728e;

        private F0 f9729i;

        private q.a f9730v;

        private Size f9731w;

        private boolean f9732y = false;

        private boolean f9733z = false;

        b() {
        }

        private boolean b() {
            return (this.f9732y || this.f9728e == null || !Objects.equals(this.f9727d, this.f9731w)) ? false : true;
        }

        private void c() {
            if (this.f9728e != null) {
                C3043d0.a("SurfaceViewImpl", "Request canceled: " + this.f9728e);
                this.f9728e.G();
            }
        }

        private void d() {
            if (this.f9728e != null) {
                C3043d0.a("SurfaceViewImpl", "Surface closed " + this.f9728e);
                this.f9728e.m().d();
            }
        }

        public static void e(q.a aVar, F0.g gVar) {
            C3043d0.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean g() throws ExecutionException, InterruptedException {
            Surface surface = z.this.f9724e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            C3043d0.a("SurfaceViewImpl", "Surface set on Preview.");
            final q.a aVar = this.f9730v;
            F0 f02 = this.f9728e;
            Objects.requireNonNull(f02);
            f02.D(surface, androidx.core.content.a.h(z.this.f9724e.getContext()), new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    z.b.e(aVar, (F0.g) obj);
                }
            });
            this.f9732y = true;
            z.this.f();
            return true;
        }

        void f(F0 f02, q.a aVar) {
            c();
            if (this.f9733z) {
                this.f9733z = false;
                f02.r();
                return;
            }
            this.f9728e = f02;
            this.f9730v = aVar;
            Size sizeP = f02.p();
            this.f9727d = sizeP;
            this.f9732y = false;
            if (g()) {
                return;
            }
            C3043d0.a("SurfaceViewImpl", "Wait for new Surface creation.");
            z.this.f9724e.getHolder().setFixedSize(sizeP.getWidth(), sizeP.getHeight());
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) throws ExecutionException, InterruptedException {
            C3043d0.a("SurfaceViewImpl", "Surface changed. Size: " + i8 + "x" + i9);
            this.f9731w = new Size(i8, i9);
            g();
        }

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            F0 f02;
            C3043d0.a("SurfaceViewImpl", "Surface created.");
            if (!this.f9733z || (f02 = this.f9729i) == null) {
                return;
            }
            f02.r();
            this.f9729i = null;
            this.f9733z = false;
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C3043d0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f9732y) {
                d();
            } else {
                c();
            }
            this.f9733z = true;
            F0 f02 = this.f9728e;
            if (f02 != null) {
                this.f9729i = f02;
            }
            this.f9732y = false;
            this.f9728e = null;
            this.f9730v = null;
            this.f9731w = null;
            this.f9727d = null;
        }
    }

    z(FrameLayout frameLayout, m mVar) {
        super(frameLayout, mVar);
        this.f9725f = new b();
    }

    public static void m(Semaphore semaphore, int i7) {
        if (i7 == 0) {
            C3043d0.a("SurfaceViewImpl", BtcVLuo.TrVmCs);
        } else {
            C3043d0.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i7);
        }
        semaphore.release();
    }

    public void n(F0 f02, q.a aVar) {
        this.f9725f.f(f02, aVar);
    }

    private static boolean o(SurfaceView surfaceView, Size size, F0 f02) {
        return surfaceView != null && Objects.equals(size, f02.p());
    }

    @Override
    View b() {
        return this.f9724e;
    }

    @Override
    Bitmap c() {
        SurfaceView surfaceView = this.f9724e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f9724e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f9724e.getWidth(), this.f9724e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f9724e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
            @Override
            public final void onPixelCopyFinished(int i7) {
                z.m(semaphore, i7);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    C3043d0.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e7) {
                C3043d0.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e7);
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override
    void d() {
    }

    @Override
    void e() {
    }

    @Override
    void g(final F0 f02, final q.a aVar) {
        if (!o(this.f9724e, this.f9699a, f02)) {
            this.f9699a = f02.p();
            l();
        }
        if (aVar != null) {
            f02.j(androidx.core.content.a.h(this.f9724e.getContext()), new Runnable() {
                @Override
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f9724e.post(new Runnable() {
            @Override
            public final void run() {
                this.f9720d.n(f02, aVar);
            }
        });
    }

    @Override
    com.google.common.util.concurrent.p<Void> i() {
        return G.n.p(null);
    }

    void l() {
        x0.g.g(this.f9700b);
        x0.g.g(this.f9699a);
        SurfaceView surfaceView = new SurfaceView(this.f9700b.getContext());
        this.f9724e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f9699a.getWidth(), this.f9699a.getHeight()));
        this.f9700b.removeAllViews();
        this.f9700b.addView(this.f9724e);
        this.f9724e.getHolder().addCallback(this.f9725f);
    }
}
