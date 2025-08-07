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

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> {

    @NotNull
    private final h<List<String>> listOfStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"uploaded_file_type", "enabled_file_types"});

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "uploadedFileType");
        this.listOfStringAdapter = wVar.f(A.j(List.class, new Type[]{String.class}), L.d(), "enabledFileTypes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(104);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details m104fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        List list = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c8.c.x("uploadedFileType", "uploaded_file_type", mVar);
                }
            } else if (iP0 == 1 && (list = (List) this.listOfStringAdapter.fromJson(mVar)) == null) {
                throw c8.c.x("enabledFileTypes", "enabled_file_types", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c8.c.o("uploadedFileType", "uploaded_file_type", mVar);
        }
        if (list != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(str, list);
        }
        throw c8.c.o("enabledFileTypes", "enabled_file_types", mVar);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("uploaded_file_type");
        this.stringAdapter.toJson(tVar, details.getUploadedFileType());
        tVar.Z("enabled_file_types");
        this.listOfStringAdapter.toJson(tVar, details.getEnabledFileTypes());
        tVar.y();
    }
}
