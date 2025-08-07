package V3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.W0;
import java.util.List;
import java.util.Map;

public class a {

    private final W0 f7547a;

    public a(W0 w02) {
        this.f7547a = w02;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return W0.t(context, str, str2, str3, bundle).q();
    }

    public void a(String str) {
        this.f7547a.F(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f7547a.G(str, str2, bundle);
    }

    public void c(String str) {
        this.f7547a.H(str);
    }

    public long d() {
        return this.f7547a.o();
    }

    public String e() {
        return this.f7547a.v();
    }

    public String f() {
        return this.f7547a.w();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f7547a.A(str, str2);
    }

    public String h() {
        return this.f7547a.x();
    }

    public String i() {
        return this.f7547a.y();
    }

    public String j() {
        return this.f7547a.z();
    }

    public int l(String str) {
        return this.f7547a.n(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z7) {
        return this.f7547a.B(str, str2, z7);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f7547a.I(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f7547a.p(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f7547a.p(bundle, true);
    }

    public void q(Bundle bundle) {
        this.f7547a.b(bundle);
    }

    public void r(Bundle bundle) {
        this.f7547a.c(bundle);
    }

    public void s(Activity activity, String str, String str2) {
        this.f7547a.d(activity, str, str2);
    }

    public void t(String str, String str2, Object obj) {
        this.f7547a.f(str, str2, obj, true);
    }

    public final void u(boolean z7) {
        this.f7547a.e(z7);
    }
}
