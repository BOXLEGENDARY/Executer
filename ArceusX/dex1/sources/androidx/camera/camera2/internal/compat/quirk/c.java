package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import C.O0;
import java.util.ArrayList;
import java.util.List;

public class c {
    static List<N0> a(O0 o02) {
        ArrayList arrayList = new ArrayList();
        if (o02.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.f())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (o02.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.h())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (o02.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.g())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (o02.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.s())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (o02.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (o02.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.f())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (o02.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.f())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (o02.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.k())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (o02.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.g())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (o02.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.g())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (o02.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.f())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (o02.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.f())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (o02.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.f())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (o02.a(ZslDisablerQuirk.class, ZslDisablerQuirk.i())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (o02.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.i())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (o02.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.s())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (o02.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.f())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (o02.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.g())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (o02.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.f())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
