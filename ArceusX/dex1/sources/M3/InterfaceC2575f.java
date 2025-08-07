package m3;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface InterfaceC2575f {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T d(String str, Class<T> cls);

    Activity g();

    void startActivityForResult(Intent intent, int i7);
}
