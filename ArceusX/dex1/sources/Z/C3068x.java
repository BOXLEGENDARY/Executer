package z;

import C.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C3068x {

    static final class a implements C.U {

        final List<C.W> f24763a;

        a(List<C.W> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f24763a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override
        public List<C.W> a() {
            return this.f24763a;
        }
    }

    static C.U a(C.W... wArr) {
        return new a(Arrays.asList(wArr));
    }

    public static C.U b() {
        return a(new W.a());
    }
}
