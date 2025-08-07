package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_HorizontalStackChildSizesStyleJsonAdapter extends h<AttributeStyles.HorizontalStackChildSizesStyle> {

    @NotNull
    private final h<StyleElements.ChildSizes> nullableChildSizesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_HorizontalStackChildSizesStyleJsonAdapter(@NotNull w wVar) {
        this.nullableChildSizesAdapter = wVar.f(StyleElements.ChildSizes.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.HorizontalStackChildSizesStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.HorizontalStackChildSizesStyle m378fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.ChildSizes childSizes = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                childSizes = (StyleElements.ChildSizes) this.nullableChildSizesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.HorizontalStackChildSizesStyle(childSizes);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle) {
        if (horizontalStackChildSizesStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableChildSizesAdapter.toJson(tVar, horizontalStackChildSizesStyle.getBase());
        tVar.y();
    }
}
