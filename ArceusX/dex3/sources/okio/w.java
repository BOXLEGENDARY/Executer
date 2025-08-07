package okio;

import E1.m;
import K1.Size;
import P9.t;
import X9.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import ca.a;
import ha.C0361l;
import ha.C0366q;
import ha.InterfaceC0883h;
import ha.v0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.f;
import o2.j;
import okio.C0411i;
import okio.g;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0002\u0016\u0013B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LB1/w;", "LB1/h;", "LB1/o;", "source", "LJ1/l;", "options", "", "useViewBoundsAsIntrinsicSize", "<init>", "(LB1/o;LJ1/l;Z)V", "", "srcWidth", "srcHeight", "LK1/h;", "scale", "Lkotlin/Pair;", "d", "(FFLK1/h;)Lkotlin/Pair;", "LB1/f;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB1/o;", "b", "LJ1/l;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "coil-svg_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements h {

    @NotNull
    private final o source;

    @NotNull
    private final C0361l options;

    private final boolean useViewBoundsAsIntrinsicSize;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LB1/w$b;", "LB1/h$a;", "", "useViewBoundsAsIntrinsicSize", "<init>", "(Z)V", "LE1/m;", "result", "b", "(LE1/m;)Z", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LB1/h;", "a", "(LE1/m;LJ1/l;Lz1/h;)LB1/h;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "coil-svg_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h.a {

        private final boolean useViewBoundsAsIntrinsicSize;

        public b() {
            this(false, 1, null);
        }

        private final boolean b(m result) {
            return Intrinsics.b(result.getMimeType(), "image/svg+xml") || u.a(g.a, result.getSource().e());
        }

        @Override
        public h a(@NotNull m result, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader) {
            if (b(result)) {
                return new w(result.getSource(), options, this.useViewBoundsAsIntrinsicSize);
            }
            return null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.useViewBoundsAsIntrinsicSize == ((b) other).useViewBoundsAsIntrinsicSize;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useViewBoundsAsIntrinsicSize);
        }

        public b(boolean z) {
            this.useViewBoundsAsIntrinsicSize = z;
        }

        public b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    public w(@NotNull o oVar, @NotNull C0361l c0361l, boolean z) {
        this.source = oVar;
        this.options = c0361l;
        this.useViewBoundsAsIntrinsicSize = z;
    }

    public static final f c(w wVar) throws j, P9.m {
        float fH;
        float f;
        int iB;
        int iB2;
        g gVarE = wVar.source.e();
        try {
            o2.g gVarL = o2.g.l(gVarE.w1());
            c.a(gVarE, (Throwable) null);
            RectF rectFG = gVarL.g();
            if (!wVar.useViewBoundsAsIntrinsicSize || rectFG == null) {
                fH = gVarL.h();
                f = gVarL.f();
            } else {
                fH = rectFG.width();
                f = rectFG.height();
            }
            Pair<Float, Float> pairD = wVar.d(fH, f, wVar.options.getScale());
            float fFloatValue = ((Number) pairD.a()).floatValue();
            float fFloatValue2 = ((Number) pairD.b()).floatValue();
            if (fH <= 0.0f || f <= 0.0f) {
                iB = a.b(fFloatValue);
                iB2 = a.b(fFloatValue2);
            } else {
                float fD = g.d(fH, f, fFloatValue, fFloatValue2, wVar.options.getScale());
                iB = (int) (fD * fH);
                iB2 = (int) (fD * f);
            }
            if (rectFG == null && fH > 0.0f && f > 0.0f) {
                gVarL.s(0.0f, 0.0f, fH, f);
            }
            gVarL.t("100%");
            gVarL.r("100%");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iB2, C0411i.d(wVar.options.getConfig()));
            String strA = C0366q.a(wVar.options.getParameters());
            gVarL.o(new Canvas(bitmapCreateBitmap), strA != null ? new f().a(strA) : null);
            return new f(new BitmapDrawable(wVar.options.getContext().getResources(), bitmapCreateBitmap), true);
        } finally {
        }
    }

    private final Pair<Float, Float> d(float srcWidth, float srcHeight, K1.h scale) {
        if (!K1.b.b(this.options.getSize())) {
            Size size = this.options.getSize();
            return t.a(Float.valueOf(C0411i.c(size.getWidth(), scale)), Float.valueOf(C0411i.c(size.getHeight(), scale)));
        }
        if (srcWidth <= 0.0f) {
            srcWidth = 512.0f;
        }
        if (srcHeight <= 0.0f) {
            srcHeight = 512.0f;
        }
        return t.a(Float.valueOf(srcWidth), Float.valueOf(srcHeight));
    }

    @Override
    public Object a(@NotNull Continuation<? super f> continuation) {
        return v0.c((CoroutineContext) null, new Function0() {
            public final Object invoke() {
                return w.c(this.d);
            }
        }, continuation, 1, (Object) null);
    }

    public w(o oVar, C0361l c0361l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, c0361l, (i & 4) != 0 ? true : z);
    }
}
