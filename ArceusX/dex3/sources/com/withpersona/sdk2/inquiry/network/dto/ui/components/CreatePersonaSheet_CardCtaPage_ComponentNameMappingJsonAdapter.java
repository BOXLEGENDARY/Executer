package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheet_CardCtaPage_ComponentNameMappingJsonAdapter extends h<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> {
    private volatile Constructor<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> constructorRef;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"startButton", "dismissButton"});

    public CreatePersonaSheet_CardCtaPage_ComponentNameMappingJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "startButton");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(73);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet.CardCtaPage.ComponentNameMapping");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet.CardCtaPage.ComponentNameMapping m231fromJson(@NotNull m mVar) throws NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        String str2 = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
                i &= -2;
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                i &= -3;
            }
        }
        mVar.j();
        if (i == -4) {
            return new CreatePersonaSheet.CardCtaPage.ComponentNameMapping(str, str2);
        }
        Constructor<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(str, str2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping) {
        if (componentNameMapping == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("startButton");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getStartButton());
        tVar.Z("dismissButton");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getDismissButton());
        tVar.y();
    }
}
