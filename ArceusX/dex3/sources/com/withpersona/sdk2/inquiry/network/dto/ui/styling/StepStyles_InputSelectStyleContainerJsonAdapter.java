package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_InputSelectStyleContainerJsonAdapter extends h<StepStyles.InputSelectStyleContainer> {

    @NotNull
    private final h<InputSelectComponentStyle> nullableInputSelectComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_InputSelectStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableInputSelectComponentStyleAdapter = wVar.f(InputSelectComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.InputSelectStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.InputSelectStyleContainer m474fromJson(@NotNull m mVar) {
        mVar.e();
        InputSelectComponentStyle inputSelectComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                inputSelectComponentStyle = (InputSelectComponentStyle) this.nullableInputSelectComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.InputSelectStyleContainer(inputSelectComponentStyle);
    }

    public void toJson(@NotNull t tVar, StepStyles.InputSelectStyleContainer inputSelectStyleContainer) {
        if (inputSelectStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableInputSelectComponentStyleAdapter.toJson(tVar, inputSelectStyleContainer.getBase());
        tVar.y();
    }
}
