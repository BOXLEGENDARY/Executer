package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class QRCode_QRCodeComponentStyleJsonAdapter extends h<QRCode.QRCodeComponentStyle> {

    @NotNull
    private final h<AttributeStyles.QRCodeFillColorStyle> nullableQRCodeFillColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.QRCodeJustifyStyle> nullableQRCodeJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.QRCodeMarginStyle> nullableQRCodeMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.QRCodeStrokeColorStyle> nullableQRCodeStrokeColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.QRCodeWidthStyle> nullableQRCodeWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"width", "justify", "margin", "strokeColor", "fillColor"});

    public QRCode_QRCodeComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableQRCodeWidthStyleAdapter = wVar.f(AttributeStyles.QRCodeWidthStyle.class, L.d(), "width");
        this.nullableQRCodeJustifyStyleAdapter = wVar.f(AttributeStyles.QRCodeJustifyStyle.class, L.d(), "justify");
        this.nullableQRCodeMarginStyleAdapter = wVar.f(AttributeStyles.QRCodeMarginStyle.class, L.d(), "margin");
        this.nullableQRCodeStrokeColorStyleAdapter = wVar.f(AttributeStyles.QRCodeStrokeColorStyle.class, L.d(), "strokeColor");
        this.nullableQRCodeFillColorStyleAdapter = wVar.f(AttributeStyles.QRCodeFillColorStyle.class, L.d(), "fillColor");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("QRCode.QRCodeComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public QRCode.QRCodeComponentStyle m294fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = null;
        AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = null;
        AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = null;
        AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = null;
        AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                qRCodeWidthStyle = (AttributeStyles.QRCodeWidthStyle) this.nullableQRCodeWidthStyleAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                qRCodeJustifyStyle = (AttributeStyles.QRCodeJustifyStyle) this.nullableQRCodeJustifyStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                qRCodeMarginStyle = (AttributeStyles.QRCodeMarginStyle) this.nullableQRCodeMarginStyleAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                qRCodeStrokeColorStyle = (AttributeStyles.QRCodeStrokeColorStyle) this.nullableQRCodeStrokeColorStyleAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                qRCodeFillColorStyle = (AttributeStyles.QRCodeFillColorStyle) this.nullableQRCodeFillColorStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new QRCode.QRCodeComponentStyle(qRCodeWidthStyle, qRCodeJustifyStyle, qRCodeMarginStyle, qRCodeStrokeColorStyle, qRCodeFillColorStyle);
    }

    public void toJson(@NotNull t tVar, QRCode.QRCodeComponentStyle qRCodeComponentStyle) {
        if (qRCodeComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("width");
        this.nullableQRCodeWidthStyleAdapter.toJson(tVar, qRCodeComponentStyle.getWidth());
        tVar.Z("justify");
        this.nullableQRCodeJustifyStyleAdapter.toJson(tVar, qRCodeComponentStyle.getJustify());
        tVar.Z("margin");
        this.nullableQRCodeMarginStyleAdapter.toJson(tVar, qRCodeComponentStyle.getMargin());
        tVar.Z("strokeColor");
        this.nullableQRCodeStrokeColorStyleAdapter.toJson(tVar, qRCodeComponentStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableQRCodeFillColorStyleAdapter.toJson(tVar, qRCodeComponentStyle.getFillColor());
        tVar.y();
    }
}
