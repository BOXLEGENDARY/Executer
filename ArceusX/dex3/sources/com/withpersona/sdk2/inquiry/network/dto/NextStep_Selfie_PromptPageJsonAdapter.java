package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Selfie_PromptPageJsonAdapter extends h<NextStep.Selfie.PromptPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selfieTitle", "selfiePrompt", "selfiePromptCenter", "agreeToPolicy", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_Selfie_PromptPageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "cameraPermissionsTitle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.PromptPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.PromptPage m194fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (true) {
            String str14 = str12;
            String str15 = str11;
            String str16 = str10;
            String str17 = str9;
            String str18 = str8;
            String str19 = str7;
            String str20 = str6;
            String str21 = str5;
            String str22 = str4;
            if (!mVar.u()) {
                mVar.j();
                if (str == null) {
                    throw c.o(Title.type, "selfieTitle", mVar);
                }
                if (str2 == null) {
                    throw c.o("prompt", "selfiePrompt", mVar);
                }
                if (str3 == null) {
                    throw c.o("promptCenter", "selfiePromptCenter", mVar);
                }
                if (str22 == null) {
                    throw c.o("disclosure", "agreeToPolicy", mVar);
                }
                if (str21 != null) {
                    return new NextStep.Selfie.PromptPage(str, str2, str3, str22, str21, str20, str19, str18, str17, str16, str15, str14, str13);
                }
                throw c.o("buttonSubmit", "btnSubmit", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x(Title.type, "selfieTitle", mVar);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("prompt", "selfiePrompt", mVar);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(mVar);
                    if (str3 == null) {
                        throw c.x("promptCenter", "selfiePromptCenter", mVar);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(mVar);
                    if (str4 == null) {
                        throw c.x("disclosure", "agreeToPolicy", mVar);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                case 4:
                    String str23 = (String) this.stringAdapter.fromJson(mVar);
                    if (str23 == null) {
                        throw c.x("buttonSubmit", "btnSubmit", mVar);
                    }
                    str5 = str23;
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str4 = str22;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str8 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    str12 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    str13 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                default:
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.PromptPage promptPage) {
        if (promptPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selfieTitle");
        this.stringAdapter.toJson(tVar, promptPage.getTitle());
        tVar.Z("selfiePrompt");
        this.stringAdapter.toJson(tVar, promptPage.getPrompt());
        tVar.Z("selfiePromptCenter");
        this.stringAdapter.toJson(tVar, promptPage.getPromptCenter());
        tVar.Z("agreeToPolicy");
        this.stringAdapter.toJson(tVar, promptPage.getDisclosure());
        tVar.Z("btnSubmit");
        this.stringAdapter.toJson(tVar, promptPage.getButtonSubmit());
        tVar.Z("cameraPermissionsTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsTitle());
        tVar.Z("cameraPermissionsPrompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsPrompt());
        tVar.Z("cameraPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsAllowButtonText());
        tVar.Z("cameraPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsCancelButtonText());
        tVar.Z("microphonePermissionsBtnCancel");
        this.nullableStringAdapter.toJson(tVar, promptPage.getMicrophonePermissionsBtnCancel());
        tVar.Z("microphonePermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(tVar, promptPage.getMicrophonePermissionsBtnContinueMobile());
        tVar.Z("microphonePermissionsPrompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getMicrophonePermissionsPrompt());
        tVar.Z("microphonePermissionsTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getMicrophonePermissionsTitle());
        tVar.y();
    }
}
