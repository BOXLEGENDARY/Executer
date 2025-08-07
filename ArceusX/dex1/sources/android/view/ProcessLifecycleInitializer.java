package android.view;

import android.content.Context;
import android.view.C1667A;
import com.github.luben.zstd.BuildConfig;
import f1.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lf1/a;", "Landroidx/lifecycle/o;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Landroidx/lifecycle/o;", BuildConfig.FLAVOR, "Ljava/lang/Class;", "b", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements a<InterfaceC1701o> {
    @Override
    public List<Class<? extends a<?>>> b() {
        return CollectionsKt.j();
    }

    @Override
    public InterfaceC1701o a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a aVarE = androidx.startup.a.e(context);
        Intrinsics.checkNotNullExpressionValue(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1697k.a(context);
        C1667A.Companion companion = C1667A.INSTANCE;
        companion.b(context);
        return companion.a();
    }
}
