package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError> {

    @NotNull
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> detailsAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "code", "details"});

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.detailsAdapter = wVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details.class, L.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(96);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError m103fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c8.c.x(Title.type, Title.type, mVar);
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c8.c.x("code", "code", mVar);
                }
            } else if (iP0 == 2 && (details = (GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details) this.detailsAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("details", "details", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c8.c.o(Title.type, Title.type, mVar);
        }
        if (str2 == null) {
            throw c8.c.o("code", "code", mVar);
        }
        if (details != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError(str, str2, details);
        }
        throw c8.c.o("details", "details", mVar);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError disabledFileTypeError) {
        if (disabledFileTypeError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.stringAdapter.toJson(tVar, disabledFileTypeError.getTitle());
        tVar.Z("code");
        this.stringAdapter.toJson(tVar, disabledFileTypeError.getCode());
        tVar.Z("details");
        this.detailsAdapter.toJson(tVar, disabledFileTypeError.getDetails());
        tVar.y();
    }
}
