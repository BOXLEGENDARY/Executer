package ka;

import D4.AbstractC0374e;
import D4.C0372c;
import D4.C0373d;
import D4.InterfaceC0371b;
import D4.InterfaceC0375f;
import P9.p;
import Q6.QtA.QXojhh;
import W0.JWp.kNUgEaOjcPdX;
import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import aa.n;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import g7.c;
import ha.M;
import ha.N;
import ha.T;
import java.util.List;
import ka.g;
import ka.i;
import ka.oik.UJEa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Li6/e;", "LD4/f;", "<init>", "()V", BuildConfig.FLAVOR, "moduleName", BuildConfig.FLAVOR, "q", "(Ljava/lang/String;)V", "i", "h", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;)Z", "status", BuildConfig.FLAVOR, "moduleNames", "o", "(Ljava/lang/String;Ljava/util/List;)V", "isInstalled", "p", "(Z)V", "LD4/e;", "state", "n", "(LD4/e;)V", "LD4/b;", "b", "LD4/b;", "splitInstallManager", "c", "Ljava/util/List;", "standardFields", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements InterfaceC0375f {

    public static final e f21084a;

    private static InterfaceC0371b splitInstallManager;

    private static final List<String> standardFields;

    @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1", f = "RobloxFeatureDelivery.kt", l = {136}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)I"}, k = 3, mv = {2, 0, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Integer>, Object> {

        int f21087d;

        private Object f21088e;

        final String f21089i;

        final C0373d f21090v;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", BuildConfig.FLAVOR, "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements g<AbstractC0374e> {

            final g f21091d;

            final T f21092e;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", BuildConfig.FLAVOR, "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
            public static final class C0197a<T> implements ka.h {

                final ka.h f21093d;

                final T f21094e;

                @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$invokeSuspend$$inlined$filter$1$2", f = "RobloxFeatureDelivery.kt", l = {224, 223}, m = "emit")
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class C0198a extends d {

                    Object f21095d;

                    int f21096e;

                    Object f21097i;

                    Object f21098v;

                    Object f21100y;

                    public C0198a(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f21095d = obj;
                        this.f21096e |= Integer.MIN_VALUE;
                        return C0197a.this.c(null, this);
                    }
                }

                public C0197a(ka.h hVar, T t7) {
                    this.f21093d = hVar;
                    this.f21094e = t7;
                }

                public final java.lang.Object c(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    throw new UnsupportedOperationException("Method not decompiled: ka.e.L.a.C0197a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(g gVar, T t7) {
                this.f21091d = gVar;
                this.f21092e = t7;
            }

            public Object a(ka.h hVar, Continuation continuation) {
                Object objA = this.f21091d.a(new C0197a(hVar, this.f21092e), continuation);
                return objA == S9.b.c() ? objA : Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", BuildConfig.FLAVOR, "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements g<AbstractC0374e> {

            final g f21101d;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", BuildConfig.FLAVOR, "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
            public static final class a<T> implements ka.h {

                final ka.h f21102d;

                @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$invokeSuspend$$inlined$filter$2$2", f = "RobloxFeatureDelivery.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class C0199a extends d {

                    Object f21103d;

                    int f21104e;

                    public C0199a(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f21103d = obj;
                        this.f21104e |= Integer.MIN_VALUE;
                        return a.this.c(null, this);
                    }
                }

                public a(ka.h hVar) {
                    this.f21102d = hVar;
                }

                public final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    throw new UnsupportedOperationException("Method not decompiled: ka.e.L.b.a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(g gVar) {
                this.f21101d = gVar;
            }

            public Object a(ka.h hVar, Continuation continuation) {
                Object objA = this.f21101d.a(new a(hVar), continuation);
                return objA == S9.b.c() ? objA : Unit.a;
            }
        }

        @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$sessionIdDeferred$1", f = "RobloxFeatureDelivery.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "<anonymous>", "(Lha/L;)I"}, k = 3, mv = {2, 0, 0})
        static final class C0200c extends k implements Function2<ha.L, Continuation<? super Integer>, Object> {

            int f21106d;

            private Object f21107e;

            final C0373d f21108i;

            final String f21109v;

            C0200c(C0373d c0373d, String str, Continuation<? super C0200c> continuation) {
                super(2, continuation);
                this.f21108i = c0373d;
                this.f21109v = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0200c c0200c = new C0200c(this.f21108i, this.f21109v, continuation);
                c0200c.f21107e = obj;
                return c0200c;
            }

            public final Object invoke(ha.L l7, Continuation<? super Integer> continuation) {
                return create(l7, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                S9.b.c();
                if (this.f21106d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                ha.L l7 = (ha.L) this.f21107e;
                InterfaceC0371b interfaceC0371b = e.splitInstallManager;
                if (interfaceC0371b == null) {
                    Intrinsics.v("splitInstallManager");
                    interfaceC0371b = null;
                }
                Task<Integer> taskE = interfaceC0371b.e(this.f21108i);
                Log.i("rbx.featuredelivery", "install of " + this.f21109v + " has started");
                try {
                    return taskE.k();
                } catch (Throwable th) {
                    M.b(l7, "Unable to initiate install", th);
                    return kotlin.coroutines.jvm.internal.b.b(-1);
                }
            }
        }

        @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$terminalState$1", f = "RobloxFeatureDelivery.kt", l = {106, 109}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/s;", "LD4/e;", BuildConfig.FLAVOR, "<anonymous>", "(Lja/s;)V"}, k = 3, mv = {2, 0, 0})
        static final class s extends k implements Function2<ja.s<? super AbstractC0374e>, Continuation<? super Unit>, Object> {

            Object f21110d;

            int f21111e;

            private Object f21112i;

            final T<Integer> f21113v;

            s(T<Integer> t7, Continuation<? super s> continuation) {
                super(2, continuation);
                this.f21113v = t7;
            }

            public static final void o(ja.s sVar, AbstractC0374e abstractC0374e) {
                ja.k.b(sVar, abstractC0374e);
            }

            public static final Unit r(InterfaceC0375f interfaceC0375f) {
                InterfaceC0371b interfaceC0371b = e.splitInstallManager;
                if (interfaceC0371b == null) {
                    Intrinsics.v(kNUgEaOjcPdX.mxhuaAwSE);
                    interfaceC0371b = null;
                }
                interfaceC0371b.g(interfaceC0375f);
                Log.i("rbx.featuredelivery", "install listener removed");
                return Unit.a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                s sVar = new s(this.f21113v, continuation);
                sVar.f21112i = obj;
                return sVar;
            }

            public final Object invoke(ja.s<? super AbstractC0374e> sVar, Continuation<? super Unit> continuation) {
                return create(sVar, continuation).invokeSuspend(Unit.a);
            }

            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                throw new UnsupportedOperationException("Method not decompiled: ka.e.L.s.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$terminalState$3", f = "RobloxFeatureDelivery.kt", l = {R.styleable.AppCompatTheme_windowNoTitle}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LD4/e;", "it", BuildConfig.FLAVOR, "<anonymous>", "(LD4/e;)V"}, k = 3, mv = {2, 0, 0})
        static final class C0201e extends k implements Function2<AbstractC0374e, Continuation<? super Unit>, Object> {

            int f21114d;

            Object f21115e;

            final T<Integer> f21116i;

            final String f21117v;

            C0201e(T<Integer> t7, String str, Continuation<? super C0201e> continuation) {
                super(2, continuation);
                this.f21116i = t7;
                this.f21117v = str;
            }

            public final Object invoke(AbstractC0374e abstractC0374e, Continuation<? super Unit> continuation) {
                return create(abstractC0374e, continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0201e c0201e = new C0201e(this.f21116i, this.f21117v, continuation);
                c0201e.f21115e = obj;
                return c0201e;
            }

            public final Object invokeSuspend(Object obj) {
                InterfaceC0371b interfaceC0371b;
                Object objC = S9.b.c();
                int i7 = this.f21114d;
                if (i7 == 0) {
                    p.b(obj);
                    if (((AbstractC0374e) this.f21115e).i() == 8) {
                        InterfaceC0371b interfaceC0371b2 = e.splitInstallManager;
                        if (interfaceC0371b2 == null) {
                            Intrinsics.v("splitInstallManager");
                            interfaceC0371b2 = null;
                        }
                        T<Integer> t7 = this.f21116i;
                        this.f21115e = interfaceC0371b2;
                        this.f21114d = 1;
                        Object objH0 = t7.h0(this);
                        if (objH0 == objC) {
                            return objC;
                        }
                        interfaceC0371b = interfaceC0371b2;
                        obj = objH0;
                    }
                    return Unit.a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0371b = (InterfaceC0371b) this.f21115e;
                p.b(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                interfaceC0371b.d(((Number) obj).intValue());
                Log.i("rbx.featuredelivery", this.f21117v + " requires user approval, cancelling install");
                return Unit.a;
            }
        }

        @f(c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery$downloadModule$1$terminalState$5", f = "RobloxFeatureDelivery.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lka/h;", "LD4/e;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "<anonymous>", "(Lka/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        static final class h extends k implements n<ka.h<? super AbstractC0374e>, Throwable, Continuation<? super Unit>, Object> {

            int f21118d;

            Object f21119e;

            final String f21120i;

            h(String str, Continuation<? super h> continuation) {
                super(3, continuation);
                this.f21120i = str;
            }

            public final Object invokeSuspend(Object obj) {
                S9.b.c();
                if (this.f21118d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                Log.i("rbx.featuredelivery", "Unable to install module " + this.f21120i, (Throwable) this.f21119e);
                return Unit.a;
            }

            public final Object invoke(ka.h<? super AbstractC0374e> hVar, Throwable th, Continuation<? super Unit> continuation) {
                h hVar2 = new h(this.f21120i, continuation);
                hVar2.f21119e = th;
                return hVar2.invokeSuspend(Unit.a);
            }
        }

        L(String str, C0373d c0373d, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f21089i = str;
            this.f21090v = c0373d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            L l7 = new L(this.f21089i, this.f21090v, continuation);
            l7.f21088e = obj;
            return l7;
        }

        public final Object invoke(ha.L l7, Continuation<? super Integer> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            int iE;
            Object objC = S9.b.c();
            int i7 = this.f21087d;
            if (i7 == 0) {
                p.b(obj);
                T tB = ha.g.b((ha.L) this.f21088e, (CoroutineContext) null, N.e, new C0200c(this.f21090v, this.f21089i, null), 1, (Object) null);
                g gVarF = i.f(new b(i.C(new a(i.b(i.d(new s(tB, null)), 10, ja.a.e), tB), new C0201e(tB, this.f21089i, null))), new h(this.f21089i, null));
                this.f21087d = 1;
                obj = i.u(gVarF, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            AbstractC0374e abstractC0374e = (AbstractC0374e) obj;
            if (abstractC0374e == null || abstractC0374e.c() != 0) {
                iE = Log.e("rbx.featuredelivery", "failed to install module: " + this.f21089i + " - status: " + abstractC0374e);
            } else {
                iE = Log.i("rbx.featuredelivery", "Module install completes: " + this.f21089i + "!");
            }
            return kotlin.coroutines.jvm.internal.b.b(iE);
        }
    }

    static {
        e eVar = new e();
        f21084a = eVar;
        standardFields = CollectionsKt.d("addOSInfo");
        InterfaceC0371b interfaceC0371bA = C0372c.a(RobloxApplication.a());
        Intrinsics.checkNotNullExpressionValue(interfaceC0371bA, "create(...)");
        interfaceC0371bA.b(eVar);
        splitInstallManager = interfaceC0371bA;
    }

    private e() {
    }

    public static final boolean g(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        InterfaceC0371b interfaceC0371b = splitInstallManager;
        if (interfaceC0371b == null) {
            Intrinsics.v("splitInstallManager");
            interfaceC0371b = null;
        }
        return interfaceC0371b.c().contains(moduleName);
    }

    public static final void h(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        InterfaceC0371b interfaceC0371b = splitInstallManager;
        if (interfaceC0371b == null) {
            Intrinsics.v("splitInstallManager");
            interfaceC0371b = null;
        }
        interfaceC0371b.f(CollectionsKt.d(moduleName));
    }

    public static final void i(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (g(moduleName)) {
            Log.i("rbx.featuredelivery", "Module already installed: " + moduleName);
            if (Intrinsics.b(moduleName, "gmasdk")) {
                f21084a.p(true);
                return;
            }
            return;
        }
        if (Intrinsics.b(moduleName, "gmasdk")) {
            f21084a.p(false);
        }
        C0373d c0373dB = C0373d.c().a(moduleName).b();
        Intrinsics.checkNotNullExpressionValue(c0373dB, "build(...)");
        InterfaceC0371b interfaceC0371b = null;
        if (j6.d.a().y0()) {
            ha.g.f((CoroutineContext) null, new L(moduleName, c0373dB, null), 1, (Object) null);
            return;
        }
        InterfaceC0371b interfaceC0371b2 = splitInstallManager;
        if (interfaceC0371b2 == null) {
            Intrinsics.v(QXojhh.dDd);
        } else {
            interfaceC0371b = interfaceC0371b2;
        }
        Task<Integer> taskE = interfaceC0371b.e(c0373dB);
        final Function1 function1 = new Function1() {
            public final Object invoke(Object obj) {
                return e.j((Integer) obj);
            }
        };
        Intrinsics.d(taskE.e(new InterfaceC1570g() {
            @Override
            public final void onSuccess(Object obj) {
                e.k(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                e.l(task);
            }
        }).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                e.m(exc);
            }
        }));
    }

    public static final Unit j(Integer num) {
        Log.i("rbx.featuredelivery", "Module download started: " + num);
        return Unit.a;
    }

    public static final void k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void l(Task task) {
        Intrinsics.checkNotNullParameter(task, "it");
        Log.i("rbx.featuredelivery", "Module download completed");
    }

    public static final void m(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        Log.e("rbx.featuredelivery", "Module download failed", exc);
    }

    private final void o(String status, List<String> moduleNames) {
        if (j6.d.a().h3()) {
            LoggingProtocol.h().e(RobloxTelemetryEvent.builder().setEventType("RobloxTelemetry").setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(CollectionsKt.d("Points")).setThrottlingHundredthPercentage(j6.d.a().m0()).setEventName("roblox_feature_delivery").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(standardFields).setCustomStringFields(j6.d.a().Q2() ? CollectionsKt.m(new Pair[]{new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.U(moduleNames, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), new Pair("user_id", String.valueOf(c.c().j()))}) : CollectionsKt.m(new Pair[]{new Pair("fingerprint", Build.FINGERPRINT), new Pair("lib_status", status), new Pair("module_names", CollectionsKt.U(moduleNames, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null))})).build()).build());
        }
    }

    private final void p(boolean isInstalled) {
        if (j6.d.a().H1()) {
            LoggingProtocol.h().e(RobloxTelemetryEvent.builder().setEventType("RobloxTelemetry").setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(CollectionsKt.m(new String[]{"Points", "EventIngest"})).setThrottlingHundredthPercentage(j6.d.a().I()).setEventName("RewardedAdEventTracking").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(standardFields).setCustomStringFields(CollectionsKt.d(new Pair("rewarded_ad_state", isInstalled ? "REWARDED_AD_STATE_SDK_DOWNLOADED" : "REWARDED_AD_STATE_SDK_NOT_DOWNLOADED"))).build()).build());
        }
    }

    public static final void q(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (!g(moduleName)) {
            Log.i("rbx.featuredelivery", "Module not installed: " + moduleName);
            return;
        }
        InterfaceC0371b interfaceC0371b = splitInstallManager;
        if (interfaceC0371b == null) {
            Intrinsics.v("splitInstallManager");
            interfaceC0371b = null;
        }
        interfaceC0371b.a(CollectionsKt.d(moduleName));
    }

    @Override
    public void a(AbstractC0374e state) {
        String str;
        Intrinsics.checkNotNullParameter(state, "state");
        switch (state.i()) {
            case 0:
                Log.i("rbx.featuredelivery", "Status: UNKNOWN for module " + state.f());
                List<String> listF = state.f();
                Intrinsics.checkNotNullExpressionValue(listF, "moduleNames(...)");
                o("Unknown", listF);
                break;
            case 1:
                Log.i("rbx.featuredelivery", "Status: PENDING for module " + state.f());
                List<String> listF2 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF2, "moduleNames(...)");
                o("Pending", listF2);
                break;
            case 2:
                long j7 = state.j();
                String str2 = UJEa.RNEw;
                if (j7 == 0) {
                    str = str2 + state.f();
                } else {
                    str = str2 + state.f() + ", " + ((state.a() * 100) / state.j()) + "%";
                }
                Log.i("rbx.featuredelivery", str);
                List<String> listF3 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF3, "moduleNames(...)");
                o("Downloading", listF3);
                break;
            case 3:
                Log.i("rbx.featuredelivery", "Status: DOWNLOADED for module " + state.f());
                List<String> listF4 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF4, "moduleNames(...)");
                o("Downloaded", listF4);
                break;
            case 4:
                Log.i("rbx.featuredelivery", "Installing " + state.f());
                List<String> listF5 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF5, "moduleNames(...)");
                o("Installing", listF5);
                break;
            case 5:
                Log.i("rbx.featuredelivery", "Installed " + state.f());
                List<String> listF6 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF6, "moduleNames(...)");
                o("Installed", listF6);
                JNIAAssetManagerSetup.a(RobloxApplication.a());
                break;
            case 6:
                Log.i("rbx.featuredelivery", "Status: Failed for module " + state.f());
                List<String> listF7 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF7, "moduleNames(...)");
                o("Failed", listF7);
                break;
            case 7:
                Log.i("rbx.featuredelivery", UJEa.MHfKSZnJdHo + state.f());
                List<String> listF8 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF8, "moduleNames(...)");
                o("Canceled", listF8);
                break;
            case 8:
                Log.i("rbx.featuredelivery", "REQUIRES_USER_CONFIRMATION is unsupported " + state.f());
                List<String> listF9 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF9, "moduleNames(...)");
                o("Requires User Confirmation", listF9);
                break;
            case 9:
                Log.i("rbx.featuredelivery", "Status: CANCELING for module " + state.f());
                List<String> listF10 = state.f();
                Intrinsics.checkNotNullExpressionValue(listF10, "moduleNames(...)");
                o("Canceling", listF10);
                break;
        }
    }
}
