package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class RemoteImage_RemoteImageComponentStyleJsonAdapter extends h<RemoteImage.RemoteImageComponentStyle> {

    @NotNull
    private final h<AttributeStyles.RemoteImageFillColorStyle> nullableRemoteImageFillColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageHeightStyle> nullableRemoteImageHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageJustifyStyle> nullableRemoteImageJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageMarginStyle> nullableRemoteImageMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageStrokeColorStyle> nullableRemoteImageStrokeColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.RemoteImageWidthStyle> nullableRemoteImageWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"height", "width", "justify", "margin", "strokeColor", "fillColor"});

    public RemoteImage_RemoteImageComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableRemoteImageHeightStyleAdapter = wVar.f(AttributeStyles.RemoteImageHeightStyle.class, L.d(), "height");
        this.nullableRemoteImageWidthStyleAdapter = wVar.f(AttributeStyles.RemoteImageWidthStyle.class, L.d(), "width");
        this.nullableRemoteImageJustifyStyleAdapter = wVar.f(AttributeStyles.RemoteImageJustifyStyle.class, L.d(), "justify");
        this.nullableRemoteImageMarginStyleAdapter = wVar.f(AttributeStyles.RemoteImageMarginStyle.class, L.d(), "margin");
        this.nullableRemoteImageStrokeColorStyleAdapter = wVar.f(AttributeStyles.RemoteImageStrokeColorStyle.class, L.d(), "strokeColor");
        this.nullableRemoteImageFillColorStyleAdapter = wVar.f(AttributeStyles.RemoteImageFillColorStyle.class, L.d(), "fillColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteImage.RemoteImageComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public RemoteImage.RemoteImageComponentStyle m298fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = null;
        AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = null;
        AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = null;
        AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = null;
        AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = null;
        AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    remoteImageHeightStyle = (AttributeStyles.RemoteImageHeightStyle) this.nullableRemoteImageHeightStyleAdapter.fromJson(mVar);
                    break;
                case 1:
                    remoteImageWidthStyle = (AttributeStyles.RemoteImageWidthStyle) this.nullableRemoteImageWidthStyleAdapter.fromJson(mVar);
                    break;
                case 2:
                    remoteImageJustifyStyle = (AttributeStyles.RemoteImageJustifyStyle) this.nullableRemoteImageJustifyStyleAdapter.fromJson(mVar);
                    break;
                case 3:
                    remoteImageMarginStyle = (AttributeStyles.RemoteImageMarginStyle) this.nullableRemoteImageMarginStyleAdapter.fromJson(mVar);
                    break;
                case 4:
                    remoteImageStrokeColorStyle = (AttributeStyles.RemoteImageStrokeColorStyle) this.nullableRemoteImageStrokeColorStyleAdapter.fromJson(mVar);
                    break;
                case 5:
                    remoteImageFillColorStyle = (AttributeStyles.RemoteImageFillColorStyle) this.nullableRemoteImageFillColorStyleAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new RemoteImage.RemoteImageComponentStyle(remoteImageHeightStyle, remoteImageWidthStyle, remoteImageJustifyStyle, remoteImageMarginStyle, remoteImageStrokeColorStyle, remoteImageFillColorStyle);
    }

    public void toJson(@NotNull t tVar, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        if (remoteImageComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("height");
        this.nullableRemoteImageHeightStyleAdapter.toJson(tVar, remoteImageComponentStyle.getHeight());
        tVar.Z("width");
        this.nullableRemoteImageWidthStyleAdapter.toJson(tVar, remoteImageComponentStyle.getWidth());
        tVar.Z("justify");
        this.nullableRemoteImageJustifyStyleAdapter.toJson(tVar, remoteImageComponentStyle.getJustify());
        tVar.Z("margin");
        this.nullableRemoteImageMarginStyleAdapter.toJson(tVar, remoteImageComponentStyle.getMargin());
        tVar.Z("strokeColor");
        this.nullableRemoteImageStrokeColorStyleAdapter.toJson(tVar, remoteImageComponentStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableRemoteImageFillColorStyleAdapter.toJson(tVar, remoteImageComponentStyle.getFillColor());
        tVar.y();
    }
}
