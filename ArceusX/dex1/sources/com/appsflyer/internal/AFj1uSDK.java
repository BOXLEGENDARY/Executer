package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public final class AFj1uSDK implements AFj1rSDK {
    private static final BitSet component4;
    final Runnable AFAdRevenueData;
    private final SensorManager areAllFieldsValid;
    private final ExecutorService component1;
    private final Map<AFj1qSDK, Map<String, Object>> component2;
    private final Map<AFj1qSDK, AFj1qSDK> component3;
    boolean getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Object getMonetizationNetwork;
    final Handler getRevenue;
    private boolean hashCode;
    private final Runnable toString;

    static {
        BitSet bitSet = new BitSet(6);
        component4 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1uSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMonetizationNetwork = new Object();
        BitSet bitSet = component4;
        this.component3 = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.AFAdRevenueData = new Runnable() {
            @Override
            public final void run() {
                synchronized (AFj1uSDK.this.getMonetizationNetwork) {
                    AFj1uSDK.this.AFAdRevenueData();
                    AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                    aFj1uSDK.getRevenue.postDelayed(aFj1uSDK.getMediationNetwork, 150L);
                    AFj1uSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getMediationNetwork = new Runnable() {
            @Override
            public final void run() {
                this.f13620d.component1();
            }
        };
        this.toString = new Runnable() {
            @Override
            public final void run() {
                synchronized (AFj1uSDK.this.getMonetizationNetwork) {
                    try {
                        AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                        if (aFj1uSDK.getCurrencyIso4217Code) {
                            aFj1uSDK.getRevenue.removeCallbacks(aFj1uSDK.AFAdRevenueData);
                            AFj1uSDK aFj1uSDK2 = AFj1uSDK.this;
                            aFj1uSDK2.getRevenue.removeCallbacks(aFj1uSDK2.getMediationNetwork);
                            AFj1uSDK.this.getMonetizationNetwork();
                            AFj1uSDK.this.getCurrencyIso4217Code = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.areAllFieldsValid = sensorManager;
        this.getRevenue = handler;
        this.component1 = executorService;
    }

    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getMonetizationNetwork) {
            try {
                if (!this.component3.isEmpty() && this.hashCode) {
                    Iterator<AFj1qSDK> it = this.component3.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMonetizationNetwork(this.component2, false);
                    }
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void component1() {
        synchronized (this.getMonetizationNetwork) {
            this.getRevenue.post(new L(this));
        }
    }

    public void component2() {
        try {
            if (!this.component3.isEmpty()) {
                for (AFj1qSDK aFj1qSDK : this.component3.values()) {
                    this.areAllFieldsValid.unregisterListener(aFj1qSDK);
                    aFj1qSDK.getMonetizationNetwork(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.hashCode = false;
    }

    public void component3() {
        try {
            for (Sensor sensor : this.areAllFieldsValid.getSensorList(-1)) {
                if (getRevenue(sensor.getType())) {
                    AFj1qSDK aFj1qSDK = new AFj1qSDK(sensor, this.component1);
                    if (!this.component3.containsKey(aFj1qSDK)) {
                        this.component3.put(aFj1qSDK, aFj1qSDK);
                    }
                    this.areAllFieldsValid.registerListener(this.component3.get(aFj1qSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.hashCode = true;
    }

    private List<Map<String, Object>> component4() {
        synchronized (this.getMonetizationNetwork) {
            try {
                Iterator<AFj1qSDK> it = this.component3.values().iterator();
                while (it.hasNext()) {
                    it.next().getMonetizationNetwork(this.component2, true);
                }
                if (this.component2.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.component2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean getRevenue(int i7) {
        return i7 >= 0 && component4.get(i7);
    }

    final void AFAdRevenueData() {
        this.getRevenue.post(new Runnable() {
            @Override
            public final void run() {
                this.f13618d.component3();
            }
        });
    }

    @Override
    public final synchronized void getCurrencyIso4217Code() {
        this.getRevenue.post(this.toString);
    }

    @Override
    public final void getMediationNetwork() {
        this.getRevenue.post(this.toString);
        this.getRevenue.post(this.AFAdRevenueData);
    }

    final void getMonetizationNetwork() {
        this.getRevenue.post(new L(this));
    }

    @Override
    public final Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (listAreAllFieldsValid.isEmpty()) {
            List<Map<String, Object>> listComponent4 = component4();
            if (!listComponent4.isEmpty()) {
                concurrentHashMap.put("sensors", listComponent4);
            }
        } else {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
        }
        return concurrentHashMap;
    }

    public AFj1uSDK(Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
