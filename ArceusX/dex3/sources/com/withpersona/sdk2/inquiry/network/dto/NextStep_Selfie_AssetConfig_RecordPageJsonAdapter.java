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

public final class NextStep_Selfie_AssetConfig_RecordPageJsonAdapter extends h<NextStep.Selfie.AssetConfig.RecordPage> {
    private volatile Constructor<NextStep.Selfie.AssetConfig.RecordPage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"loadingPictograph", "selfieLeftPictograph", "selfieRightPictograph"});

    public NextStep_Selfie_AssetConfig_RecordPageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "loadingPictograph");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Selfie.AssetConfig.RecordPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Selfie.AssetConfig.RecordPage m188fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
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
            }
        }
        mVar.j();
        if (i == -8) {
            return new NextStep.Selfie.AssetConfig.RecordPage(remoteImage, remoteImage2, remoteImage3);
        }
        Constructor<NextStep.Selfie.AssetConfig.RecordPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Selfie.AssetConfig.RecordPage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, remoteImage3, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.Selfie.AssetConfig.RecordPage recordPage) {
        if (recordPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("loadingPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, recordPage.getLoadingPictograph());
        tVar.Z("selfieLeftPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, recordPage.getSelfieLeftPictograph());
        tVar.Z("selfieRightPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, recordPage.getSelfieRightPictograph());
        tVar.y();
    }
}
