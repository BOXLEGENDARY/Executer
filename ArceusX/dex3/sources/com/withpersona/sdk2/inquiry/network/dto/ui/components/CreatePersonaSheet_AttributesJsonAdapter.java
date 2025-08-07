package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheet_AttributesJsonAdapter extends h<CreatePersonaSheet.Attributes> {
    private volatile Constructor<CreatePersonaSheet.Attributes> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"pages", "url", "autoCompleteOnDismiss"});

    @NotNull
    private final h<CreatePersonaSheet.Pages> pagesAdapter;

    public CreatePersonaSheet_AttributesJsonAdapter(@NotNull w wVar) {
        this.pagesAdapter = wVar.f(CreatePersonaSheet.Pages.class, L.d(), "pages");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "url");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "autoCompleteOnDismiss");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet.Attributes m229fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        CreatePersonaSheet.Pages pages = null;
        String str = null;
        Boolean bool = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                pages = (CreatePersonaSheet.Pages) this.pagesAdapter.fromJson(mVar);
                if (pages == null) {
                    throw c.x("pages", "pages", mVar);
                }
            } else if (iP0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                i = -5;
            }
        }
        mVar.j();
        if (i == -5) {
            if (pages != null) {
                return new CreatePersonaSheet.Attributes(pages, str, bool);
            }
            throw c.o("pages", "pages", mVar);
        }
        Constructor<CreatePersonaSheet.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CreatePersonaSheet.Attributes.class.getDeclaredConstructor(CreatePersonaSheet.Pages.class, String.class, Boolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (pages != null) {
            return declaredConstructor.newInstance(pages, str, bool, Integer.valueOf(i), null);
        }
        throw c.o("pages", "pages", mVar);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("pages");
        this.pagesAdapter.toJson(tVar, attributes.getPages());
        tVar.Z("url");
        this.nullableStringAdapter.toJson(tVar, attributes.getUrl());
        tVar.Z("autoCompleteOnDismiss");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getAutoCompleteOnDismiss());
        tVar.y();
    }
}
