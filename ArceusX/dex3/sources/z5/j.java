package z5;

import P9.o;
import com.roblox.client.personasdk.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lm8/j;", "Lm8/d;", "<init>", "()V", "Lm8/i;", "b", "()Lm8/i;", "Ll8/y;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "LP9/o;", "Lm8/a;", "a", "(Ll8/y;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm8/i;", "textEntityExtractor", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "previousReadings", "c", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j implements d {

    private final i textEntityExtractor = b();

    @NotNull
    private final HashMap<String, Integer> previousReadings = new HashMap<>();

    @f(c = "com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer", f = "TextExtractionAnalyzer.kt", l = {26}, m = "analyze-0E7RQCE")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends d {
        Object d;
        Object e;
        int v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.v |= Integer.MIN_VALUE;
            Object objA = j.this.a(null, null, this);
            return objA == S9.b.c() ? objA : o.a(objA);
        }
    }

    private final i b() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.e(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.camera.analyzers.TextEntityExtractor");
            return (i) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull u5.y r8, android.graphics.Rect r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends z5.a>> r10) {
        throw new UnsupportedOperationException("Method not decompiled: z5.j.a(l8.y, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
