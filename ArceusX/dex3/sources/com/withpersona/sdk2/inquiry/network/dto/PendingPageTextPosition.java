package com.withpersona.sdk2.inquiry.network.dto;

import T9.a;
import T9.b;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = false)
public final class PendingPageTextPosition {
    private static final a $ENTRIES;
    private static final PendingPageTextPosition[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final PendingPageTextPosition TOP = new PendingPageTextPosition("TOP", 0);
    public static final PendingPageTextPosition BOTTOM = new PendingPageTextPosition("BOTTOM", 1);

    public static final class Companion extends h<PendingPageTextPosition> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @z
        public void toJson(@NotNull t tVar, PendingPageTextPosition pendingPageTextPosition) {
        }

        private Companion() {
        }

        @f
        @NotNull
        public PendingPageTextPosition m199fromJson(@NotNull m mVar) {
            Object objM0 = mVar.M0();
            return Intrinsics.b(objM0, "start") ? PendingPageTextPosition.TOP : Intrinsics.b(objM0, "end") ? PendingPageTextPosition.BOTTOM : PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
    }

    private static final PendingPageTextPosition[] $values() {
        return new PendingPageTextPosition[]{TOP, BOTTOM};
    }

    static {
        PendingPageTextPosition[] pendingPageTextPositionArr$values = $values();
        $VALUES = pendingPageTextPositionArr$values;
        $ENTRIES = b.a(pendingPageTextPositionArr$values);
        Companion = new Companion(null);
    }

    private PendingPageTextPosition(String str, int i) {
    }

    @NotNull
    public static a<PendingPageTextPosition> getEntries() {
        return $ENTRIES;
    }

    public static PendingPageTextPosition valueOf(String str) {
        return (PendingPageTextPosition) Enum.valueOf(PendingPageTextPosition.class, str);
    }

    public static PendingPageTextPosition[] values() {
        return (PendingPageTextPosition[]) $VALUES.clone();
    }
}
