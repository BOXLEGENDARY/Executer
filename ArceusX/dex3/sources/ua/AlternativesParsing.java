package ua;

import com.roblox.client.personasdk.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lua/c;", "T", "Lua/s;", "Lua/o;", "mainFormat", "", "formats", "<init>", "(Lua/o;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Lua/o;", "d", "()Lua/o;", "Ljava/util/List;", "c", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AlternativesParsing<T> implements s<T> {

    @NotNull
    private final o<T> mainFormat;

    @NotNull
    private final List<o<T>> formats;

    public AlternativesParsing(@NotNull o<? super T> oVar, @NotNull List<? extends o<? super T>> list) {
        Intrinsics.checkNotNullParameter(oVar, "mainFormat");
        Intrinsics.checkNotNullParameter(list, "formats");
        this.mainFormat = oVar;
        this.formats = list;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        return this.mainFormat.a();
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        List listJ = CollectionsKt.j();
        List listC = CollectionsKt.c();
        listC.add(this.mainFormat.b());
        Iterator<o<T>> it = this.formats.iterator();
        while (it.hasNext()) {
            listC.add(it.next().b());
        }
        return new wa.q<>(listJ, CollectionsKt.a(listC));
    }

    @NotNull
    public final List<o<T>> c() {
        return this.formats;
    }

    @NotNull
    public final o<T> d() {
        return this.mainFormat;
    }

    public boolean equals(Object other) {
        if (other instanceof AlternativesParsing) {
            AlternativesParsing alternativesParsing = (AlternativesParsing) other;
            if (Intrinsics.b(this.mainFormat, alternativesParsing.mainFormat) && Intrinsics.b(this.formats, alternativesParsing.formats)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.mainFormat.hashCode() * 31) + this.formats.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlternativesParsing(" + this.formats + ')';
    }
}
