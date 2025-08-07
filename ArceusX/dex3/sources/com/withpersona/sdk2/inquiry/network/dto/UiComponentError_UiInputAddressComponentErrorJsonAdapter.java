package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class UiComponentError_UiInputAddressComponentErrorJsonAdapter extends h<UiComponentError.UiInputAddressComponentError> {

    @NotNull
    private final h<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "type", "message"});

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputAddressComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.mapOfStringStringAdapter = wVar.f(A.j(Map.class, new Type[]{String.class, String.class}), L.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UiComponentError.UiInputAddressComponentError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public UiComponentError.UiInputAddressComponentError m202fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        Map map = null;
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
            } else if (iP0 == 2 && (map = (Map) this.mapOfStringStringAdapter.fromJson(mVar)) == null) {
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
        if (map != null) {
            return new UiComponentError.UiInputAddressComponentError(str, str2, map);
        }
        throw c.o("message", "message", mVar);
    }

    public void toJson(@NotNull t tVar, UiComponentError.UiInputAddressComponentError uiInputAddressComponentError) {
        if (uiInputAddressComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, uiInputAddressComponentError.getName());
        tVar.Z("type");
        this.stringAdapter.toJson(tVar, uiInputAddressComponentError.getType());
        tVar.Z("message");
        this.mapOfStringStringAdapter.toJson(tVar, uiInputAddressComponentError.getMessage());
        tVar.y();
    }
}
