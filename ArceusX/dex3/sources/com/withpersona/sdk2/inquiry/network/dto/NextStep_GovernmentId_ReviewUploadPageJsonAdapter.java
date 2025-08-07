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

public final class NextStep_GovernmentId_ReviewUploadPageJsonAdapter extends h<NextStep.GovernmentId.ReviewUploadPage> {

    @NotNull
    private final m.b options = m.b.a(new String[]{"titleFront", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_ReviewUploadPageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "titleFront");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.ReviewUploadPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.ReviewUploadPage m184fromJson(@NotNull m mVar) throws j {
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
        while (true) {
            String str11 = str10;
            String str12 = str9;
            String str13 = str8;
            String str14 = str7;
            String str15 = str6;
            String str16 = str5;
            String str17 = str4;
            if (!mVar.u()) {
                mVar.j();
                if (str == null) {
                    throw c.o("titleFront", "titleFront", mVar);
                }
                if (str2 == null) {
                    throw c.o("titleBack", "titleBack", mVar);
                }
                if (str3 == null) {
                    throw c.o("titlePdf417", "titlePdf417", mVar);
                }
                if (str17 == null) {
                    throw c.o("titlePassportSignature", "titlePassportSignature", mVar);
                }
                if (str16 == null) {
                    throw c.o("descriptionFront", "descriptionFront", mVar);
                }
                if (str15 == null) {
                    throw c.o("descriptionBack", "descriptionBack", mVar);
                }
                if (str14 == null) {
                    throw c.o("descriptionPdf417", "descriptionPdf417", mVar);
                }
                if (str13 == null) {
                    throw c.o("descriptionPassportSignature", "descriptionPassportSignature", mVar);
                }
                if (str12 == null) {
                    throw c.o("confirmButtonText", "confirmButtonText", mVar);
                }
                if (str11 != null) {
                    return new NextStep.GovernmentId.ReviewUploadPage(str, str2, str3, str17, str16, str15, str14, str13, str12, str11);
                }
                throw c.o("chooseAnotherButtonText", "chooseAnotherButtonText", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x("titleFront", "titleFront", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("titleBack", "titleBack", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(mVar);
                    if (str3 == null) {
                        throw c.x("titlePdf417", "titlePdf417", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(mVar);
                    if (str4 == null) {
                        throw c.x("titlePassportSignature", "titlePassportSignature", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(mVar);
                    if (str5 == null) {
                        throw c.x("descriptionFront", "descriptionFront", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str4 = str17;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(mVar);
                    if (str6 == null) {
                        throw c.x("descriptionBack", "descriptionBack", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str5 = str16;
                    str4 = str17;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    String str18 = (String) this.stringAdapter.fromJson(mVar);
                    if (str18 == null) {
                        throw c.x("descriptionPdf417", "descriptionPdf417", mVar);
                    }
                    str7 = str18;
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    str8 = (String) this.stringAdapter.fromJson(mVar);
                    if (str8 == null) {
                        throw c.x("descriptionPassportSignature", "descriptionPassportSignature", mVar);
                    }
                    str10 = str11;
                    str9 = str12;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.stringAdapter.fromJson(mVar);
                    if (str9 == null) {
                        throw c.x("confirmButtonText", "confirmButtonText", mVar);
                    }
                    str10 = str11;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.stringAdapter.fromJson(mVar);
                    if (str10 == null) {
                        throw c.x("chooseAnotherButtonText", "chooseAnotherButtonText", mVar);
                    }
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
                default:
                    str10 = str11;
                    str9 = str12;
                    str8 = str13;
                    str7 = str14;
                    str6 = str15;
                    str5 = str16;
                    str4 = str17;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        if (reviewUploadPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("titleFront");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getTitleFront());
        tVar.Z("titleBack");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getTitleBack());
        tVar.Z("titlePdf417");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getTitlePdf417());
        tVar.Z("titlePassportSignature");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getTitlePassportSignature());
        tVar.Z("descriptionFront");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getDescriptionFront());
        tVar.Z("descriptionBack");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getDescriptionBack());
        tVar.Z("descriptionPdf417");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getDescriptionPdf417());
        tVar.Z("descriptionPassportSignature");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getDescriptionPassportSignature());
        tVar.Z("confirmButtonText");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getConfirmButtonText());
        tVar.Z("chooseAnotherButtonText");
        this.stringAdapter.toJson(tVar, reviewUploadPage.getChooseAnotherButtonText());
        tVar.y();
    }
}
