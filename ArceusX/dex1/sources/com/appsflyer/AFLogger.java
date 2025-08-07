package com.appsflyer;

import P9.h;
import P9.i;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.room.kU.HguUe;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFh1zSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0019J#\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u001dJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010 J+\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010 J3\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010!J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010$\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b&\u0010%J'\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+JG\u0010.\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010+J'\u00101\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010+J'\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010+J\u001f\u00103\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\u0001058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u0019\u00106\u001a\u0006*\u000209098BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b8\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1gSDK;", "<init>", "()V", BuildConfig.FLAVOR, "logMessage", BuildConfig.FLAVOR, "shouldRemoteDebug", BuildConfig.FLAVOR, "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", "message", BuildConfig.FLAVOR, "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", BuildConfig.FLAVOR, "client", "registerClient", "([Lcom/appsflyer/internal/AFg1gSDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFh1zSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;)V", BuildConfig.FLAVOR, "getRevenue", "LP9/h;", "getCurrencyIso4217Code", "Ljava/util/concurrent/ExecutorService;", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFLogger extends AFg1gSDK {
    public static final AFLogger INSTANCE = new AFLogger();

    public static final h getCurrencyIso4217Code = i.b(AnonymousClass10.getRevenue);

    public static final h getRevenue = i.b(AnonymousClass1.getCurrencyIso4217Code);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMediationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function0<ExecutorService> {
        public static final AnonymousClass1 getCurrencyIso4217Code = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFg1gSDK;", BuildConfig.FLAVOR, "AFAdRevenueData", "()Ljava/util/Set;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass10 extends l implements Function0<Set<AFg1gSDK>> {
        public static final AnonymousClass10 getRevenue = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        public final Set<AFg1gSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends l implements Function1<AFg1gSDK, Unit> {
        public boolean $getCurrencyIso4217Code;
        public AFh1zSDK $getMonetizationNetwork;
        public String $getRevenue;

        public AnonymousClass2(AFh1zSDK aFh1zSDK, String str, boolean z7) {
            super(1);
            this.$getMonetizationNetwork = aFh1zSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = z7;
        }

        public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, KwdswzaUHE.cTzDPRicomuc);
            aFg1gSDK.i(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
        }

        public final Object invoke(Object obj) {
            getCurrencyIso4217Code((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends l implements Function1<AFg1gSDK, Unit> {
        public String $AFAdRevenueData;
        public AFh1zSDK $getCurrencyIso4217Code;

        public AnonymousClass3(AFh1zSDK aFh1zSDK, String str) {
            super(1);
            this.$getCurrencyIso4217Code = aFh1zSDK;
            this.$AFAdRevenueData = str;
        }

        public final void AFAdRevenueData(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, BuildConfig.FLAVOR);
            aFg1gSDK.force(this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        public final Object invoke(Object obj) {
            AFAdRevenueData((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "getRevenue", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends l implements Function1<AFg1gSDK, Unit> {
        public AFh1zSDK $AFAdRevenueData;
        public boolean $component3;
        public boolean $component4;
        public boolean $getCurrencyIso4217Code;
        public Throwable $getMediationNetwork;
        public String $getMonetizationNetwork;
        public boolean $getRevenue;

        public AnonymousClass4(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
            super(1);
            this.$AFAdRevenueData = aFh1zSDK;
            this.$getMonetizationNetwork = str;
            this.$getMediationNetwork = th;
            this.$getRevenue = z7;
            this.$getCurrencyIso4217Code = z8;
            this.$component4 = z9;
            this.$component3 = z10;
        }

        public final void getRevenue(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, BuildConfig.FLAVOR);
            aFg1gSDK.e(this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code, this.$component4, this.$component3);
        }

        public final Object invoke(Object obj) {
            getRevenue((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "getRevenue", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends l implements Function1<AFg1gSDK, Unit> {
        public AFh1zSDK $AFAdRevenueData;
        public boolean $getCurrencyIso4217Code;
        public String $getMediationNetwork;

        public AnonymousClass5(AFh1zSDK aFh1zSDK, String str, boolean z7) {
            super(1);
            this.$AFAdRevenueData = aFh1zSDK;
            this.$getMediationNetwork = str;
            this.$getCurrencyIso4217Code = z7;
        }

        public final void getRevenue(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, BuildConfig.FLAVOR);
            aFg1gSDK.d(this.$AFAdRevenueData, this.$getMediationNetwork, this.$getCurrencyIso4217Code);
        }

        public final Object invoke(Object obj) {
            getRevenue((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass6 extends l implements Function1<AFg1gSDK, Unit> {
        public String $AFAdRevenueData;
        public AFh1zSDK $getMediationNetwork;
        public boolean $getMonetizationNetwork;

        public AnonymousClass6(AFh1zSDK aFh1zSDK, String str, boolean z7) {
            super(1);
            this.$getMediationNetwork = aFh1zSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = z7;
        }

        public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, BuildConfig.FLAVOR);
            aFg1gSDK.v(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        public final Object invoke(Object obj) {
            getCurrencyIso4217Code((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", "p0", BuildConfig.FLAVOR, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFg1gSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass8 extends l implements Function1<AFg1gSDK, Unit> {
        public AFh1zSDK $getCurrencyIso4217Code;
        public boolean $getMonetizationNetwork;
        public String $getRevenue;

        public AnonymousClass8(AFh1zSDK aFh1zSDK, String str, boolean z7) {
            super(1);
            this.$getCurrencyIso4217Code = aFh1zSDK;
            this.$getRevenue = str;
            this.$getMonetizationNetwork = z7;
        }

        public final void getMonetizationNetwork(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, BuildConfig.FLAVOR);
            aFg1gSDK.w(this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMonetizationNetwork);
        }

        public final Object invoke(Object obj) {
            getMonetizationNetwork((AFg1gSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        public final int level;

        LogLevel(int i7) {
            this.level = i7;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, BuildConfig.FLAVOR);
        INSTANCE.d(AFh1zSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(ex, BuildConfig.FLAVOR);
        AFg1gSDK.e$default(INSTANCE, AFh1zSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Y(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str, ex, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, BuildConfig.FLAVOR);
        INSTANCE.i(AFh1zSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    public static final void afLogForce(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, BuildConfig.FLAVOR);
        INSTANCE.force(AFh1zSDK.OTHER, logMessage);
    }

    public static final void afRDLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, BuildConfig.FLAVOR);
        INSTANCE.v(AFh1zSDK.OTHER, rdLogMessage, true);
    }

    public static final void afVerboseLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, BuildConfig.FLAVOR);
        INSTANCE.v(AFh1zSDK.OTHER, rdLogMessage, false);
    }

    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, BuildConfig.FLAVOR);
        INSTANCE.w(AFh1zSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    public static final void getCurrencyIso4217Code(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, BuildConfig.FLAVOR);
        h hVar = getCurrencyIso4217Code;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        synchronized (((Set) value)) {
            Object value2 = hVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, BuildConfig.FLAVOR);
            ((Set) value2).removeAll(kotlin.collections.i.S(aFg1gSDKArr));
            Unit unit = Unit.a;
        }
    }

    public static final void getMonetizationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, BuildConfig.FLAVOR);
        h hVar = getCurrencyIso4217Code;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        synchronized (((Set) value)) {
            Object value2 = hVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, BuildConfig.FLAVOR);
            CollectionsKt.z((Set) value2, aFg1gSDKArr);
            Unit unit = Unit.a;
        }
    }

    @Override
    public final void d(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass5(tag, msg, shouldRemoteDebug)));
    }

    @Override
    public final void e(AFh1zSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(throwable, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass4(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug)));
    }

    @Override
    public final void force(AFh1zSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass3(tag, msg)));
    }

    @Override
    public final void i(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass2(tag, msg, shouldRemoteDebug)));
    }

    public final void registerClient(final AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() {
            @Override
            public final void run() {
                AFLogger.getMonetizationNetwork(client);
            }
        });
    }

    public final void unregisterClient(final AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() {
            @Override
            public final void run() {
                AFLogger.getCurrencyIso4217Code(client);
            }
        });
    }

    @Override
    public final void v(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass6(tag, msg, shouldRemoteDebug)));
    }

    @Override
    public final void w(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass8(tag, msg, shouldRemoteDebug)));
    }

    public static final void afDebugLog(String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, BuildConfig.FLAVOR);
        INSTANCE.d(AFh1zSDK.OTHER, debugLogMessage, true);
    }

    public static final void afInfoLog(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, BuildConfig.FLAVOR);
        INSTANCE.i(AFh1zSDK.OTHER, logMessage, true);
    }

    public static final void afWarnLog(String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, HguUe.jHVDZxrAEh);
        AFg1gSDK.w$default(INSTANCE, AFh1zSDK.OTHER, warningLogMessage, false, 4, null);
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Y(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str, ex, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
    }

    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Y(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    public static final void getCurrencyIso4217Code(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        h hVar = getCurrencyIso4217Code;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        synchronized (((Set) value)) {
            try {
                Object value2 = hVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, BuildConfig.FLAVOR);
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1gSDK) it.next());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Y(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        if (errorLogMessage == null || StringsKt.Y(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
