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

public final class NextStep_GovernmentIdJsonAdapter extends h<NextStep.GovernmentId> {

    @NotNull
    private final h<NextStep.GovernmentId.Config> configAdapter;

    @NotNull
    private final h<StepStyles.GovernmentIdStepStyle> nullableGovernmentIdStepStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "config", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentIdJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.configAdapter = wVar.f(NextStep.GovernmentId.Config.class, L.d(), "config");
        this.nullableGovernmentIdStepStyleAdapter = wVar.f(StepStyles.GovernmentIdStepStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId m165fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        NextStep.GovernmentId.Config config = null;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = null;
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
                config = (NextStep.GovernmentId.Config) this.configAdapter.fromJson(mVar);
                if (config == null) {
                    throw c.x("config", "config", mVar);
                }
            } else if (iP0 == 2) {
                governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) this.nullableGovernmentIdStepStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (config != null) {
            return new NextStep.GovernmentId(str, config, governmentIdStepStyle);
        }
        throw c.o("config", "config", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId governmentId) {
        if (governmentId == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, governmentId.getName());
        tVar.Z("config");
        this.configAdapter.toJson(tVar, governmentId.getConfig());
        tVar.Z("styles");
        this.nullableGovernmentIdStepStyleAdapter.toJson(tVar, governmentId.getStyles());
        tVar.y();
    }
}
