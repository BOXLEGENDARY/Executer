package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_CancelDialogJsonAdapter extends h<NextStep.CancelDialog> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "prompt", "btnSubmit", "btnResume"});

    public NextStep_CancelDialogJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.CancelDialog");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.CancelDialog m149fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                str4 = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.CancelDialog(str, str2, str3, str4);
    }

    public void toJson(@NotNull t tVar, NextStep.CancelDialog cancelDialog) {
        if (cancelDialog == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, cancelDialog.getTitle());
        tVar.Z("prompt");
        this.nullableStringAdapter.toJson(tVar, cancelDialog.getPrompt());
        tVar.Z("btnSubmit");
        this.nullableStringAdapter.toJson(tVar, cancelDialog.getBtnSubmit());
        tVar.Z("btnResume");
        this.nullableStringAdapter.toJson(tVar, cancelDialog.getBtnResume());
        tVar.y();
    }
}
