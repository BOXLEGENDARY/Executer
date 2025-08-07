package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import y0.xyyu.hkVlaTTCDY;

public class AFKeystoreWrapper {
    public KeyStore AFAdRevenueData;
    public Context getRevenue;
    public final Object getMonetizationNetwork = new Object();
    public String getMediationNetwork = BuildConfig.FLAVOR;
    public int getCurrencyIso4217Code = 0;

    public AFKeystoreWrapper(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.getRevenue = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFAdRevenueData = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e7) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e7);
        }
    }

    public static boolean getMediationNetwork(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final void getCurrencyIso4217Code(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMonetizationNetwork) {
                try {
                    if (this.AFAdRevenueData.containsAlias(str)) {
                        AFLogger.afInfoLog(hkVlaTTCDY.kwaQpiXyhEXU.concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th2.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th2);
        }
    }

    public final String getMonetizationNetwork() {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = this.getMediationNetwork;
        }
        return str;
    }

    public final boolean getRevenue() {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.getRevenue():boolean");
    }

    public final int getMediationNetwork() {
        int i7;
        synchronized (this.getMonetizationNetwork) {
            i7 = this.getCurrencyIso4217Code;
        }
        return i7;
    }

    public final String getCurrencyIso4217Code() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.getMonetizationNetwork) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.getMediationNetwork);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.getCurrencyIso4217Code);
        }
        return sb.toString();
    }
}
