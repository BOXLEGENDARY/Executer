package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter extends h<ErrorResponse.Error.InvalidFieldValueError> {

    @NotNull
    private final h<Map<String, UiComponentError>> nullableMapOfStringUiComponentErrorAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "details"});

    public ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.nullableMapOfStringUiComponentErrorAdapter = wVar.f(A.j(Map.class, new Type[]{String.class, UiComponentError.class}), L.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse.Error.InvalidFieldValueError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ErrorResponse.Error.InvalidFieldValueError m96fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        Map map = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                map = (Map) this.nullableMapOfStringUiComponentErrorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new ErrorResponse.Error.InvalidFieldValueError(str, map);
    }

    public void toJson(@NotNull t tVar, ErrorResponse.Error.InvalidFieldValueError invalidFieldValueError) {
        if (invalidFieldValueError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, invalidFieldValueError.getTitle());
        tVar.Z("details");
        this.nullableMapOfStringUiComponentErrorAdapter.toJson(tVar, invalidFieldValueError.getDetails());
        tVar.y();
    }
}
