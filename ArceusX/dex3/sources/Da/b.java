package Da;

import Ca.ArrayOperationInputData;
import Da.d;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\b\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fH\u0016¢\u0006\u0004\b\b\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LDa/b;", "LAa/a;", "LDa/d;", "<init>", "()V", "", "expression", "data", "Lh;", "evaluator", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "", "", "mappingOperation", "", "expressionValues", "", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;", "LDa/c;", "f", "(LDa/c;Lh;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class b implements Aa.a, d {

    @NotNull
    public static final b a = new b();

    private b() {
    }

    @Override
    public Object a(Object expression, Object data, @NotNull h evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return g(expression, data, evaluator);
    }

    @Override
    public Object c(Object obj, Object obj2, @NotNull h hVar, @NotNull Function2<? super ArrayOperationInputData, ? super h, ? extends Object> function2) {
        return d.a.f(this, obj, obj2, hVar, function2);
    }

    @Override
    @NotNull
    public ArrayOperationInputData d(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return d.a.c(this, list, obj, hVar);
    }

    @Override
    public List<Object> e(@NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
        return d.a.h(this, list, obj, hVar);
    }

    @Override
    public Object f(@NotNull OccurrenceCheckInputData data, @NotNull h evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.b().iterator();
        while (it.hasNext()) {
            if (a.i(evaluator.a(data.a(), it.next()))) {
                return Boolean.FALSE;
            }
        }
        return data.getOperationDefault();
    }

    public Object g(Object obj, Object obj2, @NotNull h hVar) {
        return d.a.b(this, obj, obj2, hVar);
    }

    @Override
    @NotNull
    public Boolean b(Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        return Boolean.TRUE;
    }

    public boolean i(Object obj) {
        return d.a.i(this, obj);
    }
}
