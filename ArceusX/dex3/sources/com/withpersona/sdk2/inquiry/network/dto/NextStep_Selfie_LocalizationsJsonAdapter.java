package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Selfie_LocalizationsJsonAdapter extends h<NextStep.Selfie.Localizations> {

    @NotNull
    private final h<NextStep.Selfie.CapturePage> capturePageAdapter;

    @NotNull
    private final h<NextStep.CancelDialog> nullableCancelDialogAdapter;

    @NotNull
    private final h<NextStep.Selfie.CheckPage> nullableCheckPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"promptPage", "capturePage", "pendingPage", "cancelDialog", "checkPage"});

    @NotNull
    private final h<NextStep.Selfie.PendingPage> pendingPageAdapter;

    @NotNull
    private final h<NextStep.Selfie.PromptPage> promptPageAdapter;

    public NextStep_Selfie_LocalizationsJsonAdapter(@NotNull w wVar) {
        this.promptPageAdapter = wVar.f(NextStep.Selfie.PromptPage.class, L.d(), "promptPage");
        this.capturePageAdapter = wVar.f(NextStep.Selfie.CapturePage.class, L.d(), "capturePage");
        this.pendingPageAdapter = wVar.f(NextStep.Selfie.PendingPage.class, L.d(), "pendingPage");
        this.nullableCancelDialogAdapter = wVar.f(NextStep.CancelDialog.class, L.d(), "cancelDialog");
        this.nullableCheckPageAdapter = wVar.f(NextStep.Selfie.CheckPage.class, L.d(), "checkPage");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.Localizations");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.Localizations m192fromJson(@NotNull m mVar) throws j {
        mVar.e();
        NextStep.Selfie.PromptPage promptPage = null;
        NextStep.Selfie.CapturePage capturePage = null;
        NextStep.Selfie.PendingPage pendingPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.Selfie.CheckPage checkPage = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                promptPage = (NextStep.Selfie.PromptPage) this.promptPageAdapter.fromJson(mVar);
                if (promptPage == null) {
                    throw c.x("promptPage", "promptPage", mVar);
                }
            } else if (iP0 == 1) {
                capturePage = (NextStep.Selfie.CapturePage) this.capturePageAdapter.fromJson(mVar);
                if (capturePage == null) {
                    throw c.x("capturePage", "capturePage", mVar);
                }
            } else if (iP0 == 2) {
                pendingPage = (NextStep.Selfie.PendingPage) this.pendingPageAdapter.fromJson(mVar);
                if (pendingPage == null) {
                    throw c.x("pendingPage", "pendingPage", mVar);
                }
            } else if (iP0 == 3) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                checkPage = (NextStep.Selfie.CheckPage) this.nullableCheckPageAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (promptPage == null) {
            throw c.o("promptPage", "promptPage", mVar);
        }
        if (capturePage == null) {
            throw c.o("capturePage", "capturePage", mVar);
        }
        if (pendingPage != null) {
            return new NextStep.Selfie.Localizations(promptPage, capturePage, pendingPage, cancelDialog, checkPage);
        }
        throw c.o("pendingPage", "pendingPage", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.Localizations localizations) {
        if (localizations == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("promptPage");
        this.promptPageAdapter.toJson(tVar, localizations.getPromptPage());
        tVar.Z("capturePage");
        this.capturePageAdapter.toJson(tVar, localizations.getCapturePage());
        tVar.Z("pendingPage");
        this.pendingPageAdapter.toJson(tVar, localizations.getPendingPage());
        tVar.Z("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(tVar, localizations.getCancelDialog());
        tVar.Z("checkPage");
        this.nullableCheckPageAdapter.toJson(tVar, localizations.getCheckPage());
        tVar.y();
    }
}
