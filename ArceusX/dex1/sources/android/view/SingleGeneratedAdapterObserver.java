package android.view;

import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/f;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/f;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "Landroidx/lifecycle/f;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleGeneratedAdapterObserver implements InterfaceC1698l {

    private final InterfaceC1692f generatedAdapter;

    public SingleGeneratedAdapterObserver(InterfaceC1692f interfaceC1692f) {
        Intrinsics.checkNotNullParameter(interfaceC1692f, "generatedAdapter");
        this.generatedAdapter = interfaceC1692f;
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.generatedAdapter.a(source, event, false, null);
        this.generatedAdapter.a(source, event, true, null);
    }
}
