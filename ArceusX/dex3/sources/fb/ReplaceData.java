package fb;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lfb/j;", "", "", "replaceCandidate", "oldString", "newString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class ReplaceData {

    @NotNull
    private final String replaceCandidate;

    @NotNull
    private final String oldString;

    @NotNull
    private final String newString;

    public ReplaceData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "replaceCandidate");
        Intrinsics.checkNotNullParameter(str2, "oldString");
        Intrinsics.checkNotNullParameter(str3, "newString");
        this.replaceCandidate = str;
        this.oldString = str2;
        this.newString = str3;
    }

    @NotNull
    public final String getNewString() {
        return this.newString;
    }

    @NotNull
    public final String getOldString() {
        return this.oldString;
    }

    @NotNull
    public final String getReplaceCandidate() {
        return this.replaceCandidate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceData)) {
            return false;
        }
        ReplaceData replaceData = (ReplaceData) other;
        return Intrinsics.b(this.replaceCandidate, replaceData.replaceCandidate) && Intrinsics.b(this.oldString, replaceData.oldString) && Intrinsics.b(this.newString, replaceData.newString);
    }

    public int hashCode() {
        return (((this.replaceCandidate.hashCode() * 31) + this.oldString.hashCode()) * 31) + this.newString.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplaceData(replaceCandidate=" + this.replaceCandidate + ", oldString=" + this.oldString + ", newString=" + this.newString + ")";
    }
}
