package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_RemoteImageFillColorStyleJsonAdapter extends h<AttributeStyles.RemoteImageFillColorStyle> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"fill", "highlight", "background", "originalFill", "originalHighlight", "originalBackground"});

    public AttributeStyles_RemoteImageFillColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "fill");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.RemoteImageFillColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.RemoteImageFillColorStyle m423fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        StyleElements.SimpleElementColor simpleElementColor3 = null;
        StyleElements.SimpleElementColor simpleElementColor4 = null;
        StyleElements.SimpleElementColor simpleElementColor5 = null;
        StyleElements.SimpleElementColor simpleElementColor6 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 1:
                    simpleElementColor2 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 2:
                    simpleElementColor3 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 3:
                    simpleElementColor4 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 4:
                    simpleElementColor5 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 5:
                    simpleElementColor6 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new AttributeStyles.RemoteImageFillColorStyle(simpleElementColor, simpleElementColor2, simpleElementColor3, simpleElementColor4, simpleElementColor5, simpleElementColor6);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle) {
        if (remoteImageFillColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("fill");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getFill());
        tVar.Z("highlight");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getHighlight());
        tVar.Z("background");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getBackground());
        tVar.Z("originalFill");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getOriginalFill());
        tVar.Z("originalHighlight");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getOriginalHighlight());
        tVar.Z("originalBackground");
        this.nullableSimpleElementColorAdapter.toJson(tVar, remoteImageFillColorStyle.getOriginalBackground());
        tVar.y();
    }
}
