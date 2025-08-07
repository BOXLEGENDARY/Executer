package H0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import k0.BAKp.xAQOwX;

class b {

    public interface a<T> {
        void a(T t7, Rect rect);
    }

    public interface InterfaceC0022b<T, V> {
        V a(T t7, int i7);

        int b(T t7);
    }

    private static class c<T> implements Comparator<T> {

        private final Rect f1540d = new Rect();

        private final Rect f1541e = new Rect();

        private final boolean f1542i;

        private final a<T> f1543v;

        c(boolean z7, a<T> aVar) {
            this.f1542i = z7;
            this.f1543v = aVar;
        }

        @Override
        public int compare(T t7, T t8) {
            Rect rect = this.f1540d;
            Rect rect2 = this.f1541e;
            this.f1543v.a(t7, rect);
            this.f1543v.a(t8, rect2);
            int i7 = rect.top;
            int i8 = rect2.top;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            int i9 = rect.left;
            int i10 = rect2.left;
            if (i9 < i10) {
                return this.f1542i ? 1 : -1;
            }
            if (i9 > i10) {
                return this.f1542i ? -1 : 1;
            }
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.right;
            int i14 = rect2.right;
            if (i13 < i14) {
                return this.f1542i ? 1 : -1;
            }
            if (i13 > i14) {
                return this.f1542i ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i7, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i7, rect, rect2);
        if (b(i7, rect, rect3) || !zB) {
            return false;
        }
        return !j(i7, rect, rect3) || i7 == 17 || i7 == 66 || k(i7, rect, rect2) < m(i7, rect, rect3);
    }

    private static boolean b(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(L l7, InterfaceC0022b<L, T> interfaceC0022b, a<T> aVar, T t7, Rect rect, int i7) {
        Rect rect2 = new Rect(rect);
        if (i7 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i7 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i7 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iB = interfaceC0022b.b(l7);
        Rect rect3 = new Rect();
        T t8 = null;
        for (int i8 = 0; i8 < iB; i8++) {
            T tA = interfaceC0022b.a(l7, i8);
            if (tA != t7) {
                aVar.a(tA, rect3);
                if (h(i7, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t8 = tA;
                }
            }
        }
        return t8;
    }

    public static <L, T> T d(L l7, InterfaceC0022b<L, T> interfaceC0022b, a<T> aVar, T t7, int i7, boolean z7, boolean z8) {
        int iB = interfaceC0022b.b(l7);
        ArrayList arrayList = new ArrayList(iB);
        for (int i8 = 0; i8 < iB; i8++) {
            arrayList.add(interfaceC0022b.a(l7, i8));
        }
        Collections.sort(arrayList, new c(z7, aVar));
        if (i7 == 1) {
            return (T) f(t7, arrayList, z8);
        }
        if (i7 == 2) {
            return (T) e(t7, arrayList, z8);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t7, ArrayList<T> arrayList, boolean z7) {
        int size = arrayList.size();
        int iLastIndexOf = (t7 == null ? -1 : arrayList.lastIndexOf(t7)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t7, ArrayList<T> arrayList, boolean z7) {
        int size = arrayList.size();
        int iIndexOf = (t7 == null ? size : arrayList.indexOf(t7)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z7 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i7, int i8) {
        return (i7 * 13 * i7) + (i8 * i8);
    }

    private static boolean h(int i7, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i7)) {
            return false;
        }
        if (i(rect, rect3, i7) && !a(i7, rect, rect2, rect3)) {
            return !a(i7, rect, rect3, rect2) && g(k(i7, rect, rect2), o(i7, rect, rect2)) < g(k(i7, rect, rect3), o(i7, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i7) {
        if (i7 == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            return (i8 > i9 || rect.left >= i9) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            return rect.left >= rect2.right;
        }
        if (i7 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i7 == 66) {
            return rect.right <= rect2.left;
        }
        if (i7 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i7, Rect rect, Rect rect2) {
        return Math.max(0, l(i7, rect, rect2));
    }

    private static int l(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i7 == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.top;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    private static int m(int i7, Rect rect, Rect rect2) {
        return Math.max(1, n(i7, rect, rect2));
    }

    private static int n(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.left;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.top;
        } else if (i7 == 66) {
            i8 = rect2.right;
            i9 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.bottom;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    private static int o(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException(xAQOwX.jmuhddAEbajRkjS);
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
