package m6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.BatteryStatus;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class C2606h {

    private static final long f22169g;

    private final Context f22170a;

    private final BatteryManager f22171b;

    private BroadcastReceiver f22172c;

    private long f22173d = System.currentTimeMillis();

    private final ScheduledExecutorService f22174e = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            return C2606h.l(runnable);
        }
    });

    private ScheduledFuture<?> f22175f;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (System.currentTimeMillis() - C2606h.this.f22173d > C2606h.f22169g) {
                C2606h.this.f22173d = System.currentTimeMillis();
                C2606h.this.o(intent);
            }
        }
    }

    static {
        f22169g = j6.d.a().W() ? 5000L : 30000L;
    }

    public C2606h(Context context) {
        this.f22170a = context;
        this.f22171b = (BatteryManager) context.getSystemService("batterymanager");
    }

    private static Boolean g(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return Boolean.valueOf(intent.getBooleanExtra(str, false));
    }

    private Integer h(int i7) {
        BatteryManager batteryManager = this.f22171b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i7);
        if (longProperty != Long.MIN_VALUE) {
            return Integer.valueOf((int) longProperty);
        }
        return null;
    }

    private static Integer i(Intent intent, String str) {
        int intExtra;
        if (intent == null || !intent.hasExtra(str) || (intExtra = intent.getIntExtra(str, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    private Long j(int i7) {
        BatteryManager batteryManager = this.f22171b;
        if (batteryManager == null) {
            return null;
        }
        long longProperty = batteryManager.getLongProperty(i7);
        if (longProperty != Long.MIN_VALUE) {
            return Long.valueOf(longProperty);
        }
        return null;
    }

    private String k(int i7) {
        return i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "BATTERY_STATUS_UNKNOWN" : "BATTERY_STATUS_FULL" : "BATTERY_STATUS_NOT_CHARGING" : "BATTERY_STATUS_DISCHARGING" : "BATTERY_STATUS_CHARGING";
    }

    public static Thread l(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("BatteryStatusObserver-" + System.currentTimeMillis());
        thread.setDaemon(true);
        return thread;
    }

    public static BatteryStatus.b m(Integer num) {
        if (num == null) {
            return BatteryStatus.b.UNKNOWN;
        }
        for (BatteryStatus.b bVar : BatteryStatus.b.values()) {
            if (bVar.androidValue == num.intValue()) {
                return bVar;
            }
        }
        return BatteryStatus.b.UNKNOWN;
    }

    public void n() {
        Integer num;
        Intent intentRegisterReceiver = this.f22170a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return;
        }
        BatteryStatus batteryStatus = new BatteryStatus();
        batteryStatus.chargeCounter = h(1);
        Integer numH = h(2);
        batteryStatus.currentNow = numH;
        if (numH != null && Math.abs(numH.intValue()) < 42000) {
            batteryStatus.currentNow = Integer.valueOf(batteryStatus.currentNow.intValue() * 1000);
        }
        Integer numH2 = h(3);
        batteryStatus.currentAverage = numH2;
        if (numH2 != null && Math.abs(numH2.intValue()) < 42000) {
            batteryStatus.currentAverage = Integer.valueOf(batteryStatus.currentAverage.intValue() * 1000);
        }
        batteryStatus.energyCounter = j(5);
        BatteryStatus.c cVarE = BatteryStatus.c.e(i(intentRegisterReceiver, "status"));
        batteryStatus.status = Integer.valueOf(cVarE.robloxValue);
        BatteryStatus.b bVarM = m(i(intentRegisterReceiver, "plugged"));
        batteryStatus.plugged = Integer.valueOf(bVarM.robloxValue);
        if (bVarM == BatteryStatus.b.NOT_PLUGGED) {
            Integer num2 = batteryStatus.currentNow;
            if (num2 != null && num2.intValue() > 0) {
                batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
                Integer num3 = batteryStatus.currentAverage;
                if (num3 != null) {
                    batteryStatus.currentAverage = Integer.valueOf(-num3.intValue());
                }
            }
        } else if (bVarM != BatteryStatus.b.UNKNOWN && (num = batteryStatus.currentNow) != null && num.intValue() < 0) {
            batteryStatus.currentNow = Integer.valueOf(-batteryStatus.currentNow.intValue());
            Integer num4 = batteryStatus.currentAverage;
            if (num4 != null) {
                batteryStatus.currentAverage = Integer.valueOf(-num4.intValue());
            }
        }
        Integer numI = i(intentRegisterReceiver, "level");
        Integer numI2 = i(intentRegisterReceiver, "scale");
        if (numI != null && numI2 != null) {
            batteryStatus.batteryPercentage = Integer.valueOf((numI.intValue() * 100) / numI2.intValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            batteryStatus.batteryLow = g(intentRegisterReceiver, "battery_low");
        }
        batteryStatus.voltage = i(intentRegisterReceiver, "voltage");
        if (i(intentRegisterReceiver, "temperature") != null) {
            batteryStatus.temperature = Float.valueOf(r4.intValue() / 10.0f);
        }
        batteryStatus.technology = intentRegisterReceiver.getStringExtra("technology");
        batteryStatus.health = Integer.valueOf(BatteryStatus.a.e(i(intentRegisterReceiver, "health")));
        batteryStatus.present = g(intentRegisterReceiver, "present");
        if (batteryStatus.currentNow != null && batteryStatus.voltage != null) {
            batteryStatus.power = Integer.valueOf((int) ((r0.intValue() / 1000.0f) * (batteryStatus.voltage.intValue() / 1000.0f)));
        }
        h7.l.g("rbx.perfdata", "perfdata battery " + bVarM.name() + " " + cVarE.name() + " " + batteryStatus.currentNow + "uAmps " + batteryStatus.power + "mW");
        NativeGLInterface.reportBatteryStatus(batteryStatus);
    }

    public void o(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int intExtra2 = intent.getIntExtra("status", -1);
        h7.l.g(KwdswzaUHE.UOD, "batteryStatus: " + k(intExtra2) + " batteryLevel: " + intExtra);
        NativeGLInterface.reportBatteryStateChanged(intExtra, intExtra2);
    }

    public void p() {
        r();
        h7.l.g("BatteryStatusObserver", "startObserving");
        if (j6.d.a().W()) {
            this.f22175f = this.f22174e.scheduleAtFixedRate(new Runnable() {
                @Override
                public final void run() {
                    this.f22168d.n();
                }
            }, 0L, f22169g, TimeUnit.MILLISECONDS);
        } else {
            q();
        }
    }

    public void q() {
        r();
        h7.l.g("BatteryStatusObserver", "startObserving");
        this.f22172c = new a();
        Intent intentRegisterReceiver = this.f22170a.registerReceiver(this.f22172c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            o(intentRegisterReceiver);
        }
    }

    public void r() {
        if (this.f22172c != null) {
            h7.l.g("BatteryStatusObserver", "stopObserving");
            this.f22170a.unregisterReceiver(this.f22172c);
            this.f22172c = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f22175f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f22175f = null;
        }
    }
}
