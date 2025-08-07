package X;

import C.H0;
import C.h1;
import X.E;
import X.InterfaceC1538i;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.concurrent.futures.c;
import androidx.room.kU.HguUe;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import z.C3043d0;

public class E implements InterfaceC1538i {

    private static final Range<Long> f7711E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    private Future<?> f7715D;

    final String f7716a;

    final boolean f7718c;

    private final MediaFormat f7719d;

    final MediaCodec f7720e;

    final InterfaceC1538i.a f7721f;

    private final Y f7722g;

    final Executor f7723h;

    private final com.google.common.util.concurrent.p<Void> f7724i;

    private final c.a<Void> f7725j;

    final h1 f7731p;

    d f7735t;

    final Object f7717b = new Object();

    final Queue<Integer> f7726k = new ArrayDeque();

    private final Queue<c.a<a0>> f7727l = new ArrayDeque();

    private final Set<a0> f7728m = new HashSet();

    final Set<C1537h> f7729n = new HashSet();

    final Deque<Range<Long>> f7730o = new ArrayDeque();

    final h0 f7732q = new g0();

    InterfaceC1539j f7733r = InterfaceC1539j.f7855a;

    Executor f7734s = F.a.a();

    Range<Long> f7736u = f7711E;

    long f7737v = 0;

    boolean f7738w = false;

    Long f7739x = null;

    Future<?> f7740y = null;

    private e f7741z = null;

    private boolean f7712A = false;

    private boolean f7713B = false;

    boolean f7714C = false;

    class a implements G.c<a0> {

        class C0053a implements G.c<Void> {
            C0053a() {
            }

            @Override
            public void onSuccess(Void r1) {
            }

            @Override
            public void onFailure(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    E.this.J((MediaCodec.CodecException) th);
                } else {
                    E.this.I(0, th.getMessage(), th);
                }
            }
        }

        a() {
        }

        @Override
        public void onSuccess(a0 a0Var) {
            a0Var.d(E.this.G());
            a0Var.b(true);
            a0Var.c();
            G.n.j(a0Var.a(), new C0053a(), E.this.f7723h);
        }

