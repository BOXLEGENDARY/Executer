package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class AFj1qSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private final Executor areAllFieldsValid;
    private long component2;
    private final float[][] component3 = new float[2][];
    private final long[] component4 = new long[2];
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private double getRevenue;

    AFj1qSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.AFAdRevenueData = type;
        String name = sensor.getName();
        String str = BuildConfig.FLAVOR;
        name = name == null ? BuildConfig.FLAVOR : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.areAllFieldsValid = executorService;
    }

    private static double AFAdRevenueData(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i7 = 0; i7 < iMin; i7++) {
            dPow += StrictMath.pow(fArr[i7] - fArr2[i7], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public void E_(SensorEvent sensorEvent) {
        long j7 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component3;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component3[1] = fArrCopyOf;
            this.component4[1] = jCurrentTimeMillis;
            this.getRevenue = AFAdRevenueData(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j7 - this.component2) {
            this.component2 = j7;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = jCurrentTimeMillis;
                return;
            }
            double dAFAdRevenueData = AFAdRevenueData(fArr3, fArr);
            if (dAFAdRevenueData > this.getRevenue) {
                this.component3[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = jCurrentTimeMillis;
                this.getRevenue = dAFAdRevenueData;
            }
        }
    }

    private static List<Float> getRevenue(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1qSDK)) {
            return false;
        }
        AFj1qSDK aFj1qSDK = (AFj1qSDK) obj;
        return getMonetizationNetwork(aFj1qSDK.AFAdRevenueData, aFj1qSDK.getCurrencyIso4217Code, aFj1qSDK.getMonetizationNetwork);
    }

    final void getMonetizationNetwork(Map<AFj1qSDK, Map<String, Object>> map, boolean z7) {
        if (!getMonetizationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getRevenue());
            return;
        }
        map.put(this, getRevenue());
        if (z7) {
            int length = this.component3.length;
            for (int i7 = 0; i7 < length; i7++) {
                this.component3[i7] = null;
            }
            int length2 = this.component4.length;
            for (int i8 = 0; i8 < length2; i8++) {
                this.component4[i8] = 0;
            }
            this.getRevenue = 0.0d;
            this.component2 = 0L;
        }
    }

    public final int hashCode() {
        return this.getMediationNetwork;
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.areAllFieldsValid.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f13616d.E_(sensorEvent);
                }
            });
        } else {
            E_(sensorEvent);
        }
    }

    private Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFAdRevenueData));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component3[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.component3[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork(int i7, String str, String str2) {
        return this.AFAdRevenueData == i7 && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    private boolean getMonetizationNetwork() {
        return this.component3[0] != null;
    }
}
