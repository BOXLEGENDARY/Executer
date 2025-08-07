package Ea;

import com.roblox.client.personasdk.R;
import java.util.List;
import jb.d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEa/b;", "LAa/b;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class b implements Aa.b {

    @NotNull
    public static final b a = new b();

    private b() {
    }

    @Override
    @NotNull
    public Object e(Object expression, Object data) {
        Object objFirstOrNull;
        String string;
        boolean z = expression instanceof List;
        List list = z ? (List) expression : null;
        long jC = (list == null || (objFirstOrNull = CollectionsKt.firstOrNull(list)) == null || (string = objFirstOrNull.toString()) == null) ? 0L : d.c(string);
        List list2 = z ? (List) expression : null;
        Object objB = list2 != null ? jb.c.b(list2) : null;
        List listJ = objB instanceof List ? (List) objB : null;
        if (listJ == null) {
            listJ = CollectionsKt.j();
        }
        List<Object> listE = a.a.e(listJ, data);
        List<Object> list3 = ((long) (listJ.size() - listE.size())) < jC ? listE : null;
        return list3 == null ? CollectionsKt.j() : list3;
    }
}
