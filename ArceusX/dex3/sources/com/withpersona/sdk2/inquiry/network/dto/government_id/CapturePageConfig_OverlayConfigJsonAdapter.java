package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CapturePageConfig_OverlayConfigJsonAdapter extends h<CapturePageConfig.OverlayConfig> {

    @NotNull
    private final h<CapturePageConfig.OverlayLocalIcon> nullableOverlayLocalIconAdapter;

    @NotNull
    private final h<RemoteImage> nullableRemoteImageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"overlay", "overlayFallback"});

    public CapturePageConfig_OverlayConfigJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageAdapter = wVar.f(RemoteImage.class, L.d(), "overlay");
        this.nullableOverlayLocalIconAdapter = wVar.f(CapturePageConfig.OverlayLocalIcon.class, L.d(), "overlayFallback");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CapturePageConfig.OverlayConfig");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CapturePageConfig.OverlayConfig m208fromJson(@NotNull m mVar) {
        mVar.e();
        RemoteImage remoteImage = null;
        CapturePageConfig.OverlayLocalIcon overlayLocalIcon = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                remoteImage = (RemoteImage) this.nullableRemoteImageAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                overlayLocalIcon = (CapturePageConfig.OverlayLocalIcon) this.nullableOverlayLocalIconAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CapturePageConfig.OverlayConfig(remoteImage, overlayLocalIcon);
    }

    public void toJson(@NotNull t tVar, CapturePageConfig.OverlayConfig overlayConfig) {
        if (overlayConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("overlay");
        this.nullableRemoteImageAdapter.toJson(tVar, overlayConfig.getOverlay());
        tVar.Z("overlayFallback");
        this.nullableOverlayLocalIconAdapter.toJson(tVar, overlayConfig.getOverlayFallback());
        tVar.y();
    }
}
