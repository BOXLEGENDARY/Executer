package t6;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.roblox.client.C2374w;
import q7.b;

public class l extends q7.b {

    private static final String f23841c = "t6.l";

    private class a implements b.b {

        private final Context f23842a;

        a(Context context) {
            this.f23842a = context.getApplicationContext();
        }

        public void a(q7.a aVar) {
            Log.v(l.f23841c, "RBHybridModulePush PushPermissionTrigger.execute() " + aVar.f());
            if (Build.VERSION.SDK_INT >= 33) {
                W7.k kVarK = C2374w.h().k();
                W7.m mVar = W7.m.z;
                if (!kVarK.c0(mVar)) {
                    C2374w.h().k().X(new String[]{mVar.toString()});
                    return;
                }
            }
            b(this.f23842a);
        }

        public void b(Context context) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 28) {
                intent.addFlags(268435456);
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            context.startActivity(intent);
        }
    }

    public l(Context context) {
        super("Push");
        d(KwdswzaUHE.ncHSmraKna, new a(context));
    }
}
