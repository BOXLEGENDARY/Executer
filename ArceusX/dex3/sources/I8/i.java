package I8;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.FallbackMode;
import ha.EnumC0342d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"LI8/i;", "Lu8/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "LI8/a;", "apiController", "LF8/d;", "environment", "Lcom/squareup/moshi/w;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;LI8/a;LF8/d;Lcom/squareup/moshi/w;)V", "LJ8/c;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "c", "(LJ8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "", "body", "Lbb/t;", "a", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "b", "LI8/a;", "LF8/d;", "d", "Lcom/squareup/moshi/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "<set-?>", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", "", "()Z", "isFallbackModeActive", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i implements InterfaceC0808a {

    @NotNull
    private final FallbackMode fallbackMode;

    @NotNull
    private final I8.a apiController;

    @NotNull
    private final EnumC0342d environment;

    @NotNull
    private final w moshi;

    private com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {49}, m = "createFallbackSession")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        int v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.v |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {68, 89, 101}, m = "transition")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        Object v;
        int y;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.y |= Integer.MIN_VALUE;
            return i.this.a(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", l = {125, 137}, m = "transitionBack")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        Object v;
        int y;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.y |= Integer.MIN_VALUE;
            return i.this.f(null, null, this);
        }
    }

    public i(@NotNull FallbackMode fallbackMode, @NotNull I8.a aVar, @NotNull EnumC0342d enumC0342d, @NotNull w wVar) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(aVar, "apiController");
        Intrinsics.checkNotNullParameter(enumC0342d, "environment");
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = aVar;
        this.environment = enumC0342d;
        this.moshi = wVar;
    }

    @Override
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.Object r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super bb.t<?>> r26) {
        throw new UnsupportedOperationException("Method not decompiled: I8.i.a(java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public boolean b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    public final java.lang.Object c(@org.jetbrains.annotations.NotNull J8.InquiryAttributes r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.network.InternalErrorInfo.NetworkErrorInfo> r9) {
        throw new UnsupportedOperationException("Method not decompiled: I8.i.c(J8.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.withpersona.sdk2.inquiry.internal.fallbackmode.i getCurrentSession() {
        return this.currentSession;
    }

    @NotNull
    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    public java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull java.lang.Object r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super bb.t<?>> r26) {
        throw new UnsupportedOperationException("Method not decompiled: I8.i.f(java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
