package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_UiJsonAdapter extends h<NextStep.Ui> {

    @NotNull
    private final h<NextStep.Ui.Config> configAdapter;
    private volatile Constructor<NextStep.Ui> constructorRef;

    @NotNull
    private final h<StepStyles.UiStepStyle> nullableUiStepStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "config", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_UiJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.configAdapter = wVar.f(NextStep.Ui.Config.class, L.d(), "config");
        this.nullableUiStepStyleAdapter = wVar.f(StepStyles.UiStepStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Ui");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Ui m195fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        NextStep.Ui.Config config = null;
        StepStyles.UiStepStyle uiStepStyle = null;
        int i = -1;
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
                config = (NextStep.Ui.Config) this.configAdapter.fromJson(mVar);
                if (config == null) {
                    throw c.x("config", "config", mVar);
                }
            } else if (iP0 == 2) {
                uiStepStyle = (StepStyles.UiStepStyle) this.nullableUiStepStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str == null) {
                throw c.o("name", "name", mVar);
            }
            if (config != null) {
                return new NextStep.Ui(str, config, uiStepStyle);
            }
            throw c.o("config", "config", mVar);
        }
        Constructor<NextStep.Ui> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Ui.class.getDeclaredConstructor(String.class, NextStep.Ui.Config.class, StepStyles.UiStepStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (config != null) {
            return declaredConstructor.newInstance(str, config, uiStepStyle, Integer.valueOf(i), null);
        }
        throw c.o("config", "config", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Ui ui) {
        if (ui == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, ui.getName());
        tVar.Z("config");
        this.configAdapter.toJson(tVar, ui.getConfig());
        tVar.Z("styles");
        this.nullableUiStepStyleAdapter.toJson(tVar, ui.getStyles());
        tVar.y();
    }
}
