package Ea;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LEa/a;", "LAa/b;", "<init>", "()V", "", "", "b", "(Ljava/lang/Object;)Z", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a implements Aa.b {

    @NotNull
    public static final a a = new a();

    private a() {
    }

    private final boolean b(Object obj) {
        return obj == null || ((obj instanceof String) && ((CharSequence) obj).length() == 0);
    }

    @Override
    @NotNull
    public List<Object> e(Object expression, Object data) {
        List<Object> listC = jb.a.c(expression);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!a.b(c.a.e(obj, data))) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
