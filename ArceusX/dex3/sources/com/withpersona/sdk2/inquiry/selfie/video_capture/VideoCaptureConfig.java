package com.withpersona.sdk2.inquiry.selfie.video_capture;

import P9.o;
import P9.p;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import ha.C0456d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0015JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b)\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b%\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lp8/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "hasExhaustedWebRtcConnectionAttempts", "canUseLocalVideoAsFallback", "Landroid/content/Context;", "applicationContext", "LP9/o;", "e", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;", "d", "f", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "c", "getVideoCaptureMethods", "Ljava/lang/String;", "Z", "()Z", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class VideoCaptureConfig {

    private final long maxRecordingLengthMs;

    @NotNull
    private final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

    @NotNull
    private final List<EnumC0732a> videoCaptureMethods;

    private final String webRtcJwt;

    private final boolean recordAudio;

    public VideoCaptureConfig(long j, @NotNull List<? extends NextStep.Selfie.CaptureFileType> list, @NotNull List<? extends EnumC0732a> list2, @g(name = "webRTCJwt") String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(list2, "videoCaptureMethods");
        this.maxRecordingLengthMs = j;
        this.enabledCaptureFileTypes = list;
        this.videoCaptureMethods = list2;
        this.webRtcJwt = str;
        this.recordAudio = z;
    }

    private final Object e(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, Context applicationContext) {
        boolean z = this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video) && CollectionsKt.firstOrNull(this.videoCaptureMethods) == EnumC0732a.d;
        boolean z2 = (hasExhaustedWebRtcConnectionAttempts == null || canUseLocalVideoAsFallback == null) ? false : true;
        if (!z || z2) {
            if (canUseLocalVideoAsFallback != null ? canUseLocalVideoAsFallback.booleanValue() : true) {
                List<EnumC0732a> list = this.videoCaptureMethods;
                EnumC0732a enumC0732a = EnumC0732a.e;
                if (list.contains(enumC0732a)) {
                    return o.b(enumC0732a);
                }
            }
            if (hasExhaustedWebRtcConnectionAttempts != null ? hasExhaustedWebRtcConnectionAttempts.booleanValue() : false) {
                o.a aVar = o.e;
                return o.b(EnumC0732a.i);
            }
            o.a aVar2 = o.e;
            EnumC0732a enumC0732a2 = (EnumC0732a) CollectionsKt.firstOrNull(this.videoCaptureMethods);
            if (enumC0732a2 == null) {
                enumC0732a2 = EnumC0732a.i;
            }
            return o.b(enumC0732a2);
        }
        List<EnumC0732a> list2 = this.videoCaptureMethods;
        EnumC0732a enumC0732a3 = EnumC0732a.e;
        if (list2.contains(enumC0732a3)) {
            if (!C0456d.e(applicationContext)) {
                return o.b(enumC0732a3);
            }
            o.a aVar3 = o.e;
            return o.b(p.a(new RuntimeException()));
        }
        List<NextStep.Selfie.CaptureFileType> list3 = this.enabledCaptureFileTypes;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (NextStep.Selfie.CaptureFileType captureFileType : list3) {
                if (captureFileType != NextStep.Selfie.CaptureFileType.Video && captureFileType != NextStep.Selfie.CaptureFileType.Unknown) {
                    if (C0456d.e(applicationContext)) {
                        o.a aVar4 = o.e;
                        return o.b(p.a(new RuntimeException()));
                    }
                    o.a aVar5 = o.e;
                    return o.b(EnumC0732a.i);
                }
            }
        }
        o.a aVar6 = o.e;
        return o.b(p.a(new RuntimeException()));
    }

    public final long getMaxRecordingLengthMs() {
        return this.maxRecordingLengthMs;
    }

    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    public final String getWebRtcJwt() {
        return this.webRtcJwt;
    }

    @NotNull
    public final VideoCaptureConfig copy(long maxRecordingLengthMs, @NotNull List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, @NotNull List<? extends EnumC0732a> videoCaptureMethods, @g(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
        Intrinsics.checkNotNullParameter(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        Intrinsics.checkNotNullParameter(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    @NotNull
    public final Object d(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (!this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            o.a aVar = o.e;
            return o.b(Boolean.FALSE);
        }
        Object objF = f(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        Throwable thE = o.e(objF);
        if (thE != null) {
            return o.b(p.a(thE));
        }
        EnumC0732a enumC0732a = (EnumC0732a) objF;
        return o.b(Boolean.valueOf(enumC0732a == EnumC0732a.d || enumC0732a == EnumC0732a.e));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && Intrinsics.b(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && Intrinsics.b(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && Intrinsics.b(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    @NotNull
    public final Object f(Boolean hasExhaustedWebRtcConnectionAttempts, Boolean canUseLocalVideoAsFallback, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (this.enabledCaptureFileTypes.contains(NextStep.Selfie.CaptureFileType.Video)) {
            return e(hasExhaustedWebRtcConnectionAttempts, canUseLocalVideoAsFallback, applicationContext);
        }
        o.a aVar = o.e;
        return o.b(EnumC0732a.i);
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.maxRecordingLengthMs) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
        String str = this.webRtcJwt;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recordAudio);
    }

    @NotNull
    public String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    public VideoCaptureConfig(long j, List list, List list2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j, list, list2, str, z);
    }
}
