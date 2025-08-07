package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter extends h<NextStep.GovernmentId.AssetConfig.CapturePage> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph"});

    public NextStep_GovernmentId_AssetConfig_CapturePageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "idFrontPictograph");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig.CapturePage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig.CapturePage m167fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        int i = -1;
        RemoteImage remoteImage2 = null;
        RemoteImage remoteImage3 = null;
        RemoteImage remoteImage4 = null;
        RemoteImage remoteImage5 = null;
        RemoteImage remoteImage6 = null;
        RemoteImage remoteImage7 = null;
        RemoteImage remoteImage8 = null;
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
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    remoteImage7 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -65;
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    remoteImage8 = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
                    i &= -129;
                    break;
            }
        }
        mVar.j();
        if (i == -256) {
            return new NextStep.GovernmentId.AssetConfig.CapturePage(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, remoteImage7, remoteImage8);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.CapturePage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.CapturePage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, remoteImage3, remoteImage4, remoteImage5, remoteImage6, remoteImage7, remoteImage8, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig.CapturePage capturePage) {
        if (capturePage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("idFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getIdFrontPictograph());
        tVar.Z("idBackPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getIdBackPictograph());
        tVar.Z("barcodePdf417Pictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getBarcodePdf417Pictograph());
        tVar.Z("passportFrontPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getPassportFrontPictograph());
        tVar.Z("passportSignaturePictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getPassportSignaturePictograph());
        tVar.Z("idFrontHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getIdFrontHelpModalPictograph());
        tVar.Z("idBackHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getIdBackHelpModalPictograph());
        tVar.Z("barcodeHelpModalPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, capturePage.getBarcodeHelpModalPictograph());
        tVar.y();
    }
}
