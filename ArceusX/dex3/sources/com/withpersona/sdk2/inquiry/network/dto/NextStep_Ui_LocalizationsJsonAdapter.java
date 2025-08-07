package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Ui_LocalizationsJsonAdapter extends h<NextStep.Ui.Localizations> {

    @NotNull
    private final h<NextStep.CancelDialog> nullableCancelDialogAdapter;

    @NotNull
    private final h<NextStep.Ui.PromptPage> nullablePromptPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"promptPage", "cancelDialog"});

    public NextStep_Ui_LocalizationsJsonAdapter(@NotNull w wVar) {
        this.nullablePromptPageAdapter = wVar.f(NextStep.Ui.PromptPage.class, L.d(), "promptPage");
        this.nullableCancelDialogAdapter = wVar.f(NextStep.CancelDialog.class, L.d(), "cancelDialog");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Ui.Localizations");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Ui.Localizations m197fromJson(@NotNull m mVar) {
        mVar.e();
        NextStep.Ui.PromptPage promptPage = null;
        NextStep.CancelDialog cancelDialog = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                promptPage = (NextStep.Ui.PromptPage) this.nullablePromptPageAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.Ui.Localizations(promptPage, cancelDialog);
    }

    public void toJson(@NotNull t tVar, NextStep.Ui.Localizations localizations) {
        if (localizations == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("promptPage");
        this.nullablePromptPageAdapter.toJson(tVar, localizations.getPromptPage());
        tVar.Z("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(tVar, localizations.getCancelDialog());
        tVar.y();
    }
}
