package com.withpersona.sdk2.inquiry.governmentid;

import P9.o;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AbstractC0618e;
import u5.D;
import u5.w;
import v8.C0828I;
import v8.C0848p;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0017B-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e;", "Lf8/o;", "LP9/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "Landroid/content/Context;", "context", "Ll8/w;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Ll8/w;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)V", "Ll8/D$b;", "parsedIdSide", "e", "(Ll8/D$b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "f", "(Ll8/D$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroid/content/Context;", "c", "Ll8/w;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "autocaptureState", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdAnalyzeWorker implements ka.o<P9.o<? extends GovernmentId.GovernmentIdImage>> {

    @NotNull
    private final Context context;

    @NotNull
    private final w governmentIdFeed;

    @NotNull
    private final IdConfig.b side;

    @NotNull
    private final String idClassKey;

    @NotNull
    private AutocaptureState autocaptureState;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "idClassKey", "Lcom/withpersona/sdk2/inquiry/governmentid/e;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/e;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        GovernmentIdAnalyzeWorker a(@NotNull IdConfig.b side, @NotNull String idClassKey);
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class b {
        public static final int[] a;

        static {
            int[] iArr = new int[D.c.values().length];
            try {
                iArr[D.c.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D.c.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements ka.g<P9.o<? extends GovernmentId.GovernmentIdImage>> {
        final ka.g d;
        final GovernmentIdAnalyzeWorker e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a<T> implements ka.h {
            final ka.h d;
            final GovernmentIdAnalyzeWorker e;

            @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "GovernmentIdAnalyzeWorker.kt", l = {70}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class C0106a extends kotlin.coroutines.jvm.internal.d {
                Object d;
                int e;

                public C0106a(Continuation continuation) {
                    super(continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(ka.h hVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.d = hVar;
                this.e = governmentIdAnalyzeWorker;
            }

            public final java.lang.Object c(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.c.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(ka.g gVar, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.d = gVar;
            this.e = governmentIdAnalyzeWorker;
        }

        public Object a(ka.h hVar, Continuation continuation) {
            Object objA = this.d.a(new a(hVar, this.e), continuation);
            return objA == S9.b.c() ? objA : Unit.a;
        }
    }

    public GovernmentIdAnalyzeWorker(@NotNull Context context, @NotNull w wVar, @NotNull IdConfig.b bVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wVar, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(bVar, "side");
        Intrinsics.checkNotNullParameter(str, "idClassKey");
        this.context = context;
        this.governmentIdFeed = wVar;
        this.side = bVar;
        this.idClassKey = str;
        this.autocaptureState = new AutocaptureState(null, 1, null);
    }

    public final Object e(D.ParsedIdSide parsedIdSide) throws P9.m {
        GovernmentId.b bVar;
        try {
            String absolutePath = C0848p.a(parsedIdSide.getBitmap(), this.context).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            List listD = CollectionsKt.d(new Frame(absolutePath, null, 2, null));
            int i = b.a[parsedIdSide.getSide().ordinal()];
            if (i == 1) {
                bVar = GovernmentId.b.d;
            } else {
                if (i != 2) {
                    throw new P9.m();
                }
                bVar = GovernmentId.b.e;
            }
            GovernmentId.b bVar2 = bVar;
            String str = this.idClassKey;
            GovernmentId.a aVar = GovernmentId.a.d;
            AbstractC0618e extractedBarcode = parsedIdSide.getExtractedBarcode();
            return P9.o.b(new GovernmentId.GovernmentIdImage(listD, bVar2, str, aVar, extractedBarcode != null ? C0828I.a(extractedBarcode) : null, f(parsedIdSide)));
        } catch (IOException e) {
            o.a aVar2 = P9.o.e;
            return P9.o.b(P9.p.a(e));
        }
    }

    private final GovernmentIdDetails f(D.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails governmentIdDetailsM;
        AbstractC0618e extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (governmentIdDetailsM = d.m(extractedBarcode)) != null) {
            return governmentIdDetailsM;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return d.l(extractedTexts);
        }
        return null;
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) other;
        return Intrinsics.b(this.context, governmentIdAnalyzeWorker.context) && Intrinsics.b(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && this.side == governmentIdAnalyzeWorker.side && Intrinsics.b(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override
    @NotNull
    public ka.g<P9.o<? extends GovernmentId.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
