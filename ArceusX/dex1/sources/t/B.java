package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class B {

    private final a f23694b;

    private final String f23695c;

    private final Map<CameraCharacteristics.Key<?>, Object> f23693a = new HashMap();

    private U f23696d = null;

    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    private B(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23694b = new y(cameraCharacteristics);
        } else {
            this.f23694b = new z(cameraCharacteristics);
        }
        this.f23695c = str;
    }

    private boolean c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static B e(CameraCharacteristics cameraCharacteristics, String str) {
        return new B(cameraCharacteristics, str);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (c(key)) {
            return (T) this.f23694b.a(key);
        }
        synchronized (this) {
            try {
                T t7 = (T) this.f23693a.get(key);
                if (t7 != null) {
                    return t7;
                }
                T t8 = (T) this.f23694b.a(key);
                if (t8 != null) {
                    this.f23693a.put(key, t8);
                }
                return t8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public U b() {
        if (this.f23696d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f23696d = U.e(streamConfigurationMap, new w.m(this.f23695c));
            } catch (AssertionError | NullPointerException e7) {
                throw new IllegalArgumentException(e7.getMessage());
            }
        }
        return this.f23696d;
    }

    public boolean d() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f23694b.a(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i7 : iArr) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
