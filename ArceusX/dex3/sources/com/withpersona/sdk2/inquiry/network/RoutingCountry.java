package com.withpersona.sdk2.inquiry.network;

import org.jetbrains.annotations.NotNull;

public final class RoutingCountry {
    private static final T9.a $ENTRIES;
    private static final RoutingCountry[] $VALUES;
    public static final RoutingCountry DE = new RoutingCountry("DE", 0);
    public static final RoutingCountry US = new RoutingCountry("US", 1);

    private static final RoutingCountry[] $values() {
        return new RoutingCountry[]{DE, US};
    }

    static {
        RoutingCountry[] routingCountryArr$values = $values();
        $VALUES = routingCountryArr$values;
        $ENTRIES = T9.b.a(routingCountryArr$values);
    }

    private RoutingCountry(String str, int i) {
    }

    @NotNull
    public static T9.a<RoutingCountry> getEntries() {
        return $ENTRIES;
    }

    public static RoutingCountry valueOf(String str) {
        return (RoutingCountry) Enum.valueOf(RoutingCountry.class, str);
    }

    public static RoutingCountry[] values() {
        return (RoutingCountry[]) $VALUES.clone();
    }
}
