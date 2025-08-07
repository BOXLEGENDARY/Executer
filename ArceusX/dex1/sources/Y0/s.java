package Y0;

import Z.tNT.PexNRiLSd;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import c1.h;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.C2522c;
import t4.gYZ.uCYQMIHsy;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b&\u0018\u0000 j2\u00020\u0001:\u0006?D'(53B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0005\u0012\u0004\u0012\u00020\u00160\u0015H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H$¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH$¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00180\u0015H\u0015¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00050$H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0017¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u000bH\u0017¢\u0006\u0004\b(\u0010\u0003J#\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0017¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u000bH\u0017¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u000bH\u0017¢\u0006\u0004\b7\u0010\u0003J\u0017\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u001e\u0010B\u001a\u0004\u0018\u0001088\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b?\u0010@\u0012\u0004\bA\u0010\u0003R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010ER\u0016\u0010I\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010HR\u001a\u0010L\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010J\u001a\u0004\bK\u0010!R\u0016\u0010N\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010MR\u0016\u0010O\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010MR$\u0010S\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010\u00188\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001d\u0010Q\u0012\u0004\bR\u0010\u0003RR\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0005\u0012\u0004\u0012\u00020\u00160T2\u001a\u0010U\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0005\u0012\u0004\u0012\u00020\u00160T8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b6\u0010V\u001a\u0004\bW\u0010#\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020b0a8G¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u0010eR#\u0010g\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010T8G¢\u0006\f\n\u0004\bK\u0010V\u001a\u0004\b^\u0010#R$\u0010i\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010VR\u0014\u0010l\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010kR\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010oR\u0017\u0010r\u001a\u00020<8G¢\u0006\f\u0012\u0004\bq\u0010\u0003\u001a\u0004\bp\u0010>R\u0014\u0010t\u001a\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010>¨\u0006u"}, d2 = {"LY0/s;", BuildConfig.FLAVOR, "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lc1/h;", "openHelper", "C", "(Ljava/lang/Class;Lc1/h;)Ljava/lang/Object;", BuildConfig.FLAVOR, "u", "v", "Ljava/util/concurrent/locks/Lock;", "l", "()Ljava/util/concurrent/locks/Lock;", "LY0/h;", "configuration", "t", "(LY0/h;)V", BuildConfig.FLAVOR, "LZ0/a;", "autoMigrationSpecs", BuildConfig.FLAVOR, "LZ0/b;", "j", "(Ljava/util/Map;)Ljava/util/List;", "config", "h", "(LY0/h;)Lc1/h;", "Landroidx/room/c;", "g", "()Landroidx/room/c;", "q", "()Ljava/util/Map;", BuildConfig.FLAVOR, "p", "()Ljava/util/Set;", "c", "d", "Lc1/j;", "query", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "z", "(Lc1/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", BuildConfig.FLAVOR, "sql", "Lc1/k;", "f", "(Ljava/lang/String;)Lc1/k;", "e", "i", "B", "Lc1/g;", "db", "w", "(Lc1/g;)V", BuildConfig.FLAVOR, "s", "()Z", "a", "Lc1/g;", "getMDatabase$annotations", "mDatabase", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "internalTransactionExecutor", "Lc1/h;", "internalOpenHelper", "Landroidx/room/c;", "m", "invalidationTracker", "Z", "allowMainThreadQueries", "writeAheadLoggingEnabled", "LY0/s$b;", "Ljava/util/List;", "getMCallbacks$annotations", "mCallbacks", BuildConfig.FLAVOR, "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "LY0/c;", "k", "LY0/c;", "autoCloser", "Ljava/lang/ThreadLocal;", BuildConfig.FLAVOR, "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "backingFieldMap", "n", "typeConverters", "o", "()Ljava/util/concurrent/Executor;", "queryExecutor", "r", "transactionExecutor", "()Lc1/h;", "y", "isOpenInternal$annotations", "isOpenInternal", "x", "isMainThread", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class s {

    protected volatile c1.g mDatabase;

    private Executor internalQueryExecutor;

    private Executor internalTransactionExecutor;

    private c1.h internalOpenHelper;

    private boolean allowMainThreadQueries;

    private boolean writeAheadLoggingEnabled;

    protected List<? extends b> mCallbacks;

    private c autoCloser;

    private final Map<String, Object> backingFieldMap;

    private final Map<Class<?>, Object> typeConverters;

    private final androidx.room.c invalidationTracker = g();

    private Map<Class<? extends Z0.a>, Z0.a> autoMigrationSpecs = new LinkedHashMap();

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020)0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0018\u0010,\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010@\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00103R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010$R\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"LY0/s$a;", "LY0/s;", "T", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", BuildConfig.FLAVOR, "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Lc1/h$c;", "factory", "f", "(Lc1/h$c;)LY0/s$a;", BuildConfig.FLAVOR, "LZ0/b;", "migrations", "b", "([LZ0/b;)LY0/s$a;", "c", "()LY0/s$a;", "Ljava/util/concurrent/Executor;", "executor", "g", "(Ljava/util/concurrent/Executor;)LY0/s$a;", "e", "LY0/s$b;", "callback", "a", "(LY0/s$b;)LY0/s$a;", "d", "()LY0/s;", "Landroid/content/Context;", "Ljava/lang/Class;", "Ljava/lang/String;", BuildConfig.FLAVOR, "Ljava/util/List;", "callbacks", "typeConverters", "LZ0/a;", "autoMigrationSpecs", "Ljava/util/concurrent/Executor;", "queryExecutor", "h", "transactionExecutor", "i", "Lc1/h$c;", BuildConfig.FLAVOR, "j", "Z", "allowMainThreadQueries", "LY0/s$d;", "k", "LY0/s$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "m", "requireMigration", "n", "allowDestructiveMigrationOnDowngrade", BuildConfig.FLAVOR, "o", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "p", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "LY0/s$e;", "q", "LY0/s$e;", "migrationContainer", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "r", "Ljava/util/Set;", "migrationsNotRequiredFrom", "s", "migrationStartAndEndVersions", "t", "copyFromAssetPath", "Ljava/io/File;", "u", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "v", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a<T extends s> {

        private final Context context;

        private final Class<T> klass;

        private final String name;

        private final List<b> callbacks;

        private final List<Object> typeConverters;

        private List<Z0.a> autoMigrationSpecs;

        private Executor queryExecutor;

        private Executor transactionExecutor;

        private h.c factory;

        private boolean allowMainThreadQueries;

        private d journalMode;

        private Intent multiInstanceInvalidationIntent;

        private boolean requireMigration;

        private boolean allowDestructiveMigrationOnDowngrade;

        private long autoCloseTimeout;

        private TimeUnit autoCloseTimeUnit;

        private final e migrationContainer;

        private Set<Integer> migrationsNotRequiredFrom;

        private Set<Integer> migrationStartAndEndVersions;

        private String copyFromAssetPath;

        private File copyFromFile;

        private Callable<InputStream> copyFromInputStream;

        public a(Context context, Class<T> cls, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cls, "klass");
            this.context = context;
            this.klass = cls;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = d.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        public a<T> a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public a<T> b(Z0.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Z0.b bVar : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                Intrinsics.d(set);
                set.add(Integer.valueOf(bVar.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                Intrinsics.d(set2);
                set2.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.b((Z0.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a<T> c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T d() {
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorF = C2522c.f();
                this.transactionExecutor = executorF;
                this.queryExecutor = executorF;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                Intrinsics.d(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException((uCYQMIHsy.KFh + iIntValue).toString());
                    }
                }
            }
            h.c xVar = this.factory;
            if (xVar == null) {
                xVar = new d1.f();
            }
            if (xVar != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j7 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    xVar = new Y0.e(xVar, new c(j7, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i7 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i8 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i7 + i8 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    xVar = new x(str, file, callable, xVar);
                }
            } else {
                xVar = null;
            }
            h.c cVar = xVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z7 = this.allowMainThreadQueries;
            d dVarF = this.journalMode.f(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Y0.h hVar = new Y0.h(context, str2, cVar, eVar, list, z7, dVarF, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs);
            T t7 = (T) r.b(this.klass, "_Impl");
            t7.t(hVar);
            return t7;
        }

        public a<T> e() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public a<T> f(h.c factory) {
            this.factory = factory;
            return this;
        }

        public a<T> g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LY0/s$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lc1/g;", "db", BuildConfig.FLAVOR, "a", "(Lc1/g;)V", "c", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public void a(c1.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void b(c1.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void c(c1.g db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u0007j\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LY0/s$d;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "Landroid/app/ActivityManager;", "activityManager", BuildConfig.FLAVOR, "e", "(Landroid/app/ActivityManager;)Z", "Landroid/content/Context;", "context", "f", "(Landroid/content/Context;)LY0/s$d;", "d", "i", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean e(ActivityManager activityManager) {
            return c1.c.b(activityManager);
        }

        public final d f(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || e(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00170\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"LY0/s$e;", BuildConfig.FLAVOR, "<init>", "()V", "LZ0/b;", "migration", BuildConfig.FLAVOR, "a", "(LZ0/b;)V", BuildConfig.FLAVOR, "result", BuildConfig.FLAVOR, "upgrade", BuildConfig.FLAVOR, "start", "end", BuildConfig.FLAVOR, "e", "(Ljava/util/List;ZII)Ljava/util/List;", BuildConfig.FLAVOR, "migrations", "b", "([LZ0/b;)V", BuildConfig.FLAVOR, "f", "()Ljava/util/Map;", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "c", "(II)Z", BuildConfig.FLAVOR, "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class e {

        private final Map<Integer, TreeMap<Integer, Z0.b>> migrations = new LinkedHashMap();

        private final void a(Z0.b migration) {
            int i7 = migration.startVersion;
            int i8 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Z0.b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i7);
            TreeMap<Integer, Z0.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Z0.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i8))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i8)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i8), migration);
        }

        private final java.util.List<Z0.b> e(java.util.List<Z0.b> r7, boolean r8, int r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: Y0.s.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(Z0.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Z0.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, Z0.b>> mapF = f();
            if (!mapF.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, Z0.b> mapH = mapF.get(Integer.valueOf(startVersion));
            if (mapH == null) {
                mapH = F.h();
            }
            return mapH.containsKey(Integer.valueOf(endVersion));
        }

        public List<Z0.b> d(int start, int end) {
            if (start == end) {
                return CollectionsKt.j();
            }
            return e(new ArrayList(), end > start, start, end);
        }

        public Map<Integer, Map<Integer, Z0.b>> f() {
            return this.migrations;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY0/s$f;", BuildConfig.FLAVOR, "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "it", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.l implements Function1<c1.g, Object> {
        g() {
            super(1);
        }

        public final Object invoke(c1.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "it");
            s.this.u();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc1/g;", "it", BuildConfig.FLAVOR, "a", "(Lc1/g;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<c1.g, Object> {
        h() {
            super(1);
        }

        public final Object invoke(c1.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "it");
            s.this.v();
            return null;
        }
    }

    public s() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static Cursor A(s sVar, c1.j jVar, CancellationSignal cancellationSignal, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            cancellationSignal = null;
        }
        return sVar.z(jVar, cancellationSignal);
    }

    private final <T> T C(Class<T> clazz, c1.h openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof i) {
            return (T) C(clazz, ((i) openHelper).getDelegate());
        }
        return null;
    }

    public final void u() {
        c();
        c1.g gVarO0 = n().o0();
        getInvalidationTracker().u(gVarO0);
        if (gVarO0.d1()) {
            gVarO0.f0();
        } else {
            gVarO0.p();
        }
    }

    public final void v() {
        n().o0().v0();
        if (s()) {
            return;
        }
        getInvalidationTracker().m();
    }

    public void B() {
        n().o0().d0();
    }

    public void c() {
        if (!this.allowMainThreadQueries && x()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!s() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException(sMlEMqrxoGI.AyElYXPq);
        }
    }

    public void e() {
        c();
        c cVar = this.autoCloser;
        if (cVar == null) {
            u();
        } else {
            cVar.g(new g());
        }
    }

    public c1.k f(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        c();
        d();
        return n().o0().J(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract c1.h h(Y0.h config);

    public void i() {
        c cVar = this.autoCloser;
        if (cVar == null) {
            v();
        } else {
            cVar.g(new h());
        }
    }

    public List<Z0.b> j(Map<Class<? extends Z0.a>, Z0.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.j();
    }

    public final Map<String, Object> k() {
        return this.backingFieldMap;
    }

    public final Lock l() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public c1.h n() {
        c1.h hVar = this.internalOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.v("internalOpenHelper");
        return null;
    }

    public Executor o() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.v(PexNRiLSd.RycoH);
        return null;
    }

    public Set<Class<? extends Z0.a>> p() {
        return L.d();
    }

    protected Map<Class<?>, List<Class<?>>> q() {
        return F.h();
    }

    public Executor r() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.v("internalTransactionExecutor");
        return null;
    }

    public boolean s() {
        return n().o0().V0();
    }

    public void t(Y0.h configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = h(configuration);
        Set<Class<? extends Z0.a>> setP = p();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends Z0.a>> it = setP.iterator();
        while (true) {
            int i7 = -1;
            if (it.hasNext()) {
                Class<? extends Z0.a> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i8 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i7 = size;
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size = i8;
                        }
                    }
                }
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i7));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i9 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i9 < 0) {
                            break;
                        } else {
                            size2 = i9;
                        }
                    }
                }
                for (Z0.b bVar : j(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.c(bVar.startVersion, bVar.endVersion)) {
                        configuration.migrationContainer.b(bVar);
                    }
                }
                w wVar = (w) C(w.class, n());
                if (wVar != null) {
                    wVar.j(configuration);
                }
                Y0.d dVar = (Y0.d) C(Y0.d.class, n());
                if (dVar != null) {
                    this.autoCloser = dVar.autoCloser;
                    getInvalidationTracker().p(dVar.autoCloser);
                }
                boolean z7 = configuration.journalMode == d.WRITE_AHEAD_LOGGING;
                n().setWriteAheadLoggingEnabled(z7);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new B(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z7;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().q(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> mapQ = q();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mapQ.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i10 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i10 < 0) {
                                    break;
                                } else {
                                    size3 = i10;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i11 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i11 < 0) {
                        return;
                    } else {
                        size4 = i11;
                    }
                }
            }
        }
    }

    protected void w(c1.g db) {
        Intrinsics.checkNotNullParameter(db, "db");
        getInvalidationTracker().j(db);
    }

    public final boolean x() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean y() {
        c1.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    public Cursor z(c1.j query, CancellationSignal signal) {
        Intrinsics.checkNotNullParameter(query, "query");
        c();
        d();
        return signal != null ? n().o0().K0(query, signal) : n().o0().X0(query);
    }
}
