package v6;

import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import d7.d;
import java.security.SecureRandom;
import java.util.ArrayList;

public class C2951a implements Z5.c {

    private static int f24172g;

    private StringBuilder f24173a;

    private StringBuilder f24174b;

    private String f24175c;

    private boolean f24176d = false;

    private long f24177e = 0;

    private ArrayList<String> f24178f = new ArrayList<>();

    class C0234a implements d7.a {

        final Z5.a f24179a;

        C0234a(Z5.a aVar) {
            this.f24179a = aVar;
        }

        public void a(d dVar) {
            Z5.a aVar = this.f24179a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public C2951a(String str) {
        this.f24173a = null;
        this.f24174b = null;
        this.f24175c = BuildConfig.FLAVOR;
        this.f24175c = str;
        this.f24174b = new StringBuilder();
        this.f24173a = new StringBuilder();
    }

    public static void g() {
        f24172g = new SecureRandom().nextInt(100);
    }

    private long h() {
        return System.currentTimeMillis() * 1000000;
    }

    private static boolean j() {
        return f24172g < j6.d.a().g0();
    }

    private String k(String str) {
        int iLastIndexOf = str.lastIndexOf(",");
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    @Override
    public void a(Z5.a aVar) {
        if (this.f24176d || j()) {
            if (this.f24177e == 0) {
                this.f24177e = h();
            }
            new d7.b(j6.d.a().O0(), j6.d.a().x1(), i(), new C0234a(aVar)).d();
        } else if (aVar != null) {
            aVar.a();
        }
    }

    @Override
    public boolean b() {
        return j6.d.a().O0() != null;
    }

    public C2951a c(String str, Object obj) {
        StringBuilder sb = this.f24173a;
        sb.append(str);
        sb.append("=");
        sb.append('\"');
        sb.append(obj);
        sb.append('\"');
        sb.append(",");
        return this;
    }

    public C2951a d(String str, boolean z7) {
        StringBuilder sb = this.f24173a;
        sb.append(str);
        sb.append("=");
        sb.append(z7);
        sb.append(",");
        return this;
    }

    public C2951a e(String str, Object obj) {
        StringBuilder sb = this.f24174b;
        sb.append(str);
        sb.append('=');
        sb.append(obj.toString().replace(" ", "\\ ").replace(",", "\\,"));
        sb.append(",");
        return this;
    }

    public Z5.c f() {
        C2952b.f().b(this);
        return this;
    }

    protected String i() {
        e("appVersion", "2.684.688");
        c("deviceType", Build.MODEL);
        e("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        e("platform", "Android");
        e("reporter", "App");
        if (this.f24177e == 0) {
            this.f24177e = h();
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f24178f.size(); i7++) {
            sb.append(this.f24178f.get(i7));
        }
        return ((CharSequence) sb) + this.f24175c + "," + k(this.f24174b.toString()) + " " + k(this.f24173a.toString()) + " " + this.f24177e + "\n";
    }

    public C2951a l(boolean z7) {
        this.f24176d = z7;
        return this;
    }
}
