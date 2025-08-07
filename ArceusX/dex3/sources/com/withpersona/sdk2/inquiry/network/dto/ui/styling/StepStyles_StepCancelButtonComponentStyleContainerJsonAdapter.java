package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepCancelButtonComponentStyleContainerJsonAdapter extends h<StepStyles.StepCancelButtonComponentStyleContainer> {

    @NotNull
    private final h<ButtonCancelComponentStyle> nullableButtonCancelComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_StepCancelButtonComponentStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableButtonCancelComponentStyleAdapter = wVar.f(ButtonCancelComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(72);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepCancelButtonComponentStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepCancelButtonComponentStyleContainer m489fromJson(@NotNull m mVar) {
        mVar.e();
        ButtonCancelComponentStyle buttonCancelComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                buttonCancelComponentStyle = (ButtonCancelComponentStyle) this.nullableButtonCancelComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepCancelButtonComponentStyleContainer(buttonCancelComponentStyle);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer) {
        if (stepCancelButtonComponentStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableButtonCancelComponentStyleAdapter.toJson(tVar, stepCancelButtonComponentStyleContainer.getBase());
        tVar.y();
    }
}
