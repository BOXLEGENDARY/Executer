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

public final class NextStep_GovernmentId_AssetConfig_SelectPageJsonAdapter extends h<NextStep.GovernmentId.AssetConfig.SelectPage> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.SelectPage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"headerPictograph", "iconDriversLicense", "iconPassport", "iconNationalId", "iconGovernmentId"});

    public NextStep_GovernmentId_AssetConfig_SelectPageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "headerPictograph");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig.SelectPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig.SelectPage m171fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
        RemoteImage remoteImage4 = null;
        RemoteImage remoteImage5 = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                remoteImage2 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i &= -3;
            } else if (iP0 == 2) {
                remoteImage3 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i &= -5;
            } else if (iP0 == 3) {
                remoteImage4 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i &= -9;
            } else if (iP0 == 4) {
                remoteImage5 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                i &= -17;
            }
        }
        mVar.j();
        if (i == -32) {
            return new NextStep.GovernmentId.AssetConfig.SelectPage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.SelectPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.SelectPage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig.SelectPage selectPage) {
        if (selectPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("headerPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, selectPage.getHeaderPictograph());
        tVar.Z("iconDriversLicense");
        this.nullableRemoteImageAdapter.toJson(tVar, selectPage.getIconDriversLicense());
        tVar.Z("iconPassport");
        this.nullableRemoteImageAdapter.toJson(tVar, selectPage.getIconPassport());
        tVar.Z("iconNationalId");
        this.nullableRemoteImageAdapter.toJson(tVar, selectPage.getIconNationalId());
        tVar.Z("iconGovernmentId");
        this.nullableRemoteImageAdapter.toJson(tVar, selectPage.getIconGovernmentId());
        tVar.y();
    }
}
