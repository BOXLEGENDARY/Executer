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
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_ConfigJsonAdapter extends h<NextStep.GovernmentId.Config> {

    @NotNull
    private final h<NextStep.GovernmentId.Localizations> localizationsAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig> nullableAssetConfigAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AutoClassificationConfig> nullableAutoClassificationConfigAdapter;

    @NotNull
    private final h<StyleElements.Axis> nullableAxisAdapter;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.DigitalIdConfig> nullableDigitalIdConfigAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<List<NextStep.GovernmentId.CaptureFileType>> nullableListOfCaptureFileTypeAdapter;

    @NotNull
    private final h<List<CaptureOptionNativeMobile>> nullableListOfCaptureOptionNativeMobileAdapter;

    @NotNull
    private final h<List<Id>> nullableListOfIdAdapter;

    @NotNull
    private final h<List<NextStep.GovernmentId.LocalizationOverride>> nullableListOfLocalizationOverrideAdapter;

    @NotNull
    private final h<List<NextStep.GovernmentId.VideoCaptureMethod>> nullableListOfVideoCaptureMethodAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<PendingPageTextPosition> nullablePendingPageTextPositionAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"idclasses", "backStepEnabled", "cancelButtonEnabled", "localizations", "enabledCaptureOptionsNativeMobile", "imageCaptureCount", "nativeMobileCameraManualCaptureDelayMs", "fieldKeyDocument", "fieldKeyIdclass", "localizationOverrides", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "videoCaptureMethods", "videoSessionJWT", "assets", "autoClassificationConfig", "reviewCaptureButtonsAxis", "pendingPageTextVerticalPosition", "audioEnabled", "mobileDriversLicense"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_ConfigJsonAdapter(@NotNull w wVar) {
        this.nullableListOfIdAdapter = wVar.f(A.j(List.class, new Type[]{Id.class}), L.d(), "idclasses");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "backStepEnabled");
        this.localizationsAdapter = wVar.f(NextStep.GovernmentId.Localizations.class, L.d(), "localizations");
        this.nullableListOfCaptureOptionNativeMobileAdapter = wVar.f(A.j(List.class, new Type[]{CaptureOptionNativeMobile.class}), L.d(), "enabledCaptureOptionsNativeMobile");
        this.nullableIntAdapter = wVar.f(Integer.class, L.d(), "imageCaptureCount");
        this.nullableLongAdapter = wVar.f(Long.class, L.d(), "nativeMobileCameraManualCaptureDelayMs");
        this.stringAdapter = wVar.f(String.class, L.d(), "fieldKeyDocument");
        this.nullableListOfLocalizationOverrideAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.GovernmentId.LocalizationOverride.class}), L.d(), "localizationOverrides");
        this.nullableListOfCaptureFileTypeAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.GovernmentId.CaptureFileType.class}), L.d(), "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = wVar.f(A.j(List.class, new Type[]{NextStep.GovernmentId.VideoCaptureMethod.class}), L.d(), "videoCaptureMethods");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "videoSessionJwt");
        this.nullableAssetConfigAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.class, L.d(), "assets");
        this.nullableAutoClassificationConfigAdapter = wVar.f(NextStep.GovernmentId.AutoClassificationConfig.class, L.d(), "autoClassificationConfig");
        this.nullableAxisAdapter = wVar.f(StyleElements.Axis.class, L.d(), "reviewCaptureButtonsAxis");
        this.nullablePendingPageTextPositionAdapter = wVar.f(PendingPageTextPosition.class, L.d(), "pendingPageTextVerticalPosition");
        this.nullableDigitalIdConfigAdapter = wVar.f(NextStep.GovernmentId.DigitalIdConfig.class, L.d(), "mobileDriversLicense");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.Config");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.Config m176fromJson(@NotNull m mVar) throws j {
        mVar.e();
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        NextStep.GovernmentId.Localizations localizations = null;
        List list2 = null;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        List list3 = null;
        Boolean bool3 = null;
        List list4 = null;
        List list5 = null;
        String str3 = null;
        NextStep.GovernmentId.AssetConfig assetConfig = null;
        NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig = null;
        StyleElements.Axis axis = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool4 = null;
        NextStep.GovernmentId.DigitalIdConfig digitalIdConfig = null;
        while (true) {
            List list6 = list4;
            Boolean bool5 = bool3;
            if (!mVar.u()) {
                mVar.j();
                if (localizations == null) {
                    throw c.o("localizations", "localizations", mVar);
                }
                if (str == null) {
                    throw c.o("fieldKeyDocument", "fieldKeyDocument", mVar);
                }
                if (str2 != null) {
                    return new NextStep.GovernmentId.Config(list, bool, bool2, localizations, list2, num, l, str, str2, list3, bool5, list6, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4, digitalIdConfig);
                }
                throw c.o("fieldKeyIdclass", "fieldKeyIdclass", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    list4 = list6;
                    bool3 = bool5;
                case 0:
                    list = (List) this.nullableListOfIdAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 3:
                    localizations = (NextStep.GovernmentId.Localizations) this.localizationsAdapter.fromJson(mVar);
                    if (localizations == null) {
                        throw c.x("localizations", "localizations", mVar);
                    }
                    list4 = list6;
                    bool3 = bool5;
                case 4:
                    list2 = (List) this.nullableListOfCaptureOptionNativeMobileAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    l = (Long) this.nullableLongAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x("fieldKeyDocument", "fieldKeyDocument", mVar);
                    }
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("fieldKeyIdclass", "fieldKeyIdclass", mVar);
                    }
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_progress:
                    list3 = (List) this.nullableListOfLocalizationOverrideAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list4 = list6;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    list4 = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(mVar);
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    list5 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_scale:
                    assetConfig = (NextStep.GovernmentId.AssetConfig) this.nullableAssetConfigAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_speed:
                    autoClassificationConfig = (NextStep.GovernmentId.AutoClassificationConfig) this.nullableAutoClassificationConfigAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case R.styleable.LottieAnimationView_lottie_url:
                    axis = (StyleElements.Axis) this.nullableAxisAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 17:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 18:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                case 19:
                    digitalIdConfig = (NextStep.GovernmentId.DigitalIdConfig) this.nullableDigitalIdConfigAdapter.fromJson(mVar);
                    list4 = list6;
                    bool3 = bool5;
                default:
                    list4 = list6;
                    bool3 = bool5;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.Config config) {
        if (config == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("idclasses");
        this.nullableListOfIdAdapter.toJson(tVar, config.getIdclasses());
        tVar.Z("backStepEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getBackStepEnabled());
        tVar.Z("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getCancelButtonEnabled());
        tVar.Z("localizations");
        this.localizationsAdapter.toJson(tVar, config.getLocalizations());
        tVar.Z("enabledCaptureOptionsNativeMobile");
        this.nullableListOfCaptureOptionNativeMobileAdapter.toJson(tVar, config.getEnabledCaptureOptionsNativeMobile());
        tVar.Z("imageCaptureCount");
        this.nullableIntAdapter.toJson(tVar, config.getImageCaptureCount());
        tVar.Z("nativeMobileCameraManualCaptureDelayMs");
        this.nullableLongAdapter.toJson(tVar, config.getNativeMobileCameraManualCaptureDelayMs());
        tVar.Z("fieldKeyDocument");
        this.stringAdapter.toJson(tVar, config.getFieldKeyDocument());
        tVar.Z("fieldKeyIdclass");
        this.stringAdapter.toJson(tVar, config.getFieldKeyIdclass());
        tVar.Z("localizationOverrides");
        this.nullableListOfLocalizationOverrideAdapter.toJson(tVar, config.getLocalizationOverrides());
        tVar.Z("shouldSkipReviewScreen");
        this.nullableBooleanAdapter.toJson(tVar, config.getShouldSkipReviewScreen());
        tVar.Z("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(tVar, config.getEnabledCaptureFileTypes());
        tVar.Z("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(tVar, config.getVideoCaptureMethods());
        tVar.Z("videoSessionJWT");
        this.nullableStringAdapter.toJson(tVar, config.getVideoSessionJwt());
        tVar.Z("assets");
        this.nullableAssetConfigAdapter.toJson(tVar, config.getAssets());
        tVar.Z("autoClassificationConfig");
        this.nullableAutoClassificationConfigAdapter.toJson(tVar, config.getAutoClassificationConfig());
        tVar.Z("reviewCaptureButtonsAxis");
        this.nullableAxisAdapter.toJson(tVar, config.getReviewCaptureButtonsAxis());
        tVar.Z("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(tVar, config.getPendingPageTextVerticalPosition());
        tVar.Z("audioEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getAudioEnabled());
        tVar.Z("mobileDriversLicense");
        this.nullableDigitalIdConfigAdapter.toJson(tVar, config.getMobileDriversLicense());
        tVar.y();
    }
}
