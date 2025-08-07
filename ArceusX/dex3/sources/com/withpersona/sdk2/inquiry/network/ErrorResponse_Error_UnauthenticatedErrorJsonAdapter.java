package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ErrorResponse_Error_UnauthenticatedErrorJsonAdapter extends h<ErrorResponse.Error.UnauthenticatedError> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "details"});

    public ErrorResponse_Error_UnauthenticatedErrorJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse.Error.UnauthenticatedError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ErrorResponse.Error.UnauthenticatedError m99fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new ErrorResponse.Error.UnauthenticatedError(str, str2);
    }

    public void toJson(@NotNull t tVar, ErrorResponse.Error.UnauthenticatedError unauthenticatedError) {
        if (unauthenticatedError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.nullableStringAdapter.toJson(tVar, unauthenticatedError.getTitle());
        tVar.Z("details");
        this.nullableStringAdapter.toJson(tVar, unauthenticatedError.getDetails());
        tVar.y();
    }
}
