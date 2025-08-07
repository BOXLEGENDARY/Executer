package android.view;

import P9.h;
import R0.a;
import android.view.AbstractC1678L;
import android.view.C1681O;
import com.github.luben.zstd.BuildConfig;
import fa.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/N;", "Landroidx/lifecycle/L;", "VM", "LP9/h;", "Lfa/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/Q;", "storeProducer", "Landroidx/lifecycle/O$b;", "factoryProducer", "LR0/a;", "extrasProducer", "<init>", "(Lfa/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", BuildConfig.FLAVOR, "a", "()Z", "d", "Lfa/c;", "e", "Lkotlin/jvm/functions/Function0;", "i", "v", "w", "Landroidx/lifecycle/L;", "cached", "b", "()Landroidx/lifecycle/L;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1680N<VM extends AbstractC1678L> implements h<VM> {

    private final c<VM> viewModelClass;

    private final Function0<C1683Q> storeProducer;

    private final Function0<C1681O.b> factoryProducer;

    private final Function0<a> extrasProducer;

    private VM cached;

    public C1680N(c<VM> cVar, Function0<? extends C1683Q> function0, Function0<? extends C1681O.b> function02, Function0<? extends a> function03) {
        Intrinsics.checkNotNullParameter(cVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(function0, "storeProducer");
        Intrinsics.checkNotNullParameter(function02, "factoryProducer");
        Intrinsics.checkNotNullParameter(function03, "extrasProducer");
        this.viewModelClass = cVar;
        this.storeProducer = function0;
        this.factoryProducer = function02;
        this.extrasProducer = function03;
    }

    public boolean a() {
        return this.cached != null;
    }

    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new C1681O((C1683Q) this.storeProducer.invoke(), (C1681O.b) this.factoryProducer.invoke(), (a) this.extrasProducer.invoke()).a(Z9.a.a(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }
}
