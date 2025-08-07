package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ClickableStackAxisStyleJsonAdapter extends h<AttributeStyles.ClickableStackAxisStyle> {

    @NotNull
    private final h<StyleElements.AxisContainer> nullableAxisContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_ClickableStackAxisStyleJsonAdapter(@NotNull w wVar) {
        this.nullableAxisContainerAdapter = wVar.f(StyleElements.AxisContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ClickableStackAxisStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ClickableStackAxisStyle m327fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.AxisContainer axisContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                axisContainer = (StyleElements.AxisContainer) this.nullableAxisContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ClickableStackAxisStyle(axisContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle) {
        if (clickableStackAxisStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableAxisContainerAdapter.toJson(tVar, clickableStackAxisStyle.getBase());
        tVar.y();
    }
}
