package G9;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class t implements Appendable, CharSequence {
    private final StringBuilder d;
    private final Deque<a> e;

    public static class a {
        public final Object a;
        public int b;
        public int c;
        public final int d;

        a(@NonNull Object obj, int i, int i2, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public t() {
        this("");
    }

    private void e(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        i(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    i(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    static boolean g(int i, int i2, int i3) {
        return i3 > i2 && i2 >= 0 && i3 <= i;
    }

    public static void j(@NonNull t tVar, Object obj, int i, int i2) {
        if (obj == null || !g(tVar.length(), i, i2)) {
            return;
        }
        k(tVar, obj, i, i2);
    }

    private static void k(@NonNull t tVar, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                tVar.i(obj, i, i2, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                k(tVar, obj2, i, i2);
            }
        }
    }

    @Override
    @NonNull
    public t append(char c) {
        this.d.append(c);
        return this;
    }

    @Override
    @NonNull
    public t append(@NonNull CharSequence charSequence) {
        e(length(), charSequence);
        this.d.append(charSequence);
        return this;
    }

    @Override
    @NonNull
    public t append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        e(length(), charSequenceSubSequence);
        this.d.append(charSequenceSubSequence);
        return this;
    }

    @Override
    public char charAt(int i) {
        return this.d.charAt(i);
    }

    @NonNull
    public t d(@NonNull String str) {
        this.d.append(str);
        return this;
    }

    @NonNull
    public List<a> f(int i, int i2) {
        int i3;
        int length = length();
        if (!g(length, i, i2)) {
            return Collections.emptyList();
        }
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(this.e);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.e.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i4 = next.b;
            if ((i4 >= i && i4 < i2) || (((i3 = next.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.d.charAt(length() - 1);
    }

    @NonNull
    public t i(@NonNull Object obj, int i, int i2, int i3) {
        this.e.push(new a(obj, i, i2, i3));
        return this;
    }

    @NonNull
    public SpannableStringBuilder l() {
        b bVar = new b(this.d);
        for (a aVar : this.e) {
            bVar.setSpan(aVar.a, aVar.b, aVar.c, aVar.d);
        }
        return bVar;
    }

    @Override
    public int length() {
        return this.d.length();
    }

    @Override
    public CharSequence subSequence(int i, int i2) {
        List<a> listF = f(i, i2);
        if (listF.isEmpty()) {
            return this.d.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.d.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (a aVar : listF) {
            int iMax = Math.max(0, aVar.b - i);
            spannableStringBuilder.setSpan(aVar.a, iMax, Math.min(length, (aVar.c - aVar.b) + iMax), aVar.d);
        }
        return spannableStringBuilder;
    }

    @Override
    @NonNull
    public String toString() {
        return this.d.toString();
    }

    public t(@NonNull CharSequence charSequence) {
        this.e = new ArrayDeque(8);
        this.d = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
