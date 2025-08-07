package ib;

import com.roblox.client.personasdk.R;
import defpackage.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lib/a;", "", "", "expression", "data", "Lh;", "evaluator", "e", "(Ljava/util/List;Ljava/lang/Object;Lh;)Ljava/util/List;", "unwrapOperationData", "(Ljava/lang/Object;Ljava/lang/Object;Lh;)Ljava/lang/Object;", "operations-api"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class C0235a {
        public static List<Object> a(@NotNull a aVar, @NotNull List<? extends Object> list, Object obj, @NotNull h hVar) {
            Intrinsics.checkNotNullParameter(list, "expression");
            Intrinsics.checkNotNullParameter(hVar, "evaluator");
            Object objB = b(aVar, CollectionsKt.firstOrNull(list), obj, hVar);
            if (objB instanceof List) {
                return (List) objB;
            }
            return null;
        }

        private static Object b(a aVar, Object obj, Object obj2, h hVar) {
            if (!(obj instanceof List)) {
                if (!jb.a.f(obj)) {
                    return obj;
                }
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return hVar.a((Map) obj, obj2);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.t(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(aVar, it.next(), obj2, hVar));
            }
            return arrayList;
        }
    }

    List<Object> e(@NotNull List<? extends Object> expression, Object data, @NotNull h evaluator);
}
