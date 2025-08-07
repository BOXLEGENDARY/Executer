package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepTextBasedComponentStyleContainerJsonAdapter extends h<StepStyles.StepTextBasedComponentStyleContainer> {

    @NotNull
    private final h<TextBasedComponentStyle> nullableTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_StepTextBasedComponentStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableTextBasedComponentStyleAdapter = wVar.f(TextBasedComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(69);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepTextBasedComponentStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepTextBasedComponentStyleContainer m495fromJson(@NotNull m mVar) {
        mVar.e();
        TextBasedComponentStyle textBasedComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                textBasedComponentStyle = (TextBasedComponentStyle) this.nullableTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepTextBasedComponentStyleContainer(textBasedComponentStyle);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer) {
        if (stepTextBasedComponentStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableTextBasedComponentStyleAdapter.toJson(tVar, stepTextBasedComponentStyleContainer.getBase());
        tVar.y();
    }
}
