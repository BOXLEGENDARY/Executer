package z5;

import P9.h;
import P9.i;
import P9.o;
import P9.p;
import a4.m;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import com.roblox.client.personasdk.R;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import q5.a;
import q5.b;
import u5.AbstractC0618e;
import u5.y;
import z5.a;
import z5.b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lm8/c;", "Lm8/d;", "<init>", "()V", "Landroid/graphics/Bitmap;", "original", "c", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Ll8/y;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lq5/a;", "LP9/h;", "b", "()Lq5/a;", "barcodeDetector", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements d {

    @NotNull
    private static final float[] c = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    @NotNull
    private final h barcodeDetector = i.b(C0632b.d);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq5/a;", "a", "()Lq5/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0632b extends l implements Function0<a> {
        public static final C0632b d = new C0632b();

        C0632b() {
            super(0);
        }

        @NotNull
        public final a invoke() {
            a aVarA = q5.c.a(new b.a().b(2048, new int[0]).a());
            Intrinsics.checkNotNullExpressionValue(aVarA, "getClient(...)");
            return aVarA;
        }
    }

    private final a b() {
        return (a) this.barcodeDetector.getValue();
    }

    private final Bitmap c(Bitmap original) {
        try {
            return Toolkit.b(Toolkit.a, original, c, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }

    @Override
    public Object a(@NotNull y yVar, Rect rect, @NotNull Continuation<? super o<? extends a>> continuation) {
        Bitmap bitmapE = yVar.e();
        if (bitmapE == null) {
            o.a aVar = o.e;
            return o.b(a.b.a);
        }
        Bitmap bitmapC = c(bitmapE);
        if (bitmapC != null) {
            bitmapE = bitmapC;
        }
        u5.a aVarA = u5.a.a(bitmapE, yVar.d().l());
        Intrinsics.checkNotNullExpressionValue(aVarA, "fromBitmap(...)");
        Task taskD = b().d(aVarA);
        Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
        try {
            m.a(taskD);
            Object objK = taskD.k();
            Intrinsics.checkNotNullExpressionValue(objK, "getResult(...)");
            r5.a aVar2 = (r5.a) CollectionsKt.O((List) objK, 0);
            if (aVar2 == null) {
                o.a aVar3 = o.e;
                return o.b(a.b.a);
            }
            String strD = aVar2.d();
            if (strD == null) {
                o.a aVar4 = o.e;
                return o.b(a.b.a);
            }
            if (aVar2.c() != 2048) {
                o.a aVar5 = o.e;
                return o.b(a.b.a);
            }
            AbstractC0618e.Pdf417BarcodeInfo pdf417BarcodeInfo = new AbstractC0618e.Pdf417BarcodeInfo(strD);
            Rect rect2 = new Rect(0, 0, yVar.d().m(), yVar.d().i());
            Rect rectA = aVar2.a();
            if (rectA == null) {
                o.a aVar6 = o.e;
                return o.b(a.b.a);
            }
            rect2.inset(1, 1);
            if (rect2.contains(rectA)) {
                o.a aVar7 = o.e;
                return o.b(new a.C0245a(pdf417BarcodeInfo));
            }
            o.a aVar8 = o.e;
            return o.b(a.b.a);
        } catch (ExecutionException unused) {
            o.a aVar9 = o.e;
            return o.b(p.a(new b.C0246b()));
        }
    }
}
