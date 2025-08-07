package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ErrorResponseJsonAdapter extends h<ErrorResponse> {

    @NotNull
    private final h<List<ErrorResponse.Error>> nullableListOfErrorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"errors"});

    public ErrorResponseJsonAdapter(@NotNull w wVar) {
        this.nullableListOfErrorAdapter = wVar.f(A.j(List.class, new Type[]{ErrorResponse.Error.class}), L.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ErrorResponse");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ErrorResponse m91fromJson(@NotNull m mVar) {
        mVar.e();
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfErrorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new ErrorResponse(list);
    }

    public void toJson(@NotNull t tVar, ErrorResponse errorResponse) {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("errors");
        this.nullableListOfErrorAdapter.toJson(tVar, errorResponse.getErrors());
        tVar.y();
    }
}
