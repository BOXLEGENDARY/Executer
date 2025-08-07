package M6;

import android.content.Context;
import com.roblox.client.M;

public class d extends L6.g implements L6.b {

    public final b f2383d;

    public final String f2384e;

    static class a {

        static final int[] f2385a;

        static {
            int[] iArr = new int[b.values().length];
            f2385a = iArr;
            try {
                iArr[b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2385a[b.ALREADY_ACKNOWLEDGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2385a[b.IS_EMULATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2385a[b.VALIDATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2385a[b.VALIDATION_RETRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2385a[b.VALIDATION_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2385a[b.VALIDATION_LIMIT_UNDER_13.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2385a[b.REQUEST_BALANCE_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2385a[b.USER_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2385a[b.FAILED_PRODUCT_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2385a[b.ACKNOWLEDGE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2385a[b.IAB_LAUNCH_PURCHASE_FLOW_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2385a[b.IAB_HANDLE_ACTIVITY_RESULT_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2385a[b.IAB_QUERY_INVENTORY_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2385a[b.IAB_CONSUME_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2385a[b.RECEIPT_VERIFICATION_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2385a[b.RECEIPT_EMPTY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2385a[b.EMPTY_USERNAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f2385a[b.FAILED_PURCHASE_RESPONSE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2385a[b.FAILED_PURCHASE_UPDATE_RESPONSE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2385a[b.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2385a[b.FAILED_NOT_ALLOWED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public enum b {
        SUCCESS,
        IS_EMULATOR,
        VALIDATION_ERROR,
        VALIDATION_RETRY,
        VALIDATION_LIMIT,
        VALIDATION_LIMIT_UNDER_13,
        REQUEST_BALANCE_ERROR,
        ACKNOWLEDGE_ERROR,
        CONSUME_ERROR,
        USER_CANCELLED,
        ALREADY_ACKNOWLEDGED,
        IAB_LAUNCH_PURCHASE_FLOW_ERROR,
        IAB_HANDLE_ACTIVITY_RESULT_ERROR,
        IAB_QUERY_INVENTORY_ERROR,
        IAB_CONSUME_ERROR,
        RECEIPT_VERIFICATION_ERROR,
        RECEIPT_EMPTY,
        EMPTY_USERNAME,
        FAILED_PURCHASE_RESPONSE,
        FAILED_PURCHASE_UPDATE_RESPONSE,
        FAILED_NOT_ALLOWED,
        FAILED_PRODUCT_NOT_FOUND,
        UNKNOWN
    }

    public d(b bVar, String str) {
        this.f2383d = bVar;
        this.f2384e = str;
    }

    @Override
    public CharSequence b(Context context) {
        context.getString(M.f19643e0);
        switch (a.f2385a[this.f2383d.ordinal()]) {
            case 1:
            case 2:
                return context.getText(M.f19635b1);
            case 3:
                return context.getString(M.f19627Y0);
            case 4:
                return context.getString(M.f19629Z0);
            case 5:
                return context.getText(M.f19623W0);
            case 6:
                return context.getString(M.f19647f1);
            case 7:
                return context.getText(M.f19650g1);
            case 8:
                return context.getString(M.f19629Z0);
            case 9:
                return context.getString(M.f19625X0);
            default:
                return context.getString(M.f19629Z0);
        }
    }

    @Override
    public boolean c() {
        b bVar = this.f2383d;
        return bVar == b.SUCCESS || bVar == b.ALREADY_ACKNOWLEDGED;
    }

    @Override
    public boolean e() {
        int i7 = a.f2385a[this.f2383d.ordinal()];
        return (i7 == 1 || i7 == 2 || i7 == 5 || i7 == 7) ? false : true;
    }

    @Override
    public String a() {
        return this.f2384e;
    }
}
