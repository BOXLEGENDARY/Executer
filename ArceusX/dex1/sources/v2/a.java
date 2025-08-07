package v2;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.l;

public final class a {

    private static final a f24097e = new C0233a().b();

    private final f f24098a;

    private final List<d> f24099b;

    private final b f24100c;

    private final String f24101d;

    public static final class C0233a {

        private f f24102a = null;

        private List<d> f24103b = new ArrayList();

        private b f24104c = null;

        private String f24105d = BuildConfig.FLAVOR;

        C0233a() {
        }

        public C0233a a(d dVar) {
            this.f24103b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f24102a, Collections.unmodifiableList(this.f24103b), this.f24104c, this.f24105d);
        }

        public C0233a c(String str) {
            this.f24105d = str;
            return this;
        }

        public C0233a d(b bVar) {
            this.f24104c = bVar;
            return this;
        }

        public C0233a e(f fVar) {
            this.f24102a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f24098a = fVar;
        this.f24099b = list;
        this.f24100c = bVar;
        this.f24101d = str;
    }

    public static C0233a e() {
        return new C0233a();
    }

    public String a() {
        return this.f24101d;
    }

    public b b() {
        return this.f24100c;
    }

    public List<d> c() {
        return this.f24099b;
    }

    public f d() {
        return this.f24098a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
