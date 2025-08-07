package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.C0485c;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0468m;
import ha.C0469n;
import ha.C0473r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "defStyleRes", "", "init", "(Landroid/util/AttributeSet;II)V", "onFinishInflate", "()V", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "state", "Lkotlin/Function0;", "back", "cancel", "f", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "controlsColor", "setControlsColor", "(I)V", "Lc9/c;", "d", "Lc9/c;", "binding", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Pi2NavigationBar extends ConstraintLayout {

    @NotNull
    private final C0485c binding;

    public Pi2NavigationBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C0485c c0485cC = C0485c.c(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c0485cC, "inflate(...)");
        this.binding = c0485cC;
        init(attributeSet, 0, 0);
    }

    public static final void d(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$back");
        function0.invoke();
    }

    public static final void e(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$cancel");
        function0.invoke();
    }

    private final void init(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0473r.a, defStyleAttr, defStyleRes);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C0473r.b) {
                    this.binding.b.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, C0469n.r));
                } else if (index == C0473r.c) {
                    this.binding.c.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, C0469n.t));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void f(@NotNull NavigationState state, @NotNull final Function0<Unit> back, @NotNull final Function0<Unit> cancel) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        if (!state.getShowNavBar()) {
            this.binding.b.setVisibility(8);
            this.binding.c.setVisibility(8);
            return;
        }
        this.binding.b.setVisibility(state.getShowBackButton() ? 0 : 4);
        this.binding.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Pi2NavigationBar.d(back, view);
            }
        });
        this.binding.c.setVisibility(state.getShowCancelButton() ? 0 : 4);
        this.binding.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Pi2NavigationBar.e(cancel, view);
            }
        });
        this.binding.b.setEnabled(state.getIsNavigationEnabled());
        this.binding.c.setEnabled(state.getIsNavigationEnabled());
    }

    @NotNull
    public final View getBackButton() {
        ImageView imageView = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "navBarBackButton");
        return imageView;
    }

    protected void onFinishInflate() throws Resources.NotFoundException {
        super/*android.view.View*/.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(C0468m.a);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void setControlsColor(int controlsColor) {
        this.binding.b.setColorFilter(controlsColor);
        this.binding.c.setColorFilter(controlsColor);
    }
}
