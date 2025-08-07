package K6;

import K6.f;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.C2370s;

public class d extends K6.a {

    private Context f1919a;

    class a extends J6.a {

        final String f1920d;

        a(String str) {
            this.f1920d = str;
        }

        @Override
        public String[] getColumnNames() {
            return new String[]{"dev_rpc_ip_port_override"};
        }

        @Override
        public String getString(int i7) {
            return this.f1920d;
        }
    }

    public d(Context context) {
        this.f1919a = context;
    }

    @Override
    public X5.a a(f.a aVar) {
        if (aVar == f.a.GET) {
            return X5.a.GetDevRpcIpAndPort;
        }
        return null;
    }

    @Override
    public Cursor b(Uri uri) {
        return new a(C2370s.b(this.f1919a));
    }
}
