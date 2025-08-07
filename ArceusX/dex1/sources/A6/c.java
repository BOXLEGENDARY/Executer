package a6;

import Y0.r;
import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.db.RobloxDatabase;
import ha.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"La6/c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "userId", "Lcom/roblox/client/db/RobloxDatabase;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lcom/roblox/client/db/RobloxDatabase;", "c", "b", "(Landroid/content/Context;)Lcom/roblox/client/db/RobloxDatabase;", BuildConfig.FLAVOR, "Ljava/util/Map;", "databaseMap", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    public static final c f8380a = new c();

    private static final Map<String, RobloxDatabase> databaseMap = new LinkedHashMap();

    private c() {
    }

    private final RobloxDatabase a(Context context, String userId) {
        return (RobloxDatabase) r.a(context, RobloxDatabase.class, "roblox-database-" + userId).e().d();
    }

    public final RobloxDatabase b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context, "default");
    }

    public final synchronized RobloxDatabase c(Context context, String userId) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userId, "userId");
            if (!q.h()) {
                return null;
            }
            Map<String, RobloxDatabase> map = databaseMap;
            RobloxDatabase robloxDatabase = map.get(userId);
            if (robloxDatabase == null) {
                synchronized (this) {
                    robloxDatabase = map.get(userId);
                    if (robloxDatabase == null) {
                        RobloxDatabase robloxDatabaseA = f8380a.a(context, userId);
                        map.put(userId, robloxDatabaseA);
                        robloxDatabase = robloxDatabaseA;
                    }
                }
            }
            return robloxDatabase;
        } finally {
        }
    }
}
