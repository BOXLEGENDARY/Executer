package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepBackgroundImageNameContainerJsonAdapter extends h<StepStyles.StepBackgroundImageNameContainer> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"localName"});

    public StepStyles_StepBackgroundImageNameContainerJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "localName");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepBackgroundImageNameContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepBackgroundImageNameContainer m485fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepBackgroundImageNameContainer(str);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepBackgroundImageNameContainer stepBackgroundImageNameContainer) {
        if (stepBackgroundImageNameContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("localName");
        this.nullableStringAdapter.toJson(tVar, stepBackgroundImageNameContainer.getLocalName());
        tVar.y();
    }
}
