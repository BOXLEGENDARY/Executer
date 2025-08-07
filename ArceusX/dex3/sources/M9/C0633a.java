package m9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s9.v;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lm9/a;", "Landroid/widget/ArrayAdapter;", "", "Landroid/content/Context;", "context", "", "resource", "", "objects", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyle", "<init>", "(Landroid/content/Context;ILjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0633a extends ArrayAdapter<String> {

    @NotNull
    private final List<String> objects;

    private final TextBasedComponentStyle textStyle;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lm9/a$a;", "Landroid/widget/Filter;", "<init>", "(Lm9/a;)V", "", "arg0", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "arg1", "", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private final class C0247a extends Filter {
        public C0247a() {
        }

        @Override
        @NotNull
        protected Filter.FilterResults performFiltering(CharSequence arg0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = C0633a.this.a();
            filterResults.count = C0633a.this.a().size();
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence arg0, Filter.FilterResults arg1) {
            C0633a.this.notifyDataSetChanged();
        }
    }

    public C0633a(@NotNull Context context, int i, @NotNull List<String> list, TextBasedComponentStyle textBasedComponentStyle) {
        super(context, i, list);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "objects");
        this.objects = list;
        this.textStyle = textBasedComponentStyle;
    }

    @NotNull
    public final List<String> a() {
        return this.objects;
    }

    @Override
    @NotNull
    public Filter getFilter() {
        return new C0247a();
    }

    @Override
    @NotNull
    public View getView(int position, View convertView, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = super.getView(position, convertView, parent);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
        if (textBasedComponentStyle != null) {
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                v.e(textView, textBasedComponentStyle);
            }
        }
        return view;
    }
}
