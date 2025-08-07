package android.view;

import P9.o;
import P9.p;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import ha.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements InterfaceC1698l {

    final AbstractC1694h.b f11382d;

    final AbstractC1694h f11383e;

    final m<Object> f11384i;

    final Function0<Object> f11385v;

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Object objB;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC1694h.a.INSTANCE.c(this.f11382d)) {
            if (event == AbstractC1694h.a.ON_DESTROY) {
                this.f11383e.d(this);
                m<Object> mVar = this.f11384i;
                o.a aVar = o.e;
                mVar.resumeWith(o.b(p.a(new C1696j())));
                return;
            }
            return;
        }
        this.f11383e.d(this);
        m<Object> mVar2 = this.f11384i;
        Function0<Object> function0 = this.f11385v;
        try {
            o.a aVar2 = o.e;
            objB = o.b(function0.invoke());
        } catch (Throwable th) {
            o.a aVar3 = o.e;
            objB = o.b(p.a(th));
        }
        mVar2.resumeWith(objB);
    }
}
