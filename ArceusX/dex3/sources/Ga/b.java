package Ga;

import Ja.d;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LGa/b;", "LAa/b;", "LJa/d;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class b implements Aa.b, Ja.d {

    @NotNull
    public static final b a = new b();

    private b() {
    }

    @Override
    @NotNull
    public Boolean e(Object expression, Object data) {
        return Boolean.valueOf(b(CollectionsKt.firstOrNull(jb.a.c(expression))));
    }

    public boolean b(Object obj) {
        return d.a.a(this, obj);
    }
}
