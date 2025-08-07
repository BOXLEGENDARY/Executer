package Y0;

import Y0.s;
import android.content.Context;
import android.content.Intent;
import c1.h;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u00104R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u00104R\u0014\u0010J\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00106¨\u0006K"}, d2 = {"LY0/h;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "Lc1/h$c;", "sqliteOpenHelperFactory", "LY0/s$e;", "migrationContainer", BuildConfig.FLAVOR, "LY0/s$b;", "callbacks", BuildConfig.FLAVOR, "allowMainThreadQueries", "LY0/s$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "LY0/s$f;", "prepackagedDatabaseCallback", "typeConverters", "LZ0/a;", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lc1/h$c;LY0/s$e;Ljava/util/List;ZLY0/s$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LY0/s$f;Ljava/util/List;Ljava/util/List;)V", "fromVersion", "toVersion", "a", "(II)Z", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lc1/h$c;", "d", "LY0/s$e;", "e", "Ljava/util/List;", "f", "Z", "g", "LY0/s$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "multiInstanceInvalidation", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class h {

    public final Context context;

    public final String name;

    public final h.c sqliteOpenHelperFactory;

    public final s.e migrationContainer;

    public final List<s.b> callbacks;

    public final boolean allowMainThreadQueries;

    public final s.d journalMode;

    public final Executor queryExecutor;

    public final Executor transactionExecutor;

    public final Intent multiInstanceInvalidationServiceIntent;

    public final boolean requireMigration;

    public final boolean allowDestructiveMigrationOnDowngrade;

    private final Set<Integer> migrationNotRequiredFrom;

    public final String copyFromAssetPath;

    public final File copyFromFile;

    public final Callable<InputStream> copyFromInputStream;

    public final List<Object> typeConverters;

    public final List<Z0.a> autoMigrationSpecs;

    public final boolean multiInstanceInvalidation;

    public h(Context context, String str, h.c cVar, s.e eVar, List<? extends s.b> list, boolean z7, s.d dVar, Executor executor, Executor executor2, Intent intent, boolean z8, boolean z9, Set<Integer> set, String str2, File file, Callable<InputStream> callable, s.f fVar, List<? extends Object> list2, List<? extends Z0.a> list3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(eVar, "migrationContainer");
        Intrinsics.checkNotNullParameter(dVar, "journalMode");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        Intrinsics.checkNotNullParameter(executor2, "transactionExecutor");
        Intrinsics.checkNotNullParameter(list2, "typeConverters");
        Intrinsics.checkNotNullParameter(list3, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = cVar;
        this.migrationContainer = eVar;
        this.callbacks = list;
        this.allowMainThreadQueries = z7;
        this.journalMode = dVar;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z8;
        this.allowDestructiveMigrationOnDowngrade = z9;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.typeConverters = list2;
        this.autoMigrationSpecs = list3;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean a(int fromVersion, int toVersion) {
        if ((fromVersion > toVersion && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        return set == null || !set.contains(Integer.valueOf(fromVersion));
    }
}
