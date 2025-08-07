package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import ha.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.H;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u0012\u0014B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "Landroid/content/Context;", "context", "Ll8/H;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "pose", "<init>", "(Landroid/content/Context;Ll8/H;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Landroid/content/Context;", "c", "Ll8/H;", "d", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "", "e", "I", "numRetries", "f", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements ka.o<AbstractC0156c> {

    @NotNull
    private final Context context;

    @NotNull
    private final H selfieDirectionFeed;

    @NotNull
    private final Selfie.b pose;

    private int numRetries;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$b;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "pose", "Lcom/withpersona/sdk2/inquiry/selfie/c;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;)Lcom/withpersona/sdk2/inquiry/selfie/c;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b {
        @NotNull
        c a(@NotNull Selfie.b pose);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/selfie/c$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c$d;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0156c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0156c {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1166690292;
            }

            @NotNull
            public String toString() {
                return "Aborted";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0156c {

            @NotNull
            private final Selfie selfie;

            public b(@NotNull Selfie selfie) {
                super(null);
                Intrinsics.checkNotNullParameter(selfie, "selfie");
                this.selfie = selfie;
            }

            @NotNull
            public final Selfie getSelfie() {
                return this.selfie;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0157c extends AbstractC0156c {

            @NotNull
            private final Throwable error;

            public C0157c(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "error");
                this.error = th;
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/c$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/c$c;", "LV8/l;", "error", "<init>", "(LV8/l;)V", "a", "LV8/l;", "()LV8/l;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0156c {

            @NotNull
            private final V8.l error;

            public d(@NotNull V8.l lVar) {
                super(null);
                Intrinsics.checkNotNullParameter(lVar, "error");
                this.error = lVar;
            }

            @NotNull
            public final V8.l getError() {
                return this.error;
            }
        }

        public AbstractC0156c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0156c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d implements ka.g<AbstractC0156c> {
        final ka.g d;
        final c e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a<T> implements ka.h {
            final ka.h d;
            final c e;

            @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "SelfieAnalyzeWorker.kt", l = {68, 73}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class C0158a extends kotlin.coroutines.jvm.internal.d {
                Object d;
                int e;
                Object i;

                public C0158a(Continuation continuation) {
                    super(continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(ka.h hVar, c cVar) {
                this.d = hVar;
                this.e = cVar;
            }

            public final java.lang.Object c(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws P9.m {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.c.d.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(ka.g gVar, c cVar) {
            this.d = gVar;
            this.e = cVar;
        }

        public Object a(ka.h hVar, Continuation continuation) {
            Object objA = this.d.a(new a(hVar, this.e), continuation);
            return objA == S9.b.c() ? objA : Unit.a;
        }
    }

    public c(@NotNull Context context, @NotNull H h, @NotNull Selfie.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(h, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(bVar, "pose");
        this.context = context;
        this.selfieDirectionFeed = h;
        this.pose = bVar;
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && ((c) otherWorker).pose == this.pose;
    }

    @Override
    @NotNull
    public ka.g<AbstractC0156c> run() {
        return ka.i.x(new d(ka.i.m(this.selfieDirectionFeed, 1), this), c0.a());
    }
}
