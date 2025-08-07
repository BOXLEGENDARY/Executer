package com.withpersona.sdk2.inquiry.shared.ui;

import P1.d;
import P1.i;
import P1.j;
import P9.p;
import U1.e;
import X9.c;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.H;
import ha.L;
import ha.L0;
import ha.M;
import ha.N;
import ha.c0;
import ha.g;
import ha.v0;
import ha.z0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "srcColor", "destColor", "", "C", "(II)V", "", "url", "Lha/z0;", "D", "(Ljava/lang/String;)Lha/z0;", "onDetachedFromWindow", "()V", "", "O", "Ljava/util/Map;", "srcColorToDestColor", "Lha/L;", "P", "Lha/L;", "scope", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ThemeableLottieAnimationView extends LottieAnimationView {

    @NotNull
    private final Map<Integer, Integer> srcColorToDestColor;

    @NotNull
    private final L scope;

    @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1", f = "ThemeableLottieAnimationView.kt", l = {66, 79}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final String e;
        final ThemeableLottieAnimationView i;

        @f(c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1$1", f = "ThemeableLottieAnimationView.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0181a extends k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final ThemeableLottieAnimationView e;
            final String i;

            C0181a(ThemeableLottieAnimationView themeableLottieAnimationView, String str, Continuation<? super C0181a> continuation) {
                super(2, continuation);
                this.e = themeableLottieAnimationView;
                this.i = str;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0181a(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                this.e.x(this.i, null);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function0<String> {
            final String d;

            b(String str) {
                super(0);
                this.d = str;
            }

            public final String invoke() throws IOException {
                try {
                    InputStream inputStreamOpenStream = new URL(this.d).openStream();
                    try {
                        Intrinsics.d(inputStreamOpenStream);
                        String strW0 = w.d(w.l(inputStreamOpenStream)).W0();
                        c.a(inputStreamOpenStream, (Throwable) null);
                        return strW0;
                    } finally {
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        a(String str, ThemeableLottieAnimationView themeableLottieAnimationView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = str;
            this.i = themeableLottieAnimationView;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                H hB = c0.b();
                b bVar = new b(this.e);
                this.d = 1;
                obj = v0.b(hB, bVar, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                p.b(obj);
            }
            String str = (String) obj;
            if (str != null) {
                L0 l0C = c0.c();
                C0181a c0181a = new C0181a(this.i, str, null);
                this.d = 2;
                if (g.g(l0C, c0181a, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    public ThemeableLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.srcColorToDestColor = new LinkedHashMap();
        this.scope = M.a(c0.a());
        f(new i() {
            @Override
            public final void a(P1.d dVar) {
                ThemeableLottieAnimationView.A(this.a, dVar);
            }
        });
    }

    public static final void A(ThemeableLottieAnimationView themeableLottieAnimationView, d dVar) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "this$0");
        themeableLottieAnimationView.g(new e("**"), j.a, new com.withpersona.sdk2.inquiry.shared.ui.a(themeableLottieAnimationView));
        themeableLottieAnimationView.g(new e("**"), j.b, new b(themeableLottieAnimationView));
    }

    public final void C(int srcColor, int destColor) {
        this.srcColorToDestColor.put(Integer.valueOf(srcColor), Integer.valueOf(destColor));
    }

    @NotNull
    public final z0 D(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return g.d(this.scope, (CoroutineContext) null, (N) null, new a(url, this, null), 3, (Object) null);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        M.e(this.scope, (CancellationException) null, 1, (Object) null);
    }
}
