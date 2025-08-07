package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;

final class i {

    private final f.i f10851a;

    private final n f10852b;

    private f.d f10853c;

    private final boolean f10854d;

    private final int[] f10855e;

    private static final class a {
        static int a(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    i7--;
                    if (i7 < 0) {
                        return z7 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z7 = true;
                    }
                }
                return i7;
            }
        }

        static int b(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    if (i7 >= length) {
                        if (z7) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                        i7++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                        i7++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i7++;
                        z7 = true;
                    }
                }
                return i7;
            }
        }
    }

    static final class b {

        private int f10856a = 1;

        private final n.a f10857b;

        private n.a f10858c;

        private n.a f10859d;

        private int f10860e;

        private int f10861f;

        private final boolean f10862g;

        private final int[] f10863h;

        b(n.a aVar, boolean z7, int[] iArr) {
            this.f10857b = aVar;
            this.f10858c = aVar;
            this.f10862g = z7;
            this.f10863h = iArr;
        }

        private static boolean d(int i7) {
            return i7 == 65039;
        }

        private static boolean f(int i7) {
            return i7 == 65038;
        }

        private int g() {
            this.f10856a = 1;
            this.f10858c = this.f10857b;
            this.f10861f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f10858c.b().j() || d(this.f10860e)) {
                return true;
            }
            if (this.f10862g) {
                if (this.f10863h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f10863h, this.f10858c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i7) {
            n.a aVarA = this.f10858c.a(i7);
            int iG = 2;
            if (this.f10856a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f10856a = 2;
                    this.f10858c = aVarA;
                    this.f10861f = 1;
                }
            } else if (aVarA != null) {
                this.f10858c = aVarA;
                this.f10861f++;
            } else if (f(i7)) {
                iG = g();
            } else if (!d(i7)) {
                if (this.f10858c.b() != null) {
                    iG = 3;
                    if (this.f10861f != 1 || h()) {
                        this.f10859d = this.f10858c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f10860e = i7;
            return iG;
        }

        h b() {
            return this.f10858c.b();
        }

        h c() {
            return this.f10859d.b();
        }

        boolean e() {
            return this.f10856a == 2 && this.f10858c.b() != null && (this.f10861f > 1 || h());
        }
    }

    i(n nVar, f.i iVar, f.d dVar, boolean z7, int[] iArr) {
        this.f10851a = iVar;
        this.f10852b = nVar;
        this.f10853c = dVar;
        this.f10854d = z7;
        this.f10855e = iArr;
    }

    private void a(Spannable spannable, h hVar, int i7, int i8) {
        spannable.setSpan(this.f10851a.a(hVar), i7, i8, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z7) {
        j[] jVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i7 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z7) {
                iMax = a.a(editable, selectionStart, Math.max(i7, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i8, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i7, 0);
                iMin = Math.min(selectionEnd + i8, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i7, KeyEvent keyEvent) {
        if (!(i7 != 67 ? i7 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i7, int i8, h hVar) {
        if (hVar.d() == 0) {
            hVar.k(this.f10853c.a(charSequence, i7, i8, hVar.h()));
        }
        return hVar.d() == 2;
    }

    private static boolean f(int i7, int i8) {
        return i7 == -1 || i8 == -1 || i7 != i8;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    CharSequence h(CharSequence charSequence, int i7, int i8, int i9, boolean z7) {
        q qVar;
        int iCharCount;
        j[] jVarArr;
        boolean z8 = charSequence instanceof o;
        if (z8) {
            ((o) charSequence).a();
        }
        if (!z8) {
            try {
                qVar = charSequence instanceof Spannable ? new q((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i7 + (-1), i8 + 1, j.class) > i8) ? null : new q(charSequence);
            } finally {
                if (z8) {
                    ((o) charSequence).d();
                }
            }
        }
        if (qVar != null && (jVarArr = (j[]) qVar.getSpans(i7, i8, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = qVar.getSpanStart(jVar);
                int spanEnd = qVar.getSpanEnd(jVar);
                if (spanStart != i8) {
                    qVar.removeSpan(jVar);
                }
                i7 = Math.min(spanStart, i7);
                i8 = Math.max(spanEnd, i8);
            }
        }
        if (i7 != i8 && i7 < charSequence.length()) {
            if (i9 != Integer.MAX_VALUE && qVar != null) {
                i9 -= ((j[]) qVar.getSpans(0, qVar.length(), j.class)).length;
            }
            b bVar = new b(this.f10852b.f(), this.f10854d, this.f10855e);
            int iCodePointAt = Character.codePointAt(charSequence, i7);
            int i10 = 0;
            q qVar2 = qVar;
            loop1: while (true) {
                iCharCount = i7;
                while (i7 < i8 && i10 < i9) {
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i7 = iCharCount;
                    } else if (iA == 2) {
                        i7 += Character.charCount(iCodePointAt);
                        if (i7 < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, i7);
                        }
                    } else if (iA == 3) {
                        if (z7 || !e(charSequence, iCharCount, i7, bVar.c())) {
                            if (qVar2 == null) {
                                qVar2 = new q((Spannable) new SpannableString(charSequence));
                            }
                            a(qVar2, bVar.c(), iCharCount, i7);
                            i10++;
                        }
                    }
                }
                break loop1;
            }
            if (bVar.e() && i10 < i9 && (z7 || !e(charSequence, iCharCount, i7, bVar.b()))) {
                if (qVar2 == null) {
                    qVar2 = new q(charSequence);
                }
                a(qVar2, bVar.b(), iCharCount, i7);
            }
            if (qVar2 == null) {
                if (z8) {
                    ((o) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = qVar2.b();
            if (z8) {
                ((o) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }
}
