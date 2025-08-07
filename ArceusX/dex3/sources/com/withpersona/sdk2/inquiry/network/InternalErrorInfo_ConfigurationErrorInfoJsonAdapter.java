package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InternalErrorInfo_ConfigurationErrorInfoJsonAdapter extends h<InternalErrorInfo.ConfigurationErrorInfo> {

    @NotNull
    private final m.b options = m.b.a(new String[]{"message"});

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_ConfigurationErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InternalErrorInfo.ConfigurationErrorInfo");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InternalErrorInfo.ConfigurationErrorInfo m119fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (str = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("message", "message", mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InternalErrorInfo.ConfigurationErrorInfo(str);
        }
        throw c8.c.o("message", "message", mVar);
    }

    public void toJson(@NotNull t tVar, InternalErrorInfo.ConfigurationErrorInfo configurationErrorInfo) {
        if (configurationErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("message");
        this.stringAdapter.toJson(tVar, configurationErrorInfo.getMessage());
        tVar.y();
    }
}
