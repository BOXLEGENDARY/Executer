package androidx.room;

import Y0.m;
import Y0.s;
import Za.qhkq.dHkZSUxHu;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import c1.g;
import c1.k;
import com.github.luben.zstd.BuildConfig;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.C2556b;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 %2\u00020\u0001:\u000459)-BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b+\u0010*J\u000f\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u0010\u000fJ#\u00101\u001a\u00020\r2\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0000¢\u0006\u0004\b3\u0010\u001fJ\u000f\u00104\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\"\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010CR\u001a\u0010I\u001a\u00020D8GX\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010JR$\u0010Q\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010M\u001a\u0004\b>\u0010N\"\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010VR&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020Y0X8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010Z\u001a\u0004\bE\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010^R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010`R\u0014\u0010b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010`R\u001a\u0010f\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010d\u0012\u0004\be\u0010\u000f¨\u0006g"}, d2 = {"Landroidx/room/c;", BuildConfig.FLAVOR, "LY0/s;", "database", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "shadowTablesMap", BuildConfig.FLAVOR, "viewTables", BuildConfig.FLAVOR, "tableNames", "<init>", "(LY0/s;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", BuildConfig.FLAVOR, "l", "()V", "Lc1/g;", "db", BuildConfig.FLAVOR, "tableId", "s", "(Lc1/g;I)V", "r", "names", "o", "([Ljava/lang/String;)[Ljava/lang/String;", "LY0/c;", "autoCloser", "p", "(LY0/c;)V", "j", "(Lc1/g;)V", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "q", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Landroidx/room/c$c;", "observer", "c", "(Landroidx/room/c$c;)V", "n", BuildConfig.FLAVOR, "d", "()Z", "m", "tables", "k", "([Ljava/lang/String;)V", "u", "t", "a", "LY0/s;", "f", "()LY0/s;", "b", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "tableIdLookup", "e", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "LY0/c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Z", "initialized", "Lc1/k;", "Lc1/k;", "()Lc1/k;", "setCleanupStatement$room_runtime_release", "(Lc1/k;)V", "cleanupStatement", "Landroidx/room/c$b;", "Landroidx/room/c$b;", "observedTableTracker", "LY0/m;", "LY0/m;", "invalidationLiveDataContainer", "Lm/b;", "Landroidx/room/c$d;", "Lm/b;", "()Lm/b;", "observerMap", "Landroidx/room/d;", "Landroidx/room/d;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "refreshRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class c {

    public static final Companion INSTANCE = new Companion(null);

    private static final String[] f12053r = {"UPDATE", "DELETE", "INSERT"};

    private final s database;

    private final Map<String, String> shadowTablesMap;

    private final Map<String, Set<String>> viewTables;

    private final Map<String, Integer> tableIdLookup;

    private final String[] tablesNames;

    private Y0.c autoCloser;

    private final AtomicBoolean pendingRefresh;

    private volatile boolean initialized;

    private volatile k cleanupStatement;

    private final b observedTableTracker;

    private final m invalidationLiveDataContainer;

    private final C2556b<AbstractC0117c, d> observerMap;

    private androidx.room.d multiInstanceInvalidationClient;

    private final Object syncTriggersLock;

    private final Object trackerLock;

    public final Runnable refreshRunnable;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/room/c$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lc1/g;", "database", BuildConfig.FLAVOR, "a", "(Lc1/g;)V", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", BuildConfig.FLAVOR, "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.d1()) {
                database.f0();
            } else {
                database.p();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/room/c$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tableCount", "<init>", "(I)V", BuildConfig.FLAVOR, "tableIds", BuildConfig.FLAVOR, "b", "([I)Z", "c", BuildConfig.FLAVOR, "d", "()V", "a", "()[I", BuildConfig.FLAVOR, "[J", "getTableObservers", "()[J", "tableObservers", BuildConfig.FLAVOR, "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        private final long[] tableObservers;

        private final boolean[] triggerStates;

        private final int[] triggerStateChanges;

        private boolean needsSync;

        public b(int i7) {
            this.tableObservers = new long[i7];
            this.triggerStates = new boolean[i7];
            this.triggerStateChanges = new int[i7];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = i8 + 1;
                        int i10 = 1;
                        boolean z7 = jArr[i7] > 0;
                        boolean[] zArr = this.triggerStates;
                        if (z7 != zArr[i8]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z7) {
                                i10 = 2;
                            }
                            iArr[i8] = i10;
                        } else {
                            this.triggerStateChanges[i8] = 0;
                        }
                        zArr[i8] = z7;
                        i7++;
                        i8 = i9;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z7;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j7 = jArr[i7];
                        jArr[i7] = 1 + j7;
                        if (j7 == 0) {
                            this.needsSync = true;
                            z7 = true;
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        public final boolean c(int... tableIds) {
            boolean z7;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j7 = jArr[i7];
                        jArr[i7] = j7 - 1;
                        if (j7 == 1) {
                            this.needsSync = true;
                            z7 = true;
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                Unit unit = Unit.a;
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/c$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tables", "<init>", "([Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", BuildConfig.FLAVOR, "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AbstractC0117c {

        private final String[] tables;

        public AbstractC0117c(String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tables");
            this.tables = strArr;
        }

        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> tables);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/room/c$d;", BuildConfig.FLAVOR, "Landroidx/room/c$c;", "observer", BuildConfig.FLAVOR, "tableIds", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tableNames", "<init>", "(Landroidx/room/c$c;[I[Ljava/lang/String;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "invalidatedTablesIds", BuildConfig.FLAVOR, "b", "(Ljava/util/Set;)V", "tables", "c", "([Ljava/lang/String;)V", "a", "Landroidx/room/c$c;", "getObserver$room_runtime_release", "()Landroidx/room/c$c;", "[I", "()[I", "[Ljava/lang/String;", "d", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        private final AbstractC0117c observer;

        private final int[] tableIds;

        private final String[] tableNames;

        private final Set<String> singleTableSet;

        public d(AbstractC0117c abstractC0117c, int[] iArr, String[] strArr) {
            Intrinsics.checkNotNullParameter(abstractC0117c, "observer");
            Intrinsics.checkNotNullParameter(iArr, "tableIds");
            Intrinsics.checkNotNullParameter(strArr, "tableNames");
            this.observer = abstractC0117c;
            this.tableIds = iArr;
            this.tableNames = strArr;
            this.singleTableSet = !(strArr.length == 0) ? L.c(strArr[0]) : L.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void b(Set<Integer> invalidatedTablesIds) {
            Set<String> setD;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i7 = 0;
                if (length != 1) {
                    Set setB = L.b();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i8 = 0;
                    while (i7 < length2) {
                        int i9 = i8 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i7]))) {
                            setB.add(this.tableNames[i8]);
                        }
                        i7++;
                        i8 = i9;
                    }
                    setD = L.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : L.d();
                }
            } else {
                setD = L.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.observer.c(setD);
        }

        public final void c(String[] tables) {
            Set<String> setD;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.tableNames.length;
            if (length == 0) {
                setD = L.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        setD = L.d();
                        break;
                    } else {
                        if (StringsKt.r(tables[i7], this.tableNames[0], true)) {
                            setD = this.singleTableSet;
                            break;
                        }
                        i7++;
                    }
                }
            } else {
                Set setB = L.b();
                for (String str : tables) {
                    for (String str2 : this.tableNames) {
                        if (StringsKt.r(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = L.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.observer.c(setD);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/c$e", "Ljava/lang/Runnable;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "()Ljava/util/Set;", BuildConfig.FLAVOR, "run", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements Runnable {
        e() {
        }

        private final Set<Integer> a() {
            c cVar = c.this;
            Set setB = L.b();
            Cursor cursorA = s.A(cVar.getDatabase(), new c1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorA.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorA.getInt(0)));
                } finally {
                }
            }
            Unit unit = Unit.a;
            X9.c.a(cursorA, (Throwable) null);
            Set<Integer> setA = L.a(setB);
            if (!setA.isEmpty()) {
                k cleanupStatement = c.this.getCleanupStatement();
                String str = dHkZSUxHu.umzebcmBgSgL;
                if (cleanupStatement == null) {
                    throw new IllegalStateException(str);
                }
                k cleanupStatement2 = c.this.getCleanupStatement();
                if (cleanupStatement2 == null) {
                    throw new IllegalArgumentException(str);
                }
                cleanupStatement2.I();
            }
            return setA;
        }

        @Override
        public void run() {
            Set<Integer> setD;
            Y0.c cVar;
            Y0.c cVar2;
            Lock lockL = c.this.getDatabase().l();
            lockL.lock();
            try {
                try {
                } finally {
                    lockL.unlock();
                    cVar2 = c.this.autoCloser;
                    if (cVar2 != null) {
                        cVar2.e();
                    }
                }
            } catch (SQLiteException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                setD = L.d();
                lockL.unlock();
                cVar = c.this.autoCloser;
                if (cVar != null) {
                }
            } catch (IllegalStateException e8) {
                Log.e(dHkZSUxHu.gLduudqMYGRt, "Cannot run invalidation tracker. Is the db closed?", e8);
                setD = L.d();
                lockL.unlock();
                cVar = c.this.autoCloser;
                if (cVar != null) {
                }
            }
            if (!c.this.d()) {
                if (cVar2 != null) {
                    return;
                } else {
                    return;
                }
            }
            if (!c.this.getPendingRefresh().compareAndSet(true, false)) {
                lockL.unlock();
                Y0.c cVar3 = c.this.autoCloser;
                if (cVar3 != null) {
                    cVar3.e();
                    return;
                }
                return;
            }
            if (c.this.getDatabase().s()) {
                lockL.unlock();
                Y0.c cVar4 = c.this.autoCloser;
                if (cVar4 != null) {
                    cVar4.e();
                    return;
                }
                return;
            }
            g gVarO0 = c.this.getDatabase().n().o0();
            gVarO0.f0();
            try {
                setD = a();
                gVarO0.d0();
                lockL.unlock();
                cVar = c.this.autoCloser;
                if (cVar != null) {
                    cVar.e();
                }
                if (setD.isEmpty()) {
                    return;
                }
                C2556b<AbstractC0117c, d> c2556bG = c.this.g();
                c cVar5 = c.this;
                synchronized (c2556bG) {
                    try {
                        Iterator<Map.Entry<K, V>> it = cVar5.g().iterator();
                        while (it.hasNext()) {
                            ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                gVarO0.v0();
            }
        }
    }

    public c(s sVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(sVar, "database");
        Intrinsics.checkNotNullParameter(map, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(map2, "viewTables");
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        this.database = sVar;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new b(strArr.length);
        this.invalidationLiveDataContainer = new m(sVar);
        this.observerMap = new C2556b<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i7));
            String str2 = this.shadowTablesMap.get(strArr[i7]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i7] = lowerCase2;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, "US");
            String lowerCase3 = value.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(locale2, "US");
                String lowerCase4 = key.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, F.i(map3, lowerCase3));
            }
        }
        this.refreshRunnable = new e();
    }

    public final void l() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.d();
            k kVar = this.cleanupStatement;
            if (kVar != null) {
                kVar.close();
                Unit unit = Unit.a;
            }
        }
    }

    private final String[] o(String[] names) {
        Set setB = L.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                Intrinsics.checkNotNullExpressionValue(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.d(set);
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) L.a(setB).toArray(new String[0]);
    }

    private final void r(g db, int tableId) throws SQLException {
        db.z(YGBtcyQ.WgcfauOJq + tableId + ", 0)");
        String str = this.tablesNames[tableId];
        for (String str2 : f12053r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + INSTANCE.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + tableId + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            db.z(str3);
        }
    }

    private final void s(g db, int tableId) throws SQLException {
        String str = this.tablesNames[tableId];
        for (String str2 : f12053r) {
            String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            db.z(str3);
        }
    }

    public void c(AbstractC0117c observer) {
        d dVarL;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrO = o(observer.getTables());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrQ0 = CollectionsKt.q0(arrayList);
        d dVar = new d(observer, iArrQ0, strArrO);
        synchronized (this.observerMap) {
            dVarL = this.observerMap.l(observer, dVar);
        }
        if (dVarL == null && this.observedTableTracker.b(Arrays.copyOf(iArrQ0, iArrQ0.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.database.y()) {
            return false;
        }
        if (!this.initialized) {
            this.database.n().o0();
        }
        if (this.initialized) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k getCleanupStatement() {
        return this.cleanupStatement;
    }

    public final s getDatabase() {
        return this.database;
    }

    public final C2556b<AbstractC0117c, d> g() {
        return this.observerMap;
    }

    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> i() {
        return this.tableIdLookup;
    }

    public final void j(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.z("PRAGMA temp_store = MEMORY;");
            database.z("PRAGMA recursive_triggers='ON';");
            database.z("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.cleanupStatement = database.J("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.initialized = true;
            Unit unit = Unit.a;
        }
    }

    public final void k(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    AbstractC0117c abstractC0117c = (AbstractC0117c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0117c.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            Y0.c cVar = this.autoCloser;
            if (cVar != null) {
                cVar.j();
            }
            this.database.o().execute(this.refreshRunnable);
        }
    }

    public void n(AbstractC0117c observer) {
        d dVarM;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            dVarM = this.observerMap.m(observer);
        }
        if (dVarM != null) {
            b bVar = this.observedTableTracker;
            int[] tableIds = dVarM.getTableIds();
            if (bVar.c(Arrays.copyOf(tableIds, tableIds.length))) {
                t();
            }
        }
    }

    public final void p(Y0.c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.l(new Runnable() {
            @Override
            public final void run() {
                this.f8083d.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new androidx.room.d(context, name, serviceIntent, this, this.database.o());
    }

    public final void t() {
        if (this.database.y()) {
            u(this.database.n().o0());
        }
    }

    public final void u(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.V0()) {
            return;
        }
        try {
            Lock lockL = this.database.l();
            lockL.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] iArrA = this.observedTableTracker.a();
                    if (iArrA == null) {
                        return;
                    }
                    INSTANCE.a(database);
                    try {
                        int length = iArrA.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            int i9 = iArrA[i7];
                            int i10 = i8 + 1;
                            if (i9 == 1) {
                                r(database, i8);
                            } else if (i9 == 2) {
                                s(database, i8);
                            }
                            i7++;
                            i8 = i10;
                        }
                        database.d0();
                        database.v0();
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        database.v0();
                        throw th;
                    }
                }
            } finally {
                lockL.unlock();
            }
        } catch (SQLiteException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        } catch (IllegalStateException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        }
    }
}
