package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_DocumentStepImageLocalStyleJsonAdapter extends h<StepStyles.DocumentStepImageLocalStyle> {

    @NotNull
    private final h<StepStyles.DocumentStepImageLocalStyleContainer> nullableDocumentStepImageLocalStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"documentStartIcon"});

    public StepStyles_DocumentStepImageLocalStyleJsonAdapter(@NotNull w wVar) {
        this.nullableDocumentStepImageLocalStyleContainerAdapter = wVar.f(StepStyles.DocumentStepImageLocalStyleContainer.class, L.d(), "documentStartIcon");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.DocumentStepImageLocalStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.DocumentStepImageLocalStyle m455fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.DocumentStepImageLocalStyleContainer documentStepImageLocalStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                documentStepImageLocalStyleContainer = (StepStyles.DocumentStepImageLocalStyleContainer) this.nullableDocumentStepImageLocalStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.DocumentStepImageLocalStyle(documentStepImageLocalStyleContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.DocumentStepImageLocalStyle documentStepImageLocalStyle) {
        if (documentStepImageLocalStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("documentStartIcon");
        this.nullableDocumentStepImageLocalStyleContainerAdapter.toJson(tVar, documentStepImageLocalStyle.getDocumentStartIcon());
        tVar.y();
    }
}
