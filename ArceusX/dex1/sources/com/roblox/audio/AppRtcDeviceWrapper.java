package com.roblox.audio;

import android.util.Log;
import androidx.room.kU.HguUe;
import com.roblox.audio.a;
import java.util.Set;

public class AppRtcDeviceWrapper {
    private static final String TAG = "AppRtcDeviceWrapper";
    private final a audioManagerEvents;
    private final long nativeReference;

    private class a implements a.b {
        @Override
        public void a(a.EnumC0174a enumC0174a, Set<a.EnumC0174a> set) {
            Log.d(AppRtcDeviceWrapper.TAG, "onAudioDeviceChanged: selectedAudioDevice: " + enumC0174a.toString());
            Log.d(AppRtcDeviceWrapper.TAG, "Placeholder until Log Audio State is implemented.");
            AppRtcDeviceWrapper.this.nativeAudioDeviceChanged(enumC0174a.ordinal(), AppRtcDeviceWrapper.this.nativeReference);
        }

        private a() {
        }
    }

    public AppRtcDeviceWrapper(long j7) {
        this.nativeReference = j7;
        Log.d(TAG, "ctor AppRtcDeviceWrapper");
        if (com.roblox.audio.a.d()) {
            this.audioManagerEvents = new a();
        } else {
            this.audioManagerEvents = null;
        }
    }

    public native void nativeAudioDeviceChanged(int i7, long j7);

    public int getSelectedAudioDeviceAsInt() {
        if (com.roblox.audio.a.d()) {
            return com.roblox.audio.a.b().c().ordinal();
        }
        Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
        return a.EnumC0174a.NONE.ordinal();
    }

    public String getSelectedAudioDeviceName() {
        if (com.roblox.audio.a.d()) {
            a.EnumC0174a enumC0174aC = com.roblox.audio.a.b().c();
            return enumC0174aC == a.EnumC0174a.SPEAKER_PHONE ? "Android Audio (Speaker)" : enumC0174aC == a.EnumC0174a.WIRED_HEADSET ? "Android Audio (Wired Device)" : enumC0174aC == a.EnumC0174a.EARPIECE ? "Android Audio (Earpiece)" : enumC0174aC == a.EnumC0174a.BLUETOOTH ? "Android Audio (Bluetooth)" : "Android Audio (NONE)";
        }
        Log.d(TAG, "Warning: Native AppRtcDeviceWrapper invoked with invalid AppRtcAudioManager");
        return "INVALID INSTANCE";
    }

    public boolean isValid() {
        return com.roblox.audio.a.d();
    }

    public void wrapSetCommunicationMute(boolean z7) {
        Log.d(TAG, "setMicrophoneMute(" + z7 + ")");
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().g(z7);
        }
    }

    public void wrapStartCommunication() {
        Log.d(TAG, HguUe.OIqEzPpbwcCWhCx);
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().i(this.audioManagerEvents);
        }
    }

    public void wrapStopCommunication() {
        Log.d(TAG, "stopCommunication()");
        if (com.roblox.audio.a.d()) {
            com.roblox.audio.a.b().j();
        }
    }
}
