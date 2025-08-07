package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_AssetConfig_CheckPageJsonAdapter extends h<NextStep.GovernmentId.AssetConfig.CheckPage> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.CheckPage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"iconFile"});

    public NextStep_GovernmentId_AssetConfig_CheckPageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "iconFile");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig.CheckPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig.CheckPage m168fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i = -2;
            }
        }
        mVar.j();
        if (i == -2) {
            return new NextStep.GovernmentId.AssetConfig.CheckPage(remoteImage);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.CheckPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.CheckPage.class.getDeclaredConstructor(RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig.CheckPage checkPage) {
        if (checkPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("iconFile");
        this.nullableRemoteImageAdapter.toJson(tVar, checkPage.getIconFile());
        tVar.y();
    }
}
