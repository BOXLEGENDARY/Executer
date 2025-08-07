package android.view;

import R0.a;
import android.os.Bundle;
import android.view.AbstractC1694h;
import android.view.C1681O;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lb1/d;", "Landroidx/lifecycle/S;", "T", BuildConfig.FLAVOR, "c", "(Lb1/d;)V", "savedStateRegistryOwner", "viewModelStoreOwner", BuildConfig.FLAVOR, "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/E;", "b", "(Lb1/d;Landroidx/lifecycle/S;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/E;", "LR0/a;", "a", "(LR0/a;)Landroidx/lifecycle/E;", "LR0/a$b;", "LR0/a$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/H;", "e", "(Landroidx/lifecycle/S;)Landroidx/lifecycle/H;", "savedStateHandlesVM", "Landroidx/lifecycle/G;", "d", "(Lb1/d;)Landroidx/lifecycle/G;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1672F {

    public static final a.b<b1.d> f11269a = new b();

    public static final a.b<InterfaceC1684S> f11270b = new c();

    public static final a.b<Bundle> f11271c = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/F$a", "LR0/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/F$b", "LR0/a$b;", "Lb1/d;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a.b<b1.d> {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/F$c", "LR0/a$b;", "Landroidx/lifecycle/S;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a.b<InterfaceC1684S> {
        c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/a;", "Landroidx/lifecycle/H;", "a", "(LR0/a;)Landroidx/lifecycle/H;"}, k = 3, mv = {1, 8, 0})
    static final class d extends l implements Function1<R0.a, C1674H> {

        public static final d f11272d = new d();

        d() {
            super(1);
        }

        public final C1674H invoke(R0.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$this$initializer");
            return new C1674H();
        }
    }

    public static final C1671E a(R0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        b1.d dVar = (b1.d) aVar.a(f11269a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1684S interfaceC1684S = (InterfaceC1684S) aVar.a(f11270b);
        if (interfaceC1684S == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f11271c);
        String str = (String) aVar.a(C1681O.c.f11339d);
        if (str != null) {
            return b(dVar, interfaceC1684S, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final C1671E b(b1.d dVar, InterfaceC1684S interfaceC1684S, String str, Bundle bundle) {
        C1673G c1673gD = d(dVar);
        C1674H c1674hE = e(interfaceC1684S);
        C1671E c1671e = c1674hE.f().get(str);
        if (c1671e != null) {
            return c1671e;
        }
        C1671E c1671eA = C1671E.INSTANCE.a(c1673gD.b(str), bundle);
        c1674hE.f().put(str, c1671eA);
        return c1671eA;
    }

    public static final <T extends b1.d & InterfaceC1684S> void c(T t7) {
        Intrinsics.checkNotNullParameter(t7, "<this>");
        AbstractC1694h.b state = t7.getLifecycle().getState();
        if (state != AbstractC1694h.b.INITIALIZED && state != AbstractC1694h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t7.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1673G c1673g = new C1673G(t7.getSavedStateRegistry(), t7);
            t7.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1673g);
            t7.getLifecycle().a(new SavedStateHandleAttacher(c1673g));
        }
    }

    public static final C1673G d(b1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        a.c cVarC = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C1673G c1673g = cVarC instanceof C1673G ? (C1673G) cVarC : null;
        if (c1673g != null) {
            return c1673g;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final C1674H e(InterfaceC1684S interfaceC1684S) {
        Intrinsics.checkNotNullParameter(interfaceC1684S, "<this>");
        R0.c cVar = new R0.c();
        cVar.a(z.b(C1674H.class), d.f11272d);
        return (C1674H) new C1681O(interfaceC1684S, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", C1674H.class);
    }
}
