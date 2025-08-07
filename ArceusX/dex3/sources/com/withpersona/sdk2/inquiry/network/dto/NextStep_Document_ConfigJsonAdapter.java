package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Document_ConfigJsonAdapter extends h<NextStep.Document.Config> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final h<NextStep.Document.Localizations> localizationsAdapter;

    @NotNull
    private final h<NextStep.Document.AssetConfig> nullableAssetConfigAdapter;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<NextStep.Document.Pages> nullablePagesAdapter;

    @NotNull
    private final h<PendingPageTextPosition> nullablePendingPageTextPositionAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"backStepEnabled", "cancelButtonEnabled", "documentFileLimit", "documentId", "startPage", "fieldKeyDocument", "kind", "localizations", "pages", "assets", "pendingPageTextVerticalPosition"});

    @NotNull
    private final h<NextStep.Document.StartPage> startPageAdapter;

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_Document_ConfigJsonAdapter(@NotNull w wVar) {
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "backStepEnabled");
        this.intAdapter = wVar.f(Integer.TYPE, L.d(), "documentFileLimit");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "documentId");
        this.startPageAdapter = wVar.f(NextStep.Document.StartPage.class, L.d(), "startPage");
        this.stringAdapter = wVar.f(String.class, L.d(), "fieldKeyDocument");
        this.localizationsAdapter = wVar.f(NextStep.Document.Localizations.class, L.d(), "localizations");
        this.nullablePagesAdapter = wVar.f(NextStep.Document.Pages.class, L.d(), "pages");
        this.nullableAssetConfigAdapter = wVar.f(NextStep.Document.AssetConfig.class, L.d(), "assets");
        this.nullablePendingPageTextPositionAdapter = wVar.f(PendingPageTextPosition.class, L.d(), "pendingPageTextVerticalPosition");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Config");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Config m155fromJson(@NotNull m mVar) throws j {
        mVar.e();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        NextStep.Document.StartPage startPage = null;
        String str2 = null;
        String str3 = null;
        NextStep.Document.Localizations localizations = null;
        NextStep.Document.Pages pages = null;
        NextStep.Document.AssetConfig assetConfig = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        while (true) {
            PendingPageTextPosition pendingPageTextPosition2 = pendingPageTextPosition;
            NextStep.Document.AssetConfig assetConfig2 = assetConfig;
            NextStep.Document.Pages pages2 = pages;
            if (!mVar.u()) {
                mVar.j();
                if (num == null) {
                    throw c.o("documentFileLimit", "documentFileLimit", mVar);
                }
                int iIntValue = num.intValue();
                if (startPage == null) {
                    throw c.o("startPage", "startPage", mVar);
                }
                if (str2 == null) {
                    throw c.o("fieldKeyDocument", "fieldKeyDocument", mVar);
                }
                if (str3 == null) {
                    throw c.o("kind", "kind", mVar);
                }
                if (localizations != null) {
                    return new NextStep.Document.Config(bool, bool2, iIntValue, str, startPage, str2, str3, localizations, pages2, assetConfig2, pendingPageTextPosition2);
                }
                throw c.o("localizations", "localizations", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 0:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(mVar);
                    if (num == null) {
                        throw c.x("documentFileLimit", "documentFileLimit", mVar);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 4:
                    startPage = (NextStep.Document.StartPage) this.startPageAdapter.fromJson(mVar);
                    if (startPage == null) {
                        throw c.x("startPage", "startPage", mVar);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("fieldKeyDocument", "fieldKeyDocument", mVar);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str3 = (String) this.stringAdapter.fromJson(mVar);
                    if (str3 == null) {
                        throw c.x("kind", "kind", mVar);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    localizations = (NextStep.Document.Localizations) this.localizationsAdapter.fromJson(mVar);
                    if (localizations == null) {
                        throw c.x("localizations", "localizations", mVar);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                case R.styleable.LottieAnimationView_lottie_loop:
                    pages = (NextStep.Document.Pages) this.nullablePagesAdapter.fromJson(mVar);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                case R.styleable.LottieAnimationView_lottie_progress:
                    assetConfig = (NextStep.Document.AssetConfig) this.nullableAssetConfigAdapter.fromJson(mVar);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    pages = pages2;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(mVar);
                    assetConfig = assetConfig2;
                    pages = pages2;
                default:
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Config config) {
        if (config == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("backStepEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getBackStepEnabled());
        tVar.Z("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(tVar, config.getCancelButtonEnabled());
        tVar.Z("documentFileLimit");
        this.intAdapter.toJson(tVar, Integer.valueOf(config.getDocumentFileLimit()));
        tVar.Z("documentId");
        this.nullableStringAdapter.toJson(tVar, config.getDocumentId());
        tVar.Z("startPage");
        this.startPageAdapter.toJson(tVar, config.getStartPage());
        tVar.Z("fieldKeyDocument");
        this.stringAdapter.toJson(tVar, config.getFieldKeyDocument());
        tVar.Z("kind");
        this.stringAdapter.toJson(tVar, config.getKind());
        tVar.Z("localizations");
        this.localizationsAdapter.toJson(tVar, config.getLocalizations());
        tVar.Z("pages");
        this.nullablePagesAdapter.toJson(tVar, config.getPages());
        tVar.Z("assets");
        this.nullableAssetConfigAdapter.toJson(tVar, config.getAssets());
        tVar.Z("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(tVar, config.getPendingPageTextVerticalPosition());
        tVar.y();
    }
}
