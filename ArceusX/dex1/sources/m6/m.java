package M6;

import com.android.billingclient.api.C1763g;
import com.android.billingclient.api.Purchase;
import com.github.luben.zstd.BuildConfig;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y0.xyyu.hkVlaTTCDY;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/android/billingclient/api/Purchase;", BuildConfig.FLAVOR, "c", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "Lcom/android/billingclient/api/g;", "b", "(Lcom/android/billingclient/api/g;)Ljava/lang/String;", BuildConfig.FLAVOR, "d", "(Lcom/android/billingclient/api/g;)F", BuildConfig.FLAVOR, "priceAmountMicros", "e", "(J)F", "a", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {
    public static final String a(C1763g c1763g) {
        String strC;
        Intrinsics.checkNotNullParameter(c1763g, "<this>");
        C1763g.b bVarB = c1763g.b();
        return (bVarB == null || (strC = bVarB.c()) == null) ? hkVlaTTCDY.uZFjmpF : strC;
    }

    public static final String b(C1763g c1763g) {
        String strA;
        Intrinsics.checkNotNullParameter(c1763g, "<this>");
        C1763g.b bVarB = c1763g.b();
        return (bVarB == null || (strA = bVarB.a()) == null) ? BuildConfig.FLAVOR : strA;
    }

    public static final String c(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        String strB = purchase.b();
        if (strB != null) {
            return strB;
        }
        String strG = purchase.g();
        Intrinsics.checkNotNullExpressionValue(strG, "getPurchaseToken(...)");
        return strG;
    }

    public static final float d(C1763g c1763g) {
        Intrinsics.checkNotNullParameter(c1763g, "<this>");
        C1763g.b bVarB = c1763g.b();
        if (bVarB != null) {
            return e(bVarB.b());
        }
        return 0.0f;
    }

    public static final float e(long j7) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j7);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf.movePointLeft(6).floatValue();
    }
}
