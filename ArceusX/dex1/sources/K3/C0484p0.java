package K3;

import java.util.Comparator;

final class C0484p0 {

    static final String f1890a;

    static final Comparator f1891b;

    static {
        Comparator comparator;
        String strConcat = C0484p0.class.getName().concat("$UnsafeComparator");
        f1890a = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC0482o0.INSTANCE;
        }
        f1891b = comparator;
    }

    C0484p0() {
    }
}
