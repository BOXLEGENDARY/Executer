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

public final class NextStep_GovernmentId_AssetConfig_PendingPageJsonAdapter extends h<NextStep.GovernmentId.AssetConfig.PendingPage> {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig.PendingPage> constructorRef;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"headerPictograph", "loadingPictograph"});

    public NextStep_GovernmentId_AssetConfig_PendingPageJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "headerPictograph");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.AssetConfig.PendingPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.AssetConfig.PendingPage m169fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        RemoteImage remoteImage = null;
        RemoteImage remoteImage2 = null;
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
            }
        }
        mVar.j();
        if (i == -4) {
            return new NextStep.GovernmentId.AssetConfig.PendingPage(remoteImage, remoteImage2);
        }
        Constructor<NextStep.GovernmentId.AssetConfig.PendingPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.PendingPage.class.getDeclaredConstructor(RemoteImage.class, RemoteImage.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(remoteImage, remoteImage2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage) {
        if (pendingPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("headerPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, pendingPage.getHeaderPictograph());
        tVar.Z("loadingPictograph");
        this.nullableRemoteImageAdapter.toJson(tVar, pendingPage.getLoadingPictograph());
        tVar.y();
    }
}
