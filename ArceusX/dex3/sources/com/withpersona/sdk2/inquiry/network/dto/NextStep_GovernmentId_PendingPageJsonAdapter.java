package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_PendingPageJsonAdapter extends h<NextStep.GovernmentId.PendingPage> {

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "description"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_PendingPageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.PendingPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.PendingPage m181fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x(Title.type, Title.type, mVar);
                }
            } else if (iP0 == 1 && (str2 = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x("description", "description", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o(Title.type, Title.type, mVar);
        }
        if (str2 != null) {
            return new NextStep.GovernmentId.PendingPage(str, str2);
        }
        throw c.o("description", "description", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.PendingPage pendingPage) {
        if (pendingPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.stringAdapter.toJson(tVar, pendingPage.getTitle());
        tVar.Z("description");
        this.stringAdapter.toJson(tVar, pendingPage.getDescription());
        tVar.y();
    }
}
