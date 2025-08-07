package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheet_CardCtaPageJsonAdapter extends h<CreatePersonaSheet.CardCtaPage> {
    private volatile Constructor<CreatePersonaSheet.CardCtaPage> constructorRef;

    @NotNull
    private final h<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> nullableComponentNameMappingAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"uiStep", "componentNameMapping"});

    @NotNull
    private final h<NextStep.Ui> uiAdapter;

    public CreatePersonaSheet_CardCtaPageJsonAdapter(@NotNull w wVar) {
        this.uiAdapter = wVar.f(NextStep.Ui.class, L.d(), "uiStep");
        this.nullableComponentNameMappingAdapter = wVar.f(CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class, L.d(), "componentNameMapping");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet.CardCtaPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet.CardCtaPage m230fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        NextStep.Ui ui = null;
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                ui = (NextStep.Ui) this.uiAdapter.fromJson(mVar);
                if (ui == null) {
                    throw c.x("uiStep", "uiStep", mVar);
                }
            } else if (iP0 == 1) {
                componentNameMapping = (CreatePersonaSheet.CardCtaPage.ComponentNameMapping) this.nullableComponentNameMappingAdapter.fromJson(mVar);
                i = -3;
            }
        }
        mVar.j();
        if (i == -3) {
            if (ui != null) {
                return new CreatePersonaSheet.CardCtaPage(ui, componentNameMapping);
            }
            throw c.o("uiStep", "uiStep", mVar);
        }
        Constructor<CreatePersonaSheet.CardCtaPage> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CreatePersonaSheet.CardCtaPage.class.getDeclaredConstructor(NextStep.Ui.class, CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (ui != null) {
            return declaredConstructor.newInstance(ui, componentNameMapping, Integer.valueOf(i), null);
        }
        throw c.o("uiStep", "uiStep", mVar);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet.CardCtaPage cardCtaPage) {
        if (cardCtaPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("uiStep");
        this.uiAdapter.toJson(tVar, cardCtaPage.getUiStep());
        tVar.Z("componentNameMapping");
        this.nullableComponentNameMappingAdapter.toJson(tVar, cardCtaPage.getComponentNameMapping());
        tVar.y();
    }
}
