package com.squareup.workflow1.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\u0010¢\u0006\u0004\b\u0002\u0010\u0003\"J\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007*\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\" \u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012*\u0018\b\u0007\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "Landroidx/activity/G;", "b", "(Landroid/content/Context;)Landroidx/activity/G;", "Landroid/view/View;", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "value", "getBackPressedHandler", "(Landroid/view/View;)Lkotlin/jvm/functions/Function0;", "c", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "getBackPressedHandler$annotations", "(Landroid/view/View;)V", "backPressedHandler", "Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "a", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "getHandlerWrapperOrNull$annotations", "handlerWrapperOrNull", "BackPressHandler", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0493e {
    private static final HandleBackPressWhenAttached a(View view) {
        return (HandleBackPressWhenAttached) view.getTag(o.c);
    }

    public static final androidx.activity.G b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (!(context instanceof androidx.activity.G)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (androidx.activity.G) context;
    }

    public static final void c(@NotNull View view, Function0<Unit> function0) {
        HandleBackPressWhenAttached handleBackPressWhenAttached;
        Intrinsics.checkNotNullParameter(view, "<this>");
        HandleBackPressWhenAttached handleBackPressWhenAttachedA = a(view);
        if (handleBackPressWhenAttachedA != null) {
            handleBackPressWhenAttachedA.b();
        }
        if (function0 == null) {
            handleBackPressWhenAttached = null;
        } else {
            HandleBackPressWhenAttached handleBackPressWhenAttached2 = new HandleBackPressWhenAttached(view, function0);
            handleBackPressWhenAttached2.start();
            handleBackPressWhenAttached = handleBackPressWhenAttached2;
        }
        view.setTag(o.c, handleBackPressWhenAttached);
    }
}
