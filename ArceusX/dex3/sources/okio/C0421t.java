package okio;

import X9.h;
import android.content.Context;
import ha.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LO1/t;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LC1/a;", "a", "(Landroid/content/Context;)LC1/a;", "b", "LC1/a;", "instance", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0421t {

    @NotNull
    public static final C0421t a = new C0421t();

    private static a instance;

    private C0421t() {
    }

    @NotNull
    public final synchronized a a(@NotNull Context context) {
        a aVarA;
        aVarA = instance;
        if (aVarA == null) {
            aVarA = new a.C0009a().b(h.r(C0412j.m(context), "image_cache")).a();
            instance = aVarA;
        }
        return aVarA;
    }
}
