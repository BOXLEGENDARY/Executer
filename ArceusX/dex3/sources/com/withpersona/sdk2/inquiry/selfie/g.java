package com.withpersona.sdk2.inquiry.selfie;

import com.roblox.client.personasdk.R;
import ha.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.H;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "Ll8/H;", "selfieDirectionFeed", "<init>", "(Ll8/H;)V", "LV8/l;", "Lcom/withpersona/sdk2/inquiry/selfie/g$a$a;", "c", "(LV8/l;)Lcom/withpersona/sdk2/inquiry/selfie/g$a$a;", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ll8/H;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g implements ka.o<a> {

    @NotNull
    private final H selfieDirectionFeed;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/selfie/g$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/g$a$b;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "LV8/l;", "error", "<init>", "(LV8/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LV8/l;", "()LV8/l;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends a {

            @NotNull
            private final V8.l error;

            public Error(@NotNull V8.l lVar) {
                super(null);
                Intrinsics.checkNotNullParameter(lVar, "error");
                this.error = lVar;
            }

            @NotNull
            public final V8.l getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.error == ((Error) other).error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/g$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/g$a;", "<init>", "()V", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends a {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements ka.g<a> {
        final ka.g d;
        final g e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a<T> implements ka.h {
            final ka.h d;
            final g e;

            @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieDetectWorker$run$$inlined$map$1$2", f = "SelfieDetectWorker.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class C0162a extends kotlin.coroutines.jvm.internal.d {
                Object d;
                int e;

                public C0162a(Continuation continuation) {
                    super(continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(ka.h hVar, g gVar) {
                this.d = hVar;
                this.e = gVar;
            }

            public final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.g.b.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(ka.g gVar, g gVar2) {
            this.d = gVar;
            this.e = gVar2;
        }

        public Object a(ka.h hVar, Continuation continuation) {
            Object objA = this.d.a(new a(hVar, this.e), continuation);
            return objA == S9.b.c() ? objA : Unit.a;
        }
    }

    public g(@NotNull H h) {
        Intrinsics.checkNotNullParameter(h, "selfieDirectionFeed");
        this.selfieDirectionFeed = h;
    }

    public final a.Error c(V8.l lVar) {
        return new a.Error(lVar);
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof g;
    }

    @Override
    @NotNull
    public ka.g<a> run() {
        return ka.i.x(ka.i.k(ka.i.l(new b(this.selfieDirectionFeed, this)), 200L), c0.a());
    }
}
