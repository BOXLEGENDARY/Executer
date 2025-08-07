package ha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import ha.C0448G;
import ha.C0449H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import q9.q;
import s9.v;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R.\u00103\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00108\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010@\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00060\u00060=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lr9/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "canSelectMultipleValues", "initialSelectedOptions", "Lkotlin/Function1;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;ZLjava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "position", "H", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;", "e", "()I", "holder", "r", "(Landroidx/recyclerview/widget/RecyclerView$D;I)V", "J", "()V", "d", "Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "f", "Z", "g", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "", "value", "h", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "I", "(Ljava/lang/String;)V", "query", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "i", "Landroid/view/LayoutInflater;", "inflater", "", "j", "Ljava/util/Set;", "_selectedValues", "Landroidx/recyclerview/widget/d;", "k", "Landroidx/recyclerview/widget/d;", "asyncListDiffer", "E", "()Ljava/util/List;", "selectedOptions", "a", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0753i extends RecyclerView.h<RecyclerView.D> {

    @NotNull
    private final List<Option> options;

    private final InputSelectBoxComponentStyle styles;

    private final boolean canSelectMultipleValues;

    @NotNull
    private final Function1<Option, Unit> onClick;

    private String query;

    private final LayoutInflater inflater;

    @NotNull
    private Set<Option> _selectedValues;

    @NotNull
    private final d<Option> asyncListDiffer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lr9/i$a;", "Landroidx/recyclerview/widget/h$f;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "<init>", "()V", "oldItem", "newItem", "", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Z", "d", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a extends h.f<Option> {
        public boolean a(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.b(oldItem, newItem);
        }

        public boolean b(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.b(oldItem, newItem);
        }
    }

    public C0753i(@NotNull Context context, @NotNull List<Option> list, InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z, @NotNull List<Option> list2, @NotNull Function1<? super Option, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "options");
        Intrinsics.checkNotNullParameter(list2, "initialSelectedOptions");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.options = list;
        this.styles = inputSelectBoxComponentStyle;
        this.canSelectMultipleValues = z;
        this.onClick = function1;
        this.inflater = LayoutInflater.from(context);
        this.asyncListDiffer = new d<>(this, new a());
        List<Option> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getValue());
        }
        Set setV0 = CollectionsKt.v0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (setV0.contains(((Option) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = CollectionsKt.u0(arrayList2);
        J();
    }

    public static final void F(C0753i c0753i, RecyclerView.D d, View view) {
        Intrinsics.checkNotNullParameter(c0753i, "this$0");
        Intrinsics.checkNotNullParameter(d, "$holder");
        c0753i.H(d.k());
    }

    public static final void G(C0753i c0753i, RecyclerView.D d, View view) {
        Intrinsics.checkNotNullParameter(c0753i, "this$0");
        Intrinsics.checkNotNullParameter(d, "$holder");
        c0753i.H(d.k());
    }

    private final void H(int position) {
        if (!this.canSelectMultipleValues) {
            this._selectedValues.clear();
        }
        Option option = (Option) this.asyncListDiffer.a().get(position);
        if (this._selectedValues.contains(option)) {
            this._selectedValues.remove(option);
        } else {
            Set<Option> set = this._selectedValues;
            Intrinsics.d(option);
            set.add(option);
        }
        k(position);
        Function1<Option, Unit> function1 = this.onClick;
        Intrinsics.d(option);
        function1.invoke(option);
    }

    @NotNull
    public final List<Option> E() {
        return CollectionsKt.r0(this._selectedValues);
    }

    public final void I(String str) {
        this.query = str;
        J();
    }

    public final void J() {
        List arrayList;
        String str = this.query;
        if (str == null || StringsKt.Y(str)) {
            arrayList = this.options;
        } else {
            List<Option> list = this.options;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.I(((Option) obj).getText(), str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.asyncListDiffer.d(arrayList);
    }

    public int e() {
        return this.asyncListDiffer.a().size();
    }

    public void r(@NotNull final RecyclerView.D holder, int position) {
        Integer focusedBackgroundColorValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Option option = (Option) this.asyncListDiffer.a().get(position);
        q qVar = (q) C0449H.a(holder);
        qVar.c.setText(option.getText());
        qVar.a().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0753i.F(this.d, holder, view);
            }
        });
        qVar.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C0753i.G(this.d, holder, view);
            }
        });
        boolean zContains = this._selectedValues.contains(option);
        qVar.b.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (zContains) {
            qVar.a().setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        qVar.a().getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        qVar.a().setBackgroundResource(typedValue.resourceId);
    }

    @NotNull
    public RecyclerView.D t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C0448G c0448g = new C0448G(q.d(this.inflater, parent, false));
        j1.a aVarO = c0448g.O();
        Intrinsics.checkNotNullExpressionValue(aVarO, "<get-binding>(...)");
        q qVar = (q) aVarO;
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle != null) {
            TextView textView = qVar.c;
            Intrinsics.checkNotNullExpressionValue(textView, "label");
            v.e(textView, inputSelectBoxComponentStyle.getTextBasedStyle());
        }
        if (this.canSelectMultipleValues) {
            qVar.b.setVisibility(0);
            qVar.b.setButtonTintList(ColorStateList.valueOf(qVar.c.getCurrentTextColor()));
        } else {
            qVar.b.setVisibility(8);
        }
        return c0448g;
    }
}
