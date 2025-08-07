package n3;

import android.content.Intent;
import m3.InterfaceC2575f;

final class C2664v extends AbstractDialogInterfaceOnClickListenerC2665w {

    final Intent f22296d;

    final InterfaceC2575f f22297e;

    C2664v(Intent intent, InterfaceC2575f interfaceC2575f, int i7) {
        this.f22296d = intent;
        this.f22297e = interfaceC2575f;
    }

    @Override
    public final void a() {
        Intent intent = this.f22296d;
        if (intent != null) {
            this.f22297e.startActivityForResult(intent, 2);
        }
    }
}
