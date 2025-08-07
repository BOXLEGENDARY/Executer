package O6;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LO6/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "userId", BuildConfig.FLAVOR, "checkoutSessionId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatePurchaseResponsePayload {

    private final Long userId;

    private final String checkoutSessionId;

    public ValidatePurchaseResponsePayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getCheckoutSessionId() {
        return this.checkoutSessionId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidatePurchaseResponsePayload)) {
            return false;
        }
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = (ValidatePurchaseResponsePayload) other;
        return Intrinsics.b(this.userId, validatePurchaseResponsePayload.userId) && Intrinsics.b(this.checkoutSessionId, validatePurchaseResponsePayload.checkoutSessionId);
    }

    public int hashCode() {
        Long l7 = this.userId;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.checkoutSessionId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ValidatePurchaseResponsePayload(userId=" + this.userId + ", checkoutSessionId=" + this.checkoutSessionId + ")";
    }

    public ValidatePurchaseResponsePayload(Long l7, String str) {
        this.userId = l7;
        this.checkoutSessionId = str;
    }

    public ValidatePurchaseResponsePayload(Long l7, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l7, (i7 & 2) != 0 ? null : str);
    }
}
