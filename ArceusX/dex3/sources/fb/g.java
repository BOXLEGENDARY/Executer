package fb;

import P9.o;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lfb/g;", "LAa/b;", "Lfb/o;", "<init>", "()V", "", "", "Lfb/h;", "f", "(Ljava/util/List;)Lfb/h;", "options", "", "Lkotlin/text/j;", "a", "(Ljava/util/List;)Ljava/util/Set;", "", "regexPattern", Text.type, "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "d", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z", "b", "(Lfb/h;)Z", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class g implements Aa.b, o {

    @NotNull
    public static final g a = new g();

    private g() {
    }

    private final Set<kotlin.text.j> a(List<? extends Object> options) {
        List<? extends Object> list = options;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        for (Object obj : list) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(kotlin.text.j.valueOf((String) obj));
        }
        return CollectionsKt.v0(arrayList);
    }

    private final boolean b(MatchArguments matchArguments) {
        List<Object> listA = matchArguments.a();
        return (listA == null || listA.isEmpty()) ? c(matchArguments.getRegexPattern(), matchArguments.getText()) : d(matchArguments.a(), matchArguments.getRegexPattern(), matchArguments.getText());
    }

    private final boolean c(String regexPattern, String text) {
        return new Regex(regexPattern).d(text);
    }

    private final boolean d(List<? extends Object> options, String regexPattern, String text) {
        Set<kotlin.text.j> setA = a(options);
        Regex regex = new Regex(regexPattern, setA);
        Set<kotlin.text.j> set = setA;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((kotlin.text.j) it.next()) == kotlin.text.j.v) {
                    List listSplit$default = StringsKt.split$default(text, new String[]{"\n"}, false, 0, 6, (Object) null);
                    if ((listSplit$default instanceof Collection) && listSplit$default.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = listSplit$default.iterator();
                    while (it2.hasNext()) {
                        if (!regex.d((String) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return regex.d(text);
    }

    private final MatchArguments f(List<? extends Object> list) {
        Object objB;
        try {
            o.a aVar = P9.o.e;
            Object obj = list.get(0);
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objB = P9.o.b(new MatchArguments((String) obj, (String) obj2, (List) obj3));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        if (P9.o.e(objB) == null) {
            return (MatchArguments) objB;
        }
        return null;
    }

    @Override
    public Object e(Object expression, Object data) {
        MatchArguments matchArgumentsF = f(jb.a.c(expression));
        if (matchArgumentsF != null) {
            return Boolean.valueOf(b(matchArgumentsF));
        }
        return null;
    }
}