        @Override
        public void onFailure(Throwable th) {
            E.this.I(0, "Unable to acquire InputBuffer.", th);
        }
    }

    private static class b {
        static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    class c implements InterfaceC1538i.a, H0 {

        private final Map<H0.a<? super U.c>, Executor> f7744a = new LinkedHashMap();

        private U.c f7745b = U.c.INACTIVE;

        private final List<com.google.common.util.concurrent.p<a0>> f7746c = new ArrayList();

        c() {
        }

        public void l(final H0.a aVar, Executor executor) {
            this.f7744a.put((H0.a) x0.g.g(aVar), (Executor) x0.g.g(executor));
            final U.c cVar = this.f7745b;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    aVar.a(cVar);
                }
            });
        }

        public void m(c.a aVar) {
            aVar.c(this.f7745b);
        }

        public Object n(final c.a aVar) throws Exception {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7777d.m(aVar);
                }
            });
            return "fetchData";
        }

        public void o(H0.a aVar) {
            this.f7744a.remove(x0.g.g(aVar));
        }

        public static void p(Map.Entry entry, U.c cVar) {
            ((H0.a) entry.getKey()).a(cVar);
        }

        @Override
        public void a(final Executor executor, final H0.a<? super U.c> aVar) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7781d.l(aVar, executor);
                }
            });
        }

        @Override
        public void b(final H0.a<? super U.c> aVar) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7787d.o(aVar);
                }
            });
        }

        @Override
        public com.google.common.util.concurrent.p<U.c> d() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f7784a.n(aVar);
                }
            });
        }

        void q(boolean z7) {
            final U.c cVar = z7 ? U.c.ACTIVE : U.c.INACTIVE;
            if (this.f7745b == cVar) {
                return;
            }
            this.f7745b = cVar;
            if (cVar == U.c.INACTIVE) {
                Iterator<com.google.common.util.concurrent.p<a0>> it = this.f7746c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f7746c.clear();
            }
            for (final Map.Entry<H0.a<? super U.c>, Executor> entry : this.f7744a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() {
                        @Override
                        public final void run() {
                            E.c.p(entry, cVar);
                        }
                    });
                } catch (RejectedExecutionException e7) {
                    C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e7);
                }
            }
        }
    }

    enum d {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    class e extends MediaCodec.Callback {

        private final Z.e f7758a;

        private boolean f7759b;

        private boolean f7760c = false;

        private boolean f7761d = false;

        private boolean f7762e = false;

        private long f7763f = 0;

        private long f7764g = 0;

        private boolean f7765h = false;

        private boolean f7766i = false;

        private boolean f7767j = false;

        class a implements G.c<Void> {

            final C1537h f7769a;

            a(C1537h c1537h) {
                this.f7769a = c1537h;
            }

            @Override
            public void onSuccess(Void r22) {
                E.this.f7729n.remove(this.f7769a);
            }

            @Override
            public void onFailure(Throwable th) {
                E.this.f7729n.remove(this.f7769a);
                if (th instanceof MediaCodec.CodecException) {
                    E.this.J((MediaCodec.CodecException) th);
                } else {
                    E.this.I(0, th.getMessage(), th);
                }
            }
        }

        e() {
            this.f7759b = true;
            if (E.this.f7718c) {
                this.f7758a = new Z.e(E.this.f7732q, E.this.f7731p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f7758a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.g(E.this.f7719d.getString("mime"))) {
                return;
            }
            this.f7759b = false;
        }

        private boolean h(MediaCodec.BufferInfo bufferInfo) {
            if (this.f7762e) {
                C3043d0.a(E.this.f7716a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                C3043d0.a(E.this.f7716a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                C3043d0.a(E.this.f7716a, "Drop buffer by codec config.");
                return false;
            }
            Z.e eVar = this.f7758a;
            if (eVar != null) {
                bufferInfo.presentationTimeUs = eVar.b(bufferInfo.presentationTimeUs);
            }
            long j7 = bufferInfo.presentationTimeUs;
            if (j7 <= this.f7763f) {
                C3043d0.a(E.this.f7716a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f7763f = j7;
            if (!E.this.f7736u.contains((Range<Long>) Long.valueOf(j7))) {
                C3043d0.a(E.this.f7716a, "Drop buffer by not in start-stop range.");
                E e7 = E.this;
                if (e7.f7738w && bufferInfo.presentationTimeUs >= ((Long) e7.f7736u.getUpper()).longValue()) {
                    Future<?> future = E.this.f7740y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    E.this.f7739x = Long.valueOf(bufferInfo.presentationTimeUs);
                    E.this.m0();
                    E.this.f7738w = false;
                }
                return false;
            }
            if (v(bufferInfo)) {
                C3043d0.a(E.this.f7716a, "Drop buffer by pause.");
                return false;
            }
            if (E.this.H(bufferInfo) <= this.f7764g) {
                C3043d0.a(E.this.f7716a, "Drop buffer by adjusted time is less than the last sent time.");
                if (E.this.f7718c && E.O(bufferInfo)) {
                    this.f7766i = true;
                }
                return false;
            }
            if (!this.f7761d && !this.f7766i && E.this.f7718c) {
                this.f7766i = true;
            }
            if (this.f7766i) {
                if (!E.O(bufferInfo)) {
                    C3043d0.a(E.this.f7716a, "Drop buffer by not a key frame.");
                    E.this.i0();
                    return false;
                }
                this.f7766i = false;
            }
            return true;
        }

        private boolean i(MediaCodec.BufferInfo bufferInfo) {
            return E.L(bufferInfo) || (this.f7759b && j(bufferInfo));
        }

        private boolean j(MediaCodec.BufferInfo bufferInfo) {
            E e7 = E.this;
            return e7.f7714C && bufferInfo.presentationTimeUs > ((Long) e7.f7736u.getUpper()).longValue();
        }

        public void k(MediaCodec.CodecException codecException) {
            switch (E.this.f7735t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    E.this.J(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + E.this.f7735t);
            }
        }

        public void l(int i7) throws MediaCodec.CryptoException {
            if (this.f7767j) {
                C3043d0.l(E.this.f7716a, "Receives input frame after codec is reset.");
                return;
            }
            switch (E.this.f7735t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    E.this.f7726k.offer(Integer.valueOf(i7));
                    E.this.f0();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + E.this.f7735t);
            }
        }

        public void m(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i7) {
            final InterfaceC1539j interfaceC1539j;
            Executor executor;
            if (this.f7767j) {
                C3043d0.l(E.this.f7716a, "Receives frame after codec is reset.");
                return;
            }
            switch (E.this.f7735t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (E.this.f7717b) {
                        E e7 = E.this;
                        interfaceC1539j = e7.f7733r;
                        executor = e7.f7734s;
                    }
                    if (!this.f7760c) {
                        this.f7760c = true;
                        try {
                            Objects.requireNonNull(interfaceC1539j);
                            executor.execute(new Runnable() {
                                @Override
                                public final void run() {
                                    interfaceC1539j.a();
                                }
                            });
                        } catch (RejectedExecutionException e8) {
                            C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e8);
                        }
                    }
                    if (h(bufferInfo)) {
                        if (!this.f7761d) {
                            this.f7761d = true;
                            C3043d0.a(E.this.f7716a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + E.this.f7731p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoS = s(bufferInfo);
                        this.f7764g = bufferInfoS.presentationTimeUs;
                        try {
                            t(new C1537h(mediaCodec, i7, bufferInfoS), interfaceC1539j, executor);
                        } catch (MediaCodec.CodecException e9) {
                            E.this.J(e9);
                            return;
                        }
                    } else {
                        try {
                            E.this.f7720e.releaseOutputBuffer(i7, false);
                        } catch (MediaCodec.CodecException e10) {
                            E.this.J(e10);
                            return;
                        }
                    }
                    if (this.f7762e || !i(bufferInfo)) {
                        return;
                    }
                    r();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + E.this.f7735t);
            }
        }

        public static void n(InterfaceC1539j interfaceC1539j, final MediaFormat mediaFormat) {
            interfaceC1539j.e(new e0() {
            });
        }

        public void o(final MediaFormat mediaFormat) {
            final InterfaceC1539j interfaceC1539j;
            Executor executor;
            if (this.f7767j) {
                C3043d0.l(E.this.f7716a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (E.this.f7735t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (E.this.f7717b) {
                        E e7 = E.this;
                        interfaceC1539j = e7.f7733r;
                        executor = e7.f7734s;
                    }
                    try {
                        executor.execute(new Runnable() {
                            @Override
                            public final void run() {
                                E.e.n(interfaceC1539j, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e8) {
                        C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e8);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + E.this.f7735t);
            }
        }

        public void p(Executor executor, final InterfaceC1539j interfaceC1539j) {
            if (E.this.f7735t == d.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC1539j);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        interfaceC1539j.b();
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e7);
            }
        }

        private MediaCodec.BufferInfo s(MediaCodec.BufferInfo bufferInfo) {
            long jH = E.this.H(bufferInfo);
            if (bufferInfo.presentationTimeUs == jH) {
                return bufferInfo;
            }
            x0.g.i(jH > this.f7764g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, jH, bufferInfo.flags);
            return bufferInfo2;
        }

        private void t(final C1537h c1537h, final InterfaceC1539j interfaceC1539j, Executor executor) {
            E.this.f7729n.add(c1537h);
            G.n.j(c1537h.e(), new a(c1537h), E.this.f7723h);
            try {
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        interfaceC1539j.c(c1537h);
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e7);
                c1537h.close();
            }
        }

        private boolean v(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC1539j interfaceC1539j;
            E.this.q0(bufferInfo.presentationTimeUs);
            boolean zN = E.this.N(bufferInfo.presentationTimeUs);
            boolean z7 = this.f7765h;
            if (!z7 && zN) {
                C3043d0.a(E.this.f7716a, "Switch to pause state");
                this.f7765h = true;
                synchronized (E.this.f7717b) {
                    E e7 = E.this;
                    executor = e7.f7734s;
                    interfaceC1539j = e7.f7733r;
                }
                Objects.requireNonNull(interfaceC1539j);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        interfaceC1539j.f();
                    }
                });
                E e8 = E.this;
                if (e8.f7735t == d.PAUSED && ((e8.f7718c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!E.this.f7718c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC1538i.a aVar = E.this.f7721f;
                    if (aVar instanceof c) {
                        ((c) aVar).q(false);
                    }
                    E.this.k0(true);
                }
                E.this.f7739x = Long.valueOf(bufferInfo.presentationTimeUs);
                E e9 = E.this;
                if (e9.f7738w) {
                    Future<?> future = e9.f7740y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    E.this.m0();
                    E.this.f7738w = false;
                }
            } else if (z7 && !zN) {
                C3043d0.a(E.this.f7716a, "Switch to resume state");
                this.f7765h = false;
                if (E.this.f7718c && !E.O(bufferInfo)) {
                    this.f7766i = true;
                }
            }
            return this.f7765h;
        }

        @Override
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7797d.k(codecException);
                }
            });
        }

        @Override
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i7) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() throws MediaCodec.CryptoException {
                    this.f7791d.l(i7);
                }
            });
        }

        @Override
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i7, final MediaCodec.BufferInfo bufferInfo) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7793d.m(bufferInfo, mediaCodec, i7);
                }
            });
        }

        @Override
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            E.this.f7723h.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f7799d.o(mediaFormat);
                }
            });
        }

        void r() {
            E e7;
            final InterfaceC1539j interfaceC1539j;
            final Executor executor;
            if (this.f7762e) {
                return;
            }
            this.f7762e = true;
            if (E.this.f7715D != null) {
                E.this.f7715D.cancel(false);
                E.this.f7715D = null;
            }
            synchronized (E.this.f7717b) {
                e7 = E.this;
                interfaceC1539j = e7.f7733r;
                executor = e7.f7734s;
            }
            e7.p0(new Runnable() {
                @Override
                public final void run() {
                    this.f7804d.p(executor, interfaceC1539j);
                }
            });
        }

        void u() {
            this.f7767j = true;
        }
    }

    class f implements InterfaceC1538i.b {

        private Surface f7772b;

        private InterfaceC1538i.b.a f7774d;

        private Executor f7775e;

        private final Object f7771a = new Object();

        private final Set<Surface> f7773c = new HashSet();

        f() {
        }

        private void d(Executor executor, final InterfaceC1538i.b.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        aVar.a(surface);
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.d(E.this.f7716a, "Unable to post to the supplied executor.", e7);
            }
        }

        @Override
        public void c(Executor executor, InterfaceC1538i.b.a aVar) {
            Surface surface;
            synchronized (this.f7771a) {
                this.f7774d = (InterfaceC1538i.b.a) x0.g.g(aVar);
                this.f7775e = (Executor) x0.g.g(executor);
                surface = this.f7772b;
            }
            if (surface != null) {
                d(executor, aVar, surface);
            }
        }

        void e() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f7771a) {
                surface = this.f7772b;
                this.f7772b = null;
                hashSet = new HashSet(this.f7773c);
                this.f7773c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        void f() {
            Surface surfaceCreateInputSurface;
            InterfaceC1538i.b.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f7771a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f7772b == null) {
                            surfaceCreateInputSurface = b.a();
                            this.f7772b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        b.b(E.this.f7720e, this.f7772b);
                    } else {
                        Surface surface = this.f7772b;
                        if (surface != null) {
                            this.f7773c.add(surface);
                        }
                        surfaceCreateInputSurface = E.this.f7720e.createInputSurface();
                        this.f7772b = surfaceCreateInputSurface;
                    }
                    aVar = this.f7774d;
                    executor = this.f7775e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || aVar == null || executor == null) {
                return;
            }
            d(executor, aVar, surfaceCreateInputSurface);
        }
    }

    public E(Executor executor, InterfaceC1540k interfaceC1540k) throws d0 {
        x0.g.g(executor);
        x0.g.g(interfaceC1540k);
        MediaCodec mediaCodecA = Y.a.a(interfaceC1540k);
        this.f7720e = mediaCodecA;
        MediaCodecInfo codecInfo = mediaCodecA.getCodecInfo();
        this.f7723h = F.a.f(executor);
        MediaFormat mediaFormatA = interfaceC1540k.a();
        this.f7719d = mediaFormatA;
        h1 h1VarB = interfaceC1540k.b();
        this.f7731p = h1VarB;
        if (interfaceC1540k instanceof AbstractC1530a) {
            this.f7716a = "AudioEncoder";
            this.f7718c = false;
            this.f7721f = new c();
            this.f7722g = new C1531b(codecInfo, interfaceC1540k.c());
        } else {
            if (!(interfaceC1540k instanceof i0)) {
                throw new d0("Unknown encoder config type");
            }
            this.f7716a = "VideoEncoder";
            this.f7718c = true;
            this.f7721f = new f();
            m0 m0Var = new m0(codecInfo, interfaceC1540k.c());
            F(m0Var, mediaFormatA);
            this.f7722g = m0Var;
        }
        C3043d0.a(this.f7716a, "mInputTimebase = " + h1VarB);
        C3043d0.a(this.f7716a, "mMediaFormat = " + mediaFormatA);
        try {
            j0();
            final AtomicReference atomicReference = new AtomicReference();
            this.f7724i = G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return E.U(atomicReference, aVar);
                }
            }));
            this.f7725j = (c.a) x0.g.g((c.a) atomicReference.get());
            l0(d.CONFIGURED);
        } catch (MediaCodec.CodecException e7) {
            throw new d0(e7);
        }
    }

    private void E() {
        if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final e eVar = this.f7741z;
            final Executor executor = this.f7723h;
            Future<?> future = this.f7715D;
            if (future != null) {
                future.cancel(false);
            }
            this.f7715D = F.a.d().schedule(new Runnable() {
                @Override
                public final void run() {
                    E.R(executor, eVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void F(k0 k0Var, MediaFormat mediaFormat) {
        x0.g.i(this.f7718c);
        String str = HguUe.xTSZX;
        if (mediaFormat.containsKey(str)) {
            int integer = mediaFormat.getInteger(str);
            int iIntValue = ((Integer) k0Var.c().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger(str, iIntValue);
                C3043d0.a(this.f7716a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    static boolean L(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean M() {
        return androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    static boolean O(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    public static Object P(AtomicReference atomicReference, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    public void Q(c.a aVar) {
        this.f7727l.remove(aVar);
    }

    public static void R(Executor executor, final e eVar) {
        Objects.requireNonNull(eVar);
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                eVar.r();
            }
        });
    }

    public void T(c0 c0Var) {
        this.f7728m.remove(c0Var);
    }

    public static Object U(AtomicReference atomicReference, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static void V(InterfaceC1539j interfaceC1539j, int i7, String str, Throwable th) {
        interfaceC1539j.d(new C1534e(i7, str, th));
    }

    public void W(long j7) {
        switch (this.f7735t) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                C3043d0.a(this.f7716a, "Pause on " + U.d.c(j7));
                this.f7730o.addLast(Range.create(Long.valueOf(j7), Long.MAX_VALUE));
                l0(d.PAUSED);
                return;
            case PENDING_START:
                l0(d.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f7735t);
        }
    }

    public void X() {
        switch (this.f7735t) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                h0();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                l0(d.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f7735t);
        }
    }

    public void Y() {
        int iOrdinal = this.f7735t.ordinal();
        if (iOrdinal == 1) {
            i0();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public void Z() {
        this.f7713B = true;
        if (this.f7712A) {
            this.f7720e.stop();
            j0();
        }
    }

    public void a0(long j7) {
        switch (this.f7735t) {
            case CONFIGURED:
                this.f7739x = null;
                C3043d0.a(this.f7716a, "Start on " + U.d.c(j7));
                try {
                    if (this.f7712A) {
                        j0();
                    }
                    this.f7736u = Range.create(Long.valueOf(j7), Long.MAX_VALUE);
                    this.f7720e.start();
                    InterfaceC1538i.a aVar = this.f7721f;
                    if (aVar instanceof c) {
                        ((c) aVar).q(true);
                    }
                    l0(d.STARTED);
                    return;
                } catch (MediaCodec.CodecException e7) {
                    J(e7);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                this.f7739x = null;
                Range<Long> rangeRemoveLast = this.f7730o.removeLast();
                x0.g.j(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l7 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l7.longValue();
                this.f7730o.addLast(Range.create(l7, Long.valueOf(j7)));
                C3043d0.a(this.f7716a, "Resume on " + U.d.c(j7) + "\nPaused duration = " + U.d.c(j7 - jLongValue));
                if ((this.f7718c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.f7718c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    k0(false);
                    InterfaceC1538i.a aVar2 = this.f7721f;
                    if (aVar2 instanceof c) {
                        ((c) aVar2).q(true);
                    }
                }
                if (this.f7718c) {
                    i0();
                }
                l0(d.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                l0(d.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f7735t);
        }
    }

    public void b0() {
        if (this.f7738w) {
            C3043d0.l(this.f7716a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f7739x = null;
            m0();
            this.f7738w = false;
        }
    }

    public void c0() {
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7873d.b0();
            }
        });
    }

    public void d0(long j7, long j8) {
        switch (this.f7735t) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                d dVar = this.f7735t;
                l0(d.STOPPING);
                Long l7 = (Long) this.f7736u.getLower();
                long jLongValue = l7.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j7 == -1) {
                    j7 = j8;
                } else if (j7 < jLongValue) {
                    C3043d0.l(this.f7716a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j7 = j8;
                }
                if (j7 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                this.f7736u = Range.create(l7, Long.valueOf(j7));
                C3043d0.a(this.f7716a, "Stop on " + U.d.c(j7));
                if (dVar == d.PAUSED && this.f7739x != null) {
                    m0();
                    return;
                } else {
                    this.f7738w = true;
                    this.f7740y = F.a.d().schedule(new Runnable() {
                        @Override
                        public final void run() {
                            this.f7863d.c0();
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                l0(d.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f7735t);
        }
    }

    public void e0(List list, Runnable runnable) {
        if (this.f7735t != d.ERROR) {
            if (!list.isEmpty()) {
                C3043d0.a(this.f7716a, "encoded data and input buffers are returned");
            }
            if (!(this.f7721f instanceof f) || this.f7713B || M()) {
                this.f7720e.stop();
            } else {
                this.f7720e.flush();
                this.f7712A = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        K();
    }

    private void h0() {
        if (this.f7712A) {
            this.f7720e.stop();
            this.f7712A = false;
        }
        this.f7720e.release();
        InterfaceC1538i.a aVar = this.f7721f;
        if (aVar instanceof f) {
            ((f) aVar).e();
        }
        l0(d.RELEASED);
        this.f7725j.c(null);
    }

    private void j0() {
        this.f7736u = f7711E;
        this.f7737v = 0L;
        this.f7730o.clear();
        this.f7726k.clear();
        Iterator<c.a<a0>> it = this.f7727l.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f7727l.clear();
        this.f7720e.reset();
        this.f7712A = false;
        this.f7713B = false;
        this.f7714C = false;
        this.f7738w = false;
        Future<?> future = this.f7740y;
        if (future != null) {
            future.cancel(true);
            this.f7740y = null;
        }
        Future<?> future2 = this.f7715D;
        if (future2 != null) {
            future2.cancel(false);
            this.f7715D = null;
        }
        e eVar = this.f7741z;
        if (eVar != null) {
            eVar.u();
        }
        e eVar2 = new e();
        this.f7741z = eVar2;
        this.f7720e.setCallback(eVar2);
        this.f7720e.configure(this.f7719d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC1538i.a aVar = this.f7721f;
        if (aVar instanceof f) {
            ((f) aVar).f();
        }
    }

    private void l0(d dVar) {
        if (this.f7735t == dVar) {
            return;
        }
        C3043d0.a(this.f7716a, "Transitioning encoder internal state: " + this.f7735t + " --> " + dVar);
        this.f7735t = dVar;
    }

    public void n0() {
        G.n.j(D(), new a(), this.f7723h);
    }

    com.google.common.util.concurrent.p<a0> D() throws MediaCodec.CryptoException {
        switch (this.f7735t) {
            case CONFIGURED:
                return G.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                com.google.common.util.concurrent.p<a0> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                    @Override
                    public final Object a(c.a aVar) {
                        return E.P(atomicReference, aVar);
                    }
                });
                final c.a<a0> aVar = (c.a) x0.g.g((c.a) atomicReference.get());
                this.f7727l.offer(aVar);
                aVar.a(new Runnable() {
                    @Override
                    public final void run() {
                        this.f7881d.Q(aVar);
                    }
                }, this.f7723h);
                f0();
                return pVarA;
            case ERROR:
                return G.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return G.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f7735t);
        }
    }

    long G() {
        return this.f7732q.a();
    }

    long H(MediaCodec.BufferInfo bufferInfo) {
        long j7 = this.f7737v;
        return j7 > 0 ? bufferInfo.presentationTimeUs - j7 : bufferInfo.presentationTimeUs;
    }

    void I(final int i7, final String str, final Throwable th) {
        switch (this.f7735t) {
            case CONFIGURED:
                S(i7, str, th);
                j0();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                l0(d.ERROR);
                p0(new Runnable() {
                    @Override
                    public final void run() {
                        this.f7707d.S(i7, str, th);
                    }
                });
                break;
            case ERROR:
                C3043d0.m(this.f7716a, "Get more than one error: " + str + "(" + i7 + ")", th);
                break;
        }
    }

    void J(MediaCodec.CodecException codecException) {
        I(1, codecException.getMessage(), codecException);
    }

    void K() {
        d dVar = this.f7735t;
        if (dVar == d.PENDING_RELEASE) {
            h0();
            return;
        }
        if (!this.f7712A) {
            j0();
        }
        l0(d.CONFIGURED);
        if (dVar == d.PENDING_START || dVar == d.PENDING_START_PAUSED) {
            start();
            if (dVar == d.PENDING_START_PAUSED) {
                d();
            }
        }
    }

    boolean N(long j7) {
        for (Range<Long> range : this.f7730o) {
            if (range.contains((Range<Long>) Long.valueOf(j7))) {
                return true;
            }
            if (j7 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    @Override
    public void a() {
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7884d.X();
            }
        });
    }

    @Override
    public void b(final long j7) {
        final long jG = G();
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7702d.d0(j7, jG);
            }
        });
    }

    @Override
    public InterfaceC1538i.a c() {
        return this.f7721f;
    }

    @Override
    public void d() {
        final long jG = G();
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7705d.W(jG);
            }
        });
    }

    @Override
    public Y e() {
        return this.f7722g;
    }

    @Override
    public void f(InterfaceC1539j interfaceC1539j, Executor executor) {
        synchronized (this.f7717b) {
            this.f7733r = interfaceC1539j;
            this.f7734s = executor;
        }
    }

    void f0() throws MediaCodec.CryptoException {
        while (!this.f7727l.isEmpty() && !this.f7726k.isEmpty()) {
            c.a aVarPoll = this.f7727l.poll();
            Objects.requireNonNull(aVarPoll);
            Integer numPoll = this.f7726k.poll();
            Objects.requireNonNull(numPoll);
            try {
                final c0 c0Var = new c0(this.f7720e, numPoll.intValue());
                if (aVarPoll.c(c0Var)) {
                    this.f7728m.add(c0Var);
                    c0Var.a().c(new Runnable() {
                        @Override
                        public final void run() {
                            this.f7866d.T(c0Var);
                        }
                    }, this.f7723h);
                } else {
                    c0Var.f();
                }
            } catch (MediaCodec.CodecException e7) {
                J(e7);
                return;
            }
        }
    }

    @Override
    public com.google.common.util.concurrent.p<Void> g() {
        return this.f7724i;
    }

    public void S(final int i7, final String str, final Throwable th) {
        final InterfaceC1539j interfaceC1539j;
        Executor executor;
        synchronized (this.f7717b) {
            interfaceC1539j = this.f7733r;
            executor = this.f7734s;
        }
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    E.V(interfaceC1539j, i7, str, th);
                }
            });
        } catch (RejectedExecutionException e7) {
            C3043d0.d(this.f7716a, "Unable to post to the supplied executor.", e7);
        }
    }

    @Override
    public void h() {
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7860d.Y();
            }
        });
    }

    @Override
    public int i() {
        if (this.f7719d.containsKey("bitrate")) {
            return this.f7719d.getInteger("bitrate");
        }
        return 0;
    }

    void i0() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f7720e.setParameters(bundle);
    }

    void k0(boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z7 ? 1 : 0);
        this.f7720e.setParameters(bundle);
    }

    void m0() {
        C3043d0.a(this.f7716a, "signalCodecStop");
        InterfaceC1538i.a aVar = this.f7721f;
        if (aVar instanceof c) {
            ((c) aVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<a0> it = this.f7728m.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            G.n.F(arrayList).c(new Runnable() {
                @Override
                public final void run() {
                    this.f7877d.n0();
                }
            }, this.f7723h);
            return;
        }
        if (aVar instanceof f) {
            try {
                E();
                this.f7720e.signalEndOfInputStream();
                this.f7714C = true;
            } catch (MediaCodec.CodecException e7) {
                J(e7);
            }
        }
    }

    public void o0() {
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7701d.Z();
            }
        });
    }

    void p0(final Runnable runnable) {
        C3043d0.a(this.f7716a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<C1537h> it = this.f7729n.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().e());
        }
        Iterator<a0> it2 = this.f7728m.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().a());
        }
        if (!arrayList.isEmpty()) {
            C3043d0.a(this.f7716a, "Waiting for resources to return. encoded data = " + this.f7729n.size() + ", input buffers = " + this.f7728m.size());
        }
        G.n.F(arrayList).c(new Runnable() {
            @Override
            public final void run() {
                this.f7874d.e0(arrayList, runnable);
            }
        }, this.f7723h);
    }

    void q0(long j7) {
        while (!this.f7730o.isEmpty()) {
            Range<Long> first = this.f7730o.getFirst();
            if (j7 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.f7730o.removeFirst();
            this.f7737v += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            C3043d0.a(this.f7716a, "Total paused duration = " + U.d.c(this.f7737v));
        }
    }

    @Override
    public void start() {
        final long jG = G();
        this.f7723h.execute(new Runnable() {
            @Override
            public final void run() {
                this.f7864d.a0(jG);
            }
        });
    }
}
