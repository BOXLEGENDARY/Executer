package z5;

import B5.a;
import P9.h;
import P9.i;
import P9.o;
import P9.p;
import a4.m;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import u5.y;
import w5.e;
import z5.a;
import z5.a;
import z5.b;
import z5.b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lm8/f;", "Lm8/d;", "<init>", "()V", "Ll8/y;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw5/d;", "LP9/h;", "b", "()Lw5/d;", "faceDetector", "Lz5/c;", "c", "()Lz5/c;", "textDetector", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f implements z5.d {

    @NotNull
    private final h faceDetector = i.b(d.d);

    @NotNull
    private final h textDetector = i.b(c.d);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw5/d;", "a", "()Lw5/d;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends l implements Function0<w5.d> {
        public static final d d = new d();

        d() {
            super(0);
        }

        @NotNull
        public final w5.d invoke() {
            w5.d dVarA = w5.c.a(new e.a().c(0.1f).a());
            Intrinsics.checkNotNullExpressionValue(dVarA, "getClient(...)");
            return dVarA;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz5/c;", "a", "()Lz5/c;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function0<z5.c> {
        public static final c d = new c();

        c() {
            super(0);
        }

        @NotNull
        public final z5.c invoke() {
            z5.c cVarA = b.a(a.d);
            Intrinsics.checkNotNullExpressionValue(cVarA, "getClient(...)");
            return cVarA;
        }
    }

    private final w5.d b() {
        return (w5.d) this.faceDetector.getValue();
    }

    private final z5.c c() {
        return (z5.c) this.textDetector.getValue();
    }

    @Override
    public Object a(@NotNull y yVar, Rect rect, @NotNull Continuation<? super o<? extends a>> continuation) {
        u5.a aVarD = yVar.d();
        Task taskD = b().d(aVarD);
        Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
        Task taskD2 = c().d(aVarD);
        Intrinsics.checkNotNullExpressionValue(taskD2, "process(...)");
        try {
            m.a(m.h(new Task[]{taskD, taskD2}));
            Object objK = taskD.k();
            Intrinsics.checkNotNullExpressionValue(objK, "getResult(...)");
            w5.a aVar = (w5.a) CollectionsKt.O((List) objK, 0);
            if (aVar == null) {
                o.a aVar2 = o.e;
                return o.b(a.b.a);
            }
            List listB = ((a) taskD2.k()).b();
            Intrinsics.checkNotNullExpressionValue(listB, "getTextBlocks(...)");
            List list = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List listC = ((a.e) it.next()).c();
                Intrinsics.checkNotNullExpressionValue(listC, "getLines(...)");
                List list2 = listC;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.t(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((a.b) it2.next()).c());
                }
                arrayList.add(arrayList2);
            }
            if (CollectionsKt.v(arrayList).size() < 5) {
                o.a aVar3 = o.e;
                return o.b(a.b.a);
            }
            Rect rect2 = new Rect(0, 0, aVarD.m(), aVarD.i());
            rect2.inset(1, 1);
            if (!rect2.contains(aVar.a())) {
                o.a aVar4 = o.e;
                return o.b(a.b.a);
            }
            o.a aVar5 = o.e;
            String strA = ((a) taskD2.k()).a();
            Intrinsics.checkNotNullExpressionValue(strA, "getText(...)");
            return o.b(new a.d(new ImageIdMetadata(strA)));
        } catch (ExecutionException unused) {
            o.a aVar6 = o.e;
            return o.b(p.a(new b.a()));
        }
    }
}
