package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedPdfError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedPdfError_DetailsJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details m114fromJson(@NotNull m mVar) {
        mVar.e();
        while (mVar.u()) {
            if (mVar.P0(this.options) == -1) {
                mVar.b1();
                mVar.f1();
            }
        }
        mVar.j();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details();
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.y();
    }
}
