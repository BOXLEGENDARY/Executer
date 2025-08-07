package android.view;

import P9.p;
import S9.b;
import Z.tNT.PexNRiLSd;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import ha.L;
import ha.L0;
import ha.c0;
import ha.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

@f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, 8, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends k implements Function2<L, Continuation<? super Unit>, Object> {

    int f11344d;

    private Object f11345e;

    final AbstractC1694h f11346i;

    final AbstractC1694h.b f11347v;

    final Function2<L, Continuation<? super Unit>, Object> f11348w;

    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", BuildConfig.FLAVOR, "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends k implements Function2<L, Continuation<? super Unit>, Object> {

        final AbstractC1694h f11349A;

        final AbstractC1694h.b f11350B;

        final L f11351C;

        final Function2<L, Continuation<? super Unit>, Object> f11352D;

        Object f11353d;

        Object f11354e;

        Object f11355i;

        Object f11356v;

        Object f11357w;

        Object f11358y;

        int f11359z;

        AnonymousClass1(AbstractC1694h abstractC1694h, AbstractC1694h.b bVar, L l7, Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f11349A = abstractC1694h;
            this.f11350B = bVar;
            this.f11351C = l7;
            this.f11352D = function2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.f11349A, this.f11350B, this.f11351C, this.f11352D, continuation);
        }

        public final Object invoke(L l7, Continuation<? super Unit> continuation) {
            return create(l7, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: android.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC1694h abstractC1694h, AbstractC1694h.b bVar, Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.f11346i = abstractC1694h;
        this.f11347v = bVar;
        this.f11348w = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f11346i, this.f11347v, this.f11348w, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f11345e = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(L l7, Continuation<? super Unit> continuation) {
        return create(l7, continuation).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objC = b.c();
        int i7 = this.f11344d;
        if (i7 == 0) {
            p.b(obj);
            L l7 = (L) this.f11345e;
            L0 l0B1 = c0.c().B1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11346i, this.f11347v, l7, this.f11348w, null);
            this.f11344d = 1;
            if (g.g(l0B1, anonymousClass1, this) == objC) {
                return objC;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException(PexNRiLSd.wyGfTZGtMzrsfmn);
            }
            p.b(obj);
        }
        return Unit.a;
    }
}
