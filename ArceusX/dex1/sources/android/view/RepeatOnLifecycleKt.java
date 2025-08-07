package android.view;

import S9.b;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import ha.L;
import ha.M;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/h;", "Landroidx/lifecycle/h$b;", "state", "Lkotlin/Function2;", "Lha/L;", "Lkotlin/coroutines/Continuation;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "block", "a", "(Landroidx/lifecycle/h;Landroidx/lifecycle/h$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RepeatOnLifecycleKt {
    public static final Object a(AbstractC1694h abstractC1694h, AbstractC1694h.b bVar, Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objF;
        if (bVar != AbstractC1694h.b.INITIALIZED) {
            return (abstractC1694h.b() != AbstractC1694h.b.DESTROYED && (objF = M.f(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC1694h, bVar, function2, null), continuation)) == b.c()) ? objF : Unit.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
