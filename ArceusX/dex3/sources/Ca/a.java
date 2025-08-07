package Ca;

import com.roblox.client.personasdk.R;
import defpackage.h;
import ib.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LCa/a;", "Lib/a;", "", "", "expressionValues", "operationData", "Lh;", "evaluator", "LCa/b;", "d", "(Ljava/util/List;Ljava/lang/Object;Lh;)LCa/b;", "", "", "mappingOperation", "b", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a extends ib.a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0016a {
        @NotNull
        public static ArrayOperationInputData a(@NotNull a aVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            List<Object> listE = aVar.e(list, obj, hVar);
            Map<String, ? extends Object> mapA = jb.c.a(list);
            return new ArrayOperationInputData(listE, mapA, aVar.b(mapA, list));
        }

        public static Object b(@NotNull a aVar, Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            if (map == null) {
                return jb.c.b(list);
            }
            return null;
        }

        public static List<Object> c(@NotNull a aVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expression");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return a.C0235a.a(aVar, list, obj, hVar);
        }
    }

    Object b(Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues);

    @NotNull
    ArrayOperationInputData d(@NotNull List<? extends Object> expressionValues, Object operationData, @NotNull h evaluator);
}
