package com.roblox.client.app;

import android.view.AbstractC1694h;
import android.view.InterfaceC1700n;
import android.view.InterfaceC1711y;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.memstorage.MemStorage;

public class AppWebViewLifecycleObserver implements InterfaceC1700n {
    @InterfaceC1711y(AbstractC1694h.a.ON_CREATE)
    public void onWebViewCreated() {
    }

    @InterfaceC1711y(AbstractC1694h.a.ON_DESTROY)
    public void onWebViewDestroyed() {
        MemStorage.fire("BrowserService.BrowserWindowClosed", BuildConfig.FLAVOR);
    }
}
