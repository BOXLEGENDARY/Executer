package C;

import C.X;
import java.util.Set;

public interface S0 extends X {
    @Override
    default <ValueT> ValueT a(X.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) e().a(aVar, valuet);
    }

    @Override
    default boolean b(X.a<?> aVar) {
        return e().b(aVar);
    }

    @Override
    default Set<X.a<?>> c() {
        return e().c();
    }

    @Override
    default Set<X.c> d(X.a<?> aVar) {
        return e().d(aVar);
    }

    X e();

    @Override
    default <ValueT> ValueT f(X.a<ValueT> aVar) {
        return (ValueT) e().f(aVar);
    }

    @Override
    default X.c g(X.a<?> aVar) {
        return e().g(aVar);
    }

    @Override
    default <ValueT> ValueT h(X.a<ValueT> aVar, X.c cVar) {
        return (ValueT) e().h(aVar, cVar);
    }

    @Override
    default void i(String str, X.b bVar) {
        e().i(str, bVar);
    }
}
