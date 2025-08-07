package c6;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJT\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lc6/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "serializedEvent", "eventName", "eventContext", "serializedParams", "retryAttemptCount", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lc6/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "Ljava/lang/String;", "g", "c", "d", "h", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticEvent {

    private final int id;

    private final String serializedEvent;

    private final String eventName;

    private final String eventContext;

    private final String serializedParams;

    private final Integer retryAttemptCount;

    public AnalyticEvent(int i7, String str, String str2, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "serializedEvent");
        this.id = i7;
        this.serializedEvent = str;
        this.eventName = str2;
        this.eventContext = str3;
        this.serializedParams = str4;
        this.retryAttemptCount = num;
    }

    public static AnalyticEvent b(AnalyticEvent analyticEvent, int i7, String str, String str2, String str3, String str4, Integer num, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = analyticEvent.id;
        }
        if ((i8 & 2) != 0) {
            str = analyticEvent.serializedEvent;
        }
        String str5 = str;
        if ((i8 & 4) != 0) {
            str2 = analyticEvent.eventName;
        }
        String str6 = str2;
        if ((i8 & 8) != 0) {
            str3 = analyticEvent.eventContext;
        }
        String str7 = str3;
        if ((i8 & 16) != 0) {
            str4 = analyticEvent.serializedParams;
        }
        String str8 = str4;
        if ((i8 & 32) != 0) {
            num = analyticEvent.retryAttemptCount;
        }
        return analyticEvent.a(i7, str5, str6, str7, str8, num);
    }

    public final AnalyticEvent a(int id, String serializedEvent, String eventName, String eventContext, String serializedParams, Integer retryAttemptCount) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        return new AnalyticEvent(id, serializedEvent, eventName, eventContext, serializedParams, retryAttemptCount);
    }

    public final String getEventContext() {
        return this.eventContext;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticEvent)) {
            return false;
        }
        AnalyticEvent analyticEvent = (AnalyticEvent) other;
        return this.id == analyticEvent.id && Intrinsics.b(this.serializedEvent, analyticEvent.serializedEvent) && Intrinsics.b(this.eventName, analyticEvent.eventName) && Intrinsics.b(this.eventContext, analyticEvent.eventContext) && Intrinsics.b(this.serializedParams, analyticEvent.serializedParams) && Intrinsics.b(this.retryAttemptCount, analyticEvent.retryAttemptCount);
    }

    public final Integer getRetryAttemptCount() {
        return this.retryAttemptCount;
    }

    public final String getSerializedEvent() {
        return this.serializedEvent;
    }

    public final String getSerializedParams() {
        return this.serializedParams;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.serializedEvent.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventContext;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serializedParams;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.retryAttemptCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticEvent(id=" + this.id + ", serializedEvent=" + this.serializedEvent + ", eventName=" + this.eventName + ", eventContext=" + this.eventContext + ", serializedParams=" + this.serializedParams + ", retryAttemptCount=" + this.retryAttemptCount + ")";
    }

    public AnalyticEvent(int i7, String str, String str2, String str3, String str4, Integer num, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : num);
    }
}
