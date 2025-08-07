package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import ka.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/t;", "Lcom/squareup/workflow1/ui/r;", "", "initialValue", "<init>", "(Ljava/lang/String;)V", "Lka/y;", "a", "Lka/y;", "_textValue", "Lka/g;", "b", "Lka/g;", "()Lka/g;", "onTextChanged", "value", "()Ljava/lang/String;", "c", "textValue", "wf1-core-common"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class t implements r {

    @NotNull
    private final ka.y<String> _textValue;

    @NotNull
    private final ka.g<String> onTextChanged;

    public t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "initialValue");
        ka.y<String> yVarA = M.a(str);
        this._textValue = yVarA;
        this.onTextChanged = ka.i.m(yVarA, 1);
    }

    @Override
    @NotNull
    public ka.g<String> a() {
        return this.onTextChanged;
    }

    @Override
    @NotNull
    public String b() {
        return (String) this._textValue.getValue();
    }

    @Override
    public void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this._textValue.setValue(str);
    }
}
