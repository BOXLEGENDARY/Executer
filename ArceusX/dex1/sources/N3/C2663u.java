package n3;

import android.app.Activity;
import android.content.Intent;

final class C2663u extends AbstractDialogInterfaceOnClickListenerC2665w {

    final Intent f22293d;

    final Activity f22294e;

    final int f22295i;

    C2663u(Intent intent, Activity activity, int i7) {
        this.f22293d = intent;
        this.f22294e = activity;
        this.f22295i = i7;
    }

    @Override
    public final void a() {
        Intent intent = this.f22293d;
        if (intent != null) {
            this.f22294e.startActivityForResult(intent, this.f22295i);
        }
    }
}
