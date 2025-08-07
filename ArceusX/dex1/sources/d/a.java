package D;

import C.InterfaceC0336k0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import z.C3043d0;

public final class a {
    public static InterfaceC0336k0 a(CamcorderProfile camcorderProfile) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            C3043d0.l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i7 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static InterfaceC0336k0 b(EncoderProfiles encoderProfiles) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i7 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
    }
}
