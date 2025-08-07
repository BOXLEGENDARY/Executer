package ua;

import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lua/o;", "format", "", "Lua/l;", "b", "(Lua/o;)Ljava/util/List;", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class p {
    public static final <T> List<l<T>> b(o<? super T> oVar) {
        List listC = CollectionsKt.c();
        c(listC, oVar);
        return CollectionsKt.a(listC);
    }

    private static final <T> void c(List<l<T>> list, o<? super T> oVar) {
        if (oVar instanceof BasicFormatStructure) {
            list.add(((BasicFormatStructure) oVar).c());
            return;
        }
        if (oVar instanceof ConcatenatedFormatStructure) {
            Iterator<T> it = ((ConcatenatedFormatStructure) oVar).c().iterator();
            while (it.hasNext()) {
                c(list, (s) it.next());
            }
            return;
        }
        if (oVar instanceof ConstantFormatStructure) {
            return;
        }
        if (oVar instanceof y) {
            c(list, ((y) oVar).f());
            return;
        }
        if (!(oVar instanceof AlternativesParsing)) {
            if (oVar instanceof t) {
                c(list, ((t) oVar).d());
            }
        } else {
            AlternativesParsing alternativesParsing = (AlternativesParsing) oVar;
            c(list, alternativesParsing.d());
            Iterator<T> it2 = alternativesParsing.c().iterator();
            while (it2.hasNext()) {
                c(list, (o) it2.next());
            }
        }
    }
}
