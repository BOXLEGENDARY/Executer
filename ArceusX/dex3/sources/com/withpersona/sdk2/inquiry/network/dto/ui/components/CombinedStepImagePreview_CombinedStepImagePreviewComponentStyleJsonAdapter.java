package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CombinedStepImagePreview_CombinedStepImagePreviewComponentStyleJsonAdapter extends h<CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle> {

    @NotNull
    private final h<AttributeStyles.RemoteImageHeightStyle> nullableRemoteImageHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageJustifyStyle> nullableRemoteImageJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageMarginStyle> nullableRemoteImageMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageWidthStyle> nullableRemoteImageWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"height", "width", "justify", "margin"});

    public CombinedStepImagePreview_CombinedStepImagePreviewComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageHeightStyleAdapter = wVar.f(AttributeStyles.RemoteImageHeightStyle.class, L.d(), "height");
        this.nullableRemoteImageWidthStyleAdapter = wVar.f(AttributeStyles.RemoteImageWidthStyle.class, L.d(), "width");
        this.nullableRemoteImageJustifyStyleAdapter = wVar.f(AttributeStyles.RemoteImageJustifyStyle.class, L.d(), "justify");
        this.nullableRemoteImageMarginStyleAdapter = wVar.f(AttributeStyles.RemoteImageMarginStyle.class, L.d(), "margin");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(85);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle m226fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = null;
        AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = null;
        AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = null;
        AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                remoteImageHeightStyle = (AttributeStyles.RemoteImageHeightStyle) this.nullableRemoteImageHeightStyleAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                remoteImageWidthStyle = (AttributeStyles.RemoteImageWidthStyle) this.nullableRemoteImageWidthStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                remoteImageJustifyStyle = (AttributeStyles.RemoteImageJustifyStyle) this.nullableRemoteImageJustifyStyleAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                remoteImageMarginStyle = (AttributeStyles.RemoteImageMarginStyle) this.nullableRemoteImageMarginStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle(remoteImageHeightStyle, remoteImageWidthStyle, remoteImageJustifyStyle, remoteImageMarginStyle);
    }

    public void toJson(@NotNull t tVar, CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
        if (combinedStepImagePreviewComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("height");
        this.nullableRemoteImageHeightStyleAdapter.toJson(tVar, combinedStepImagePreviewComponentStyle.getHeight());
        tVar.Z("width");
        this.nullableRemoteImageWidthStyleAdapter.toJson(tVar, combinedStepImagePreviewComponentStyle.getWidth());
        tVar.Z("justify");
        this.nullableRemoteImageJustifyStyleAdapter.toJson(tVar, combinedStepImagePreviewComponentStyle.getJustify());
        tVar.Z("margin");
        this.nullableRemoteImageMarginStyleAdapter.toJson(tVar, combinedStepImagePreviewComponentStyle.getMargin());
        tVar.y();
    }
}
