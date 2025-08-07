package com.google.android.gms.common;

public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i7) {
        super(i7, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + C1819d.f14213a + " but found " + i7 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
