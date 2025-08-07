package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Spacer_SpacerComponentStyleJsonAdapter extends h<Spacer.SpacerComponentStyle> {

    @NotNull
    private final h<AttributeStyles.SpacerHeightStyle> nullableSpacerHeightStyleAdapter;

    @NotNull
    private final h<AttributeStyles.SpacerWidthStyle> nullableSpacerWidthStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"height", "width"});

    public Spacer_SpacerComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSpacerHeightStyleAdapter = wVar.f(AttributeStyles.SpacerHeightStyle.class, L.d(), "height");
        this.nullableSpacerWidthStyleAdapter = wVar.f(AttributeStyles.SpacerWidthStyle.class, L.d(), "width");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Spacer.SpacerComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Spacer.SpacerComponentStyle m301fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.SpacerHeightStyle spacerHeightStyle = null;
        AttributeStyles.SpacerWidthStyle spacerWidthStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                spacerHeightStyle = (AttributeStyles.SpacerHeightStyle) this.nullableSpacerHeightStyleAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                spacerWidthStyle = (AttributeStyles.SpacerWidthStyle) this.nullableSpacerWidthStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new Spacer.SpacerComponentStyle(spacerHeightStyle, spacerWidthStyle);
    }

    public void toJson(@NotNull t tVar, Spacer.SpacerComponentStyle spacerComponentStyle) {
        if (spacerComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("height");
        this.nullableSpacerHeightStyleAdapter.toJson(tVar, spacerComponentStyle.getHeight());
        tVar.Z("width");
        this.nullableSpacerWidthStyleAdapter.toJson(tVar, spacerComponentStyle.getWidth());
        tVar.y();
    }
}
