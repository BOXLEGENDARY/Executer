package e;

import com.github.luben.zstd.BuildConfig;
import e.C2407g;
import f.C2436f;
import f.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf/h$g;", "mediaType", BuildConfig.FLAVOR, "maxItems", BuildConfig.FLAVOR, "isOrderedSelection", "Lf/h$b;", "defaultTab", "Le/g;", "a", "(Lf/h$g;IZLf/h$b;)Le/g;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C2408h {
    public static final C2407g a(h.g gVar, int i7, boolean z7, h.b bVar) {
        Intrinsics.checkNotNullParameter(gVar, "mediaType");
        Intrinsics.checkNotNullParameter(bVar, "defaultTab");
        return new C2407g.a().d(gVar).c(i7).e(z7).b(bVar).a();
    }

    public static C2407g b(h.g gVar, int i7, boolean z7, h.b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = h.c.f20436a;
        }
        if ((i8 & 2) != 0) {
            i7 = C2436f.INSTANCE.a();
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        if ((i8 & 8) != 0) {
            bVar = h.b.a.f20434a;
        }
        return a(gVar, i7, z7, bVar);
    }
}
