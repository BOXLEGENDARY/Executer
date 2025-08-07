package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class UiComponentError_UiInputComponentErrorJsonAdapter extends h<UiComponentError.UiInputComponentError> {

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "type", "message"});

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UiComponentError.UiInputComponentError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public UiComponentError.UiInputComponentError m203fromJson(@NotNull m mVar) throws j {
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
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c.x("type", "type", mVar);
                }
            } else if (iP0 == 2 && (str3 = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x("message", "message", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o("name", "name", mVar);
        }
        if (str2 == null) {
            throw c.o("type", "type", mVar);
        }
        if (str3 != null) {
            return new UiComponentError.UiInputComponentError(str, str2, str3);
        }
        throw c.o("message", "message", mVar);
    }

    public void toJson(@NotNull t tVar, UiComponentError.UiInputComponentError uiInputComponentError) {
        if (uiInputComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, uiInputComponentError.getName());
        tVar.Z("type");
        this.stringAdapter.toJson(tVar, uiInputComponentError.getType());
        tVar.Z("message");
        this.stringAdapter.toJson(tVar, uiInputComponentError.getMessage());
        tVar.y();
    }
}
