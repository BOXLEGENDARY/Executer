package M6;

import com.github.luben.zstd.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LM6/n;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "grantedAssetIds", "grantedBundleIds", "<init>", "([Ljava/lang/String;[Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "[Ljava/lang/String;", "getGrantedAssetIds", "()[Ljava/lang/String;", "b", "getGrantedBundleIds", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RobloxPurchaseInfo {

    @SerializedName("granted_asset_ids")
    private final String[] grantedAssetIds;

    @SerializedName("granted_bundle_ids")
    private final String[] grantedBundleIds;

    public RobloxPurchaseInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobloxPurchaseInfo)) {
            return false;
        }
        RobloxPurchaseInfo robloxPurchaseInfo = (RobloxPurchaseInfo) other;
        return Intrinsics.b(this.grantedAssetIds, robloxPurchaseInfo.grantedAssetIds) && Intrinsics.b(this.grantedBundleIds, robloxPurchaseInfo.grantedBundleIds);
    }

    public int hashCode() {
        String[] strArr = this.grantedAssetIds;
        int iHashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        String[] strArr2 = this.grantedBundleIds;
        return iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0);
    }

    public String toString() {
        return "RobloxPurchaseInfo(grantedAssetIds=" + Arrays.toString(this.grantedAssetIds) + ", grantedBundleIds=" + Arrays.toString(this.grantedBundleIds) + ")";
    }

    public RobloxPurchaseInfo(String[] strArr, String[] strArr2) {
        this.grantedAssetIds = strArr;
        this.grantedBundleIds = strArr2;
    }

    public RobloxPurchaseInfo(String[] strArr, String[] strArr2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : strArr, (i7 & 2) != 0 ? null : strArr2);
    }
}
