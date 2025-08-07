package S4;

import java.util.Arrays;
import java.util.List;

public class r extends s {

    private final List<C1529d<?>> f7375d;

    public r(List<C1529d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f7375d = list;
    }
}
