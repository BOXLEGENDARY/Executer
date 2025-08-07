package android.view;

import ha.L;
import ha.V0;
import ha.c0;
import ha.z0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/L;", "Lha/L;", "a", "(Landroidx/lifecycle/L;)Lha/L;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1679M {
    public static final L a(AbstractC1678L abstractC1678L) throws IOException {
        Intrinsics.checkNotNullParameter(abstractC1678L, "<this>");
        L l7 = (L) abstractC1678L.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (l7 != null) {
            return l7;
        }
        Object objE = abstractC1678L.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1689c(V0.b((z0) null, 1, (Object) null).K(c0.c().B1())));
        Intrinsics.checkNotNullExpressionValue(objE, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (L) objE;
    }
}
