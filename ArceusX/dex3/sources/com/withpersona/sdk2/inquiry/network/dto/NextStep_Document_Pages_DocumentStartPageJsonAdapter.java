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

public final class NextStep_Document_Pages_DocumentStartPageJsonAdapter extends h<NextStep.Document.Pages.DocumentStartPage> {

    @NotNull
    private final h<NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping> nullableComponentNameMappingAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"uiStep", "componentNameMapping"});

    @NotNull
    private final h<NextStep.Ui> uiAdapter;

    public NextStep_Document_Pages_DocumentStartPageJsonAdapter(@NotNull w wVar) {
        this.uiAdapter = wVar.f(NextStep.Ui.class, L.d(), "uiStep");
        this.nullableComponentNameMappingAdapter = wVar.f(NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping.class, L.d(), "componentNameMapping");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Pages.DocumentStartPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Pages.DocumentStartPage m159fromJson(@NotNull m mVar) throws j {
        mVar.e();
        NextStep.Ui ui = null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                ui = (NextStep.Ui) this.uiAdapter.fromJson(mVar);
                if (ui == null) {
                    throw c.x("uiStep", "uiStep", mVar);
                }
            } else if (iP0 == 1) {
                componentNameMapping = (NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping) this.nullableComponentNameMappingAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (ui != null) {
            return new NextStep.Document.Pages.DocumentStartPage(ui, componentNameMapping);
        }
        throw c.o("uiStep", "uiStep", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Pages.DocumentStartPage documentStartPage) {
        if (documentStartPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("uiStep");
        this.uiAdapter.toJson(tVar, documentStartPage.getUiStep());
        tVar.Z("componentNameMapping");
        this.nullableComponentNameMappingAdapter.toJson(tVar, documentStartPage.getComponentNameMapping());
        tVar.y();
    }
}
