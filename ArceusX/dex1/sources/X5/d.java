package X5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;

public class d {

    private final String[] f7972a;

    private String f7973b;

    public d(Context context) {
        this(context.getPackageName() + context.getString(b.f7963a));
    }

    private Cursor b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, this.f7972a, null, null, null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public c a(Context context) {
        Cursor cursorB = b(context, a.GetConfig.e(this.f7973b));
        c cVar = (cursorB == null || !cursorB.moveToFirst()) ? null : new c(cursorB.getString(cursorB.getColumnIndex("channel_param")), cursorB.getString(cursorB.getColumnIndex("default_channel_param")), cursorB.getString(cursorB.getColumnIndex("base_url_param")), cursorB.getString(cursorB.getColumnIndex(jUbDmI.yOypqWTdtWKbW)), cursorB.getString(cursorB.getColumnIndex("settings_param")), cursorB.getString(cursorB.getColumnIndex("user_agent_param")), cursorB.getString(cursorB.getColumnIndex("default_user_agent_param")), cursorB.getString(cursorB.getColumnIndex("dev_rpc_ip_port_override")));
        if (cursorB != null) {
            cursorB.close();
        }
        return cVar;
    }

    public d(String str) {
        this.f7972a = new String[]{"PROJECTION_NONE"};
        this.f7973b = str;
    }
}
