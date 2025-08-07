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

public final class NextStep_Document_AssetConfigJsonAdapter extends h<NextStep.Document.AssetConfig> {
    private volatile Constructor<NextStep.Document.AssetConfig> constructorRef;

    @NotNull
    private final h<NextStep.Document.AssetConfig.PendingPage> nullablePendingPageAdapter;

    @NotNull
    private final h<NextStep.Document.AssetConfig.PromptPage> nullablePromptPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"promptPage", "pendingPage"});

    public NextStep_Document_AssetConfigJsonAdapter(@NotNull w wVar) {
        this.nullablePromptPageAdapter = wVar.f(NextStep.Document.AssetConfig.PromptPage.class, L.d(), "promptPage");
        this.nullablePendingPageAdapter = wVar.f(NextStep.Document.AssetConfig.PendingPage.class, L.d(), "pendingPage");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.AssetConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.AssetConfig m152fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        NextStep.Document.AssetConfig.PromptPage promptPage = null;
        NextStep.Document.AssetConfig.PendingPage pendingPage = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                promptPage = (NextStep.Document.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                pendingPage = (NextStep.Document.AssetConfig.PendingPage) this.nullablePendingPageAdapter.fromJson(mVar);
                i &= -3;
            }
        }
        mVar.j();
        if (i == -4) {
            return new NextStep.Document.AssetConfig(promptPage, pendingPage);
        }
        Constructor<NextStep.Document.AssetConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Document.AssetConfig.class.getDeclaredConstructor(NextStep.Document.AssetConfig.PromptPage.class, NextStep.Document.AssetConfig.PendingPage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(promptPage, pendingPage, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.AssetConfig assetConfig) {
        if (assetConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("promptPage");
        this.nullablePromptPageAdapter.toJson(tVar, assetConfig.getPromptPage());
        tVar.Z("pendingPage");
        this.nullablePendingPageAdapter.toJson(tVar, assetConfig.getPendingPage());
        tVar.y();
    }
}
