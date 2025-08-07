package u5;

import P9.m;
import P9.o;
import P9.p;
import S9.b;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.f;
import androidx.camera.core.n;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.camera.ImageLightCondition;
import ha.InterfaceC0636b;
import ha.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.B;
import ka.h;
import ka.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import u5.D;
import z5.a;
import z5.b;
import z5.c;
import z5.d;
import z5.e;
import z5.j;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u00020\u0005B\u001d\b\u0007\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0011H\u0096A¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J1\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0018H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Ll8/w;", "Landroidx/camera/core/f$a;", "Lka/B;", "LP9/o;", "Ll8/D;", "Ln8/b;", "Lka/x;", "resultFlow", "<init>", "(Lka/x;)V", "Ll8/y;", "imageToAnalyze", "n", "(Ll8/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "p", "(Ll8/y;)Landroid/graphics/Rect;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8/D$c;", "side", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "Lm8/d;", "passiveAnalyzers", "", "o", "(Ll8/D$c;Ljava/util/List;Ljava/util/List;)V", "rect", "previewRect", "s", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/n;", "imageProxy", "k", "(Landroidx/camera/core/n;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "g", "(Landroid/media/Image;I)V", "Ll8/b;", "analyzerResults", "q", "(Ll8/y;Ljava/util/List;)Ljava/lang/Object;", "d", "Lka/x;", "e", "Ll8/D$c;", "i", "Ljava/util/List;", "analyzers", "v", "Ll8/O;", "w", "Ll8/O;", "viewfinderInfo", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class w implements f.a, B<o<? extends D>>, InterfaceC0636b {

    @NotNull
    private final x<o<D>> resultFlow;

    private D.c side;

    @NotNull
    private List<? extends d> analyzers;

    @NotNull
    private List<? extends d> passiveAnalyzers;

    private ViewfinderInfo viewfinderInfo;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed", f = "GovernmentIdFeed.kt", l = {88, 94}, m = "analyze-gIAlu-s")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {
        int B;
        Object d;
        Object e;
        Object i;
        Object v;
        Object w;
        Object y;
        Object z;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            Object objN = w.this.n(null, this);
            return objN == b.c() ? objN : o.a(objN);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", f = "GovernmentIdFeed.kt", l = {108, 110}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        final n i;
        final w v;

        L(n nVar, w wVar, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = nVar;
            this.v = wVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new L(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            AutoCloseable autoCloseable;
            Object objN;
            Object objC = b.c();
            ?? r1 = this.e;
            try {
                if (r1 == 0) {
                    p.b(obj);
                    autoCloseable = this.i;
                    w wVar = this.v;
                    y yVarE = z.e(autoCloseable);
                    if (yVarE == null) {
                        Unit unit = Unit.a;
                        Y9.a.a(autoCloseable, (Throwable) null);
                        return unit;
                    }
                    this.d = autoCloseable;
                    this.e = 1;
                    objN = wVar.n(yVarE, this);
                    if (objN == objC) {
                        return objC;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        return Unit.a;
                    }
                    autoCloseable = (AutoCloseable) this.d;
                    p.b(obj);
                    objN = ((o) obj).j();
                }
                Y9.a.a(autoCloseable, (Throwable) null);
                x xVar = this.v.resultFlow;
                o oVarA = o.a(objN);
                this.d = null;
                this.e = 2;
                if (xVar.c(oVarA, this) == objC) {
                    return objC;
                }
                return Unit.a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Y9.a.a((AutoCloseable) r1, th);
                    throw th2;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", f = "GovernmentIdFeed.kt", l = {117, 119}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0630c extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        final Image i;
        final w v;
        final int w;

        C0630c(Image image, w wVar, int i, Continuation<? super C0630c> continuation) {
            super(2, continuation);
            this.i = image;
            this.v = wVar;
            this.w = i;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C0630c(this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objN;
            Image image;
            Object objC = b.c();
            ?? r1 = this.e;
            try {
                if (r1 == 0) {
                    p.b(obj);
                    Image image2 = this.i;
                    w wVar = this.v;
                    y yVarD = z.d(image2, this.w);
                    this.d = image2;
                    this.e = 1;
                    objN = wVar.n(yVarD, this);
                    image = image2;
                    if (objN == objC) {
                        return objC;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        return Unit.a;
                    }
                    ?? r12 = (AutoCloseable) this.d;
                    p.b(obj);
                    objN = ((o) obj).j();
                    image = r12;
                }
                Y9.a.a(image, (Throwable) null);
                r1 = this.v.resultFlow;
                o oVarA = o.a(objN);
                this.d = null;
                this.e = 2;
                if (r1.c(oVarA, this) == objC) {
                    return objC;
                }
                return Unit.a;
            } finally {
            }
        }
    }

    public w(@NotNull x<o<D>> xVar) {
        Intrinsics.checkNotNullParameter(xVar, "resultFlow");
        this.resultFlow = xVar;
        this.analyzers = CollectionsKt.j();
        this.passiveAnalyzers = CollectionsKt.j();
    }

    public final java.lang.Object n(u5.y r13, kotlin.coroutines.Continuation<? super P9.o<? extends u5.D>> r14) {
        throw new UnsupportedOperationException("Method not decompiled: u5.w.n(l8.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Rect p(y imageToAnalyze) {
        int height;
        int width;
        double d;
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        if (viewfinderInfo == null) {
            return null;
        }
        int iWidth = viewfinderInfo.getViewport().width();
        int iHeight = viewfinderInfo.getViewport().height();
        if (iWidth == 0 || iHeight == 0) {
            return null;
        }
        if (imageToAnalyze.getRotationDegrees() == 90 || imageToAnalyze.getRotationDegrees() == 270) {
            height = imageToAnalyze.getHeight();
            width = imageToAnalyze.getWidth();
        } else {
            height = imageToAnalyze.getWidth();
            width = imageToAnalyze.getHeight();
        }
        double d2 = height;
        double d3 = iWidth;
        double d4 = d2 / d3;
        double d5 = width;
        double d6 = iHeight;
        double d7 = d5 / d6;
        double dMin = Math.min(d4, d7);
        double d8 = 0.0d;
        if (d4 > d7) {
            d = 0.0d;
            d8 = (d2 - (d3 * dMin)) / 2.0d;
        } else {
            d = (d5 - (d6 * dMin)) / 2.0d;
        }
        double d10 = d8 + ((viewfinderInfo.getRegion().left - viewfinderInfo.getViewport().left) * dMin);
        double d11 = d + ((viewfinderInfo.getRegion().top - viewfinderInfo.getViewport().top) * dMin);
        double dWidth = viewfinderInfo.getRegion().width() * dMin;
        double dHeight = viewfinderInfo.getRegion().height() * dMin;
        return (imageToAnalyze.getRotationDegrees() == 90 || imageToAnalyze.getRotationDegrees() == 270) ? new Rect((int) d11, (int) d10, (int) (d11 + dHeight), (int) (d10 + dWidth)) : new Rect((int) d10, (int) d11, (int) (d10 + dWidth), (int) (d11 + dHeight));
    }

    private static final void r(v vVar, y<AbstractC0618e> yVar, y<ImageIdMetadata> yVar2, y<D.c> yVar3, y<ExtractedTexts> yVar4, v vVar2, y<ImageLightCondition> yVar5, z5.a aVar, boolean z) {
        a.b bVar = a.b.a;
        if (!Intrinsics.b(aVar, bVar) && z) {
            vVar.d = true;
        }
        if (aVar instanceof a.C0245a) {
            if (yVar.d == null) {
                yVar.d = ((a.C0245a) aVar).getExtractedBarcode();
                return;
            }
            return;
        }
        if (aVar instanceof a.d) {
            yVar2.d = ((a.d) aVar).getMetadata();
            return;
        }
        if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            r(vVar, yVar, yVar2, yVar3, yVar4, vVar2, yVar5, cVar.getFrontOrBackData(), z);
            yVar3.d = cVar.getSide();
        } else if (aVar instanceof a.f) {
            yVar4.d = ((a.f) aVar).getExtractedTexts();
        } else if (Intrinsics.b(aVar, bVar)) {
            vVar2.d = true;
        } else if (aVar instanceof a.e) {
            yVar5.d = ((a.e) aVar).getImageLightCondition();
        }
    }

    public Object a(@NotNull h<? super o<? extends D>> hVar, @NotNull Continuation<?> continuation) {
        return this.resultFlow.a(hVar, continuation);
    }

    @Override
    public void g(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        g.f((CoroutineContext) null, new C0630c(image, this, rotationDegrees, null), 1, (Object) null);
    }

    public void k(@NotNull n imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        g.f((CoroutineContext) null, new L(imageProxy, this, null), 1, (Object) null);
    }

    public final void o(@NotNull D.c side, @NotNull List<? extends AutoCaptureRule> rules, @NotNull List<? extends d> passiveAnalyzers) throws m {
        d jVar;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends AutoCaptureRule> list = rules;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        for (AutoCaptureRule autoCaptureRule : list) {
            if (autoCaptureRule instanceof AutoCaptureRule.BarcodePdf417Rule) {
                jVar = new c();
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontOrBackRule) {
                jVar = new e(new z5.f(), new c());
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontRule) {
                jVar = new z5.f();
            } else if (autoCaptureRule instanceof AutoCaptureRule.MrzRule) {
                jVar = new z5.h();
            } else {
                if (!(autoCaptureRule instanceof AutoCaptureRule.TextExtractionRule)) {
                    throw new m();
                }
                jVar = new j();
            }
            arrayList.add(jVar);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    @NotNull
    public final Object q(@NotNull y imageToAnalyze, @NotNull List<AnalyzerResult> analyzerResults) {
        Iterator it;
        y yVar;
        y yVar2;
        y yVar3;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        Intrinsics.checkNotNullParameter(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            o.a aVar = o.e;
            return o.b(p.a(new b.c()));
        }
        v vVar = new v();
        v vVar2 = new v();
        y yVar4 = new y();
        yVar4.d = this.side;
        y yVar5 = new y();
        y yVar6 = new y();
        y yVar7 = new y();
        y yVar8 = new y();
        Iterator it2 = analyzerResults.iterator();
        Throwable th = null;
        while (it2.hasNext()) {
            AnalyzerResult analyzerResult = (AnalyzerResult) it2.next();
            Object result = analyzerResult.getResult();
            if (o.h(result)) {
                yVar = yVar8;
                it = it2;
                yVar2 = yVar7;
                yVar3 = yVar6;
                r(vVar, yVar6, yVar5, yVar4, yVar7, vVar2, yVar8, (z5.a) result, analyzerResult.getIsActiveAnalyzer());
            } else {
                it = it2;
                yVar = yVar8;
                yVar2 = yVar7;
                yVar3 = yVar6;
            }
            Throwable thE = o.e(result);
            if (thE != null && th == null && analyzerResult.getIsActiveAnalyzer()) {
                vVar2.d = true;
                th = thE;
            }
            yVar8 = yVar;
            yVar7 = yVar2;
            yVar6 = yVar3;
            it2 = it;
        }
        y yVar9 = yVar8;
        y yVar10 = yVar7;
        y yVar11 = yVar6;
        if (vVar2.d) {
            if (th != null) {
                o.a aVar2 = o.e;
                return o.b(p.a(th));
            }
            o.a aVar3 = o.e;
            return o.b(new D.None((ImageLightCondition) yVar9.d));
        }
        if (!vVar.d) {
            o.a aVar4 = o.e;
            return o.b(new D.None((ImageLightCondition) yVar9.d));
        }
        D.c cVar = (D.c) yVar4.d;
        if (cVar == null) {
            o.a aVar5 = o.e;
            return o.b(new D.None((ImageLightCondition) yVar9.d));
        }
        Bitmap bitmapE = imageToAnalyze.e();
        if (bitmapE == null) {
            o.a aVar6 = o.e;
            return o.b(new D.None((ImageLightCondition) yVar9.d));
        }
        o.a aVar7 = o.e;
        return o.b(new D.ParsedIdSide(cVar, bitmapE, (ImageIdMetadata) yVar5.d, (AbstractC0618e) yVar11.d, (ExtractedTexts) yVar10.d, (ImageLightCondition) yVar9.d));
    }

    public final void s(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }
}
