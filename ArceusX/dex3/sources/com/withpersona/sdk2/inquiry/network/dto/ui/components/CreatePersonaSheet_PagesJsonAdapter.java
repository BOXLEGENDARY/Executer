package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheet_PagesJsonAdapter extends h<CreatePersonaSheet.Pages> {

    @NotNull
    private final h<CreatePersonaSheet.CardCtaPage> nullableCardCtaPageAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"ctaCard"});

    public CreatePersonaSheet_PagesJsonAdapter(@NotNull w wVar) {
        this.nullableCardCtaPageAdapter = wVar.f(CreatePersonaSheet.CardCtaPage.class, L.d(), "ctaCard");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet.Pages");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet.Pages m233fromJson(@NotNull m mVar) {
        mVar.e();
        CreatePersonaSheet.CardCtaPage cardCtaPage = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                cardCtaPage = (CreatePersonaSheet.CardCtaPage) this.nullableCardCtaPageAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new CreatePersonaSheet.Pages(cardCtaPage);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet.Pages pages) {
        if (pages == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("ctaCard");
        this.nullableCardCtaPageAdapter.toJson(tVar, pages.getCtaCard());
        tVar.y();
    }
}
