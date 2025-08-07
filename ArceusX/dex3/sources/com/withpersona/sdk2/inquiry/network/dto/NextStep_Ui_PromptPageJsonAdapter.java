package com.withpersona.sdk2.inquiry.network.dto;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Ui_PromptPageJsonAdapter extends h<NextStep.Ui.PromptPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"gpsPermissionsBtnCancel", "gpsPermissionsBtnContinueMobile", "gpsDeviceFeatureBtnContinueMobile", "gpsPermissionsPrompt", "gpsPermissionsTitle", "gpsFeaturePrompt", "gpsFeatureTitle"});

    public NextStep_Ui_PromptPageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "gpsPermissionsBtnCancel");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Ui.PromptPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Ui.PromptPage m198fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
            }
        }
        mVar.j();
        return new NextStep.Ui.PromptPage(str, str2, str3, str4, str5, str6, str7);
    }

    public void toJson(@NotNull t tVar, NextStep.Ui.PromptPage promptPage) {
        if (promptPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("gpsPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsPermissionsBtnCancel());
        tVar.Z("gpsPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsPermissionsAllowButtonText());
        tVar.Z("gpsDeviceFeatureBtnContinueMobile");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsFeatureTurnOnText());
        tVar.Z("gpsPermissionsPrompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsPermissionsPrompt());
        tVar.Z("gpsPermissionsTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsPermissionsTitle());
        tVar.Z("gpsFeaturePrompt");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsFeaturePrompt());
        tVar.Z("gpsFeatureTitle");
        this.nullableStringAdapter.toJson(tVar, promptPage.getGpsFeatureTitle());
        tVar.y();
    }
}
