package com.withpersona.sdk2.inquiry.network.dto.government_id;

import T9.a;
import T9.b;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import org.jetbrains.annotations.NotNull;

@i(generateAdapter = false)
public final class CaptureOptionNativeMobile {
    private static final a $ENTRIES;
    private static final CaptureOptionNativeMobile[] $VALUES;

    @g(name = "mobile_camera")
    public static final CaptureOptionNativeMobile MOBILE_CAMERA = new CaptureOptionNativeMobile("MOBILE_CAMERA", 0);

    @g(name = "upload")
    public static final CaptureOptionNativeMobile UPLOAD = new CaptureOptionNativeMobile("UPLOAD", 1);

    private static final CaptureOptionNativeMobile[] $values() {
        return new CaptureOptionNativeMobile[]{MOBILE_CAMERA, UPLOAD};
    }

    static {
        CaptureOptionNativeMobile[] captureOptionNativeMobileArr$values = $values();
        $VALUES = captureOptionNativeMobileArr$values;
        $ENTRIES = b.a(captureOptionNativeMobileArr$values);
    }

    private CaptureOptionNativeMobile(String str, int i) {
    }

    @NotNull
    public static a<CaptureOptionNativeMobile> getEntries() {
        return $ENTRIES;
    }

    public static CaptureOptionNativeMobile valueOf(String str) {
        return (CaptureOptionNativeMobile) Enum.valueOf(CaptureOptionNativeMobile.class, str);
    }

    public static CaptureOptionNativeMobile[] values() {
        return (CaptureOptionNativeMobile[]) $VALUES.clone();
    }
}
