package u5;

import P9.p;
import S9.b;
import android.content.Context;
import androidx.camera.lifecycle.e;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import z.U;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll8/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0623j {

    @NotNull
    public static final C0623j a = new C0623j();

    @f(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", l = {R.styleable.LottieAnimationView_lottie_repeatMode, R.styleable.LottieAnimationView_lottie_url, 20}, m = "unbind")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends d {
        Object d;
        int i;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            return C0623j.this.a(null, this);
        }
    }

    @f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final e e;

        L(e eVar, Continuation<? super L> continuation) {
            super(2, continuation);
            this.e = eVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new L(this.e, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                this.e.B();
            } catch (U unused) {
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/lifecycle/e;", "kotlin.jvm.PlatformType", "a", "()Landroidx/camera/lifecycle/e;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends l implements Function0<e> {
        final com.google.common.util.concurrent.p<e> d;

        c(com.google.common.util.concurrent.p<e> pVar) {
            super(0);
            this.d = pVar;
        }

        public final e invoke() {
            return (e) this.d.get();
        }
    }

    @f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/google/common/util/concurrent/p;", "Landroidx/camera/lifecycle/e;", "<anonymous>", "(Lha/L;)Lcom/google/common/util/concurrent/p;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0624d extends k implements Function2<ha.L, Continuation<? super com.google.common.util.concurrent.p<e>>, Object> {
        int d;
        final Context e;

        C0624d(Context context, Continuation<? super C0624d> continuation) {
            super(2, continuation);
            this.e = context;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C0624d(this.e, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super com.google.common.util.concurrent.p<e>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            return e.i.b(this.e);
        }
    }

    private C0623j() {
    }

    public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        throw new UnsupportedOperationException("Method not decompiled: u5.C0623j.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
