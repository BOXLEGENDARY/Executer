package com.withpersona.sdk2.inquiry.steps.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010,\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010-\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010+R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "backgroundImageDrawable", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "a", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "c", "()Ljava/lang/Integer;", "backgroundColor", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "pageLevelVerticalAlignment", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class UiComponentScreen implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UiComponentScreen> CREATOR = new a();

    private final List<UiComponent> components;

    private final StepStyles.UiStepStyle styles;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UiComponentScreen> {
        @Override
        @NotNull
        public final UiComponentScreen createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new UiComponentScreen(arrayList, (StepStyles.UiStepStyle) parcel.readParcelable(UiComponentScreen.class.getClassLoader()));
        }

        @Override
        @NotNull
        public final UiComponentScreen[] newArray(int i) {
            return new UiComponentScreen[i];
        }
    }

    public UiComponentScreen(List<? extends UiComponent> list, StepStyles.UiStepStyle uiStepStyle) {
        this.components = list;
        this.styles = uiStepStyle;
    }

    public static UiComponentScreen b(UiComponentScreen uiComponentScreen, List list, StepStyles.UiStepStyle uiStepStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uiComponentScreen.components;
        }
        if ((i & 2) != 0) {
            uiStepStyle = uiComponentScreen.styles;
        }
        return uiComponentScreen.a(list, uiStepStyle);
    }

    @NotNull
    public final UiComponentScreen a(List<? extends UiComponent> components, StepStyles.UiStepStyle styles) {
        return new UiComponentScreen(components, styles);
    }

    public final Drawable backgroundImageDrawable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return uiStepStyle.backgroundImageDrawable(context);
        }
        return null;
    }

    public final Integer c() {
        StepStyles.StepBackgroundColorStyle backgroundColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (backgroundColor = uiStepStyle.getBackgroundColor()) == null || (base = backgroundColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final Integer d() {
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiComponentScreen)) {
            return false;
        }
        UiComponentScreen uiComponentScreen = (UiComponentScreen) other;
        return Intrinsics.b(this.components, uiComponentScreen.components) && Intrinsics.b(this.styles, uiComponentScreen.styles);
    }

    public final StyleElements.PositionType f() {
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        if (uiStepStyle != null) {
            return uiStepStyle.getPageLevelVerticalAlignment();
        }
        return null;
    }

    public final List<UiComponent> getComponents() {
        return this.components;
    }

    public final StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        List<UiComponent> list = this.components;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return iHashCode + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UiComponentScreen(components=" + this.components + ", styles=" + this.styles + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<UiComponent> list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        parcel.writeParcelable(this.styles, flags);
    }
}
