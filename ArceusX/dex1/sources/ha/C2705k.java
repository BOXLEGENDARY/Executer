package ha;

import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import s7.g;
import t7.c;

public class C2705k {

    private static C2705k f22532d;

    private OkHttpClient f22533a;

    private int f22534b = 5;

    private int f22535c = 5;

    public static C2705k a() {
        if (f22532d == null) {
            synchronized (C2705k.class) {
                try {
                    if (f22532d == null) {
                        f22532d = new C2705k();
                    }
                } finally {
                }
            }
        }
        return f22532d;
    }

    public OkHttpClient b() {
        if (this.f22533a == null) {
            this.f22533a = new c((CookieJar) null, this.f22534b, this.f22535c, g.e()).a();
        }
        return this.f22533a;
    }
}
