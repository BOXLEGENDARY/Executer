package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class SpacerJsonAdapter extends h<Spacer> {
    private volatile Constructor<Spacer> constructorRef;

    @NotNull
    private final h<Spacer.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<Spacer.SpacerComponentStyle> nullableSpacerComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public SpacerJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(Spacer.Attributes.class, L.d(), "attributes");
        this.nullableSpacerComponentStyleAdapter = wVar.f(Spacer.SpacerComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Spacer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Spacer m299fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        Spacer.Attributes attributes = null;
        Spacer.SpacerComponentStyle spacerComponentStyle = null;
        int i = -1;
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
                attributes = (Spacer.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                spacerComponentStyle = (Spacer.SpacerComponentStyle) this.nullableSpacerComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new Spacer(str, attributes, spacerComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<Spacer> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Spacer.class.getDeclaredConstructor(String.class, Spacer.Attributes.class, Spacer.SpacerComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, spacerComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, Spacer spacer) {
        if (spacer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, spacer.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, spacer.getAttributes());
        tVar.Z("styles");
        this.nullableSpacerComponentStyleAdapter.toJson(tVar, spacer.getStyles());
        tVar.y();
    }
}
