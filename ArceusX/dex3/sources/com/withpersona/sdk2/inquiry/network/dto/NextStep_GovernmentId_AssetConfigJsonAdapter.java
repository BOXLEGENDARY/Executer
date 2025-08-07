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

public final class NextStep_GovernmentId_AssetConfigJsonAdapter extends h<NextStep.GovernmentId.AssetConfig> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig> constructorRef;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig.CapturePage> nullableCapturePageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig.CheckPage> nullableCheckPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig.PendingPage> nullablePendingPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig.PromptPage> nullablePromptPageAdapter;

    @NotNull
    private final h<NextStep.GovernmentId.AssetConfig.SelectPage> nullableSelectPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selectPage", "promptPage", "capturePage", "checkPage", "pendingPage"});

    public NextStep_GovernmentId_AssetConfigJsonAdapter(@NotNull w wVar) {
        this.nullableSelectPageAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.SelectPage.class, L.d(), "selectPage");
        this.nullablePromptPageAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.PromptPage.class, L.d(), "promptPage");
        this.nullableCapturePageAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.CapturePage.class, L.d(), "capturePage");
        this.nullableCheckPageAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.CheckPage.class, L.d(), "checkPage");
        this.nullablePendingPageAdapter = wVar.f(NextStep.GovernmentId.AssetConfig.PendingPage.class, L.d(), "pendingPage");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig m166fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = null;
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage = null;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = null;
        NextStep.GovernmentId.AssetConfig.CheckPage checkPage = null;
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                selectPage = (NextStep.GovernmentId.AssetConfig.SelectPage) this.nullableSelectPageAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                promptPage = (NextStep.GovernmentId.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(mVar);
                i &= -3;
            } else if (iP0 == 2) {
                capturePage = (NextStep.GovernmentId.AssetConfig.CapturePage) this.nullableCapturePageAdapter.fromJson(mVar);
                i &= -5;
            } else if (iP0 == 3) {
                checkPage = (NextStep.GovernmentId.AssetConfig.CheckPage) this.nullableCheckPageAdapter.fromJson(mVar);
                i &= -9;
            } else if (iP0 == 4) {
                pendingPage = (NextStep.GovernmentId.AssetConfig.PendingPage) this.nullablePendingPageAdapter.fromJson(mVar);
                i &= -17;
            }
        }
        mVar.j();
        if (i == -32) {
            return new NextStep.GovernmentId.AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
        }
        Constructor<NextStep.GovernmentId.AssetConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.class.getDeclaredConstructor(NextStep.GovernmentId.AssetConfig.SelectPage.class, NextStep.GovernmentId.AssetConfig.PromptPage.class, NextStep.GovernmentId.AssetConfig.CapturePage.class, NextStep.GovernmentId.AssetConfig.CheckPage.class, NextStep.GovernmentId.AssetConfig.PendingPage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(selectPage, promptPage, capturePage, checkPage, pendingPage, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig assetConfig) {
        if (assetConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selectPage");
        this.nullableSelectPageAdapter.toJson(tVar, assetConfig.getSelectPage());
        tVar.Z("promptPage");
        this.nullablePromptPageAdapter.toJson(tVar, assetConfig.getPromptPage());
        tVar.Z("capturePage");
        this.nullableCapturePageAdapter.toJson(tVar, assetConfig.getCapturePage());
        tVar.Z("checkPage");
        this.nullableCheckPageAdapter.toJson(tVar, assetConfig.getCheckPage());
        tVar.Z("pendingPage");
        this.nullablePendingPageAdapter.toJson(tVar, assetConfig.getPendingPage());
        tVar.y();
    }
}
