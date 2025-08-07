package Ga;

import Ja.d;
import com.roblox.client.personasdk.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LGa/a;", "LAa/b;", "LJa/d;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a implements Aa.b, Ja.d {

    @NotNull
    public static final a a = new a();

    private a() {
    }

    public boolean a(Object obj) {
        return d.a.a(this, obj);
    }

    @Override
    public Object e(Object expression, Object data) {
        Object next;
        List<Object> listC = jb.a.c(expression);
        List<Object> list = listC;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (!a.a(next)) {
                            break;
                        }
                    }
                    return next == null ? CollectionsKt.W(listC) : next;
                }
            }
        }
        boolean z2 = true;
        if (!z || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (!a.a(it3.next())) {
                    z2 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
