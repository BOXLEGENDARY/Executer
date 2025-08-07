package K6;

import K6.f;
import X5.c;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.widget.Toast;
import com.roblox.client.C2370s;
import com.roblox.client.M;
import com.roblox.client.a0;
import com.roblox.client.provider.ShellConfigurationContentProvider;
import h7.l;

public class c implements f {

    private final String f1916a = "rbx.config";

    private Context f1917b;

    private ShellConfigurationContentProvider f1918c;

    public c(ShellConfigurationContentProvider shellConfigurationContentProvider, Context context) {
        this.f1918c = shellConfigurationContentProvider;
        this.f1917b = context;
    }

    private X5.c e() {
        return this.f1918c.d();
    }

    private c.a f() {
        return this.f1918c.c();
    }

    public void g() {
        Toast.makeText(this.f1917b.getApplicationContext(), M.f19628Z, 0).show();
    }

    @Override
    public X5.a a(f.a aVar) {
        if (aVar == f.a.GET) {
            return X5.a.GetConfig;
        }
        if (aVar == f.a.POST) {
            return X5.a.f7958w;
        }
        return null;
    }

    @Override
    public Cursor b(Uri uri) {
        return new J6.b(this.f1918c.d());
    }

    @Override
    public void c(Uri uri, ContentValues contentValues) {
        if (contentValues.containsKey("settings_param")) {
            String asString = contentValues.getAsString("settings_param");
            l.a("rbx.config", "new payload:" + asString);
            e().j(asString);
            f().a(asString);
        }
        if (contentValues.containsKey("channel_param")) {
            String asString2 = contentValues.getAsString("channel_param");
            l.a("rbx.config", "new robloxChannel:" + asString2);
            e().m(asString2);
            f().f(asString2);
        }
        if (contentValues.containsKey("base_url_param")) {
            String asString3 = contentValues.getAsString("base_url_param");
            l.a("rbx.config", "new baseUrl:" + asString3);
            e().k(asString3);
            f().b(asString3);
        }
        if (contentValues.containsKey("user_agent_param")) {
            String asString4 = contentValues.getAsString("user_agent_param");
            l.a("rbx.config", "set user agent:" + asString4);
            e().n(asString4);
            f().c(asString4);
        }
        if (contentValues.containsKey("dev_rpc_ip_port_override")) {
            String asString5 = contentValues.getAsString("dev_rpc_ip_port_override");
            l.a("rbx.config", "set dev rpc ip and port:" + asString5);
            e().l(asString5);
            f().d(asString5);
            C2370s.e(this.f1917b, asString5);
            new Handler(this.f1917b.getMainLooper()).post(new Runnable() {
                @Override
                public final void run() {
                    this.f1915d.g();
                }
            });
            if (com.roblox.client.startup.d.s(this.f1917b).v()) {
                a0.M0(true);
            }
        }
    }
}
