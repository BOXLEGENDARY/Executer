package android.view;

import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/d;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/d;Landroidx/lifecycle/l;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "d", "Landroidx/lifecycle/d;", "e", "Landroidx/lifecycle/l;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements InterfaceC1698l {

    private final InterfaceC1690d defaultLifecycleObserver;

    private final InterfaceC1698l lifecycleEventObserver;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class a {

        public static final int[] f11259a;

        static {
            int[] iArr = new int[AbstractC1694h.a.values().length];
            try {
                iArr[AbstractC1694h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1694h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1694h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1694h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1694h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1694h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1694h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f11259a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC1690d interfaceC1690d, InterfaceC1698l interfaceC1698l) {
        Intrinsics.checkNotNullParameter(interfaceC1690d, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = interfaceC1690d;
        this.lifecycleEventObserver = interfaceC1698l;
    }

    @Override
    public void j(InterfaceC1701o source, AbstractC1694h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f11259a[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.onCreate(source);
                break;
            case 2:
                this.defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                this.defaultLifecycleObserver.onResume(source);
                break;
            case 4:
                this.defaultLifecycleObserver.onPause(source);
                break;
            case 5:
                this.defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                this.defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1698l interfaceC1698l = this.lifecycleEventObserver;
        if (interfaceC1698l != null) {
            interfaceC1698l.j(source, event);
        }
    }
}
