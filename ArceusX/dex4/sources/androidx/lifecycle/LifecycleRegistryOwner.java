package androidx.lifecycle;

import androidx.annotation.NonNull;

@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override
    @NonNull
    LifecycleRegistry getLifecycle();
}
