package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Document_PagesJsonAdapter extends h<NextStep.Document.Pages> {

    @NotNull
    private final h<NextStep.Document.Pages.DocumentPages> nullableDocumentPagesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"document"});

    public NextStep_Document_PagesJsonAdapter(@NotNull w wVar) {
        this.nullableDocumentPagesAdapter = wVar.f(NextStep.Document.Pages.DocumentPages.class, L.d(), "document");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Pages");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Pages m157fromJson(@NotNull m mVar) {
        mVar.e();
        NextStep.Document.Pages.DocumentPages documentPages = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                documentPages = (NextStep.Document.Pages.DocumentPages) this.nullableDocumentPagesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.Document.Pages(documentPages);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Pages pages) {
        if (pages == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("document");
        this.nullableDocumentPagesAdapter.toJson(tVar, pages.getDocument());
        tVar.y();
    }
}
