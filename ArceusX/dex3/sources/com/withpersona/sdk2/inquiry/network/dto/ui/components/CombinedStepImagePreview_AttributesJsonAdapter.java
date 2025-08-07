package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import org.jetbrains.annotations.NotNull;

public final class CombinedStepImagePreview_AttributesJsonAdapter extends h<CombinedStepImagePreview.Attributes> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public CombinedStepImagePreview_AttributesJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CombinedStepImagePreview.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CombinedStepImagePreview.Attributes m225fromJson(@NotNull m mVar) {
        mVar.e();
        while (mVar.u()) {
            if (mVar.P0(this.options) == -1) {
                mVar.b1();
                mVar.f1();
            }
        }
        mVar.j();
        return new CombinedStepImagePreview.Attributes();
    }

    public void toJson(@NotNull t tVar, CombinedStepImagePreview.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.y();
    }
}
