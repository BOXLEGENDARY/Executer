package Ca;

import Ca.a;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LCa/f;", "LCa/a;", "", "expression", "operationData", "Lh;", "evaluator", "Lkotlin/Function2;", "LCa/b;", "arrayOperation", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lh;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface f extends Ca.a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static ArrayOperationInputData a(@NotNull f fVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return a.C0016a.a(fVar, list, obj, hVar);
        }

        public static Object b(@NotNull f fVar, Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            return a.C0016a.b(fVar, map, list);
        }

        public static Object c(@NotNull f fVar, Object obj, Object obj2, @NotNull h hVar, @NotNull Function2<? super ArrayOperationInputData, ? super h, ? extends Object> function2) {
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            Intrinsics.checkNotNullParameter(function2, "arrayOperation");
            return function2.invoke(fVar.d(jb.a.c(obj), obj2, hVar), hVar);
        }

        public static List<Object> d(@NotNull f fVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expression");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return a.C0016a.c(fVar, list, obj, hVar);
        }
    }

    Object c(Object expression, Object operationData, @NotNull h evaluator, @NotNull Function2<? super ArrayOperationInputData, ? super h, ? extends Object> arrayOperation);
}
