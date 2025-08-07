package U5;

import com.github.luben.zstd.BuildConfig;

public class a {

    private long f7511a;

    private String f7512b;

    private String f7513c;

    private String f7514d;

    public a(long j7, String str) {
        this.f7511a = j7;
        this.f7512b = str == null ? BuildConfig.FLAVOR : str;
        this.f7513c = BuildConfig.FLAVOR;
        this.f7514d = BuildConfig.FLAVOR;
    }

    public String a() {
        return this.f7514d;
    }

    public long b() {
        return this.f7511a;
    }

    public String c() {
        return this.f7513c;
    }

    public String d() {
        String str = this.f7512b;
        if (str != null) {
            return str;
        }
        return "User " + b();
    }

    public void e(String str) {
        this.f7514d = str;
    }

    public void f(long j7) {
        this.f7511a = j7;
    }

    public void g(String str) {
        this.f7513c = str;
    }

    public void h(String str) {
        this.f7512b = str;
    }

    public void i(a aVar) {
        if (aVar == this) {
            return;
        }
        if (this.f7511a != aVar.b() && aVar.b() != -1) {
            f(aVar.b());
        }
        if (!this.f7512b.equals(aVar.d()) && !aVar.d().isEmpty()) {
            h(aVar.d());
        }
        if (!this.f7513c.equals(aVar.c()) && !aVar.c().isEmpty()) {
            g(aVar.c());
        }
        if (this.f7514d.equals(aVar.a()) || aVar.a().isEmpty()) {
            return;
        }
        e(aVar.a());
    }
}
