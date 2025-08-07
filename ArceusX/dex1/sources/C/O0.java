package C;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class O0 {

    private final boolean f415a;

    private final Set<Class<? extends N0>> f416b;

    private final Set<Class<? extends N0>> f417c;

    public static class b {

        private boolean f418a = true;

        private Set<Class<? extends N0>> f419b;

        private Set<Class<? extends N0>> f420c;

        public O0 a() {
            return new O0(this.f418a, this.f419b, this.f420c);
        }

        public b b(Set<Class<? extends N0>> set) {
            this.f420c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends N0>> set) {
            this.f419b = new HashSet(set);
            return this;
        }

        public b d(boolean z7) {
            this.f418a = z7;
            return this;
        }
    }

    public static O0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends N0> cls, boolean z7) {
        if (this.f416b.contains(cls)) {
            return true;
        }
        if (this.f417c.contains(cls)) {
            return false;
        }
        return this.f415a && z7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof O0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        O0 o02 = (O0) obj;
        return this.f415a == o02.f415a && Objects.equals(this.f416b, o02.f416b) && Objects.equals(this.f417c, o02.f417c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f415a), this.f416b, this.f417c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f415a + ", forceEnabledQuirks=" + this.f416b + ", forceDisabledQuirks=" + this.f417c + '}';
    }

    private O0(boolean z7, Set<Class<? extends N0>> set, Set<Class<? extends N0>> set2) {
        this.f415a = z7;
        this.f416b = set == null ? Collections.emptySet() : new HashSet<>(set);
        this.f417c = set2 == null ? Collections.emptySet() : new HashSet<>(set2);
    }
}
