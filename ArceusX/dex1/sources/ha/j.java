package ha;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.p;
import androidx.core.content.a;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LL5/j;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)Ljava/util/Map;", "channelId", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    public static final j f2141a = new j();

    private j() {
    }

    public static final Map<String, String> a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map mapC = F.c();
        mapC.put("notifications_enabled", String.valueOf(p.b(context).a()));
        if (Build.VERSION.SDK_INT >= 33) {
            mapC.put("post_notifications_permission_granted", String.valueOf(a.a(context, "android.permission.POST_NOTIFICATIONS") == 0));
        }
        return F.b(mapC);
    }

    public static final Map<String, String> b(Context context, String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapC = F.c();
        Object systemService = context.getSystemService("notification");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
        if (notificationChannel != null) {
            mapC.put("channel_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() > 0));
            mapC.put("popup_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() >= 4));
            mapC.put("lock_screen_visible_" + channelId, String.valueOf(notificationChannel.getLockscreenVisibility() != -1));
            mapC.put("badge_enabled_" + channelId, String.valueOf(notificationChannel.canShowBadge()));
            mapC.put("sound_enabled_" + channelId, String.valueOf(notificationChannel.getSound() != null));
            mapC.put("vibration_enabled_" + channelId, String.valueOf(notificationChannel.shouldVibrate()));
        }
        return F.b(mapC);
    }
}
