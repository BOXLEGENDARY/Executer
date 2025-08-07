package C;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import z.C3043d0;

public class C0316a0 {

    private static final Set<EnumC0356v> f504a = Collections.unmodifiableSet(EnumSet.of(EnumC0356v.PASSIVE_FOCUSED, EnumC0356v.PASSIVE_NOT_FOCUSED, EnumC0356v.LOCKED_FOCUSED, EnumC0356v.LOCKED_NOT_FOCUSED));

    private static final Set<EnumC0360x> f505b = Collections.unmodifiableSet(EnumSet.of(EnumC0360x.f765v, EnumC0360x.UNKNOWN));

    private static final Set<EnumC0352t> f506c;

    private static final Set<EnumC0352t> f507d;

    static {
        EnumC0352t enumC0352t = EnumC0352t.CONVERGED;
        EnumC0352t enumC0352t2 = EnumC0352t.FLASH_REQUIRED;
        EnumC0352t enumC0352t3 = EnumC0352t.UNKNOWN;
        Set<EnumC0352t> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC0352t, enumC0352t2, enumC0352t3));
        f506c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC0352t2);
        enumSetCopyOf.remove(enumC0352t3);
        f507d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(InterfaceC0364z interfaceC0364z, boolean z7) {
        boolean z8 = interfaceC0364z.h() == EnumC0354u.OFF || interfaceC0364z.h() == EnumC0354u.UNKNOWN || f504a.contains(interfaceC0364z.l());
        boolean z9 = interfaceC0364z.k() == EnumC0350s.OFF;
        boolean z10 = !z7 ? !(z9 || f506c.contains(interfaceC0364z.i())) : !(z9 || f507d.contains(interfaceC0364z.i()));
        boolean z11 = interfaceC0364z.g() == EnumC0358w.OFF || f505b.contains(interfaceC0364z.e());
        C3043d0.a("ConvergenceUtils", "checkCaptureResult, AE=" + interfaceC0364z.i() + " AF =" + interfaceC0364z.l() + " AWB=" + interfaceC0364z.e());
        return z8 && z10 && z11;
    }
}
