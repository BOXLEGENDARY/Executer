package com.withpersona.sdk2.inquiry.network.dto;

import P9.h;
import P9.i;
import defpackage.e;
import org.jetbrains.annotations.NotNull;

public final class JsonLogicBooleanKt {

    @NotNull
    private static final h jsonLogicEngine$delegate = i.b(JsonLogicBooleanKt$jsonLogicEngine$2.INSTANCE);

    public static final e getJsonLogicEngine() {
        return (e) jsonLogicEngine$delegate.getValue();
    }
}
