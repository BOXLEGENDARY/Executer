package m6;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import androidx.room.kU.HguUe;
import com.roblox.engine.jni.NativeGLInterface;

public class W {

    private final Context f22161a;

    private PowerManager$OnThermalStatusChangedListener f22162b;

    class a implements PowerManager$OnThermalStatusChangedListener {
        a() {
        }

        public void onThermalStatusChanged(int i7) {
            NativeGLInterface.reportThermalStateChanged(i7);
            h7.l.a("ThermalStatusObserver", "onThermalStatusChanged: " + i7);
        }
    }

    public W(Context context) {
        this.f22161a = context;
    }

    public void a() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) this.f22161a.getSystemService("power")) == null) {
            return;
        }
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = this.f22162b;
        if (powerManager$OnThermalStatusChangedListener != null) {
            powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        }
        NativeGLInterface.reportThermalStateChanged(powerManager.getCurrentThermalStatus());
        h7.l.g("ThermalStatusObserver", "startObserving");
        a aVar = new a();
        this.f22162b = aVar;
        powerManager.addThermalStatusListener(aVar);
    }

    public void b() {
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener;
        if (Build.VERSION.SDK_INT < 29 || this.f22162b == null) {
            return;
        }
        h7.l.g("ThermalStatusObserver", "stopObserving");
        PowerManager powerManager = (PowerManager) this.f22161a.getSystemService(HguUe.mcMLIahnl);
        if (powerManager == null || (powerManager$OnThermalStatusChangedListener = this.f22162b) == null) {
            return;
        }
        powerManager.removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
        this.f22162b = null;
        NativeGLInterface.reportThermalStateChanged(-1);
    }
}
