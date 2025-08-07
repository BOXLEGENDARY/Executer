package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class RemoteImageJsonAdapter extends h<RemoteImage> {

    @NotNull
    private final h<RemoteImage.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<RemoteImage.RemoteImageComponentStyle> nullableRemoteImageComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public RemoteImageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(RemoteImage.Attributes.class, L.d(), "attributes");
        this.nullableRemoteImageComponentStyleAdapter = wVar.f(RemoteImage.RemoteImageComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteImage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public RemoteImage m296fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        RemoteImage.Attributes attributes = null;
        RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle = null;
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
                attributes = (RemoteImage.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                remoteImageComponentStyle = (RemoteImage.RemoteImageComponentStyle) this.nullableRemoteImageComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new RemoteImage(str, attributes, remoteImageComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, RemoteImage remoteImage) {
        if (remoteImage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, remoteImage.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, remoteImage.getAttributes());
        tVar.Z("styles");
        this.nullableRemoteImageComponentStyleAdapter.toJson(tVar, remoteImage.getStyles());
        tVar.y();
    }
}
