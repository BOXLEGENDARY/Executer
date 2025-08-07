package androidx.camera.camera2.internal.compat.quirk;

import C.O0;
import C.P0;
import C.R0;
import java.util.ArrayList;
import t.B;
import z.C3043d0;

public class a {
    public static R0 a(String str, B b2) {
        O0 o0A = P0.b().a();
        ArrayList arrayList = new ArrayList();
        if (o0A.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(b2))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(b2));
        }
        if (o0A.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.g(b2))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (o0A.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.f(b2))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (o0A.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.f(b2))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (o0A.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.g(b2))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(b2));
        }
        if (o0A.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.f(b2))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (o0A.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.f(b2))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (o0A.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.g(b2))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (o0A.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f(b2))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (o0A.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f(b2))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (o0A.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.l(b2))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (o0A.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.g(b2))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (o0A.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.f(b2))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (o0A.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.f(b2))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (o0A.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.f(b2))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (o0A.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.f(b2))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (o0A.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.f(b2))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (o0A.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f(b2))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (o0A.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f(b2))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (o0A.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.f(b2))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (o0A.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.k(b2))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(b2));
        }
        if (o0A.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.l())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (o0A.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.f())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (o0A.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (o0A.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.g(b2))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (o0A.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.h())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        R0 r02 = new R0(arrayList);
        C3043d0.a("CameraQuirks", "camera2 CameraQuirks = " + R0.d(r02));
        return r02;
    }
}
