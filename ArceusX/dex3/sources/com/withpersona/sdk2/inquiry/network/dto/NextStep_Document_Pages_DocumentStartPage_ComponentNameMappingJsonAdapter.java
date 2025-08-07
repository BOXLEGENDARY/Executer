package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_Document_Pages_DocumentStartPage_ComponentNameMappingJsonAdapter extends h<NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"buttonFilePicker", "buttonPhotoLibrary", "buttonCamera", "buttonUploadOptions"});

    public NextStep_Document_Pages_DocumentStartPage_ComponentNameMappingJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "buttonFilePicker");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(84);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping m160fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                str4 = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping(str, str2, str3, str4);
    }

    public void toJson(@NotNull t tVar, NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping) {
        if (componentNameMapping == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("buttonFilePicker");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getButtonFilePicker());
        tVar.Z("buttonPhotoLibrary");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getButtonPhotoLibrary());
        tVar.Z("buttonCamera");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getButtonCamera());
        tVar.Z("buttonUploadOptions");
        this.nullableStringAdapter.toJson(tVar, componentNameMapping.getButtonUploadOptions());
        tVar.y();
    }
}
