package c6;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc6/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "lastReceivedTimestampMs", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationId {

    private final String notificationId;

    private final long lastReceivedTimestampMs;

    public NotificationId(String str, long j7) {
        Intrinsics.checkNotNullParameter(str, "notificationId");
        this.notificationId = str;
        this.lastReceivedTimestampMs = j7;
    }

    public final long getLastReceivedTimestampMs() {
        return this.lastReceivedTimestampMs;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationId)) {
            return false;
        }
        NotificationId notificationId = (NotificationId) other;
        return Intrinsics.b(this.notificationId, notificationId.notificationId) && this.lastReceivedTimestampMs == notificationId.lastReceivedTimestampMs;
    }

    public int hashCode() {
        return (this.notificationId.hashCode() * 31) + Long.hashCode(this.lastReceivedTimestampMs);
    }

    public String toString() {
        return "NotificationId(notificationId=" + this.notificationId + ", lastReceivedTimestampMs=" + this.lastReceivedTimestampMs + ")";
    }
}
