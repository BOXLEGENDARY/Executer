package android.view;

import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/l;", BuildConfig.FLAVOR, "Landroidx/lifecycle/f;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/f;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "[Landroidx/lifecycle/f;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements InterfaceC1698l {

    private final InterfaceC1692f[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(InterfaceC1692f[] interfaceC1692fArr) {
        Intrinsics.checkNotNullParameter(interfaceC1692fArr, "generatedAdapters");
        this.generatedAdapters = interfaceC1692fArr;
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        C1708v c1708v = new C1708v();
        for (InterfaceC1692f interfaceC1692f : this.generatedAdapters) {
            interfaceC1692f.a(source, event, false, c1708v);
        }
        for (InterfaceC1692f interfaceC1692f2 : this.generatedAdapters) {
            interfaceC1692f2.a(source, event, true, c1708v);
        }
    }
}
