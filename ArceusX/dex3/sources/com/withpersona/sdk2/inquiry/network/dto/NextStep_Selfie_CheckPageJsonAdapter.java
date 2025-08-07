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

public final class NextStep_Selfie_CheckPageJsonAdapter extends h<NextStep.Selfie.CheckPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "btnSubmit", "btnRetake"});

    public NextStep_Selfie_CheckPageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.CheckPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.CheckPage m190fromJson(@NotNull m mVar) {
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
        return new NextStep.Selfie.CheckPage(str, str2, str3, str4, str5, str6, str7);
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.CheckPage checkPage) {
        if (checkPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, checkPage.getTitle());
        tVar.Z("description");
        this.nullableStringAdapter.toJson(tVar, checkPage.getDescription());
        tVar.Z("selfieLabelFront");
        this.nullableStringAdapter.toJson(tVar, checkPage.getSelfieLabelFront());
        tVar.Z("selfieLabelLeft");
        this.nullableStringAdapter.toJson(tVar, checkPage.getSelfieLabelLeft());
        tVar.Z("selfieLabelRight");
        this.nullableStringAdapter.toJson(tVar, checkPage.getSelfieLabelRight());
        tVar.Z("btnSubmit");
        this.nullableStringAdapter.toJson(tVar, checkPage.getBtnSubmit());
        tVar.Z("btnRetake");
        this.nullableStringAdapter.toJson(tVar, checkPage.getBtnRetake());
        tVar.y();
    }
}
