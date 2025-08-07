package H;

import C.S0;
import C.X;

public interface m<T> extends S0 {

    public static final X.a<String> f1523F = X.a.a("camerax.core.target.name", String.class);

    public static final X.a<Class<?>> f1524G = X.a.a("camerax.core.target.class", Class.class);

    default String D(String str) {
        return (String) a(f1523F, str);
    }

    default String I() {
        return (String) f(f1523F);
    }
}
