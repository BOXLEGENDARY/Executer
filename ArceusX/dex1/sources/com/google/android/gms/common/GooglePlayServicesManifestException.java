package com.google.android.gms.common;

public class GooglePlayServicesManifestException extends IllegalStateException {

    private final int f14043d;

    public GooglePlayServicesManifestException(int i7, String str) {
        super(str);
        this.f14043d = i7;
    }
}
