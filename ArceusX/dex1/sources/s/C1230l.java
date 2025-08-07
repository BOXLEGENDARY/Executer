package S;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C1230l {

    public static final C1230l f6336a;

    public static final C1230l f6337b;

    public static final C1230l f6338c;

    public static final C1230l f6339d;

    public static final C1230l f6340e;

    public static final C1230l f6341f;

    static final C1230l f6342g;

    private static final Set<C1230l> f6343h;

    private static final List<C1230l> f6344i;

    public static abstract class b extends C1230l {
        public b() {
            super();
        }

        static b f(int i7, String str, List<Size> list) {
            return new C1224f(i7, str, list);
        }

        public abstract String c();

        public abstract List<Size> d();

        public abstract int e();
    }

    static {
        b bVarF = b.f(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f6336a = bVarF;
        b bVarF2 = b.f(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f6337b = bVarF2;
        b bVarF3 = b.f(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f6338c = bVarF3;
        b bVarF4 = b.f(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f6339d = bVarF4;
        b bVarF5 = b.f(0, "LOWEST", Collections.emptyList());
        f6340e = bVarF5;
        b bVarF6 = b.f(1, "HIGHEST", Collections.emptyList());
        f6341f = bVarF6;
        f6342g = b.f(-1, "NONE", Collections.emptyList());
        f6343h = new HashSet(Arrays.asList(bVarF5, bVarF6, bVarF, bVarF2, bVarF3, bVarF4));
        f6344i = Arrays.asList(bVarF4, bVarF3, bVarF2, bVarF);
    }

    static boolean a(C1230l c1230l) {
        return f6343h.contains(c1230l);
    }

    public static List<C1230l> b() {
        return new ArrayList(f6344i);
    }

    private C1230l() {
    }
}
