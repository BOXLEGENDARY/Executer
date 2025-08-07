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

public final class NextStep_GovernmentId_CapturePageJsonAdapter extends h<NextStep.GovernmentId.CapturePage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", "btnHelp", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_CapturePageJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.stringAdapter = wVar.f(String.class, L.d(), "scanFront");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.CapturePage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.CapturePage m174fromJson(@NotNull m mVar) throws j {
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
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        while (true) {
            String str25 = str12;
            String str26 = str11;
            String str27 = str10;
            String str28 = str9;
            String str29 = str;
            String str30 = str8;
            if (!mVar.u()) {
                mVar.j();
                if (str2 == null) {
                    throw c.o("scanFront", "scanFront", mVar);
                }
                if (str3 == null) {
                    throw c.o("scanBack", "scanBack", mVar);
                }
                if (str4 == null) {
                    throw c.o("scanPdf417", "scanPdf417", mVar);
                }
                if (str5 == null) {
                    throw c.o("scanFrontOrBack", "scanFrontOrBack", mVar);
                }
                if (str6 == null) {
                    throw c.o("scanSignature", "scanSignature", mVar);
                }
                if (str7 == null) {
                    throw c.o("capturing", "capturing", mVar);
                }
                if (str30 != null) {
                    return new NextStep.GovernmentId.CapturePage(str29, str2, str3, str4, str5, str6, str7, str30, str28, str27, str26, str25, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
                }
                throw c.o("confirmCapture", "confirmCapture", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str8 = str30;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(mVar);
                    if (str2 == null) {
                        throw c.x("scanFront", "scanFront", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(mVar);
                    if (str3 == null) {
                        throw c.x("scanBack", "scanBack", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(mVar);
                    if (str4 == null) {
                        throw c.x("scanPdf417", "scanPdf417", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(mVar);
                    if (str5 == null) {
                        throw c.x("scanFrontOrBack", "scanFrontOrBack", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(mVar);
                    if (str6 == null) {
                        throw c.x("scanSignature", "scanSignature", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    str7 = (String) this.stringAdapter.fromJson(mVar);
                    if (str7 == null) {
                        throw c.x("capturing", "capturing", mVar);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    String str31 = (String) this.stringAdapter.fromJson(mVar);
                    if (str31 == null) {
                        throw c.x("confirmCapture", "confirmCapture", mVar);
                    }
                    str8 = str31;
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                case R.styleable.LottieAnimationView_lottie_loop:
                    str9 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_progress:
                    str10 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    str11 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    str12 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    str13 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    str14 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_scale:
                    str15 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_speed:
                    str16 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case R.styleable.LottieAnimationView_lottie_url:
                    str17 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 21:
                    str22 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 22:
                    str23 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                case 23:
                    str24 = (String) this.nullableStringAdapter.fromJson(mVar);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                default:
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.CapturePage capturePage) {
        if (capturePage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, capturePage.getTitle());
        tVar.Z("scanFront");
        this.stringAdapter.toJson(tVar, capturePage.getScanFront());
        tVar.Z("scanBack");
        this.stringAdapter.toJson(tVar, capturePage.getScanBack());
        tVar.Z("scanPdf417");
        this.stringAdapter.toJson(tVar, capturePage.getScanPdf417());
        tVar.Z("scanFrontOrBack");
        this.stringAdapter.toJson(tVar, capturePage.getScanFrontOrBack());
        tVar.Z("scanSignature");
        this.stringAdapter.toJson(tVar, capturePage.getScanSignature());
        tVar.Z("capturing");
        this.stringAdapter.toJson(tVar, capturePage.getCapturing());
        tVar.Z("confirmCapture");
        this.stringAdapter.toJson(tVar, capturePage.getConfirmCapture());
        tVar.Z("disclaimer");
        this.nullableStringAdapter.toJson(tVar, capturePage.getDisclaimer());
        tVar.Z("hintHoldStill");
        this.nullableStringAdapter.toJson(tVar, capturePage.getHintHoldStill());
        tVar.Z("hintLowLight");
        this.nullableStringAdapter.toJson(tVar, capturePage.getHintLowLight());
        tVar.Z("btnHelp");
        this.nullableStringAdapter.toJson(tVar, capturePage.getBtnHelp());
        tVar.Z("barcodeHelpModalTitle");
        this.nullableStringAdapter.toJson(tVar, capturePage.getBarcodeHelpModalTitle());
        tVar.Z("barcodeHelpModalPrompt");
        this.nullableStringAdapter.toJson(tVar, capturePage.getBarcodeHelpModalPrompt());
        tVar.Z("barcodeHelpModalHints");
        this.nullableStringAdapter.toJson(tVar, capturePage.getBarcodeHelpModalHints());
        tVar.Z("barcodeHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(tVar, capturePage.getBarcodeHelpModalContinueBtn());
        tVar.Z("idFrontHelpModalTitle");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdFrontHelpModalTitle());
        tVar.Z("idFrontHelpModalPrompt");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdFrontHelpModalPrompt());
        tVar.Z("idFrontHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdFrontHelpModalHintsMobile());
        tVar.Z("idFrontHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdFrontHelpModalContinueBtn());
        tVar.Z("idBackHelpModalTitle");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdBackHelpModalTitle());
        tVar.Z("idBackHelpModalPrompt");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdBackHelpModalPrompt());
        tVar.Z("idBackHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdBackHelpModalHintsMobile());
        tVar.Z("idBackHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(tVar, capturePage.getIdBackHelpModalContinueBtn());
        tVar.y();
    }
}
