package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/view/ViewGroup;", BuildConfig.FLAVOR, "Landroid/view/View;", "b", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1614e0 {

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/e0$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", BuildConfig.FLAVOR, "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Sequence<View> {

        final ViewGroup f10664a;

        a(ViewGroup viewGroup) {
            this.f10664a = viewGroup;
        }

        public Iterator<View> iterator() {
            return C1614e0.b(this.f10664a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/view/e0$b", BuildConfig.FLAVOR, "Landroid/view/View;", BuildConfig.FLAVOR, "hasNext", "()Z", "a", "()Landroid/view/View;", BuildConfig.FLAVOR, "remove", "()V", BuildConfig.FLAVOR, "d", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<View>, ba.a {

        private int index;

        final ViewGroup f10666e;

        b(ViewGroup viewGroup) {
            this.f10666e = viewGroup;
        }

        @Override
        public View next() {
            ViewGroup viewGroup = this.f10666e;
            int i7 = this.index;
            this.index = i7 + 1;
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override
        public boolean hasNext() {
            return this.index < this.f10666e.getChildCount();
        }

        @Override
        public void remove() {
            ViewGroup viewGroup = this.f10666e;
            int i7 = this.index - 1;
            this.index = i7;
            viewGroup.removeViewAt(i7);
        }
    }

    public static final Sequence<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
