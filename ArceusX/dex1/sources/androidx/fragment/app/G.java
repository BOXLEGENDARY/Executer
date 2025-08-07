package androidx.fragment.app;

import android.view.AbstractC1678L;
import android.view.C1680N;
import android.view.C1681O;
import android.view.C1683Q;
import android.view.InterfaceC1684S;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/fragment/app/Fragment;", "Lfa/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/Q;", "storeProducer", "LR0/a;", "extrasProducer", "Landroidx/lifecycle/O$b;", "factoryProducer", "LP9/h;", "b", "(Landroidx/fragment/app/Fragment;Lfa/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)LP9/h;", "Landroidx/lifecycle/S;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class G {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/O$b;", "a", "()Landroidx/lifecycle/O$b;"}, k = 3, mv = {1, 6, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<C1681O.b> {

        final Fragment f11107d;

        a(Fragment fragment) {
            super(0);
            this.f11107d = fragment;
        }

        public final C1681O.b invoke() {
            C1681O.b defaultViewModelProviderFactory = this.f11107d.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final <VM extends AbstractC1678L> P9.h<VM> b(Fragment fragment, fa.c<VM> cVar, Function0<? extends C1683Q> function0, Function0<? extends R0.a> function02, Function0<? extends C1681O.b> function03) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(function0, "storeProducer");
        Intrinsics.checkNotNullParameter(function02, "extrasProducer");
        if (function03 == null) {
            function03 = new a(fragment);
        }
        return new C1680N(cVar, function0, function03, function02);
    }

    public static final InterfaceC1684S c(P9.h<? extends InterfaceC1684S> hVar) {
        return (InterfaceC1684S) hVar.getValue();
    }
}
