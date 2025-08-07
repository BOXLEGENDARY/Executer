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

public final class NextStep_Document_LocalizationsJsonAdapter extends h<NextStep.Document.Localizations> {

    @NotNull
    private final h<NextStep.CancelDialog> nullableCancelDialogAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"pendingPage", "promptPage", "cancelDialog"});

    @NotNull
    private final h<NextStep.Document.PendingPage> pendingPageAdapter;

    @NotNull
    private final h<NextStep.Document.PromptPage> promptPageAdapter;

    public NextStep_Document_LocalizationsJsonAdapter(@NotNull w wVar) {
        this.pendingPageAdapter = wVar.f(NextStep.Document.PendingPage.class, L.d(), "pendingPage");
        this.promptPageAdapter = wVar.f(NextStep.Document.PromptPage.class, L.d(), "promptPage");
        this.nullableCancelDialogAdapter = wVar.f(NextStep.CancelDialog.class, L.d(), "cancelDialog");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Localizations");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Localizations m156fromJson(@NotNull m mVar) throws j {
        mVar.e();
        NextStep.Document.PendingPage pendingPage = null;
        NextStep.Document.PromptPage promptPage = null;
        NextStep.CancelDialog cancelDialog = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                pendingPage = (NextStep.Document.PendingPage) this.pendingPageAdapter.fromJson(mVar);
                if (pendingPage == null) {
                    throw c.x("pendingPage", "pendingPage", mVar);
                }
            } else if (iP0 == 1) {
                promptPage = (NextStep.Document.PromptPage) this.promptPageAdapter.fromJson(mVar);
                if (promptPage == null) {
                    throw c.x("promptPage", "promptPage", mVar);
                }
            } else if (iP0 == 2) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (pendingPage == null) {
            throw c.o("pendingPage", "pendingPage", mVar);
        }
        if (promptPage != null) {
            return new NextStep.Document.Localizations(pendingPage, promptPage, cancelDialog);
        }
        throw c.o("promptPage", "promptPage", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Localizations localizations) {
        if (localizations == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("pendingPage");
        this.pendingPageAdapter.toJson(tVar, localizations.getPendingPage());
        tVar.Z("promptPage");
        this.promptPageAdapter.toJson(tVar, localizations.getPromptPage());
        tVar.Z("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(tVar, localizations.getCancelDialog());
        tVar.y();
    }
}
