package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import t.C;
import t.O;

class T implements O.b {

    final CameraManager f23723a;

    final Object f23724b;

    static final class a {

        final Map<CameraManager.AvailabilityCallback, O.a> f23725a = new HashMap();

        final Handler f23726b;

        a(Handler handler) {
            this.f23726b = handler;
        }
    }

    T(Context context, Object obj) {
        this.f23723a = (CameraManager) context.getSystemService("camera");
        this.f23724b = obj;
    }

    static T h(Context context, Handler handler) {
        return new T(context, new a(handler));
    }

    @Override
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f23724b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f23725a) {
                try {
                    aVar = aVar2.f23725a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new O.a(executor, availabilityCallback);
                        aVar2.f23725a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f23723a.registerAvailabilityCallback(aVar, aVar2.f23726b);
    }

    @Override
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        O.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f23724b;
            synchronized (aVar.f23725a) {
                aVarRemove = aVar.f23725a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            aVarRemove.g();
        }
        this.f23723a.unregisterAvailabilityCallback(aVarRemove);
    }

    @Override
    public CameraCharacteristics c(String str) throws C2894g {
        try {
            return this.f23723a.getCameraCharacteristics(str);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }

    @Override
    public Set<Set<String>> e() throws C2894g {
        return Collections.emptySet();
    }

    @Override
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C2894g {
        x0.g.g(executor);
        x0.g.g(stateCallback);
        try {
            this.f23723a.openCamera(str, new C.b(executor, stateCallback), ((a) this.f23724b).f23726b);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }

    @Override
    public String[] g() throws C2894g {
        try {
            return this.f23723a.getCameraIdList();
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }
}
