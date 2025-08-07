package J6;

import X5.c;
import android.content.Context;
import android.content.SharedPreferences;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.a0;
import h7.s;
import java.io.IOException;

public class c implements c.a {

    private Z6.a f1726a;

    private SharedPreferences f1727b;

    private String f1728c;

    public c(Context context) {
        this.f1726a = new Z6.a(context);
        this.f1727b = s.e(context.getApplicationContext()).d("configure_dev_roblox", true);
        a0.N0(context);
        this.f1728c = a0.o(context);
    }

    @Override
    public void a(String str) throws IOException {
        if (str != null) {
            this.f1726a.i(str);
        } else {
            this.f1726a.a();
        }
    }

    @Override
    public void b(String str) {
        if (str != null) {
            this.f1727b.edit().putString("BaseUrl", str).apply();
        } else {
            this.f1727b.edit().remove("BaseUrl").apply();
        }
    }

    @Override
    public void c(String str) {
        if (str != null) {
            this.f1727b.edit().putString("user_agent", str).apply();
        } else {
            this.f1727b.edit().remove("user_agent").apply();
        }
    }

    @Override
    public void d(String str) {
        if (str != null) {
            this.f1727b.edit().putString("dev_rpc_ip_port_override", str).apply();
        } else {
            this.f1727b.edit().remove("dev_rpc_ip_port_override").apply();
        }
    }

    @Override
    public X5.c e() {
        String strH = this.f1726a.h();
        return new X5.c(this.f1727b.getString("RobloxChannel", null), BuildConfig.FLAVOR, this.f1727b.getString("BaseUrl", null), "www.roblox.com", strH, this.f1727b.getString("user_agent", null), this.f1728c, this.f1727b.getString("dev_rpc_ip_port_override", null));
    }

    @Override
    public void f(String str) {
        if (str != null) {
            this.f1727b.edit().putString("RobloxChannel", str).apply();
        } else {
            this.f1727b.edit().remove("RobloxChannel").apply();
        }
    }
}
