package com.google.android.gms.internal.play_billing;

enum EnumC2129q0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    private static final AbstractC2075h0 f16129J;

    private final int f16137d;

    static {
        C2069g0 c2069g0 = new C2069g0();
        for (EnumC2129q0 enumC2129q0 : values()) {
            c2069g0.a(Integer.valueOf(enumC2129q0.f16137d), enumC2129q0);
        }
        f16129J = c2069g0.b();
    }

    EnumC2129q0(int i7) {
        this.f16137d = i7;
    }

    static EnumC2129q0 c(int i7) {
        AbstractC2075h0 abstractC2075h0 = f16129J;
        Integer numValueOf = Integer.valueOf(i7);
        return !abstractC2075h0.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC2129q0) abstractC2075h0.get(numValueOf);
    }
}
