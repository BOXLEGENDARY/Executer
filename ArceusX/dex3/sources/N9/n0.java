package n9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l9.ComponentView;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aW\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/ViewGroup;", "root", "Landroidx/constraintlayout/widget/d;", "constraintSet", "", "Ll9/a;", "componentViews", "", "childrenIds", "", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "alignment", "gap", "", "a", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/d;Ljava/util/List;Ljava/util/List;[ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "b", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/d;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class n0 {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, @NotNull androidx.constraintlayout.widget.d dVar, @NotNull List<ComponentView> list, @NotNull List<Integer> list2, int[] iArr, StyleElements.PositionType positionType, int i) {
        Integer num;
        int i2;
        int i3;
        Object next;
        Object next2;
        List<u9.a> listI;
        ViewGroup viewGroup2 = viewGroup;
        Intrinsics.checkNotNullParameter(viewGroup2, "root");
        Intrinsics.checkNotNullParameter(dVar, "constraintSet");
        Intrinsics.checkNotNullParameter(list, "componentViews");
        Intrinsics.checkNotNullParameter(list2, "childrenIds");
        double dO = iArr != null ? kotlin.collections.i.O(iArr) : 0.0d;
        ArrayList arrayList = new ArrayList();
        List<Integer> list3 = list2;
        int i4 = 0;
        int i5 = 0;
        for (Object obj : list3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.s();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u9.b bVar = new u9.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i5 != CollectionsKt.l(list2)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (((ComponentView) next2).d().getId() == iIntValue) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) next2;
                UiComponent uiComponentC = componentView != null ? componentView.c() : null;
                InterfaceC0689q interfaceC0689q = uiComponentC instanceof InterfaceC0689q ? (InterfaceC0689q) uiComponentC : null;
                if (interfaceC0689q != null && (listI = interfaceC0689q.i()) != null) {
                    listI.add(bVar);
                }
                viewGroup2.addView(bVar);
                dVar.m(bVar.getId(), i);
                dVar.o(bVar.getId(), true);
                dVar.l(bVar.getId(), 1);
                dVar.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i5 = i6;
        }
        int i7 = 0;
        for (Object obj2 : list3) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.s();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i7 > 0 ? (Integer) arrayList.get(i7 - 1) : null;
            if (i7 == CollectionsKt.l(list2)) {
                dVar.h(iIntValue2, 7, i4, 7);
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((ComponentView) next).d().getId() == iIntValue2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((u9.b) viewGroup2.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
                i2 = 6;
            } else {
                num = (Integer) arrayList.get(i7);
                i2 = 6;
                dVar.h(iIntValue2, 7, num.intValue(), 6);
                dVar.h(num.intValue(), 7, list2.get(i10).intValue(), 6);
                dVar.h(num.intValue(), 6, iIntValue2, 7);
            }
            if (num2 != null) {
                dVar.h(iIntValue2, i2, num2.intValue(), 7);
            } else {
                dVar.h(iIntValue2, i2, 0, i2);
            }
            dVar.l(iIntValue2, -2);
            dVar.n(iIntValue2, true);
            if (dO > 0.0d) {
                double d = (iArr != null ? iArr[i7] : 0) / dO;
                if (d > 0.0d) {
                    dVar.y(iIntValue2, (float) d);
                } else {
                    dVar.m(iIntValue2, -2);
                }
                i3 = 0;
            } else {
                i3 = 0;
                dVar.k(iIntValue2, 0);
            }
            dVar.h(iIntValue2, 3, i3, 3);
            dVar.h(iIntValue2, 4, i3, 4);
            if (num != null) {
                dVar.h(num.intValue(), 3, i3, 3);
                dVar.h(num.intValue(), 4, i3, 4);
            }
            int i11 = positionType == null ? -1 : a.a[positionType.ordinal()];
            if (i11 == 1) {
                dVar.A(iIntValue2, 0.0f);
            } else if (i11 != 2) {
                dVar.A(iIntValue2, 0.5f);
            } else {
                dVar.A(iIntValue2, 1.0f);
            }
            i7 = i10;
            i4 = i3;
            viewGroup2 = viewGroup;
        }
    }

    public static final void b(@NotNull ViewGroup viewGroup, @NotNull androidx.constraintlayout.widget.d dVar, @NotNull List<ComponentView> list, @NotNull List<Integer> list2, StyleElements.PositionType positionType, int i) {
        Integer num;
        Object next;
        Object next2;
        List<u9.a> listI;
        Intrinsics.checkNotNullParameter(viewGroup, "root");
        Intrinsics.checkNotNullParameter(dVar, "constraintSet");
        Intrinsics.checkNotNullParameter(list, "componentViews");
        Intrinsics.checkNotNullParameter(list2, "childrenIds");
        ArrayList arrayList = new ArrayList();
        List<Integer> list3 = list2;
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.s();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u9.b bVar = new u9.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i2 != CollectionsKt.l(list2)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (((ComponentView) next2).d().getId() == iIntValue) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) next2;
                UiComponent uiComponentC = componentView != null ? componentView.c() : null;
                InterfaceC0689q interfaceC0689q = uiComponentC instanceof InterfaceC0689q ? (InterfaceC0689q) uiComponentC : null;
                if (interfaceC0689q != null && (listI = interfaceC0689q.i()) != null) {
                    listI.add(bVar);
                }
                viewGroup.addView(bVar);
                dVar.m(bVar.getId(), 1);
                dVar.o(bVar.getId(), true);
                dVar.l(bVar.getId(), i);
                dVar.n(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i2 = i3;
        }
        int i4 = 0;
        for (Object obj2 : list3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.s();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i4 > 0 ? (Integer) arrayList.get(i4 - 1) : null;
            if (i4 == CollectionsKt.l(list2)) {
                dVar.h(iIntValue2, 4, 0, 4);
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((ComponentView) next).d().getId() == iIntValue2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((u9.b) viewGroup.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
            } else {
                num = (Integer) arrayList.get(i4);
                dVar.h(num.intValue(), 3, iIntValue2, 4);
            }
            if (i4 == 0) {
                dVar.h(iIntValue2, 3, 0, 3);
            }
            if (num2 != null) {
                dVar.h(num2.intValue(), 4, iIntValue2, 3);
                dVar.h(iIntValue2, 3, num2.intValue(), 4);
            }
            dVar.h(iIntValue2, 6, 0, 6);
            dVar.h(iIntValue2, 7, 0, 7);
            if (num != null) {
                dVar.h(num.intValue(), 6, 0, 6);
                dVar.h(num.intValue(), 7, 0, 7);
            }
            dVar.l(iIntValue2, -2);
            dVar.m(iIntValue2, 0);
            int i6 = positionType == null ? -1 : a.a[positionType.ordinal()];
            if (i6 == 1) {
                dVar.x(iIntValue2, 0.0f);
            } else if (i6 != 2) {
                dVar.x(iIntValue2, 0.5f);
            } else {
                dVar.x(iIntValue2, 1.0f);
            }
            i4 = i5;
        }
    }
}
