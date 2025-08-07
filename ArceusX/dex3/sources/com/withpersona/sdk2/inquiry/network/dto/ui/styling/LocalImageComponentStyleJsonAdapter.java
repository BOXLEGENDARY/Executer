package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class LocalImageComponentStyleJsonAdapter extends h<LocalImageComponentStyle> {
    private volatile Constructor<LocalImageComponentStyle> constructorRef;

    @NotNull
    private final h<AttributeStyles.LocalImageFillColorStyle> nullableLocalImageFillColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.LocalImageHeightStyle> nullableLocalImageHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.LocalImageJustifyStyle> nullableLocalImageJustifyStyleAdapter;

    @NotNull
    private final h<AttributeStyles.LocalImageMarginStyle> nullableLocalImageMarginStyleAdapter;

    @NotNull
    private final h<AttributeStyles.LocalImageStrokeColorStyle> nullableLocalImageStrokeColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.LocalImageWidthStyle> nullableLocalImageWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"strokeColor", "fillColor", "height", "width", "justify", "margin"});

    public LocalImageComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableLocalImageStrokeColorStyleAdapter = wVar.f(AttributeStyles.LocalImageStrokeColorStyle.class, L.d(), "strokeColor");
        this.nullableLocalImageFillColorStyleAdapter = wVar.f(AttributeStyles.LocalImageFillColorStyle.class, L.d(), "fillColor");
        this.nullableLocalImageHeightStyleAdapter = wVar.f(AttributeStyles.LocalImageHeightStyle.class, L.d(), "height");
        this.nullableLocalImageWidthStyleAdapter = wVar.f(AttributeStyles.LocalImageWidthStyle.class, L.d(), "width");
        this.nullableLocalImageJustifyStyleAdapter = wVar.f(AttributeStyles.LocalImageJustifyStyle.class, L.d(), "justify");
        this.nullableLocalImageMarginStyleAdapter = wVar.f(AttributeStyles.LocalImageMarginStyle.class, L.d(), "margin");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LocalImageComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public LocalImageComponentStyle m448fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = null;
        int i = -1;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = null;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = null;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = null;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = null;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    localImageStrokeColorStyle = (AttributeStyles.LocalImageStrokeColorStyle) this.nullableLocalImageStrokeColorStyleAdapter.fromJson(mVar);
                    i &= -2;
                    break;
                case 1:
                    localImageFillColorStyle = (AttributeStyles.LocalImageFillColorStyle) this.nullableLocalImageFillColorStyleAdapter.fromJson(mVar);
                    i &= -3;
                    break;
                case 2:
                    localImageHeightStyle = (AttributeStyles.LocalImageHeightStyle) this.nullableLocalImageHeightStyleAdapter.fromJson(mVar);
                    i &= -5;
                    break;
                case 3:
                    localImageWidthStyle = (AttributeStyles.LocalImageWidthStyle) this.nullableLocalImageWidthStyleAdapter.fromJson(mVar);
                    i &= -9;
                    break;
                case 4:
                    localImageJustifyStyle = (AttributeStyles.LocalImageJustifyStyle) this.nullableLocalImageJustifyStyleAdapter.fromJson(mVar);
                    i &= -17;
                    break;
                case 5:
                    localImageMarginStyle = (AttributeStyles.LocalImageMarginStyle) this.nullableLocalImageMarginStyleAdapter.fromJson(mVar);
                    i &= -33;
                    break;
            }
        }
        mVar.j();
        if (i == -64) {
            return new LocalImageComponentStyle(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle, localImageJustifyStyle, localImageMarginStyle);
        }
        Constructor<LocalImageComponentStyle> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = LocalImageComponentStyle.class.getDeclaredConstructor(AttributeStyles.LocalImageStrokeColorStyle.class, AttributeStyles.LocalImageFillColorStyle.class, AttributeStyles.LocalImageHeightStyle.class, AttributeStyles.LocalImageWidthStyle.class, AttributeStyles.LocalImageJustifyStyle.class, AttributeStyles.LocalImageMarginStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle, localImageJustifyStyle, localImageMarginStyle, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, LocalImageComponentStyle localImageComponentStyle) {
        if (localImageComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("strokeColor");
        this.nullableLocalImageStrokeColorStyleAdapter.toJson(tVar, localImageComponentStyle.getStrokeColor());
        tVar.Z("fillColor");
        this.nullableLocalImageFillColorStyleAdapter.toJson(tVar, localImageComponentStyle.getFillColor());
        tVar.Z("height");
        this.nullableLocalImageHeightStyleAdapter.toJson(tVar, localImageComponentStyle.getHeight());
        tVar.Z("width");
        this.nullableLocalImageWidthStyleAdapter.toJson(tVar, localImageComponentStyle.getWidth());
        tVar.Z("justify");
        this.nullableLocalImageJustifyStyleAdapter.toJson(tVar, localImageComponentStyle.getJustify());
        tVar.Z("margin");
        this.nullableLocalImageMarginStyleAdapter.toJson(tVar, localImageComponentStyle.getMargin());
        tVar.y();
    }
}
