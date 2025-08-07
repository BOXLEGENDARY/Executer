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

public final class NextStep_Selfie_CapturePageJsonAdapter extends h<NextStep.Selfie.CapturePage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_Selfie_CapturePageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.stringAdapter = wVar.f(String.class, L.d(), "selfieHintTakePhoto");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.CapturePage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.CapturePage m189fromJson(@NotNull m mVar) throws j {
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
        while (true) {
            String str12 = str;
            String str13 = str11;
            String str14 = str10;
            String str15 = str9;
            String str16 = str8;
            String str17 = str7;
            String str18 = str6;
            String str19 = str5;
            if (!mVar.u()) {
                mVar.j();
                if (str2 == null) {
                    throw c.o("selfieHintTakePhoto", "selfieHintTakePhoto", mVar);
                }
                if (str3 == null) {
                    throw c.o("selfieHintCenterFace", "selfieHintCenterFace", mVar);
                }
                if (str4 == null) {
                    throw c.o("selfieHintFaceTooClose", "selfieHintFaceTooClose", mVar);
                }
                if (str19 == null) {
                    throw c.o("selfieHintFaceTooFar", "selfieHintFaceTooFar", mVar);
                }
                if (str18 == null) {
                    throw c.o("selfieHintMultipleFaces", "selfieHintMultipleFaces", mVar);
                }
                if (str17 == null) {
                    throw c.o("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", mVar);
                }
                if (str16 == null) {
                    throw c.o("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", mVar);
                }
                if (str15 == null) {
                    throw c.o("selfieHintLookLeft", "selfieHintLookLeft", mVar);
                }
                if (str14 == null) {
                    throw c.o("selfieHintLookRight", "selfieHintLookRight", mVar);
                }
                if (str13 != null) {
                    return new NextStep.Selfie.CapturePage(str12, str2, str3, str4, str19, str18, str17, str16, str15, str14, str13);
                }
                throw c.o("selfieHintHoldStill", "selfieHintHoldStill", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("selfieHintTakePhoto", "selfieHintTakePhoto", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(mVar);
                    if (str3 == null) {
                        throw c.x("selfieHintCenterFace", "selfieHintCenterFace", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(mVar);
                    if (str4 == null) {
                        throw c.x("selfieHintFaceTooClose", "selfieHintFaceTooClose", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(mVar);
                    if (str5 == null) {
                        throw c.x("selfieHintFaceTooFar", "selfieHintFaceTooFar", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(mVar);
                    if (str6 == null) {
                        throw c.x("selfieHintMultipleFaces", "selfieHintMultipleFaces", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str5 = str19;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str7 = (String) this.stringAdapter.fromJson(mVar);
                    if (str7 == null) {
                        throw c.x("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str6 = str18;
                    str5 = str19;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    String str20 = (String) this.stringAdapter.fromJson(mVar);
                    if (str20 == null) {
                        throw c.x("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", mVar);
                    }
                    str8 = str20;
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.stringAdapter.fromJson(mVar);
                    if (str9 == null) {
                        throw c.x("selfieHintLookLeft", "selfieHintLookLeft", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.stringAdapter.fromJson(mVar);
                    if (str10 == null) {
                        throw c.x("selfieHintLookRight", "selfieHintLookRight", mVar);
                    }
                    str = str12;
                    str11 = str13;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str11 = (String) this.stringAdapter.fromJson(mVar);
                    if (str11 == null) {
                        throw c.x("selfieHintHoldStill", "selfieHintHoldStill", mVar);
                    }
                    str = str12;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                default:
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.CapturePage capturePage) {
        if (capturePage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, capturePage.getTitle());
        tVar.Z("selfieHintTakePhoto");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintTakePhoto());
        tVar.Z("selfieHintCenterFace");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintCenterFace());
        tVar.Z("selfieHintFaceTooClose");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintFaceTooClose());
        tVar.Z("selfieHintFaceTooFar");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintFaceTooFar());
        tVar.Z("selfieHintMultipleFaces");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintMultipleFaces());
        tVar.Z("selfieHintFaceIncomplete");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintFaceIncomplete());
        tVar.Z("selfieHintPoseNotCenter");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintPoseNotCenter());
        tVar.Z("selfieHintLookLeft");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintLookLeft());
        tVar.Z("selfieHintLookRight");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintLookRight());
        tVar.Z("selfieHintHoldStill");
        this.stringAdapter.toJson(tVar, capturePage.getSelfieHintHoldStill());
        tVar.y();
    }
}
