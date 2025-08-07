package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepPaddingStyleContainerJsonAdapter extends h<StepStyles.StepPaddingStyleContainer> {

    @NotNull
    private final h<StyleElements.SizeSet> nullableSizeSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_StepPaddingStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableSizeSetAdapter = wVar.f(StyleElements.SizeSet.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepPaddingStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepPaddingStyleContainer m490fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SizeSet sizeSet = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                sizeSet = (StyleElements.SizeSet) this.nullableSizeSetAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepPaddingStyleContainer(sizeSet);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepPaddingStyleContainer stepPaddingStyleContainer) {
        if (stepPaddingStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSizeSetAdapter.toJson(tVar, stepPaddingStyleContainer.getBase());
        tVar.y();
    }
}
