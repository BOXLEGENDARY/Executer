package v2;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {

    private static final d f24123c = new a().a();

    private final String f24124a;

    private final List<c> f24125b;

    public static final class a {

        private String f24126a = BuildConfig.FLAVOR;

        private List<c> f24127b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f24126a, Collections.unmodifiableList(this.f24127b));
        }

        public a b(List<c> list) {
            this.f24127b = list;
            return this;
        }

        public a c(String str) {
            this.f24126a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f24124a = str;
        this.f24125b = list;
    }

    public static a c() {
        return new a();
    }

    public List<c> a() {
        return this.f24125b;
    }

    public String b() {
        return this.f24124a;
    }
}
