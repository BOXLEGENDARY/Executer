package androidx.camera.video.internal.compat.quirk;

import C.N0;
import C.O0;
import java.util.ArrayList;
import java.util.List;

public class b {
    static List<N0> a(O0 o02) {
        ArrayList arrayList = new ArrayList();
        if (o02.a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.f())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (o02.a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.o())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (o02.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.f())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (o02.a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.h())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (o02.a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.k())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (o02.a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.f())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (o02.a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.g())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (o02.a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.m())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (o02.a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.h())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (o02.a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.g())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (o02.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.f())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (o02.a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.f())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (o02.a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.m())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (o02.a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.g())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (o02.a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.h())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (o02.a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.h())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (o02.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.g())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (o02.a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.j())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (o02.a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.g())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (o02.a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.j())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        return arrayList;
    }
}
