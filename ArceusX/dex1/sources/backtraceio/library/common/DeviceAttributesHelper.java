package backtraceio.library.common;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import backtraceio.library.enums.BatteryState;
import backtraceio.library.enums.BluetoothStatus;
import backtraceio.library.enums.GpsStatus;
import backtraceio.library.enums.LocationStatus;
import backtraceio.library.enums.NfcStatus;
import backtraceio.library.enums.WifiStatus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class DeviceAttributesHelper {
    private static String uuid;
    private final Context context;

    public DeviceAttributesHelper(Context context) {
        this.context = context;
    }

    private String generateDeviceId() {
        if (!BacktraceStringHelper.isNullOrEmpty(uuid)) {
            return uuid;
        }
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        String string2 = TextUtils.isEmpty(string) ? UUID.randomUUID().toString() : UUID.nameUUIDFromBytes(string.getBytes()).toString();
        uuid = string2;
        return string2;
    }

    private String getAppUsedStorageSize() {
        long jFreeMemory;
        try {
            Runtime runtime = Runtime.getRuntime();
            jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        } catch (Exception e7) {
            e7.printStackTrace();
            jFreeMemory = -1;
        }
        return Long.toString(jFreeMemory);
    }

    private float getBatteryLevel() {
        if (this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return -1.0f;
        }
        return r0.getIntExtra("level", -1) / r0.getIntExtra("scale", -1);
    }

    private BatteryState getBatteryState() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return BatteryState.UNKNOWN;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra != 2 ? intExtra != 4 ? intExtra != 5 ? BatteryState.UNKNOWN : BatteryState.FULL : BatteryState.UNPLUGGED : BatteryState.CHARGING;
    }

    private float getCpuTemperature() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/thermal/thermal_zone0/temp"));
            String line = bufferedReader.readLine();
            if (line == null) {
                return 0.0f;
            }
            bufferedReader.close();
            return Float.parseFloat(line) / 1000.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    private GpsStatus getGpsStatus() {
        return ((LocationManager) this.context.getSystemService("location")).isProviderEnabled("gps") ? GpsStatus.ENABLED : GpsStatus.DISABLED;
    }

    private LocationStatus getLocationServiceStatus() {
        return Settings.Secure.getInt(this.context.getContentResolver(), "location_mode", 0) != 0 ? LocationStatus.ENABLED : LocationStatus.DISABLED;
    }

    private ActivityManager.MemoryInfo getMemoryInformation() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private NfcStatus getNfcStatus() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.context);
        return defaultAdapter == null ? NfcStatus.NOT_AVAILABLE : !defaultAdapter.isEnabled() ? NfcStatus.DISABLED : NfcStatus.ENABLED;
    }

    private WifiStatus getWifiStatus() {
        return !PermissionHelper.isPermissionForAccessWifiStateGranted(this.context) ? WifiStatus.NOT_PERMITTED : ((WifiManager) this.context.getApplicationContext().getSystemService("wifi")).isWifiEnabled() ? WifiStatus.ENABLED : WifiStatus.DISABLED;
    }

    private boolean isAirplaneModeOn() {
        return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private BluetoothStatus isBluetoothEnabled() {
        BluetoothAdapter adapter;
        if (!PermissionHelper.isPermissionForBluetoothGranted(this.context)) {
            return BluetoothStatus.NOT_PERMITTED;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
        return (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || !adapter.isEnabled()) ? BluetoothStatus.DISABLED : BluetoothStatus.ENABLED;
    }

    private boolean isPowerSavingMode() {
        return ((PowerManager) this.context.getSystemService("power")).isPowerSaveMode();
    }

    public HashMap<String, String> getDeviceAttributes(Boolean bool) {
        HashMap<String, String> map = new HashMap<>();
        map.put("guid", generateDeviceId());
        map.put("uname.sysname", "Android");
        map.put("uname.machine", System.getProperty("os.arch"));
        if (!bool.booleanValue()) {
            return map;
        }
        map.put("device.airplane_mode", String.valueOf(isAirplaneModeOn()));
        map.put("device.location", getLocationServiceStatus().toString());
        map.put("device.nfc.status", getNfcStatus().toString());
        map.put("device.gps.enabled", getGpsStatus().toString());
        map.put("device.bluetooth_status", isBluetoothEnabled().toString());
        map.put("device.cpu.temperature", String.valueOf(getCpuTemperature()));
        map.put("device.is_power_saving_mode", String.valueOf(isPowerSavingMode()));
        map.put("device.wifi.status", getWifiStatus().toString());
        map.put("app.storage_used", getAppUsedStorageSize());
        map.put("battery.level", String.valueOf(getBatteryLevel()));
        map.put("battery.state", getBatteryState().toString());
        map.put("cpu.boottime", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        ActivityManager.MemoryInfo memoryInformation = getMemoryInformation();
        map.put("system.memory.total", Long.toString(memoryInformation.totalMem));
        map.put("system.memory.free", Long.toString(memoryInformation.availMem));
        map.put("system.memory.active", Long.toString(memoryInformation.totalMem - memoryInformation.availMem));
        return map;
    }
}
