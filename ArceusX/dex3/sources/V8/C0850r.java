package v8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import ha.C0448G;
import ha.C0458f;
import ha.C0476u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z8.C0892e;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R0\u0010B\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170>j\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER*\u0010I\u001a\u00020C2\u0006\u0010G\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010E\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lv8/r;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lkotlin/jvm/functions/Function1;)V", "Lz8/e;", "viewHolder", "D", "(Lz8/e;)V", "binding", "Landroid/graphics/drawable/Drawable;", "drawableRes", "J", "(Lz8/e;Landroid/graphics/drawable/Drawable;)V", "", "strokeColor", "fillColor", "iconDrawable", "F", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "pressedColor", "Landroid/content/res/ColorStateList;", "E", "(I)Landroid/content/res/ColorStateList;", "Landroid/view/ViewGroup;", "parent", "viewType", "La9/G;", "H", "(Landroid/view/ViewGroup;I)La9/G;", "e", "()I", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "d", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "g", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "cachedImages", "", "i", "Z", "useIcons", "value", "j", "isEnabled", "()Z", "I", "(Z)V", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0850r extends RecyclerView.h<RecyclerView.D> {

    @NotNull
    private final List<EnabledIdClass> data;

    private final StepStyles.GovernmentIdStepStyle styles;

    private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

    @NotNull
    private final Function1<IdConfig, Unit> onClick;

    @NotNull
    private final HashMap<Integer, Drawable> cachedImages;

    private final boolean useIcons;

    private boolean isEnabled;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[EnumC0820A.values().length];
            try {
                iArr[EnumC0820A.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0820A.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0820A.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0820A.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C0850r(@NotNull Context context, @NotNull List<EnabledIdClass> list, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, @NotNull Function1<? super IdConfig, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.data = list;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.onClick = function1;
        this.cachedImages = new HashMap<>();
        this.useIcons = !C0476u.b(context, S8.a.d, null, false, false, 14, null);
        this.isEnabled = true;
    }

    private final void D(C0892e viewHolder) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
            TextView textView = viewHolder.e;
            Intrinsics.checkNotNullExpressionValue(textView, "label");
            s9.v.e(textView, governmentIdVerticalOptionTextStyle);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (chevronColor = governmentIdStepStyle2.getChevronColor()) != null) {
            viewHolder.b.setColorFilter(chevronColor.intValue());
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this.styles;
        if (governmentIdStepStyle3 != null && (backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            Integer activeOptionBackgroundColorValue = this.styles.getActiveOptionBackgroundColorValue();
            if (activeOptionBackgroundColorValue != null) {
                viewHolder.a().setBackground(new RippleDrawable(E(activeOptionBackgroundColorValue.intValue()), new ColorDrawable(iIntValue), null));
            }
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = this.styles;
        if (governmentIdStepStyle4 == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle4.getGovernmentIdSelectOptionMinRowHeight()) == null) {
            return;
        }
        viewHolder.f.setMinHeight((int) C0458f.a(governmentIdSelectOptionMinRowHeight.doubleValue()));
    }

    private final ColorStateList E(int pressedColor) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{pressedColor});
    }

    private final Drawable F(Context context, Integer strokeColor, Integer fillColor, Drawable iconDrawable) {
        Drawable drawableMutate;
        ArrayList arrayList = new ArrayList();
        if (strokeColor != null) {
            iconDrawable.mutate().setTint(strokeColor.intValue());
        }
        Drawable drawableB = h.a.b(context, C0823D.e);
        if (fillColor != null && drawableB != null && (drawableMutate = drawableB.mutate()) != null) {
            drawableMutate.setTint(fillColor.intValue());
        }
        if (drawableB != null) {
            arrayList.add(drawableB);
        }
        arrayList.add(iconDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    public static final void G(C0850r c0850r, EnabledIdClass enabledIdClass, View view) {
        Intrinsics.checkNotNullParameter(c0850r, "this$0");
        Intrinsics.checkNotNullParameter(enabledIdClass, "$enabledIdClass");
        c0850r.onClick.invoke(enabledIdClass.getIdConfig());
    }

    private final void J(C0892e binding, Drawable drawableRes) {
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        Integer numValueOf = null;
        Integer numValueOf2 = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (governmentIdIconFillColor = governmentIdStepStyle2.getGovernmentIdIconFillColor()) != null) {
            numValueOf = Integer.valueOf(governmentIdIconFillColor.intValue());
        }
        Context context = binding.a().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableMutate = F(context, numValueOf2, numValueOf, drawableRes).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        binding.c.setImageDrawable(drawableMutate);
    }

    @NotNull
    public C0448G<C0892e> t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C0448G<C0892e> c0448g = new C0448G<>(C0892e.d(LayoutInflater.from(parent.getContext()), parent, false));
        j1.a aVarO = c0448g.O();
        Intrinsics.checkNotNullExpressionValue(aVarO, "<get-binding>(...)");
        D((C0892e) aVarO);
        return c0448g;
    }

    public final void I(boolean z) {
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        j();
    }

    public int e() {
        return this.data.size();
    }

    public void r(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.D r18, int r19) throws P9.m {
        throw new UnsupportedOperationException("Method not decompiled: v8.C0850r.r(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }
}
