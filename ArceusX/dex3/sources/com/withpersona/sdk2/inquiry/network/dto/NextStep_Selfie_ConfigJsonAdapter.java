package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Selfie_ConfigJsonAdapter extends h<NextStep.Selfie.Config> {

    @NotNull
    private final h<NextStep.Selfie.AssetConfig> assetConfigAdapter;

    @NotNull
    private final h<Boolean> booleanAdapter;

    @NotNull
    private final h<NextStep.Selfie.CaptureMethod> captureMethodAdapter;

    @NotNull
    private final h<NextStep.Selfie.Localizations> localizationsAdapter;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<List<NextStep.Selfie.CaptureFileType>> nullableListOfCaptureFileTypeAdapter;

    @NotNull
    private final h<List<PoseConfig>> nullableListOfPoseConfigAdapter;

    @NotNull
    private final h<List<NextStep.Selfie.SelfiePose>> nullableListOfSelfiePoseAdapter;

    @NotNull
    private final h<List<NextStep.Selfie.VideoCaptureMethod>> nullableListOfVideoCaptureMethodAdapter;

    @NotNull
    private final h<PendingPageTextPosition> nullablePendingPageTextPositionAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selfieType", "backStepEnabled", "cancelButtonEnabled", "localizations", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "videoCaptureMethods", "assets", "videoSessionJWT", "orderedPoses", "pendingPageTextVerticalPosition", "audioEnabled", "poseConfigs"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_Selfie_ConfigJsonAdapter(@NotNull w wVar) {
        this.captureMethodAdapter = wVar.f(NextStep.Selfie.CaptureMethod.class, L.d(), "selfieType");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "backStepEnabled");
        this.localizationsAdapter = wVar.f(NextStep.Selfie.Localizations.class, L.d(), "localizations");
        this.stringAdapter = wVar.f(String.class, L.d(), "fieldKeySelfie");
        this.booleanAdapter = wVar.f(Boolean.TYPE, L.d(), "requireStrictSelfieCapture");
        this.nullableListOfCaptureFileTypeAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.Selfie.CaptureFileType.class}), L.d(), "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.Selfie.VideoCaptureMethod.class}), L.d(), "videoCaptureMethods");
        this.assetConfigAdapter = wVar.f(NextStep.Selfie.AssetConfig.class, L.d(), "assets");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "videoSessionJwt");
        this.nullableListOfSelfiePoseAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.Selfie.SelfiePose.class}), L.d(), "orderedPoses");
        this.nullablePendingPageTextPositionAdapter = wVar.f(PendingPageTextPosition.class, L.d(), "pendingPageTextVerticalPosition");
        this.nullableListOfPoseConfigAdapter = wVar.f(A.j(List.class, new Type[]{PoseConfig.class}), L.d(), "poseConfigs");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.Config");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.Config m191fromJson(@NotNull m mVar) throws j {
        mVar.e();
        Boolean bool = null;
        NextStep.Selfie.CaptureMethod captureMethod = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        NextStep.Selfie.Localizations localizations = null;
        String str = null;
        Boolean bool4 = null;
        List list = null;
        List list2 = null;
        NextStep.Selfie.AssetConfig assetConfig = null;
        String str2 = null;
        List list3 = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool5 = null;
        List list4 = null;
        while (true) {
            List list5 = list3;
            String str3 = str2;
            List list6 = list2;
            List list7 = list;
            if (!mVar.u()) {
                mVar.j();
                if (captureMethod == null) {
                    throw c.o("selfieType", "selfieType", mVar);
                }
                if (localizations == null) {
                    throw c.o("localizations", "localizations", mVar);
                }
                if (str == null) {
                    throw c.o("fieldKeySelfie", "fieldKeySelfie", mVar);
                }
                if (bool == null) {
                    throw c.o("requireStrictSelfieCapture", "requireStrictSelfieCapture", mVar);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (assetConfig != null) {
                    return new NextStep.Selfie.Config(captureMethod, bool2, bool3, localizations, str, zBooleanValue, bool4, list7, list6, assetConfig, str3, list5, pendingPageTextPosition, bool5, list4);
                }
                throw c.o("assets", "assets", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 0:
                    captureMethod = (NextStep.Selfie.CaptureMethod) this.captureMethodAdapter.fromJson(mVar);
                    if (captureMethod == null) {
                        throw c.x("selfieType", "selfieType", mVar);
                    }
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 2:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 3:
                    localizations = (NextStep.Selfie.Localizations) this.localizationsAdapter.fromJson(mVar);
                    if (localizations == null) {
                        throw c.x("localizations", "localizations", mVar);
                    }
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 4:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x("fieldKeySelfie", "fieldKeySelfie", mVar);
                    }
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case 5:
                    bool = (Boolean) this.booleanAdapter.fromJson(mVar);
                    if (bool == null) {
                        throw c.x("requireStrictSelfieCapture", "requireStrictSelfieCapture", mVar);
                    }
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    list = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                case R.styleable.LottieAnimationView_lottie_loop:
                    list2 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_progress:
                    assetConfig = (NextStep.Selfie.AssetConfig) this.assetConfigAdapter.fromJson(mVar);
                    if (assetConfig == null) {
                        throw c.x("assets", "assets", mVar);
                    }
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    list3 = list5;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    list3 = (List) this.nullableListOfSelfiePoseAdapter.fromJson(mVar);
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                case R.styleable.LottieAnimationView_lottie_scale:
                    list4 = (List) this.nullableListOfPoseConfigAdapter.fromJson(mVar);
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
                default:
                    list3 = list5;
                    str2 = str3;
                    list2 = list6;
                    list = list7;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.Config config) {
        if (config == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selfieType");
        this.captureMethodAdapter.toJson(tVar, config.getSelfieType());
        tVar.Z("backStepEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getBackStepEnabled());
        tVar.Z("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getCancelButtonEnabled());
        tVar.Z("localizations");
        this.localizationsAdapter.toJson(tVar, config.getLocalizations());
        tVar.Z("fieldKeySelfie");
        this.stringAdapter.toJson(tVar, config.getFieldKeySelfie());
        tVar.Z("requireStrictSelfieCapture");
        this.booleanAdapter.toJson(tVar, Boolean.valueOf(config.getRequireStrictSelfieCapture()));
        tVar.Z("skipPromptPage");
        this.nullableBooleanAdapter.toJson(tVar, config.getSkipPromptPage());
        tVar.Z("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(tVar, config.getEnabledCaptureFileTypes());
        tVar.Z("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(tVar, config.getVideoCaptureMethods());
        tVar.Z("assets");
        this.assetConfigAdapter.toJson(tVar, config.getAssets());
        tVar.Z("videoSessionJWT");
        this.nullableStringAdapter.toJson(tVar, config.getVideoSessionJwt());
        tVar.Z("orderedPoses");
        this.nullableListOfSelfiePoseAdapter.toJson(tVar, config.getOrderedPoses());
        tVar.Z("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(tVar, config.getPendingPageTextVerticalPosition());
        tVar.Z("audioEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getAudioEnabled());
        tVar.Z("poseConfigs");
        this.nullableListOfPoseConfigAdapter.toJson(tVar, config.getPoseConfigs());
        tVar.y();
    }
}
