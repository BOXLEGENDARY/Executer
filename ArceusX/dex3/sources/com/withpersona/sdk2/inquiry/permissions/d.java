package com.withpersona.sdk2.inquiry.permissions;

import M8.i;
import M8.j;
import Q8.l;
import Q8.p;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import java.util.ArrayList;
import java.util.List;
import ka.k;
import ka.r;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0085\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\"\u0010\u0007\u001a\u001e0\u0005R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\r2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u001b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f*\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020\b*\u00020$2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0'*\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lf8/k$a;", "Lf8/k;", "context", "", "requestPermissions", "LQ8/l;", "permission", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "key", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "Lf8/r;", "handler", "LM8/i;", "d", "(Ljava/lang/Object;Lf8/k$a;ZLQ8/l;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LM8/i;", "c", "(Ljava/lang/Object;)LM8/i;", "Landroid/content/Context;", "b", "(Landroid/content/Context;LQ8/l;)Z", "", "permissions", "a", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d {
    @NotNull
    public static final List<l> a(@NotNull Context context, @NotNull List<? extends l> list) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(list, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!b(context, (l) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean b(@NotNull Context context, @NotNull l lVar) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "permission");
        return androidx.core.content.a.a(context, p.b(lVar)) == 0;
    }

    @NotNull
    public static final i<Object, Object> c(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new i<>(obj, CollectionsKt.j(), "PermissionFlowModal");
    }

    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> i<Object, Object> d(@NotNull Object obj, @NotNull k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a aVar, boolean z, @NotNull l lVar, boolean z2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, StepStyle stepStyle, @NotNull String str9, @NotNull Function1<? super PermissionRequestWorkflow.Output, ? extends r<? super PropsT, StateT, ? extends OutputT>> function1) {
        i<Object, Object> iVarA;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "context");
        Intrinsics.checkNotNullParameter(lVar, "permission");
        Intrinsics.checkNotNullParameter(str, Title.type);
        Intrinsics.checkNotNullParameter(str2, "rationale");
        Intrinsics.checkNotNullParameter(str3, "rationaleWhenPermanentlyDenied");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(str9, "key");
        Intrinsics.checkNotNullParameter(function1, "handler");
        if (!z) {
            return c(obj);
        }
        Object objC = aVar.c(permissionRequestWorkflow, new PermissionRequestWorkflow.Props(lVar, z2, str, str2, str3, str4, str5, str6, str7, str8, stepStyle), str9, function1);
        return (objC == null || (iVarA = j.a(objC, obj, "PermissionFlowModal")) == null) ? c(obj) : iVarA;
    }
}
