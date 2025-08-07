package K3;

import java.util.Comparator;

public abstract class S implements Comparator {
    protected S() {
    }

    public S a() {
        return new X(this);
    }

    @Override
    public abstract int compare(Object obj, Object obj2);
}
