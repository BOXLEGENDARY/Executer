package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import z.C3043d0;

public final class g {
    public static boolean a(InterfaceC2958c interfaceC2958c) {
        return b(false, interfaceC2958c);
    }

    public static boolean b(boolean z7, InterfaceC2958c interfaceC2958c) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC2958c.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e7) {
            if (androidx.camera.camera2.internal.compat.quirk.b.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                C3043d0.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                C3043d0.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e7);
            }
            if (z7) {
                throw e7;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            C3043d0.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
