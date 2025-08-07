package ka;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.f;
import okio.g;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokio/f;", "", "str", "d", "(Lokio/f;Ljava/lang/String;)Lokio/f;", "Lokio/g;", "b", "(Lokio/g;)Ljava/lang/String;", "Lokio/h;", "bytes", "c", "(Lokio/f;Lokio/h;)Lokio/f;", "a", "(Lokio/g;)Lokio/h;", "wf1-workflow-core"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0572j {
    @NotNull
    public static final h a(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.x(gVar.readInt());
    }

    @NotNull
    public static final String b(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return a(gVar).K();
    }

    @NotNull
    public static final f c(@NotNull f fVar, @NotNull h hVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(hVar, "bytes");
        fVar.L(hVar.E()).a1(hVar);
        return fVar;
    }

    @NotNull
    public static final f d(@NotNull f fVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return c(fVar, h.v.d(str));
    }
}
