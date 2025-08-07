package com.withpersona.sdk2.inquiry.permissions;

import P9.o;
import P9.p;
import U3.e;
import a4.g;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.R;
import ha.C0375G;
import ha.m;
import ha.n;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\rB!\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "Le/c;", "Landroidx/activity/result/IntentSenderRequest;", "resolvableApiLauncher", "Landroid/content/Context;", "context", "<init>", "(Le/c;Landroid/content/Context;)V", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "c", "Landroid/content/Context;", "a", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a implements o<b> {

    @NotNull
    private final e.c<IntentSenderRequest> resolvableApiLauncher;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/a;", "a", "()Lcom/withpersona/sdk2/inquiry/permissions/a;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface InterfaceC0148a {
        @NotNull
        a a();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0149a extends b {

            @NotNull
            public static final C0149a a = new C0149a();

            private C0149a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0149a);
            }

            public int hashCode() {
                return -588562023;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0150b extends b {

            @NotNull
            public static final C0150b a = new C0150b();

            private C0150b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0150b);
            }

            public int hashCode() {
                return 726963865;
            }

            @NotNull
            public String toString() {
                return "NotSupported";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c extends b {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -190170683;
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

    @f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1", f = "DeviceFeatureRequestWorker.kt", l = {102, 61, 67, 76, 84}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<h<? super b>, Continuation<? super Unit>, Object> {
        Object d;
        Object e;
        int i;
        private Object v;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/result/ActivityResult;", "result", "", "a", "(Landroidx/activity/result/ActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0151a<T> implements h {
            final h<b> d;

            C0151a(h<? super b> hVar) {
                this.d = hVar;
            }

            public final Object c(ActivityResult activityResult, @NotNull Continuation<? super Unit> continuation) {
                if (activityResult == null || activityResult.b() != -1) {
                    Object objC = this.d.c(b.C0149a.a, continuation);
                    return objC == S9.b.c() ? objC : Unit.a;
                }
                Object objC2 = this.d.c(b.c.a, continuation);
                return objC2 == S9.b.c() ? objC2 : Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU3/f;", "kotlin.jvm.PlatformType", "locationSettingsResponse", "", "a", "(LU3/f;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<U3.f, Unit> {
            final m<P9.o<? extends U3.f>> d;

            b(m<? super P9.o<? extends U3.f>> mVar) {
                super(1);
                this.d = mVar;
            }

            public final void a(U3.f fVar) {
                this.d.resumeWith(P9.o.b(P9.o.a(P9.o.b(fVar))));
            }

            public Object invoke(Object obj) {
                a((U3.f) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "exception", "Ljava/lang/Exception;", "onFailure"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        static final class C0152c implements a4.f {
            final m<P9.o<? extends U3.f>> a;

            C0152c(m<? super P9.o<? extends U3.f>> mVar) {
                this.a = mVar;
            }

            public final void onFailure(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "exception");
                m<P9.o<? extends U3.f>> mVar = this.a;
                o.a aVar = P9.o.e;
                mVar.resumeWith(P9.o.b(P9.o.a(P9.o.b(p.a(exc)))));
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.v = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws P9.d {
            h hVar;
            Object objC = S9.b.c();
            ?? r1 = this.i;
            try {
            } catch (IntentSender.SendIntentException unused) {
                b.C0150b c0150b = b.C0150b.a;
                this.v = null;
                this.d = null;
                this.e = null;
                this.i = 5;
                if (r1.c(c0150b, this) == objC) {
                    return objC;
                }
            }
            if (r1 == 0) {
                p.b(obj);
                h hVar2 = (h) this.v;
                LocationRequest locationRequestBuild = new LocationRequest.Builder(10000L).setPriority(100).setMinUpdateIntervalMillis(5000L).build();
                Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
                LocationSettingsRequest locationSettingsRequestB = new LocationSettingsRequest.a().a(locationRequestBuild).c(true).b();
                Intrinsics.checkNotNullExpressionValue(locationSettingsRequestB, "build(...)");
                U3.h hVarA = e.a(a.this.context);
                Intrinsics.checkNotNullExpressionValue(hVarA, "getSettingsClient(...)");
                this.v = hVar2;
                this.d = locationSettingsRequestB;
                this.e = hVarA;
                this.i = 1;
                n nVar = new n(S9.b.b(this), 1);
                nVar.C();
                Task taskCheckLocationSettings = hVarA.checkLocationSettings(locationSettingsRequestB);
                Intrinsics.checkNotNullExpressionValue(taskCheckLocationSettings, "checkLocationSettings(...)");
                taskCheckLocationSettings.e(new d(new b(nVar)));
                taskCheckLocationSettings.c(new C0152c(nVar));
                Object objZ = nVar.z();
                if (objZ == S9.b.c()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objZ == objC) {
                    return objC;
                }
                hVar = hVar2;
                obj = objZ;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        p.b(obj);
                        return Unit.a;
                    }
                    if (r1 == 3) {
                        p.b(obj);
                        return Unit.a;
                    }
                    if (r1 != 4) {
                        if (r1 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        return Unit.a;
                    }
                    h hVar3 = (h) this.v;
                    p.b(obj);
                    r1 = hVar3;
                    throw new P9.d();
                }
                h hVar4 = (h) this.v;
                p.b(obj);
                hVar = hVar4;
            }
            Object objJ = ((P9.o) obj).j();
            if (P9.o.h(objJ)) {
                b.c cVar = b.c.a;
                this.v = null;
                this.d = null;
                this.e = null;
                this.i = 2;
                if (hVar.c(cVar, this) == objC) {
                    return objC;
                }
                return Unit.a;
            }
            l3.m mVarE = P9.o.e(objJ);
            if (!(mVarE instanceof l3.m)) {
                b.C0150b c0150b2 = b.C0150b.a;
                this.v = null;
                this.d = null;
                this.e = null;
                this.i = 3;
                if (hVar.c(c0150b2, this) == objC) {
                    return objC;
                }
                return Unit.a;
            }
            PendingIntent pendingIntentC = mVarE.c();
            Intrinsics.checkNotNullExpressionValue(pendingIntentC, "getResolution(...)");
            a.this.resolvableApiLauncher.b(new IntentSenderRequest.a(pendingIntentC).a());
            C0375G c0375g = new C0375G();
            C0151a c0151a = new C0151a(hVar);
            this.v = hVar;
            this.d = null;
            this.e = null;
            this.i = 4;
            r1 = hVar;
            if (c0375g.a(c0151a, this) == objC) {
                return objC;
            }
            throw new P9.d();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d implements g {
        private final Function1 a;

        d(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.a = function1;
        }

        public final void onSuccess(Object obj) {
            this.a.invoke(obj);
        }
    }

    public a(@NotNull e.c<IntentSenderRequest> cVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(cVar, "resolvableApiLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.resolvableApiLauncher = cVar;
        this.context = context;
    }

    @Override
    public boolean a(@NotNull ka.o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override
    @NotNull
    public ka.g<b> run() {
        return i.v(new c(null));
    }
}
