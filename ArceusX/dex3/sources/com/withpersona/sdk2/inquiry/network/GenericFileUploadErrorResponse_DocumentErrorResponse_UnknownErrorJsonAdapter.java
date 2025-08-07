package com.withpersona.sdk2.inquiry.network;

import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;

    @NotNull
    private final h<ErrorDetails> nullableErrorDetailsAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Title.type, "code", "details"});

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Title.type);
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "code");
        this.nullableErrorDetailsAdapter = wVar.f(ErrorDetails.class, L.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(87);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError m117fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        String str2 = null;
        ErrorDetails errorDetails = null;
        int i = -1;
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
                i &= -2;
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                i &= -3;
            } else if (iP0 == 2) {
                errorDetails = (ErrorDetails) this.nullableErrorDetailsAdapter.fromJson(mVar);
                i &= -5;
            }
        }
        mVar.j();
        if (i == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(str, str2, errorDetails);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, c8.c.c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(str, str2, errorDetails, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Title.type);
        this.stringAdapter.toJson(tVar, unknownError.getTitle());
        tVar.Z("code");
        this.nullableStringAdapter.toJson(tVar, unknownError.getCode());
        tVar.Z("details");
        this.nullableErrorDetailsAdapter.toJson(tVar, unknownError.getDetails());
        tVar.y();
    }
}
