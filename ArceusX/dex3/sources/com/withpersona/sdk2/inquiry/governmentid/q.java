package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import ha.C0476u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v8.C0823D;
import v8.C0826G;
import v8.OverlayAssets;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lv8/B;", "b", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;)Lv8/B;", "", "attr", "Landroid/graphics/drawable/GradientDrawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class q {
    @NotNull
    public static final GradientDrawable a(@NotNull Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(S8.c.b);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(S8.c.c);
        int iC = androidx.core.content.a.c(context, S8.b.a);
        Integer numF = C0476u.f(context, i, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] iArr = S8.g.a;
            Intrinsics.checkNotNullExpressionValue(iArr, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, iArr);
            dimension = typedArrayObtainStyledAttributes.getDimension(S8.g.b, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(S8.g.d, dimensionPixelSize);
            iC = typedArrayObtainStyledAttributes.getColor(S8.g.c, iC);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, iC);
        return gradientDrawable;
    }

    @NotNull
    public static final OverlayAssets b(@NotNull Context context, @NotNull Screen.Overlay overlay) {
        int resourceId;
        int resourceId2;
        int i;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Screen.Overlay.Passport passport = Screen.Overlay.Passport.d;
        if (Intrinsics.b(overlay, passport)) {
            resourceId = C0826G.c;
        } else if (Intrinsics.b(overlay, Screen.Overlay.Barcode.d)) {
            resourceId = C0826G.a;
        } else {
            if (!(Intrinsics.b(overlay, Screen.Overlay.CornersOnly.d) ? true : overlay instanceof Screen.Overlay.Custom ? true : Intrinsics.b(overlay, Screen.Overlay.GenericFront.d) ? true : Intrinsics.b(overlay, Screen.Overlay.Rectangle.d))) {
                throw new P9.m();
            }
            resourceId = C0826G.b;
        }
        if (Intrinsics.b(overlay, passport)) {
            resourceId2 = C0823D.j;
        } else if (Intrinsics.b(overlay, Screen.Overlay.Barcode.d)) {
            resourceId2 = C0823D.a;
        } else if (Intrinsics.b(overlay, Screen.Overlay.Rectangle.d)) {
            resourceId2 = C0823D.b;
        } else if (Intrinsics.b(overlay, Screen.Overlay.CornersOnly.d)) {
            resourceId2 = C0823D.f;
        } else {
            if (!(overlay instanceof Screen.Overlay.Custom ? true : Intrinsics.b(overlay, Screen.Overlay.GenericFront.d))) {
                throw new P9.m();
            }
            resourceId2 = C0823D.g;
        }
        if (Intrinsics.b(overlay, passport)) {
            i = S8.a.j;
        } else if (Intrinsics.b(overlay, Screen.Overlay.Barcode.d)) {
            i = S8.a.f;
        } else {
            if (!(Intrinsics.b(overlay, Screen.Overlay.CornersOnly.d) ? true : overlay instanceof Screen.Overlay.Custom ? true : Intrinsics.b(overlay, Screen.Overlay.GenericFront.d) ? true : Intrinsics.b(overlay, Screen.Overlay.Rectangle.d))) {
                throw new P9.m();
            }
            i = S8.a.i;
        }
        Integer numF = C0476u.f(context, i, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] iArr = S8.g.e;
            Intrinsics.checkNotNullExpressionValue(iArr, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, iArr);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(S8.g.f, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(S8.g.g, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }
}
