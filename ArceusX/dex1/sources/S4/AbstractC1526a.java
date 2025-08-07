package S4;

import java.util.Set;

abstract class AbstractC1526a implements e {
    AbstractC1526a() {
    }

    @Override
    public <T> T a(Class<T> cls) {
        c5.b<T> bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
