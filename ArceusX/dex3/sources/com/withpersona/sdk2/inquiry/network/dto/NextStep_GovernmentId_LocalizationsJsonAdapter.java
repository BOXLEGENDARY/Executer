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

public final class NextStep_GovernmentId_LocalizationsJsonAdapter extends h<NextStep.GovernmentId.Localizations> {

    @NotNull
    private final h<NextStep.GovernmentId.CapturePage> capturePageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.CheckPage> checkPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AutoClassificationPage> nullableAutoClassificationPageAdapter;

    @NotNull
    private final h<NextStep.CancelDialog> nullableCancelDialogAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selectPage", "promptPage", "capturePage", "checkPage", "pendingPage", "requestPage", "reviewUploadPage", "cancelDialog", "autoClassificationPage"});

    @NotNull
    private final h<NextStep.GovernmentId.PendingPage> pendingPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.PromptPage> promptPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.RequestPage> requestPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.ReviewUploadPage> reviewUploadPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.SelectPage> selectPageAdapter;

    public NextStep_GovernmentId_LocalizationsJsonAdapter(@NotNull w wVar) {
        this.selectPageAdapter = wVar.f(NextStep.GovernmentId.SelectPage.class, L.d(), "selectPage");
        this.promptPageAdapter = wVar.f(NextStep.GovernmentId.PromptPage.class, L.d(), "promptPage");
        this.capturePageAdapter = wVar.f(NextStep.GovernmentId.CapturePage.class, L.d(), "capturePage");
        this.checkPageAdapter = wVar.f(NextStep.GovernmentId.CheckPage.class, L.d(), "checkPage");
        this.pendingPageAdapter = wVar.f(NextStep.GovernmentId.PendingPage.class, L.d(), "pendingPage");
        this.requestPageAdapter = wVar.f(NextStep.GovernmentId.RequestPage.class, L.d(), "requestPage");
        this.reviewUploadPageAdapter = wVar.f(NextStep.GovernmentId.ReviewUploadPage.class, L.d(), "reviewUploadPage");
        this.nullableCancelDialogAdapter = wVar.f(NextStep.CancelDialog.class, L.d(), "cancelDialog");
        this.nullableAutoClassificationPageAdapter = wVar.f(NextStep.GovernmentId.AutoClassificationPage.class, L.d(), "autoClassificationPage");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.Localizations");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.Localizations m180fromJson(@NotNull m mVar) throws j {
        mVar.e();
        NextStep.GovernmentId.SelectPage selectPage = null;
        NextStep.GovernmentId.PromptPage promptPage = null;
        NextStep.GovernmentId.CapturePage capturePage = null;
        NextStep.GovernmentId.CheckPage checkPage = null;
        NextStep.GovernmentId.PendingPage pendingPage = null;
        NextStep.GovernmentId.RequestPage requestPage = null;
        NextStep.GovernmentId.ReviewUploadPage reviewUploadPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = null;
        while (true) {
            NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = autoClassificationPage;
            NextStep.CancelDialog cancelDialog2 = cancelDialog;
            NextStep.GovernmentId.ReviewUploadPage reviewUploadPage2 = reviewUploadPage;
            if (!mVar.u()) {
                mVar.j();
                if (selectPage == null) {
                    throw c.o("selectPage", "selectPage", mVar);
                }
                if (promptPage == null) {
                    throw c.o("promptPage", "promptPage", mVar);
                }
                if (capturePage == null) {
                    throw c.o("capturePage", "capturePage", mVar);
                }
                if (checkPage == null) {
                    throw c.o("checkPage", "checkPage", mVar);
                }
                if (pendingPage == null) {
                    throw c.o("pendingPage", "pendingPage", mVar);
                }
                if (requestPage == null) {
                    throw c.o("requestPage", "requestPage", mVar);
                }
                if (reviewUploadPage2 != null) {
                    return new NextStep.GovernmentId.Localizations(selectPage, promptPage, capturePage, checkPage, pendingPage, requestPage, reviewUploadPage2, cancelDialog2, autoClassificationPage2);
                }
                throw c.o("reviewUploadPage", "reviewUploadPage", mVar);
            }
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 0:
                    selectPage = (NextStep.GovernmentId.SelectPage) this.selectPageAdapter.fromJson(mVar);
                    if (selectPage == null) {
                        throw c.x("selectPage", "selectPage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 1:
                    promptPage = (NextStep.GovernmentId.PromptPage) this.promptPageAdapter.fromJson(mVar);
                    if (promptPage == null) {
                        throw c.x("promptPage", "promptPage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 2:
                    capturePage = (NextStep.GovernmentId.CapturePage) this.capturePageAdapter.fromJson(mVar);
                    if (capturePage == null) {
                        throw c.x("capturePage", "capturePage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 3:
                    checkPage = (NextStep.GovernmentId.CheckPage) this.checkPageAdapter.fromJson(mVar);
                    if (checkPage == null) {
                        throw c.x("checkPage", "checkPage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 4:
                    pendingPage = (NextStep.GovernmentId.PendingPage) this.pendingPageAdapter.fromJson(mVar);
                    if (pendingPage == null) {
                        throw c.x("pendingPage", "pendingPage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case 5:
                    requestPage = (NextStep.GovernmentId.RequestPage) this.requestPageAdapter.fromJson(mVar);
                    if (requestPage == null) {
                        throw c.x("requestPage", "requestPage", mVar);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    NextStep.GovernmentId.ReviewUploadPage reviewUploadPage3 = (NextStep.GovernmentId.ReviewUploadPage) this.reviewUploadPageAdapter.fromJson(mVar);
                    if (reviewUploadPage3 == null) {
                        throw c.x("reviewUploadPage", "reviewUploadPage", mVar);
                    }
                    reviewUploadPage = reviewUploadPage3;
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(mVar);
                    autoClassificationPage = autoClassificationPage2;
                    reviewUploadPage = reviewUploadPage2;
                case R.styleable.LottieAnimationView_lottie_loop:
                    autoClassificationPage = (NextStep.GovernmentId.AutoClassificationPage) this.nullableAutoClassificationPageAdapter.fromJson(mVar);
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                default:
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
            }
        }
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.Localizations localizations) {
        if (localizations == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selectPage");
        this.selectPageAdapter.toJson(tVar, localizations.getSelectPage());
        tVar.Z("promptPage");
        this.promptPageAdapter.toJson(tVar, localizations.getPromptPage());
        tVar.Z("capturePage");
        this.capturePageAdapter.toJson(tVar, localizations.getCapturePage());
        tVar.Z("checkPage");
        this.checkPageAdapter.toJson(tVar, localizations.getCheckPage());
        tVar.Z("pendingPage");
        this.pendingPageAdapter.toJson(tVar, localizations.getPendingPage());
        tVar.Z("requestPage");
        this.requestPageAdapter.toJson(tVar, localizations.getRequestPage());
        tVar.Z("reviewUploadPage");
        this.reviewUploadPageAdapter.toJson(tVar, localizations.getReviewUploadPage());
        tVar.Z("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(tVar, localizations.getCancelDialog());
        tVar.Z("autoClassificationPage");
        this.nullableAutoClassificationPageAdapter.toJson(tVar, localizations.getAutoClassificationPage());
        tVar.y();
    }
}
