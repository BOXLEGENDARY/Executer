package com.withpersona.sdk2.inquiry.network.dto;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_PromptPageJsonAdapter extends h<NextStep.GovernmentId.PromptPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle"});

    public NextStep_GovernmentId_PromptPageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "cameraPermissionsTitle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.PromptPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.PromptPage m182fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
            }
        }
        mVar.j();
        return new NextStep.GovernmentId.PromptPage(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.PromptPage promptPage) {
        if (promptPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
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
