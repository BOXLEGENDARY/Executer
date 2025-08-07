package com.withpersona.sdk2.inquiry.network.dto;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_AutoClassificationPageJsonAdapter extends h<NextStep.GovernmentId.AutoClassificationPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText"});

    public NextStep_GovernmentId_AutoClassificationPageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "unableToClassifyDocumentTitle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AutoClassificationPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AutoClassificationPage m173fromJson(@NotNull m mVar) {
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
            }
        }
        mVar.j();
        return new NextStep.GovernmentId.AutoClassificationPage(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AutoClassificationPage autoClassificationPage) {
        if (autoClassificationPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("unableToClassifyDocumentTitle");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getUnableToClassifyDocumentTitle());
        tVar.Z("unableToClassifyDocumentContinueButtonText");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getUnableToClassifyDocumentContinueButtonText());
        tVar.Z("idClassRejectedTitle");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getIdClassRejectedTitle());
        tVar.Z("idClassRejectedContinueButtonText");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getIdClassRejectedContinueButtonText());
        tVar.Z("countryInputTitle");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getCountryInputTitle());
        tVar.Z("idClassInputTitle");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getIdClassInputTitle());
        tVar.Z("manualClassificationTitle");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getManualClassificationTitle());
        tVar.Z("manualClassificationContinueButtonText");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getManualClassificationContinueButtonText());
        tVar.Z("autoClassificationCaptureTipText");
        this.nullableStringAdapter.toJson(tVar, autoClassificationPage.getAutoClassificationCaptureTipText());
        tVar.y();
    }
}
