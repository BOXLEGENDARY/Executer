package android.view;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/d;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/o;", "owner", BuildConfig.FLAVOR, "onCreate", "(Landroidx/lifecycle/o;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InterfaceC1690d extends InterfaceC1700n {
    default void onCreate(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onResume(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStart(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(InterfaceC1701o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
