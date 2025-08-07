package ha;

import com.github.luben.zstd.BuildConfig;

public class C2704j {

    public a f22521a;

    int f22525e;

    boolean f22527g;

    private String f22522b = null;

    String f22523c = null;

    private byte[] f22524d = null;

    long f22526f = 0;

    String f22528h = BuildConfig.FLAVOR;

    enum a {
        GET,
        POST
    }

    public String a() {
        String str = this.f22522b;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int b() {
        return this.f22525e;
    }

    public void c(String str) {
        this.f22528h = str;
    }

    public void d(String str) {
        this.f22522b = str;
    }

    public String e() {
        return this.f22523c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f22523c + "\nRequest Type: " + this.f22521a + "\nResponse Body: " + this.f22522b + "\nResponse Code: " + this.f22525e;
    }
}
