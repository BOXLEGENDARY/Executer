package com.appsflyer.internal;

import K0.wJ.BtcVLuo;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\f\u0010\u0011J\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0018R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFc1eSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "p2", "<init>", "([BLjava/util/Map;I)V", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()Z", "Ljava/net/HttpURLConnection;", "AFAdRevenueData", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "(Ljava/net/HttpURLConnection;J)Z", "getRevenue", "[B", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1kSDK;", "()Lcom/appsflyer/internal/AFd1kSDK;", "getMediationNetwork", "Ljava/util/Map;", "Z", "I", "()Ljava/lang/String;", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFc1eSDK {

    public int getRevenue;

    private final boolean AFAdRevenueData;

    public Map<String, String> getCurrencyIso4217Code;

    public byte[] getMonetizationNetwork;

    public AFc1eSDK(byte[] bArr, Map<String, String> map, int i7) {
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.getRevenue = i7;
        this.AFAdRevenueData = true;
    }

    private final boolean AFAdRevenueData(HttpURLConnection httpURLConnection, long j7) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.getMonetizationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        String currencyIso4217Code = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getRevenue);
        httpURLConnection.setConnectTimeout(this.getRevenue);
        httpURLConnection.addRequestProperty("Content-Type", getGetMediationNetwork().getRevenue);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMonetizationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, BuildConfig.FLAVOR);
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMonetizationNetwork);
        bufferedOutputStream.close();
        String strAFAdRevenueData = AFAdRevenueData(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + strAFAdRevenueData + "\n\ttook " + jCurrentTimeMillis + "ms";
        String currencyIso4217Code2 = getCurrencyIso4217Code("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getAFAdRevenueData()) {
            AFLogger.afRDLog(currencyIso4217Code2);
        } else {
            AFLogger.afVerboseLog(currencyIso4217Code2);
        }
        return AFd1xSDK.getMediationNetwork(httpURLConnection);
    }

    public abstract AFd1kSDK getGetMediationNetwork();

    public abstract String getCurrencyIso4217Code(String str);

    public final boolean getCurrencyIso4217Code() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String mediationNetwork = getMediationNetwork();
            Intrinsics.checkNotNullParameter(mediationNetwork, BuildConfig.FLAVOR);
            URLConnection uRLConnectionOpenConnection = new URL(mediationNetwork).openConnection();
            Intrinsics.e(uRLConnectionOpenConnection, BuildConfig.FLAVOR);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean zAFAdRevenueData = AFAdRevenueData(httpURLConnection2, jCurrentTimeMillis);
                if (httpURLConnection2 == null) {
                    return zAFAdRevenueData;
                }
                httpURLConnection2.disconnect();
                return zAFAdRevenueData;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String currencyIso4217Code = getCurrencyIso4217Code(BtcVLuo.wkblGoNjsbN + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getAFAdRevenueData()) {
                        AFLogger.afRDLog(currencyIso4217Code);
                    } else {
                        AFLogger.afVerboseLog(currencyIso4217Code);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th2) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public abstract String getMediationNetwork();

    public boolean getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    private static String AFAdRevenueData(HttpURLConnection p02) throws IOException {
        InputStream errorStream;
        try {
            errorStream = p02.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.HTTP_CLIENT;
            String message = th.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, message, th, false, false, false, false, 96, null);
            errorStream = p02.getErrorStream();
        }
        if (errorStream == null) {
            return BuildConfig.FLAVOR;
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, BuildConfig.FLAVOR);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        String strU = CollectionsKt.U(X9.n.e(bufferedReader), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        bufferedReader.close();
        return strU == null ? BuildConfig.FLAVOR : strU;
    }
}
