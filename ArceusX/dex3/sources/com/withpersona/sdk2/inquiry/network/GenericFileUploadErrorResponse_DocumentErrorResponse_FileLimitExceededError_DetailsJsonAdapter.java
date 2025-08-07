package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileLimitExceededError_DetailsJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(105);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details m106fromJson(@NotNull m mVar) {
        mVar.e();
        while (mVar.u()) {
            if (mVar.P0(this.options) == -1) {
                mVar.b1();
                mVar.f1();
            }
        }
        mVar.j();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details();
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.y();
    }
}
