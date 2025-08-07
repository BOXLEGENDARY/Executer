package fb;

import P9.o;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfb/m;", "LAa/b;", "<init>", "()V", "", "", "Lfb/n;", "b", "(Ljava/util/List;)Lfb/n;", "", "a", "(Lfb/n;)Ljava/util/List;", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class m implements Aa.b {

    @NotNull
    public static final m a = new m();

    private m() {
    }

    private final List<String> a(SplitArguments splitArguments) {
        List<Object> listA = splitArguments.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listA, 10));
        for (Object obj : listA) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        String[] strArr = (String[]) CollectionsKt.v0(arrayList).toArray(new String[0]);
        return StringsKt.split$default(splitArguments.getText(), (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, (Object) null);
    }

    private final SplitArguments b(List<? extends Object> list) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            Object obj = list.get(0);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objB = P9.o.b(new SplitArguments((String) obj, (List) obj2));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        if (P9.o.e(objB) == null) {
            return (SplitArguments) objB;
        }
        return null;
    }

    @Override
    public Object e(Object expression, Object data) {
        SplitArguments splitArgumentsB = b(jb.a.c(expression));
        if (splitArgumentsB != null) {
            return a(splitArgumentsB);
        }
        return null;
    }
}
