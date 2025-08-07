package b6;

import P9.p;
import Za.qhkq.dHkZSUxHu;
import c6.AnalyticEvent;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lb6/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "batchSize", BuildConfig.FLAVOR, "Lc6/a;", "d", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", BuildConfig.FLAVOR, "events", BuildConfig.FLAVOR, "e", "([Lc6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "g", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "event", "f", "(Lc6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterfaceC1742a {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C0132a {

        @f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", f = "AnalyticEventDao.kt", l = {42}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0133a extends k implements Function1<Continuation<? super Unit>, Object> {

            int f12597d;

            final InterfaceC1742a f12598e;

            final AnalyticEvent f12599i;

            C0133a(InterfaceC1742a interfaceC1742a, AnalyticEvent analyticEvent, Continuation<? super C0133a> continuation) {
                super(1, continuation);
                this.f12598e = interfaceC1742a;
                this.f12599i = analyticEvent;
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C0133a(this.f12598e, this.f12599i, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                Object objC = S9.b.c();
                int i7 = this.f12597d;
                if (i7 == 0) {
                    p.b(obj);
                    InterfaceC1742a interfaceC1742a = this.f12598e;
                    AnalyticEvent analyticEvent = this.f12599i;
                    this.f12597d = 1;
                    if (interfaceC1742a.f(analyticEvent, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.a;
            }
        }

        @f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", f = "AnalyticEventDao.kt", l = {24}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "Lc6/a;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
        static final class b extends k implements Function1<Continuation<? super List<? extends AnalyticEvent>>, Object> {

            int f12600d;

            final InterfaceC1742a f12601e;

            final int f12602i;

            b(InterfaceC1742a interfaceC1742a, int i7, Continuation<? super b> continuation) {
                super(1, continuation);
                this.f12601e = interfaceC1742a;
                this.f12602i = i7;
            }

            public final Object invoke(Continuation<? super List<AnalyticEvent>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new b(this.f12601e, this.f12602i, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                Object objC = S9.b.c();
                int i7 = this.f12600d;
                if (i7 == 0) {
                    p.b(obj);
                    InterfaceC1742a interfaceC1742a = this.f12601e;
                    int i8 = this.f12602i;
                    this.f12600d = 1;
                    obj = interfaceC1742a.d(i8, this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return obj;
            }
        }

        @f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", f = "AnalyticEventDao.kt", l = {30}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class c extends k implements Function1<Continuation<? super Unit>, Object> {

            int f12603d;

            final InterfaceC1742a f12604e;

            final AnalyticEvent[] f12605i;

            c(InterfaceC1742a interfaceC1742a, AnalyticEvent[] analyticEventArr, Continuation<? super c> continuation) {
                super(1, continuation);
                this.f12604e = interfaceC1742a;
                this.f12605i = analyticEventArr;
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new c(this.f12604e, this.f12605i, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                Object objC = S9.b.c();
                int i7 = this.f12603d;
                if (i7 == 0) {
                    p.b(obj);
                    InterfaceC1742a interfaceC1742a = this.f12604e;
                    AnalyticEvent[] analyticEventArr = this.f12605i;
                    AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                    this.f12603d = 1;
                    if (interfaceC1742a.e(analyticEventArr2, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.a;
            }
        }

        @f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", f = "AnalyticEventDao.kt", l = {36}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class d extends k implements Function1<Continuation<? super Unit>, Object> {

            int f12606d;

            final InterfaceC1742a f12607e;

            final List<AnalyticEvent> f12608i;

            d(InterfaceC1742a interfaceC1742a, List<AnalyticEvent> list, Continuation<? super d> continuation) {
                super(1, continuation);
                this.f12607e = interfaceC1742a;
                this.f12608i = list;
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new d(this.f12607e, this.f12608i, continuation);
            }

            public final Object invokeSuspend(Object obj) {
                Object objC = S9.b.c();
                int i7 = this.f12606d;
                if (i7 == 0) {
                    p.b(obj);
                    InterfaceC1742a interfaceC1742a = this.f12607e;
                    List<AnalyticEvent> list = this.f12608i;
                    this.f12606d = 1;
                    if (interfaceC1742a.a(list, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.a;
            }
        }

        public static Object a(InterfaceC1742a interfaceC1742a, AnalyticEvent analyticEvent, Continuation<? super Unit> continuation) {
            Object objC = b6.c.c("AnalyticEventDao", new C0133a(interfaceC1742a, analyticEvent, null), continuation);
            return objC == S9.b.c() ? objC : Unit.a;
        }

        public static Object b(InterfaceC1742a interfaceC1742a, int i7, Continuation<? super List<AnalyticEvent>> continuation) {
            return b6.c.a(dHkZSUxHu.jikuozgAoFoVty, new b(interfaceC1742a, i7, null), continuation);
        }

        public static Object c(InterfaceC1742a interfaceC1742a, AnalyticEvent[] analyticEventArr, Continuation<? super Boolean> continuation) {
            return b6.c.b("AnalyticEventDao", new c(interfaceC1742a, analyticEventArr, null), continuation);
        }

        public static Object d(InterfaceC1742a interfaceC1742a, List<AnalyticEvent> list, Continuation<? super Unit> continuation) {
            Object objC = b6.c.c("AnalyticEventDao", new d(interfaceC1742a, list, null), continuation);
            return objC == S9.b.c() ? objC : Unit.a;
        }
    }

    Object a(List<AnalyticEvent> list, Continuation<? super Unit> continuation);

    Object b(Continuation<? super Integer> continuation);

    Object c(AnalyticEvent analyticEvent, Continuation<? super Unit> continuation);

    Object d(int i7, Continuation<? super List<AnalyticEvent>> continuation);

    Object e(AnalyticEvent[] analyticEventArr, Continuation<? super Unit> continuation);

    Object f(AnalyticEvent analyticEvent, Continuation<? super Unit> continuation);

    Object g(AnalyticEvent[] analyticEventArr, Continuation<? super Boolean> continuation);

    Object h(int i7, Continuation<? super List<AnalyticEvent>> continuation);

    Object i(List<AnalyticEvent> list, Continuation<? super Unit> continuation);
}
