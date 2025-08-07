package Da;

import Ca.ArrayOperationInputData;
import Ca.f;
import Ja.d;
import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LDa/d;", "LCa/f;", "LJa/d;", "LDa/c;", "data", "Lh;", "evaluator", "", "f", "(LDa/c;Lh;)Ljava/lang/Object;", "LCa/b;", "operationInput", "Lkotlin/Function2;", "arrayOperation", "evaluateOrDefault", "(LCa/b;Lh;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toOccurrenceCheckInput", "(LCa/b;)LDa/c;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface d extends f, Ja.d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCa/b;", "input", "Lh;", "logicEvaluator", "", "a", "(LCa/b;Lh;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
        static final class C0017a extends l implements Function2<ArrayOperationInputData, h, Object> {
            final d d;

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
            class C0018a extends j implements Function2<OccurrenceCheckInputData, h, Object> {
                C0018a(Object obj) {
                    super(2, obj, d.class, "check", "check(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", 0);
                }

                public final Object invoke(@NotNull OccurrenceCheckInputData occurrenceCheckInputData, @NotNull h hVar) {
                    Intrinsics.checkNotNullParameter(occurrenceCheckInputData, "p0");
                    Intrinsics.checkNotNullParameter(hVar, "p1");
                    return ((d) ((kotlin.jvm.internal.d) this).receiver).f(occurrenceCheckInputData, hVar);
                }
            }

            C0017a(d dVar) {
                super(2);
                this.d = dVar;
            }

            public final Object invoke(@NotNull ArrayOperationInputData arrayOperationInputData, @NotNull h hVar) {
                Intrinsics.checkNotNullParameter(arrayOperationInputData, "input");
                Intrinsics.checkNotNullParameter(hVar, "logicEvaluator");
                return a.d(this.d, arrayOperationInputData, hVar, new C0018a(this.d));
            }
        }

        public static Object b(@NotNull d dVar, Object obj, Object obj2, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return dVar.c(obj, obj2, hVar, new C0017a(dVar));
        }

        @NotNull
        public static ArrayOperationInputData c(@NotNull d dVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return f.a.a(dVar, list, obj, hVar);
        }

        public static Object d(d dVar, ArrayOperationInputData arrayOperationInputData, h hVar, Function2<? super OccurrenceCheckInputData, ? super h, ? extends Object> function2) {
            Object objInvoke;
            OccurrenceCheckInputData occurrenceCheckInputDataG = g(dVar, arrayOperationInputData);
            return (occurrenceCheckInputDataG == null || (objInvoke = function2.invoke(occurrenceCheckInputDataG, hVar)) == null) ? arrayOperationInputData.getOperationDefault() : objInvoke;
        }

        @NotNull
        public static Boolean e(@NotNull d dVar, Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
            Intrinsics.checkNotNullParameter(list, "expressionValues");
            return Boolean.FALSE;
        }

        public static Object f(@NotNull d dVar, Object obj, Object obj2, @NotNull h hVar, @NotNull Function2<? super ArrayOperationInputData, ? super h, ? extends Object> function2) {
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            Intrinsics.checkNotNullParameter(function2, "arrayOperation");
            return f.a.c(dVar, obj, obj2, hVar, function2);
        }

        private static OccurrenceCheckInputData g(d dVar, ArrayOperationInputData arrayOperationInputData) {
            if (arrayOperationInputData.a() == null || arrayOperationInputData.b() == null || arrayOperationInputData.b().isEmpty()) {
                return null;
            }
            return new OccurrenceCheckInputData(arrayOperationInputData.b(), arrayOperationInputData.a(), arrayOperationInputData.getOperationDefault());
        }

        public static List<Object> h(@NotNull d dVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expression");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            return f.a.d(dVar, list, obj, hVar);
        }

        public static boolean i(@NotNull d dVar, Object obj) {
            return d.a.a(dVar, obj);
        }
    }

    Object f(@NotNull OccurrenceCheckInputData data, @NotNull h evaluator);
}
