package com.roblox.client.app;

import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1711y;
import com.roblox.engine.jni.NativeGLInterface;
import h7.l;
import m7.a;
import m7.c;

public class AppInputFocusLifecycleObserver implements InterfaceC1700n {

    private final String f19898d = "rbx.datamodel";

    @InterfaceC1711y(AbstractC1694h.a.ON_CREATE)
    public void onMenuOptionActivated() {
        l.a("rbx.datamodel", "onMenuOptionActivated");
        a aVar = new a(false);
        NativeGLInterface.nativeBroadcastEventWithNamespace(((c) aVar).a, ((c) aVar).b, ((c) aVar).c);
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
    public void onMenuOptionClosed() {
        l.a("rbx.datamodel", "onMenuOptionClosed");
        a aVar = new a(true);
        NativeGLInterface.nativeBroadcastEventWithNamespace(((c) aVar).a, ((c) aVar).b, ((c) aVar).c);
    }
}
