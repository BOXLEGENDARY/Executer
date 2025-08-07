package com.withpersona.sdk2.inquiry.permissions;

import P9.p;
import Q8.l;
import android.content.Context;
import com.roblox.client.personasdk.R;
import f.a;
import ha.C0370B;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\u0013B)\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "Le/c;", "", "requestPermissionsLauncher", "Landroid/content/Context;", "context", "LQ8/l;", "permission", "<init>", "(Le/c;Landroid/content/Context;LQ8/l;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "c", "Landroid/content/Context;", "d", "LQ8/l;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements o<b> {

    @NotNull
    private final e.c<String> requestPermissionsLauncher;

    @NotNull
    private final Context context;

    @NotNull
    private final l permission;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c$a;", "", "Landroid/content/Context;", "context", "Le/c;", "", "requestPermissionsLauncher", "<init>", "(Landroid/content/Context;Le/c;)V", "LQ8/l;", "permission", "Lcom/withpersona/sdk2/inquiry/permissions/c;", "a", "(LQ8/l;)Lcom/withpersona/sdk2/inquiry/permissions/c;", "Landroid/content/Context;", "b", "Le/c;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final Context context;

        @NotNull
        private final e.c<String> requestPermissionsLauncher;

        public a(@NotNull Context context, @NotNull e.c<String> cVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cVar, "requestPermissionsLauncher");
            this.context = context;
            this.requestPermissionsLauncher = cVar;
        }

        @NotNull
        public final c a(@NotNull l permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new c(this.requestPermissionsLauncher, this.context, permission);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/permissions/c$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/c$b$b;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends b {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1697964102;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0153b extends b {

            @NotNull
            public static final C0153b a = new C0153b();

            private C0153b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0153b);
            }

            public int hashCode() {
                return 1972662456;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker$run$1", f = "PermissionRequestWorker.kt", l = {32, 36}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0154c extends k implements Function2<h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements h {
            final h<b> d;

            a(h<? super b> hVar) {
                this.d = hVar;
            }

            public final Object a(boolean z, @NotNull Continuation<? super Unit> continuation) {
                if (z) {
                    Object objC = this.d.c(b.C0153b.a, continuation);
                    return objC == S9.b.c() ? objC : Unit.a;
                }
                Object objC2 = this.d.c(b.a.a, continuation);
                return objC2 == S9.b.c() ? objC2 : Unit.a;
            }

            public Object c(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        C0154c(Continuation<? super C0154c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C0154c c0154c = c.this.new C0154c(continuation);
            c0154c.e = obj;
            return c0154c;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws P9.d {
            Object objC = S9.b.c();
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    p.b(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                throw new P9.d();
            }
            p.b(obj);
            h hVar = (h) this.e;
            a.a synchronousResult = c.this.requestPermissionsLauncher.a().getSynchronousResult(c.this.context, Q8.p.b(c.this.permission));
            if (Intrinsics.b(synchronousResult != null ? synchronousResult.a() : null, kotlin.coroutines.jvm.internal.b.a(true))) {
                b.C0153b c0153b = b.C0153b.a;
                this.d = 1;
                if (hVar.c(c0153b, this) == objC) {
                    return objC;
                }
                return Unit.a;
            }
            c.this.requestPermissionsLauncher.b(Q8.p.b(c.this.permission));
            C0370B c0370b = new C0370B();
            a aVar = new a(hVar);
            this.d = 2;
            if (c0370b.a(aVar, this) == objC) {
                return objC;
            }
            throw new P9.d();
        }
    }

    public c(@NotNull e.c<String> cVar, @NotNull Context context, @NotNull l lVar) {
        Intrinsics.checkNotNullParameter(cVar, "requestPermissionsLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lVar, "permission");
        this.requestPermissionsLauncher = cVar;
        this.context = context;
        this.permission = lVar;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && ((c) otherWorker).permission == this.permission;
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new C0154c(null));
    }
}
