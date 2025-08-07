package wa;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wa.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0006B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u000f"}, d2 = {"Lwa/l;", "Lwa/c;", "Output", "", "Lwa/q;", "commands", "a", "(Lwa/q;)Lwa/q;", "", "input", "initialContainer", "", "startIndex", "b", "(Lwa/q;Ljava/lang/CharSequence;Lwa/c;I)Lwa/c;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class l<Output extends c<Output>> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwa/l$a;", "Output", "", "output", "Lwa/q;", "parserStructure", "", "inputPosition", "<init>", "(Ljava/lang/Object;Lwa/q;I)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lwa/q;", "c", "()Lwa/q;", "I", "()I", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a<Output> {

        private final Output output;

        @NotNull
        private final q<Output> parserStructure;

        private final int inputPosition;

        public a(Output output, @NotNull q<? super Output> qVar, int i) {
            Intrinsics.checkNotNullParameter(qVar, "parserStructure");
            this.output = output;
            this.parserStructure = qVar;
            this.inputPosition = i;
        }

        public final int getInputPosition() {
            return this.inputPosition;
        }

        public final Output b() {
            return this.output;
        }

        @NotNull
        public final q<Output> c() {
            return this.parserStructure;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class b<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return R9.a.a(Integer.valueOf(((i) t2).getPosition()), Integer.valueOf(((i) t).getPosition()));
        }
    }

    @NotNull
    public static <Output extends c<Output>> q<Output> a(@NotNull q<? super Output> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "commands");
        return qVar;
    }

    @NotNull
    public static final Output b(q<? super Output> qVar, @NotNull CharSequence charSequence, @NotNull Output output, int i) throws j {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(output, "initialContainer");
        ArrayList arrayList = new ArrayList();
        List listO = CollectionsKt.o(new a[]{new a(output, qVar, i)});
        while (true) {
            a aVar = (a) CollectionsKt.C(listO);
            if (aVar == null) {
                if (arrayList.size() > 1) {
                    CollectionsKt.x(arrayList, new b());
                }
                throw new j(arrayList);
            }
            Output output2 = (Output) ((c) aVar.b()).copy();
            int inputPosition = aVar.getInputPosition();
            q qVarC = aVar.c();
            int size = qVarC.b().size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object objA = ((o) qVarC.b().get(i2)).a(output2, charSequence, inputPosition);
                    if (objA instanceof Integer) {
                        inputPosition = ((Number) objA).intValue();
                        i2++;
                    } else {
                        if (!(objA instanceof i)) {
                            throw new IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        arrayList.add((i) objA);
                    }
                } else if (!qVarC.a().isEmpty()) {
                    int size2 = qVarC.a().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            listO.add(new a(output2, (q) qVarC.a().get(size2), inputPosition));
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                } else {
                    if (inputPosition == charSequence.length()) {
                        return output2;
                    }
                    arrayList.add(new i(inputPosition, m.d));
                }
            }
        }
    }

    public static c c(q qVar, CharSequence charSequence, c cVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return b(qVar, charSequence, cVar, i);
    }
}
