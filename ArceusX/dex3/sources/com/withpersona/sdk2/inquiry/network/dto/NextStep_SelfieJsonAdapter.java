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

public final class NextStep_SelfieJsonAdapter extends h<NextStep.Selfie> {

    @NotNull
    private final h<NextStep.Selfie.Config> configAdapter;

    @NotNull
    private final h<StepStyles.SelfieStepStyle> nullableSelfieStepStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "config", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_SelfieJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.configAdapter = wVar.f(NextStep.Selfie.Config.class, L.d(), "config");
        this.nullableSelfieStepStyleAdapter = wVar.f(StepStyles.SelfieStepStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie m185fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        NextStep.Selfie.Config config = null;
        StepStyles.SelfieStepStyle selfieStepStyle = null;
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
                config = (NextStep.Selfie.Config) this.configAdapter.fromJson(mVar);
                if (config == null) {
                    throw c.x("config", "config", mVar);
                }
            } else if (iP0 == 2) {
                selfieStepStyle = (StepStyles.SelfieStepStyle) this.nullableSelfieStepStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (config != null) {
            return new NextStep.Selfie(str, config, selfieStepStyle);
        }
        throw c.o("config", "config", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie selfie) {
        if (selfie == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, selfie.getName());
        tVar.Z("config");
        this.configAdapter.toJson(tVar, selfie.getConfig());
        tVar.Z("styles");
        this.nullableSelfieStepStyleAdapter.toJson(tVar, selfie.getStyles());
        tVar.y();
    }
}
