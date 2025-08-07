package Ha;

import Ha.InterfaceC0347b;
import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LHa/a;", "LAa/b;", "LHa/b;", "<init>", "()V", "", "expression", "data", "", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class C0346a implements Aa.b, InterfaceC0347b {

    @NotNull
    public static final C0346a a = new C0346a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "first", "second", "", "a", "(II)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
    static final class C0025a extends l implements Function2<Integer, Integer, Boolean> {
        public static final C0025a d = new C0025a();

        C0025a() {
            super(2);
        }

        @NotNull
        public final Boolean a(int i, int i2) {
            return Boolean.valueOf(i == i2);
        }

        public Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    private C0346a() {
    }

    @Override
    public Object a(Object obj) {
        return InterfaceC0347b.a.f(this, obj);
    }

    @Override
    public boolean b(List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return InterfaceC0347b.a.b(this, list, function2);
    }

    @Override
    public Boolean c(Object obj) {
        return InterfaceC0347b.a.g(this, obj);
    }

    @Override
    public Object d(Object obj) {
        return InterfaceC0347b.a.e(this, obj);
    }

    @Override
    public List<Comparable<?>> f(Comparable<?> comparable, Comparable<?> comparable2) {
        return InterfaceC0347b.a.c(this, comparable, comparable2);
    }

    @Override
    public List<Comparable<?>> g(Comparable<?> comparable, Comparable<?> comparable2) {
        return InterfaceC0347b.a.d(this, comparable, comparable2);
    }

    public boolean h(Object obj, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return InterfaceC0347b.a.a(this, obj, function2);
    }

    @Override
    @NotNull
    public Boolean e(Object expression, Object data) {
        return Boolean.valueOf(h(expression, C0025a.d));
    }
}
