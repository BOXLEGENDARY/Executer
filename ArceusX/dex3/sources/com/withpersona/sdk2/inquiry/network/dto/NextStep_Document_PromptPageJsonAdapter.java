package com.withpersona.sdk2.inquiry.network.dto;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Document_PromptPageJsonAdapter extends h<NextStep.Document.PromptPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "prompt", "disclaimer", "captureOptionsDialogTitle", "btnCapture", "btnUpload", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel"});

    public NextStep_Document_PromptPageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.PromptPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.PromptPage m164fromJson(@NotNull m mVar) {
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
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str7 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str8 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new NextStep.Document.PromptPage(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.PromptPage promptPage) {
        if (promptPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, promptPage.getTitle());
        tVar.Z("prompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getPrompt());
        tVar.Z("disclaimer");
        this.nullableStringAdapter.toJson(tVar, promptPage.getDisclaimer());
        tVar.Z("captureOptionsDialogTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCaptureOptionsDialogTitle());
        tVar.Z("btnCapture");
        this.nullableStringAdapter.toJson(tVar, promptPage.getBtnCapture());
        tVar.Z("btnUpload");
        this.nullableStringAdapter.toJson(tVar, promptPage.getBtnUpload());
        tVar.Z("btnSubmit");
        this.nullableStringAdapter.toJson(tVar, promptPage.getBtnSubmit());
        tVar.Z("cameraPermissionsTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsTitle());
        tVar.Z("cameraPermissionsPrompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsPrompt());
        tVar.Z("cameraPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsAllowButtonText());
        tVar.Z("cameraPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(tVar, promptPage.getCameraPermissionsCancelButtonText());
        tVar.y();
    }
}
