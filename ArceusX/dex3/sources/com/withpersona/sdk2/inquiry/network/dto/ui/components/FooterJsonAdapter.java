package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class FooterJsonAdapter extends h<Footer> {
    private volatile Constructor<Footer> constructorRef;

    @NotNull
    private final h<Footer.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<Footer.FooterComponentStyle> nullableFooterComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public FooterJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(Footer.Attributes.class, L.d(), "attributes");
        this.nullableFooterComponentStyleAdapter = wVar.f(Footer.FooterComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Footer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Footer m237fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        Footer.Attributes attributes = null;
        Footer.FooterComponentStyle footerComponentStyle = null;
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
                attributes = (Footer.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                footerComponentStyle = (Footer.FooterComponentStyle) this.nullableFooterComponentStyleAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (str != null) {
                return new Footer(str, attributes, footerComponentStyle);
            }
            throw c.o("name", "name", mVar);
        }
        Constructor<Footer> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Footer.class.getDeclaredConstructor(String.class, Footer.Attributes.class, Footer.FooterComponentStyle.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, attributes, footerComponentStyle, Integer.valueOf(i), null);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, Footer footer) {
        if (footer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, footer.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, footer.getAttributes());
        tVar.Z("styles");
        this.nullableFooterComponentStyleAdapter.toJson(tVar, footer.getStyles());
        tVar.y();
    }
}
