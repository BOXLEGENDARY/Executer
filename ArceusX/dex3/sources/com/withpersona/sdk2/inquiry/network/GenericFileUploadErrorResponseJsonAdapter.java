package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponseJsonAdapter extends h<GenericFileUploadErrorResponse> {

    @NotNull
    private final h<List<GenericFileUploadErrorResponse.DocumentErrorResponse>> listOfDocumentErrorResponseAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"errors"});

    public GenericFileUploadErrorResponseJsonAdapter(@NotNull w wVar) {
        this.listOfDocumentErrorResponseAdapter = wVar.f(A.j(List.class, new Type[]{GenericFileUploadErrorResponse.DocumentErrorResponse.class}), L.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse m102fromJson(@NotNull m mVar) throws j {
        mVar.e();
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (list = (List) this.listOfDocumentErrorResponseAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("errors", "errors", mVar);
            }
        }
        mVar.j();
        if (list != null) {
            return new GenericFileUploadErrorResponse(list);
        }
        throw c8.c.o("errors", "errors", mVar);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse genericFileUploadErrorResponse) {
        if (genericFileUploadErrorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(tVar, genericFileUploadErrorResponse.getErrors());
        tVar.y();
    }
}
