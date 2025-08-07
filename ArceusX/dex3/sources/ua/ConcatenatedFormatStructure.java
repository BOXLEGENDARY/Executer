package ua;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va.C0853a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lua/h;", "T", "Lua/o;", "", "Lua/s;", "formats", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Ljava/util/List;", "c", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public class ConcatenatedFormatStructure<T> implements o<T> {

    @NotNull
    private final List<s<T>> formats;

    public ConcatenatedFormatStructure(@NotNull List<? extends s<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "formats");
        this.formats = list;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        List<s<T>> list = this.formats;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).a());
        }
        return arrayList.size() == 1 ? (va.e) CollectionsKt.i0(arrayList) : new C0853a(arrayList);
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        List<s<T>> list = this.formats;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).b());
        }
        return wa.n.b(arrayList);
    }

    @NotNull
    public final List<s<T>> c() {
        return this.formats;
    }

    public boolean equals(Object other) {
        return (other instanceof ConcatenatedFormatStructure) && Intrinsics.b(this.formats, ((ConcatenatedFormatStructure) other).formats);
    }

    public int hashCode() {
        return this.formats.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConcatenatedFormatStructure(" + CollectionsKt.U(this.formats, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ')';
    }
}
