package z5;

import B5.a;
import P9.i;
import P9.o;
import P9.p;
import a4.m;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0618e;
import u5.MrzExtraction;
import u5.y;
import z5.a;
import z5.b;
import z5.b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lm8/h;", "Lm8/d;", "<init>", "()V", "Ll8/y;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz5/c;", "LP9/h;", "b", "()Lz5/c;", "textDetector", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h implements d {

    @NotNull
    private final P9.h textDetector = i.b(c.d);

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

    private final z5.c b() {
        return (z5.c) this.textDetector.getValue();
    }

    @Override
    public Object a(@NotNull y yVar, Rect rect, @NotNull Continuation<? super o<? extends a>> continuation) {
        Task taskD = b().d(yVar.d());
        Intrinsics.checkNotNullExpressionValue(taskD, "process(...)");
        try {
            m.a(taskD);
            String strA = ((a) taskD.k()).a();
            Intrinsics.checkNotNullExpressionValue(strA, "getText(...)");
            if (Intrinsics.b(strA, "")) {
                o.a aVar = o.e;
                return o.b(a.b.a);
            }
            MrzExtraction mrzExtractionC = MrzExtraction.INSTANCE.c(strA);
            if (mrzExtractionC == null) {
                o.a aVar2 = o.e;
                return o.b(a.b.a);
            }
            o.a aVar3 = o.e;
            return o.b(new a.C0245a(new AbstractC0618e.MrzBarcodeInfo(mrzExtractionC.getRawText(), mrzExtractionC.getIdentificationNumber(), mrzExtractionC.getBirthdate(), mrzExtractionC.getExpirationDate())));
        } catch (ExecutionException unused) {
            o.a aVar4 = o.e;
            return o.b(p.a(new b.C0246b()));
        }
    }
}
