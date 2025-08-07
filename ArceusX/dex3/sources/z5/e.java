package z5;

import P9.o;
import P9.t;
import S9.b;
import com.roblox.client.personasdk.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.D;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lm8/e;", "Lm8/d;", "Lm8/f;", "idFrontAnalyzer", "Lm8/c;", "barcodePdf417Analyzer", "<init>", "(Lm8/f;Lm8/c;)V", "Ll8/y;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm8/f;", "b", "Lm8/c;", "", "Ll8/D$c;", "c", "Ljava/util/Map;", "analyzers", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class e implements d {

    @NotNull
    private final f idFrontAnalyzer;

    @NotNull
    private final c barcodePdf417Analyzer;

    @NotNull
    private final Map<d, D.c> analyzers;

    @f(c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", f = "FrontOrBackAnalyzer.kt", l = {27}, m = "analyze-0E7RQCE")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends d {
        int A;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            Object objA = e.this.a(null, null, this);
            return objA == b.c() ? objA : o.a(objA);
        }
    }

    public e(@NotNull f fVar, @NotNull c cVar) {
        Intrinsics.checkNotNullParameter(fVar, "idFrontAnalyzer");
        Intrinsics.checkNotNullParameter(cVar, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = fVar;
        this.barcodePdf417Analyzer = cVar;
        this.analyzers = F.k(new Pair[]{t.a(cVar, D.c.e), t.a(fVar, D.c.d)});
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull u5.y r10, android.graphics.Rect r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends z5.a>> r12) {
        throw new UnsupportedOperationException("Method not decompiled: z5.e.a(l8.y, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
