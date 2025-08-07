package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_AddressTextStyleJsonAdapter extends h<AttributeStyles.AddressTextStyle> {

    @NotNull
    private final h<AttributeStyles.AddressTextStyleContainer> nullableAddressTextStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"expandButton"});

    public AttributeStyles_AddressTextStyleJsonAdapter(@NotNull w wVar) {
        this.nullableAddressTextStyleContainerAdapter = wVar.f(AttributeStyles.AddressTextStyleContainer.class, L.d(), "expandButton");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.AddressTextStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.AddressTextStyle m310fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.AddressTextStyleContainer addressTextStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                addressTextStyleContainer = (AttributeStyles.AddressTextStyleContainer) this.nullableAddressTextStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.AddressTextStyle(addressTextStyleContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.AddressTextStyle addressTextStyle) {
        if (addressTextStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("expandButton");
        this.nullableAddressTextStyleContainerAdapter.toJson(tVar, addressTextStyle.getExpandButton());
        tVar.y();
    }
}
