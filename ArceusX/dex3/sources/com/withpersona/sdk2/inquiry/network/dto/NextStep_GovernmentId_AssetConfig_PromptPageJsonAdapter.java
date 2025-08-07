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

public final class NextStep_GovernmentId_AssetConfig_PromptPageJsonAdapter extends h<NextStep.GovernmentId.AssetConfig.PromptPage> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.PromptPage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"headerPictograph", "idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph"});

    public NextStep_GovernmentId_AssetConfig_PromptPageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "headerPictograph");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig.PromptPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig.PromptPage m170fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        int i = -1;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
        RemoteImage remoteImage4 = null;
        RemoteImage remoteImage5 = null;
        RemoteImage remoteImage6 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -2;
                    break;
                case 1:
                    remoteImage2 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -3;
                    break;
                case 2:
                    remoteImage3 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -5;
                    break;
                case 3:
                    remoteImage4 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -9;
                    break;
                case 4:
                    remoteImage5 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -17;
                    break;
                case 5:
                    remoteImage6 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -33;
                    break;
            }
        }
        mVar.j();
        if (i == -64) {
            return new NextStep.GovernmentId.AssetConfig.PromptPage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.PromptPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.PromptPage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig.PromptPage promptPage) {
        if (promptPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("headerPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getHeaderPictograph());
        tVar.Z("idFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getIdFrontPictograph());
        tVar.Z("idBackPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getIdBackPictograph());
        tVar.Z("barcodePdf417Pictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getBarcodePdf417Pictograph());
        tVar.Z("passportFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getPassportFrontPictograph());
        tVar.Z("passportSignaturePictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, promptPage.getPassportSignaturePictograph());
        tVar.y();
    }
}
