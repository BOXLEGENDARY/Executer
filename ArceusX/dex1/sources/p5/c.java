package P5;

import Za.e;
import Za.j;
import android.content.Context;
import j6.d;
import org.webrtc.voiceengine.AppAudioManagerBase;

public class c implements a {

    final AppAudioManagerBase f3726a;

    final com.roblox.audio.a f3727b;

    public c(Context context) {
        if (d.a().i1()) {
            this.f3727b = j.q(context);
            this.f3726a = null;
        } else {
            this.f3727b = null;
            this.f3726a = e.g(context);
        }
    }

    @Override
    public void c() {
        if (d.a().i1()) {
            com.roblox.audio.a aVar = this.f3727b;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        AppAudioManagerBase appAudioManagerBase = this.f3726a;
        if (appAudioManagerBase != null) {
            appAudioManagerBase.dispose();
        }
    }

    @Override
    public void d(androidx.appcompat.app.d dVar) {
        if (d.a().i1()) {
            this.f3727b.f(dVar);
        } else {
            this.f3726a.setActivityForPermissionRequest(dVar);
        }
    }
}
