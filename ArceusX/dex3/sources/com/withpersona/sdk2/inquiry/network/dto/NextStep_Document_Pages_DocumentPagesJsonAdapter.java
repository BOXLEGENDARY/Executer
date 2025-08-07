package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Document_Pages_DocumentPagesJsonAdapter extends h<NextStep.Document.Pages.DocumentPages> {

    @NotNull
    private final h<NextStep.Document.Pages.DocumentStartPage> nullableDocumentStartPageAdapter;

    @NotNull
    private final h<NextStep.Document.Pages.UploadOptionsDialog> nullableUploadOptionsDialogAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prompt", "uploadOptionsDialog"});

    public NextStep_Document_Pages_DocumentPagesJsonAdapter(@NotNull w wVar) {
        this.nullableDocumentStartPageAdapter = wVar.f(NextStep.Document.Pages.DocumentStartPage.class, L.d(), "prompt");
        this.nullableUploadOptionsDialogAdapter = wVar.f(NextStep.Document.Pages.UploadOptionsDialog.class, L.d(), "uploadOptionsDialog");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Pages.DocumentPages");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Pages.DocumentPages m158fromJson(@NotNull m mVar) {
        mVar.e();
        NextStep.Document.Pages.DocumentStartPage documentStartPage = null;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                documentStartPage = (NextStep.Document.Pages.DocumentStartPage) this.nullableDocumentStartPageAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                uploadOptionsDialog = (NextStep.Document.Pages.UploadOptionsDialog) this.nullableUploadOptionsDialogAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.Document.Pages.DocumentPages(documentStartPage, uploadOptionsDialog);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Pages.DocumentPages documentPages) {
        if (documentPages == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prompt");
        this.nullableDocumentStartPageAdapter.toJson(tVar, documentPages.getPrompt());
        tVar.Z("uploadOptionsDialog");
        this.nullableUploadOptionsDialogAdapter.toJson(tVar, documentPages.getUploadOptionsDialog());
        tVar.y();
    }
}
