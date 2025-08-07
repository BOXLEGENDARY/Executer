package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Selfie_AssetConfigJsonAdapter extends h<NextStep.Selfie.AssetConfig> {
    private volatile Constructor<NextStep.Selfie.AssetConfig> constructorRef;

    @NotNull
    private final h<NextStep.Selfie.AssetConfig.PromptPage> nullablePromptPageAdapter;

    @NotNull
    private final h<NextStep.Selfie.AssetConfig.RecordPage> nullableRecordPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"promptPage", "recordPage"});

    public NextStep_Selfie_AssetConfigJsonAdapter(@NotNull w wVar) {
        this.nullablePromptPageAdapter = wVar.f(NextStep.Selfie.AssetConfig.PromptPage.class, L.d(), "promptPage");
        this.nullableRecordPageAdapter = wVar.f(NextStep.Selfie.AssetConfig.RecordPage.class, L.d(), "recordPage");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.AssetConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.AssetConfig m186fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        NextStep.Selfie.AssetConfig.PromptPage promptPage = null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                promptPage = (NextStep.Selfie.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                recordPage = (NextStep.Selfie.AssetConfig.RecordPage) this.nullableRecordPageAdapter.fromJson(mVar);
                i &= -3;
            }
        }
        mVar.j();
        if (i == -4) {
            return new NextStep.Selfie.AssetConfig(promptPage, recordPage);
        }
        Constructor<NextStep.Selfie.AssetConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Selfie.AssetConfig.class.getDeclaredConstructor(NextStep.Selfie.AssetConfig.PromptPage.class, NextStep.Selfie.AssetConfig.RecordPage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(promptPage, recordPage, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.AssetConfig assetConfig) {
        if (assetConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("promptPage");
        this.nullablePromptPageAdapter.toJson(tVar, assetConfig.getPromptPage());
        tVar.Z("recordPage");
        this.nullableRecordPageAdapter.toJson(tVar, assetConfig.getRecordPage());
        tVar.y();
    }
}
