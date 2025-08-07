package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_DocumentJsonAdapter extends h<NextStep.Document> {

    @NotNull
    private final h<NextStep.Document.Config> configAdapter;

    @NotNull
    private final h<StepStyles.DocumentStepStyle> nullableDocumentStepStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "styles", "config"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_DocumentJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableDocumentStepStyleAdapter = wVar.f(StepStyles.DocumentStepStyle.class, L.d(), "styles");
        this.configAdapter = wVar.f(NextStep.Document.Config.class, L.d(), "config");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document m151fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        NextStep.Document.Config config = null;
        StepStyles.DocumentStepStyle documentStepStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                documentStepStyle = (StepStyles.DocumentStepStyle) this.nullableDocumentStepStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2 && (config = (NextStep.Document.Config) this.configAdapter.fromJson(mVar)) == null) {
                throw c.x("config", "config", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (config != null) {
            return new NextStep.Document(str, documentStepStyle, config);
        }
        throw c.o("config", "config", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Document document) {
        if (document == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, document.getName());
        tVar.Z("styles");
        this.nullableDocumentStepStyleAdapter.toJson(tVar, document.getStyles());
        tVar.Z("config");
        this.configAdapter.toJson(tVar, document.getConfig());
        tVar.y();
    }
}
