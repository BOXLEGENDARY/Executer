package Ga;

import Ja.d;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LGa/c;", "LAa/b;", "LJa/d;", "<init>", "()V", "", "", "a", "(Ljava/util/List;)Ljava/lang/Object;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class c implements Aa.b, Ja.d {

    @NotNull
    public static final c a = new c();

    private c() {
    }

    private final Object a(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull(list);
        }
        if (size != 2) {
            return size != 3 ? b(CollectionsKt.firstOrNull(list)) ? jb.c.b(list) : a(list.subList(2, list.size())) : b(CollectionsKt.firstOrNull(list)) ? jb.c.b(list) : jb.c.c(list);
        }
        if (b(CollectionsKt.firstOrNull(list))) {
            return jb.c.b(list);
        }
        return null;
    }

    public boolean b(Object obj) {
        return d.a.a(this, obj);
    }

    @Override
    public Object e(Object expression, Object data) {
        return a(jb.a.c(expression));
    }
}
