package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_CheckPageJsonAdapter extends h<NextStep.GovernmentId.CheckPage> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"btnSubmit", "btnRetake", "titleConfirmCapture"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_CheckPageJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "buttonSubmit");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "titleConfirmCapture");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.CheckPage");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.CheckPage m175fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("buttonSubmit", "btnSubmit", mVar);
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c.x("buttonRetake", "btnRetake", mVar);
                }
            } else if (iP0 == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("buttonSubmit", "btnSubmit", mVar);
        }
        if (str2 != null) {
            return new NextStep.GovernmentId.CheckPage(str, str2, str3);
        }
        throw c.o("buttonRetake", "btnRetake", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.CheckPage checkPage) {
        if (checkPage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("btnSubmit");
        this.stringAdapter.toJson(tVar, checkPage.getButtonSubmit());
        tVar.Z("btnRetake");
        this.stringAdapter.toJson(tVar, checkPage.getButtonRetake());
        tVar.Z("titleConfirmCapture");
        this.nullableStringAdapter.toJson(tVar, checkPage.getTitleConfirmCapture());
        tVar.y();
    }
}
