package C;

import C.X;
import androidx.appcompat.app.FN.krlBPZZeK;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;

public interface B extends S0 {

    public static final X.a<p1> f367a = X.a.a("camerax.core.camera.useCaseConfigFactory", p1.class);

    public static final X.a<AbstractC0344o0> f368b = X.a.a("camerax.core.camera.compatibilityId", AbstractC0344o0.class);

    public static final X.a<Integer> f369c = X.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    public static final X.a<Z0> f370d = X.a.a("camerax.core.camera.SessionProcessor", Z0.class);

    public static final X.a<Boolean> f371e = X.a.a(krlBPZZeK.ezW, Boolean.class);

    public static final X.a<Boolean> f372f = X.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    public static final X.a<Boolean> f373g = X.a.a(GObvYfBKohxpYX.hIMJrM, Boolean.class);

    default int E() {
        return ((Integer) a(f369c, 0)).intValue();
    }

    AbstractC0344o0 N();

    default boolean O() {
        return ((Boolean) a(f373g, Boolean.FALSE)).booleanValue();
    }

    default Z0 P(Z0 z02) {
        return (Z0) a(f370d, z02);
    }

    default p1 k() {
        return (p1) a(f367a, p1.f680a);
    }

    default boolean z() {
        return ((Boolean) a(f372f, Boolean.FALSE)).booleanValue();
    }
}
