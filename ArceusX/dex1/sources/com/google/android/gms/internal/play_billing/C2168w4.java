package com.google.android.gms.internal.play_billing;

final class C2168w4 implements T2 {

    static final T2 f16160a = new C2168w4();

    private C2168w4() {
    }

    @Override
    public final boolean y(int i7) {
        return (i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC2174x4.ALTERNATIVE_BILLING_ACTION : EnumC2174x4.LOCAL_PURCHASES_UPDATED_ACTION : EnumC2174x4.PURCHASES_UPDATED_ACTION : EnumC2174x4.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
