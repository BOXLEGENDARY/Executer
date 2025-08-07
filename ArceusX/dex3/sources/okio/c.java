package okio;

import E1.m;
import K1.Size;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import ca.a;
import ha.C0361l;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.C0404a;
import okio.C0412j;
import okio.K;
import okio.e;
import okio.g;
import okio.h;
import okio.o;
import okio.o;
import okio.w;
import org.jetbrains.annotations.NotNull;
import qa.f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"LB1/c;", "LB1/h;", "LB1/o;", "source", "LJ1/l;", "options", "Lqa/d;", "parallelismLock", "LB1/k;", "exifOrientationPolicy", "<init>", "(LB1/o;LJ1/l;Lqa/d;LB1/k;)V", "Landroid/graphics/BitmapFactory$Options;", "LB1/f;", "e", "(Landroid/graphics/BitmapFactory$Options;)LB1/f;", "LB1/i;", "exifData", "", "c", "(Landroid/graphics/BitmapFactory$Options;LB1/i;)V", "d", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB1/o;", "b", "LJ1/l;", "Lqa/d;", "LB1/k;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements h {

    @NotNull
    private final o source;

    @NotNull
    private final C0361l options;

    @NotNull
    private final qa.d parallelismLock;

    @NotNull
    private final k exifOrientationPolicy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0013\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LB1/c$b;", "Lokio/o;", "Lokio/K;", "delegate", "<init>", "(Lokio/K;)V", "Lokio/e;", "sink", "", "byteCount", "read", "(Lokio/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "d", "Ljava/lang/Exception;", "b", "()Ljava/lang/Exception;", "exception", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b extends o {

        private Exception exception;

        public b(@NotNull K k) {
            super(k);
        }

        public final Exception getException() {
            return this.exception;
        }

        public long read(@NotNull e sink, long byteCount) throws Exception {
            try {
                return super.read(sink, byteCount);
            } catch (Exception e) {
                this.exception = e;
                throw e;
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LB1/c$c;", "LB1/h$a;", "", "maxParallelism", "LB1/k;", "exifOrientationPolicy", "<init>", "(ILB1/k;)V", "LE1/m;", "result", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LB1/h;", "a", "(LE1/m;LJ1/l;Lz1/h;)LB1/h;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LB1/k;", "Lqa/d;", "b", "Lqa/d;", "parallelismLock", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0003c implements h.a {

        @NotNull
        private final k exifOrientationPolicy;

        @NotNull
        private final qa.d parallelismLock;

        public C0003c(int i, @NotNull k kVar) {
            this.exifOrientationPolicy = kVar;
            this.parallelismLock = f.b(i, 0, 2, (Object) null);
        }

        @Override
        @NotNull
        public h a(@NotNull m result, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            return new c(result.getSource(), options, this.parallelismLock, this.exifOrientationPolicy);
        }

        public boolean equals(Object other) {
            return other instanceof C0003c;
        }

        public int hashCode() {
            return C0003c.class.hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {231, 46}, m = "decode")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(@NotNull o oVar, @NotNull C0361l c0361l, @NotNull qa.d dVar, @NotNull k kVar) {
        this.source = oVar;
        this.options = c0361l;
        this.parallelismLock = dVar;
        this.exifOrientationPolicy = kVar;
    }

    private final void c(BitmapFactory.Options options, i iVar) {
        Bitmap.Config config = this.options.getConfig();
        if (iVar.getIsFlipped() || m.a(iVar)) {
            config = C0404a.e(config);
        }
        if (this.options.getAllowRgb565() && config == Bitmap.Config.ARGB_8888 && Intrinsics.b(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config2 = options.outConfig;
        Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
        if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
            config = config3;
        }
        options.inPreferredConfig = config;
    }

    private final void d(BitmapFactory.Options options, i iVar) throws P9.m {
        o.a metadata = this.source.getMetadata();
        if ((metadata instanceof s) && K1.b.b(this.options.getSize())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((s) metadata).getDensity();
            options.inTargetDensity = this.options.getContext().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = m.b(iVar) ? options.outHeight : options.outWidth;
        int i2 = m.b(iVar) ? options.outWidth : options.outHeight;
        Size size = this.options.getSize();
        int iA = K1.b.b(size) ? i : C0412j.A(size.d(), this.options.getScale());
        Size size2 = this.options.getSize();
        int iA2 = K1.b.b(size2) ? i2 : C0412j.A(size2.c(), this.options.getScale());
        int iA3 = g.a(i, i2, iA, iA2, this.options.getScale());
        options.inSampleSize = iA3;
        double dB = g.b(i / iA3, i2 / iA3, iA, iA2, this.options.getScale());
        if (this.options.getAllowInexactSize()) {
            dB = kotlin.ranges.b.e(dB, 1.0d);
        }
        boolean z = dB == 1.0d;
        options.inScaled = !z;
        if (z) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = a.a(Integer.MAX_VALUE / dB);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = a.a(Integer.MAX_VALUE * dB);
        }
    }

    private final f e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.e());
        g gVarD = w.d(bVar);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gVarD.peek().w1(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        l lVar = l.a;
        i iVarA = lVar.a(options.outMimeType, gVarD, this.exifOrientationPolicy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (this.options.getColorSpace() != null) {
            options.inPreferredColorSpace = this.options.getColorSpace();
        }
        options.inPremultiplied = this.options.getPremultipliedAlpha();
        c(options, iVarA);
        d(options, iVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVarD.w1(), null, options);
            X9.c.a(gVarD, (Throwable) null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), lVar.b(bitmapDecodeStream, iVarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new f(bitmapDrawable, z);
        } finally {
        }
    }

    public static final f f(c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super okio.f> r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: okio.c.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
