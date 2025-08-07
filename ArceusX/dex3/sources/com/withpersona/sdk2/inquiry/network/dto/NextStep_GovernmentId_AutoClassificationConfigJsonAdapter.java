package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_AutoClassificationConfigJsonAdapter extends h<NextStep.GovernmentId.AutoClassificationConfig> {
    private volatile Constructor<NextStep.GovernmentId.AutoClassificationConfig> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<CapturePageConfig> nullableCapturePageConfigAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"isEnabled", "extractTextFromImage", "capturePageConfig"});

    public NextStep_GovernmentId_AutoClassificationConfigJsonAdapter(@NotNull w wVar) {
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "isEnabled");
        this.nullableCapturePageConfigAdapter = wVar.f(CapturePageConfig.class, L.d(), "capturePageConfig");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AutoClassificationConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AutoClassificationConfig m172fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        Boolean bool = null;
        Boolean bool2 = null;
        CapturePageConfig capturePageConfig = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                i &= -3;
            } else if (iP0 == 2) {
                capturePageConfig = (CapturePageConfig) this.nullableCapturePageConfigAdapter.fromJson(mVar);
                i &= -5;
            }
        }
        mVar.j();
        if (i == -8) {
            return new NextStep.GovernmentId.AutoClassificationConfig(bool, bool2, capturePageConfig);
        }
        Constructor<NextStep.GovernmentId.AutoClassificationConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AutoClassificationConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, CapturePageConfig.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(bool, bool2, capturePageConfig, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig) {
        if (autoClassificationConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("isEnabled");
        this.nullableBooleanAdapter.toJson(tVar, autoClassificationConfig.isEnabled());
        tVar.Z("extractTextFromImage");
        this.nullableBooleanAdapter.toJson(tVar, autoClassificationConfig.getExtractTextFromImage());
        tVar.Z("capturePageConfig");
        this.nullableCapturePageConfigAdapter.toJson(tVar, autoClassificationConfig.getCapturePageConfig());
        tVar.y();
    }
}
