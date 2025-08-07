package ha;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "maxAttempts", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "", "a", "(ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0478w {

    @f(c = "com.withpersona.sdk2.inquiry.shared.RetryKt", f = "Retry.kt", l = {R.styleable.LottieAnimationView_lottie_repeatMode}, m = "retry")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends d {
        int d;
        int e;
        Object i;
        Object v;
        int w;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.w |= Integer.MIN_VALUE;
            return C0478w.a(0, null, this);
        }
    }

    public static final java.lang.Object a(int r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0478w.a(int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
