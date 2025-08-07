package wa;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "", "Lwa/q;", "b", "(Ljava/util/List;)Lwa/q;", "Lwa/i;", "errors", "", "e", "(Ljava/util/List;)Ljava/lang/String;", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwa/i;", "it", "", "a", "(Lwa/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<i, CharSequence> {
        public static final a d = new a();

        a() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "it");
            return "position " + iVar.getPosition() + ": '" + ((String) iVar.a().invoke()) + '\'';
        }
    }

    @NotNull
    public static final <T> q<T> b(@NotNull List<? extends q<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        q qVar = new q(CollectionsKt.j(), CollectionsKt.j());
        if (!list.isEmpty()) {
            ListIterator<? extends q<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                qVar = c(listIterator.previous(), qVar);
            }
        }
        return d(qVar, CollectionsKt.j());
    }

    private static final <T> q<T> c(q<? super T> qVar, q<? super T> qVar2) {
        if (qVar.a().isEmpty()) {
            return new q<>(CollectionsKt.e0(qVar.b(), qVar2.b()), qVar2.a());
        }
        List<o<? super T>> listB = qVar.b();
        List<q<? super T>> listA = qVar.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((q) it.next(), qVar2));
        }
        return new q<>(listB, arrayList);
    }

    private static final <T> q<T> d(q<? super T> qVar, List<u<T>> list) {
        List listD;
        ArrayList arrayList = new ArrayList();
        List listT0 = CollectionsKt.t0(list);
        List listT02 = null;
        for (o<? super T> oVar : qVar.b()) {
            if (oVar instanceof h) {
                if (listT02 != null) {
                    listT02.addAll(((h) oVar).c());
                } else {
                    listT02 = CollectionsKt.t0(((h) oVar).c());
                }
            } else if (oVar instanceof u) {
                listT0.add(oVar);
            } else {
                if (listT02 != null) {
                    arrayList.add(new h(listT02));
                    listT02 = null;
                }
                arrayList.add(oVar);
            }
        }
        List<q<? super T>> listA = qVar.a();
        List arrayList2 = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            q qVarD = d((q) it.next(), listT0);
            if (qVarD.b().isEmpty()) {
                List listA2 = qVarD.a();
                if (listA2.isEmpty()) {
                    listA2 = CollectionsKt.d(qVarD);
                }
                listD = listA2;
            } else {
                listD = CollectionsKt.d(qVarD);
            }
            CollectionsKt.y(arrayList2, listD);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = CollectionsKt.d(new q(listT0, CollectionsKt.j()));
        }
        List list2 = arrayList2;
        if (listT02 == null) {
            return new q<>(arrayList, list2);
        }
        List<q> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                o oVar2 = (o) CollectionsKt.firstOrNull(((q) it2.next()).b());
                if (oVar2 != null && (oVar2 instanceof h)) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.t(list3, 10));
                    for (q qVar2 : list3) {
                        o oVar3 = (o) CollectionsKt.firstOrNull(qVar2.b());
                        arrayList3.add(oVar3 instanceof h ? new q(CollectionsKt.e0(CollectionsKt.d(new h(CollectionsKt.e0(listT02, ((h) oVar3).c()))), CollectionsKt.H(qVar2.b(), 1)), qVar2.a()) : oVar3 == null ? new q(CollectionsKt.d(new h(listT02)), qVar2.a()) : new q(CollectionsKt.e0(CollectionsKt.d(new h(listT02)), qVar2.b()), qVar2.a()));
                    }
                    return new q<>(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new h(listT02));
        return new q<>(arrayList, list2);
    }

    public static final String e(List<i> list) {
        if (list.size() != 1) {
            String string = ((StringBuilder) CollectionsKt.S(list, new StringBuilder(list.size() * 33), ", ", "Errors: ", (CharSequence) null, 0, (CharSequence) null, a.d, 56, (Object) null)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        return "Position " + list.get(0).getPosition() + ": " + ((String) list.get(0).a().invoke());
    }
}
