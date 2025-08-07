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

public final class NextStep_CompleteJsonAdapter extends h<NextStep.Complete> {

    @NotNull
    private final m.b options = m.b.a(new String[]{"name"});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_CompleteJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Complete");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Complete m150fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (str = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x("name", "name", mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new NextStep.Complete(str);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.Complete complete) {
        if (complete == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, complete.getName());
        tVar.y();
    }
}
