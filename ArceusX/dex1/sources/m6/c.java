package M6;

import com.android.billingclient.api.Purchase;
import q6.InterfaceC2737a;

public class c implements InterfaceC2737a {
    private boolean isInApp;
    private boolean isRetry;
    private String orderId;
    private String packageName;
    private String productId;
    private String token;

    public c(Purchase purchase, boolean z7, boolean z8) {
        this.packageName = purchase.d();
        this.productId = a.l(purchase);
        this.orderId = purchase.b();
        this.isRetry = z7;
        this.token = purchase.g();
        this.isInApp = z8;
    }
}
