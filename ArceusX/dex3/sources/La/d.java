package La;

import La.e;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LLa/d;", "LAa/b;", "LLa/e;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class d implements Aa.b, e {

    @NotNull
    public static final d a = new d();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "first", "second", "", "a", "(II)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
    static final class a extends l implements Function2<Integer, Integer, Boolean> {
        public static final a d = new a();

        a() {
            super(2);
        }

        @NotNull
        public final Boolean a(int i, int i2) {
            return Boolean.valueOf(i <= i2);
        }

        public Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    private d() {
    }

    @Override
    public boolean b(List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return e.a.b(this, list, function2);
    }

    @Override
    public Boolean c(Object obj) {
        return e.a.f(this, obj);
    }

    public boolean d(List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return e.a.c(this, list, function2);
    }

    @Override
    @NotNull
    public Object e(Object expression, Object data) {
        return Boolean.valueOf(d(jb.a.c(expression), a.d));
    }

    @Override
    public List<Comparable<?>> f(Comparable<?> comparable, Comparable<?> comparable2) {
        return e.a.d(this, comparable, comparable2);
    }

    @Override
    public List<Comparable<?>> g(Comparable<?> comparable, Comparable<?> comparable2) {
        return e.a.e(this, comparable, comparable2);
    }
}
