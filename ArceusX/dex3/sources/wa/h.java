package wa;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import ta.C0807d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lwa/h;", "Output", "Lwa/o;", "", "Lwa/e;", "consumers", "<init>", "(Ljava/util/List;)V", "storage", "", "input", "", "startIndex", "Lwa/k;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "minLength", "", "Z", "isFlexible", "d", "whatThisExpects", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h<Output> implements o<Output> {

    @NotNull
    private final List<e<Output>> consumers;

    private final int minLength;

    private final boolean isFlexible;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<String> {
        final h<Output> d;

        a(h<Output> hVar) {
            super(0);
            this.d = hVar;
        }

        @NotNull
        public final String invoke() {
            return "Unexpected end of input: yet to parse " + this.d.d();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function0<String> {
        final w d;
        final h<Output> e;

        b(w wVar, h<Output> hVar) {
            super(0);
            this.d = wVar;
            this.e = hVar;
        }

        @NotNull
        public final String invoke() {
            return "Only found " + this.d.d + " digits in a row, but need to parse " + this.e.d();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function0<String> {
        final String d;
        final h<Output> e;
        final int i;
        final g v;

        c(String str, h<Output> hVar, int i, g gVar) {
            super(0);
            this.d = str;
            this.e = hVar;
            this.i = i;
            this.v = gVar;
        }

        @NotNull
        public final String invoke() {
            return "Can not interpret the string '" + this.d + "' as " + this.e.c().get(this.i).getWhatThisExpects() + ": " + this.v.a();
        }
    }

    public h(@NotNull List<? extends e<? super Output>> list) {
        boolean z;
        boolean z2;
        int i;
        Intrinsics.checkNotNullParameter(list, "consumers");
        this.consumers = list;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer length = ((e) it.next()).getLength();
            if (length != null) {
                iIntValue = length.intValue();
            }
            i2 += iIntValue;
        }
        this.minLength = i2;
        List<e<Output>> list2 = this.consumers;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((e) it2.next()).getLength() == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.isFlexible = z;
        List<e<Output>> list3 = this.consumers;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z2 = true;
        } else {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer length2 = ((e) it3.next()).getLength();
                if (!((length2 != null ? length2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<e<Output>> list4 = this.consumers;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it4 = list4.iterator();
            i = 0;
            while (it4.hasNext()) {
                if ((((e) it4.next()).getLength() == null) && (i = i + 1) < 0) {
                    CollectionsKt.r();
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List<e<Output>> list5 = this.consumers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((e) obj).getLength() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((e) it5.next()).getWhatThisExpects());
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    public final String d() {
        String str;
        List<e<Output>> list = this.consumers;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            StringBuilder sb = new StringBuilder();
            Integer length = eVar.getLength();
            if (length == null) {
                str = "at least one digit";
            } else {
                str = length + " digits";
            }
            sb.append(str);
            sb.append(" for ");
            sb.append(eVar.getWhatThisExpects());
            arrayList.add(sb.toString());
        }
        if (this.isFlexible) {
            return "a number with at least " + this.minLength + " digits: " + arrayList;
        }
        return "a number with exactly " + this.minLength + " digits: " + arrayList;
    }

    @Override
    @NotNull
    public Object a(Output storage, @NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.minLength + startIndex > input.length()) {
            return k.INSTANCE.a(startIndex, new a(this));
        }
        w wVar = new w();
        while (wVar.d + startIndex < input.length() && C0807d.b(input.charAt(wVar.d + startIndex))) {
            wVar.d++;
        }
        if (wVar.d < this.minLength) {
            return k.INSTANCE.a(startIndex, new b(wVar, this));
        }
        int size = this.consumers.size();
        int i = 0;
        while (i < size) {
            Integer length = this.consumers.get(i).getLength();
            int iIntValue = (length != null ? length.intValue() : (wVar.d - this.minLength) + 1) + startIndex;
            g gVarA = this.consumers.get(i).a(storage, input, startIndex, iIntValue);
            if (gVarA != null) {
                return k.INSTANCE.a(startIndex, new c(input.subSequence(startIndex, iIntValue).toString(), this, i, gVarA));
            }
            i++;
            startIndex = iIntValue;
        }
        return k.INSTANCE.b(startIndex);
    }

    @NotNull
    public final List<e<Output>> c() {
        return this.consumers;
    }

    @NotNull
    public String toString() {
        return d();
    }
}
