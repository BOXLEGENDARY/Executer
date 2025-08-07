package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k0.BAKp.xAQOwX;
import org.json.JSONObject;

public final class AFj1hSDK {
    private static String AFAdRevenueData(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String getCurrencyIso4217Code(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFAdRevenueData(messageDigest.digest());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Error turning data to SHA-256 string", e7);
            return null;
        }
    }

    public static byte[] getMediationNetwork(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e7) {
            AFLogger.afErrorLog(xAQOwX.MQN, e7);
            return null;
        }
    }

    public static long getMonetizationNetwork(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
    }

    public static String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFAdRevenueData(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7, true);
            return e7.getMessage();
        }
    }

    public static boolean AFAdRevenueData(Map<String, Object> map, String[] strArr, AFc1kSDK aFc1kSDK) throws IllegalStateException {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String strAreAllFieldsValid = AFc1kSDK.areAllFieldsValid();
        StringBuilder sb = new StringBuilder();
        sb.append(new JSONObject(map));
        sb.append(strAreAllFieldsValid);
        return AFAdRevenueData(sb.toString(), AFb1kSDK.getMonetizationNetwork(aFc1kSDK.getRevenue)).equals(str2);
    }
}
