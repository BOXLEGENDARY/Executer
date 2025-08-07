package X5;

import android.content.ContentValues;
import android.net.Uri;

public enum a {
    GetPing("ping.get", 1),
    GetConfig("config.get", 2),
    f7958w("config.post", 3),
    GetUserAgent("ua.get", 4),
    GetDevRpcIpAndPort("devrpc.get", 5);


    public final String f7961d;

    public final int f7962e;

    a(String str, int i7) {
        this.f7961d = str;
        this.f7962e = i7;
    }

    public Uri e(String str) {
        return f(str, null);
    }

    public Uri f(String str, ContentValues contentValues) {
        Uri uriBuild = Uri.parse("content://" + str + "/" + this.f7961d);
        if (contentValues != null) {
            for (String str2 : contentValues.keySet()) {
                uriBuild = uriBuild.buildUpon().appendQueryParameter(str2, contentValues.getAsString(str2)).build();
            }
        }
        return uriBuild;
    }
}
