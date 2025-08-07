package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "p1", "p2", BuildConfig.FLAVOR, "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getMonetizationNetwork", "()Lorg/json/JSONObject;", "AFAdRevenueData", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "Ljava/lang/String;", "getCurrencyIso4217Code", "getRevenue", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExceptionInfo {

    public static final Companion INSTANCE = new Companion(null);

    public String label;

    int counter;

    final String hashName;

    public String stackTrace;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1tSDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1cSDK;", "getMonetizationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1cSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean getMediationNetwork(Integer p02, String... p1) {
            boolean z7 = p02 == null;
            int length = p1.length;
            for (int i7 = 0; i7 < 3; i7++) {
                String str = p1[i7];
                z7 = z7 || str == null || str.length() == 0;
            }
            return z7;
        }

        public static ExceptionInfo getMonetizationNetwork(String p02) {
            Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
            List<String> listSplit$default = StringsKt.split$default(p02, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String monetizationNetwork = null;
            String monetizationNetwork2 = null;
            String monetizationNetwork3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (StringsKt.F(str, "label=", false, 2, (Object) null)) {
                    monetizationNetwork = getMonetizationNetwork(str, "label=");
                } else if (StringsKt.F(str, "hashName=", false, 2, (Object) null)) {
                    monetizationNetwork2 = getMonetizationNetwork(str, "hashName=");
                } else if (!StringsKt.F(str, "stackTrace=", false, 2, (Object) null)) {
                    if (!StringsKt.F(str, sMlEMqrxoGI.BebrGAdC, false, 2, (Object) null)) {
                        break;
                    }
                    String strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.Q0(strSubstring).toString()));
                } else {
                    monetizationNetwork3 = getMonetizationNetwork(str, "stackTrace=");
                }
            }
            if (getMediationNetwork(numValueOf, monetizationNetwork, monetizationNetwork2, monetizationNetwork3)) {
                return null;
            }
            Intrinsics.d(monetizationNetwork);
            Intrinsics.d(monetizationNetwork2);
            Intrinsics.d(monetizationNetwork3);
            Intrinsics.d(numValueOf);
            return new ExceptionInfo(monetizationNetwork, monetizationNetwork2, monetizationNetwork3, numValueOf.intValue());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String getMonetizationNetwork(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            String string = StringsKt.Q0(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, BuildConfig.FLAVOR);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(bytes, BuildConfig.FLAVOR);
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, BuildConfig.FLAVOR);
            return new String(bArrDecode, charset);
        }
    }

    public ExceptionInfo(String str, String str2, String str3, int i7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i7;
    }

    public final String AFAdRevenueData() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, BuildConfig.FLAVOR);
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, BuildConfig.FLAVOR);
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p02;
        return Intrinsics.b(this.label, exceptionInfo.label) && Intrinsics.b(this.hashName, exceptionInfo.hashName) && Intrinsics.b(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    public final JSONObject getMonetizationNetwork() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put("st", this.stackTrace);
        jSONObject.put("c", String.valueOf(this.counter));
        return jSONObject;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + Integer.hashCode(this.counter);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }

    public ExceptionInfo(String str, String str2, String str3, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i8 & 8) != 0 ? 1 : i7);
    }
}
