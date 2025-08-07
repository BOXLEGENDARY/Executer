package ua;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ta.C0807d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lua/j;", "T", "Lua/s;", "", "string", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Ljava/lang/String;", "getString", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ConstantFormatStructure<T> implements s<T> {

    @NotNull
    private final String string;

    public ConstantFormatStructure(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        this.string = str;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        return new va.c(this.string);
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        String strSubstring;
        List listA;
        if (this.string.length() == 0) {
            listA = CollectionsKt.j();
        } else {
            List listC = CollectionsKt.c();
            String strSubstring2 = "";
            if (C0807d.b(this.string.charAt(0))) {
                String strSubstring3 = this.string;
                int length = strSubstring3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!C0807d.b(strSubstring3.charAt(i))) {
                        strSubstring3 = strSubstring3.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        break;
                    }
                    i++;
                }
                listC.add(new wa.h(CollectionsKt.d(new wa.b(strSubstring3))));
                String str = this.string;
                int length2 = str.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        strSubstring = "";
                        break;
                    }
                    if (!C0807d.b(str.charAt(i2))) {
                        strSubstring = str.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    i2++;
                }
            } else {
                strSubstring = this.string;
            }
            if (strSubstring.length() > 0) {
                if (C0807d.b(strSubstring.charAt(strSubstring.length() - 1))) {
                    int iQ = StringsKt.Q(strSubstring);
                    while (true) {
                        if (-1 >= iQ) {
                            break;
                        }
                        if (!C0807d.b(strSubstring.charAt(iQ))) {
                            strSubstring2 = strSubstring.substring(0, iQ + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            break;
                        }
                        iQ--;
                    }
                    listC.add(new wa.r(strSubstring2));
                    int iQ2 = StringsKt.Q(strSubstring);
                    while (true) {
                        if (-1 >= iQ2) {
                            break;
                        }
                        if (!C0807d.b(strSubstring.charAt(iQ2))) {
                            strSubstring = strSubstring.substring(iQ2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            break;
                        }
                        iQ2--;
                    }
                    listC.add(new wa.h(CollectionsKt.d(new wa.b(strSubstring))));
                } else {
                    listC.add(new wa.r(strSubstring));
                }
            }
            listA = CollectionsKt.a(listC);
        }
        return new wa.q<>(listA, CollectionsKt.j());
    }

    public boolean equals(Object other) {
        return (other instanceof ConstantFormatStructure) && Intrinsics.b(this.string, ((ConstantFormatStructure) other).string);
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConstantFormatStructure(" + this.string + ')';
    }
}
