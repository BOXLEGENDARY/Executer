package androidx.profileinstaller;

import H3.QdLC.QcdySgfdST;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.f;
import java.io.IOException;

public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements f.c {
        a() {
        }

        @Override
        public void a(int i7, Object obj) {
            f.f11470b.a(i7, obj);
        }

        @Override
        public void b(int i7, Object obj) {
            f.f11470b.b(i7, obj);
            ProfileInstallReceiver.this.setResultCode(i7);
        }
    }

    static void a(f.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.b(12, null);
    }

    @Override
    public void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.k(context, new W0.b(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    f.l(context, new W0.b(), new a());
                    return;
                } else {
                    if (QcdySgfdST.DwTOBbEOZqDja.equals(string)) {
                        f.c(context, new W0.b(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.b(16, null);
        }
    }
}
