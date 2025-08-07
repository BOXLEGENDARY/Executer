package K6;

import K6.f;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.roblox.client.a0;

public class g extends K6.a {

    private Context f1925a;

    class a extends J6.a {

        final String f1926d;

        a(String str) {
            this.f1926d = str;
        }

        @Override
        public String[] getColumnNames() {
            return new String[]{"user_agent_param"};
        }

        @Override
        public String getString(int i7) {
            return this.f1926d;
        }
    }

    public g(Context context) {
        this.f1925a = context;
    }

    @Override
    public X5.a a(f.a aVar) {
        if (aVar == f.a.GET) {
            return X5.a.GetUserAgent;
        }
        return null;
    }

    @Override
    public Cursor b(Uri uri) {
        String queryParameter = uri.getQueryParameter("user_agent_param");
        a0.N0(this.f1925a);
        if (queryParameter == null) {
            queryParameter = "google";
        }
        return new a(a0.p(this.f1925a, queryParameter));
    }
}
