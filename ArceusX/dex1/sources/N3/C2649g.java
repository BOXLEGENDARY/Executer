package n3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class C2649g {

    public static final class a {

        private final List f22279a;

        private final Object f22280b;

        a(Object obj, C2634J c2634j) {
            C2651i.l(obj);
            this.f22280b = obj;
            this.f22279a = new ArrayList();
        }

        public a a(String str, Object obj) {
            C2651i.l(str);
            this.f22279a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f22280b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f22279a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append((String) this.f22279a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a d(Object obj) {
        return new a(obj, null);
    }
}
