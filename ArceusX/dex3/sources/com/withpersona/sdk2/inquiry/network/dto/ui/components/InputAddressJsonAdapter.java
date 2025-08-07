package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputAddressJsonAdapter extends h<InputAddress> {

    @NotNull
    private final h<InputAddress.AddressComponentStyle> nullableAddressComponentStyleAdapter;

    @NotNull
    private final h<InputAddress.Attributes> nullableAttributesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "styles", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public InputAddressJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAddressComponentStyleAdapter = wVar.f(InputAddress.AddressComponentStyle.class, L.d(), "styles");
        this.nullableAttributesAdapter = wVar.f(InputAddress.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputAddress");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputAddress m247fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputAddress.AddressComponentStyle addressComponentStyle = null;
        InputAddress.Attributes attributes = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                addressComponentStyle = (InputAddress.AddressComponentStyle) this.nullableAddressComponentStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                attributes = (InputAddress.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputAddress(str, addressComponentStyle, attributes);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputAddress inputAddress) {
        if (inputAddress == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputAddress.getName());
        tVar.Z("styles");
        this.nullableAddressComponentStyleAdapter.toJson(tVar, inputAddress.getStyles());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputAddress.getAttributes());
        tVar.y();
    }
}
