package coil.lifecycle;

import androidx.lifecycle.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0081@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/h;", "", "a", "(Landroidx/lifecycle/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/n;", "observer", "b", "(Landroidx/lifecycle/h;Landroidx/lifecycle/n;)V", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    @f(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends d {
        Object d;
        Object e;
        Object i;
        int v;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.v |= Integer.MIN_VALUE;
            return h.a(null, this);
        }
    }

    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.lifecycle.h r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: coil.lifecycle.h.a(androidx.lifecycle.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(@NotNull androidx.lifecycle.h hVar, @NotNull n nVar) {
        hVar.d(nVar);
        hVar.a(nVar);
    }
}
