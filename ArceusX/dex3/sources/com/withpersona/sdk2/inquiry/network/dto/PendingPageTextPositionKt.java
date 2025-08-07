package com.withpersona.sdk2.inquiry.network.dto;

import org.jetbrains.annotations.NotNull;

public final class PendingPageTextPositionKt {

    @NotNull
    private static final PendingPageTextPosition DEFAULT_PROCESSING_TEXT_POSITION = PendingPageTextPosition.BOTTOM;

    @NotNull
    public static final PendingPageTextPosition getDEFAULT_PROCESSING_TEXT_POSITION() {
        return DEFAULT_PROCESSING_TEXT_POSITION;
    }
}
