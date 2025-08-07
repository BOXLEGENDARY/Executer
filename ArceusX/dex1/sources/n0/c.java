package N0;

import Z.tNT.PexNRiLSd;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00038\u0007,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0013J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J7\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00062\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0'H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"LN0/c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "LN0/c$c;", "b", "(Landroidx/fragment/app/Fragment;)LN0/c$c;", BuildConfig.FLAVOR, "previousFragmentId", BuildConfig.FLAVOR, "f", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "k", "(Landroidx/fragment/app/Fragment;)V", "h", BuildConfig.FLAVOR, "isVisibleToUser", "m", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", BuildConfig.FLAVOR, "requestCode", "l", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "j", "i", "n", "LN0/m;", "violation", "e", "(LN0/m;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "p", "(LN0/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(LN0/c$c;LN0/m;)V", "Ljava/lang/Runnable;", "runnable", "o", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "LN0/c$c;", "getDefaultPolicy", "()LN0/c$c;", "setDefaultPolicy", "(LN0/c$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c {

    public static final c f2551a = new c();

    private static C0040c defaultPolicy = C0040c.f2563d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LN0/c$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "v", "w", "y", "z", "A", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        f2558v,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN0/c$b;", BuildConfig.FLAVOR, "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LN0/c$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "LN0/c$a;", "flags", "LN0/c$b;", "listener", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/lang/Class;", "LN0/m;", "allowedViolations", "<init>", "(Ljava/util/Set;LN0/c$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "LN0/c$b;", "()LN0/c$b;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0040c {

        public static final C0040c f2563d = new C0040c(L.d(), null, F.h());

        private final Set<a> flags;

        private final Map<String, Set<Class<? extends m>>> mAllowedViolations;

        public C0040c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends m>>> map) {
            Intrinsics.checkNotNullParameter(set, "flags");
            Intrinsics.checkNotNullParameter(map, "allowedViolations");
            this.flags = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends m>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<a> a() {
            return this.flags;
        }

        public final b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends m>>> c() {
            return this.mAllowedViolations;
        }
    }

    private c() {
    }

    private final C0040c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.C0() != null) {
                    C0040c c0040cC0 = parentFragmentManager.C0();
                    Intrinsics.d(c0040cC0);
                    return c0040cC0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void c(C0040c policy, final m violation) {
        Fragment fragmentA = violation.getFragment();
        final String name = fragmentA.getClass().getName();
        if (policy.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        policy.b();
        if (policy.a().contains(a.PENALTY_DEATH)) {
            o(fragmentA, new Runnable() {
                @Override
                public final void run() {
                    c.d(name, violation);
                }
            });
        }
    }

    public static final void d(String str, m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, mVar);
        throw mVar;
    }

    private final void e(m violation) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, PexNRiLSd.IfXlixf);
        N0.a aVar = new N0.a(fragment, previousFragmentId);
        c cVar = f2551a;
        cVar.e(aVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.p(c0040cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0040cB, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, container);
        c cVar = f2551a;
        cVar.e(dVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.f2558v) && cVar.p(c0040cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0040cB, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f2551a;
        cVar.e(eVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(c0040cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0040cB, eVar);
        }
    }

    public static final void i(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f2551a;
        cVar.e(fVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0040cB, fragment.getClass(), fVar.getClass())) {
            cVar.c(c0040cB, fVar);
        }
    }

    public static final void j(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f2551a;
        cVar.e(gVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0040cB, fragment.getClass(), gVar.getClass())) {
            cVar.c(c0040cB, gVar);
        }
    }

    public static final void k(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f2551a;
        cVar.e(iVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(c0040cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c0040cB, iVar);
        }
    }

    public static final void l(Fragment violatingFragment, Fragment targetFragment, int requestCode) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, requestCode);
        c cVar = f2551a;
        cVar.e(jVar);
        C0040c c0040cB = cVar.b(violatingFragment);
        if (c0040cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0040cB, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(c0040cB, jVar);
        }
    }

    public static final void m(Fragment fragment, boolean isVisibleToUser) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment, isVisibleToUser);
        c cVar = f2551a;
        cVar.e(kVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.p(c0040cB, fragment.getClass(), kVar.getClass())) {
            cVar.c(c0040cB, kVar);
        }
    }

    public static final void n(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f2551a;
        cVar.e(nVar);
        C0040c c0040cB = cVar.b(fragment);
        if (c0040cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.p(c0040cB, fragment.getClass(), nVar.getClass())) {
            cVar.c(c0040cB, nVar);
        }
    }

    private final void o(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerG = fragment.getParentFragmentManager().w0().g();
        Intrinsics.checkNotNullExpressionValue(handlerG, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.b(handlerG.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerG.post(runnable);
        }
    }

    private final boolean p(C0040c policy, Class<? extends Fragment> fragmentClass, Class<? extends m> violationClass) {
        Set<Class<? extends m>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.b(violationClass.getSuperclass(), m.class) || !CollectionsKt.F(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }
}
