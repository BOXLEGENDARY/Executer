package com.appsflyer.internal;

import U.Gw.oeVkjmfPcLbWm;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.appsflyer.AFLogger;
import ka.oik.UJEa;
import z3.AdxZ.bpTQi;

@Deprecated
public final class AFa1ySDK {
    private final AFa1tSDK getRevenue = new AFa1tSDK() {
        @Override
        public final Class<?> getMediationNetwork(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    interface AFa1tSDK {
        Class<?> getMediationNetwork(String str) throws ClassNotFoundException;
    }

    enum AFa1zSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA(oeVkjmfPcLbWm.XWxEwGe, "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT(UJEa.SaibuJjzFrzDolQ, "com.tns.NativeScriptActivity"),
        EXPO("android_expo", bpTQi.PhX),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE(KwdswzaUHE.lSkEXreWzlnc, "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        final String AFAdRevenueData;
        final String getMonetizationNetwork;

        AFa1zSDK(String str, String str2) {
            this.AFAdRevenueData = str;
            this.getMonetizationNetwork = str2;
        }
    }

    private boolean getMonetizationNetwork(String str) {
        try {
            this.getRevenue.getMediationNetwork(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e7) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e7, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String getMediationNetwork() {
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (getMonetizationNetwork(aFa1zSDK.getMonetizationNetwork)) {
                return aFa1zSDK.AFAdRevenueData;
            }
        }
        return AFa1zSDK.DEFAULT.AFAdRevenueData;
    }
}
