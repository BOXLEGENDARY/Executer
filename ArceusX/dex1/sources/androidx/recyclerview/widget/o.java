package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

class o {

    final a f12012a;

    interface a {
        void a(a.b bVar);

        a.b b(int i7, int i8, int i9, Object obj);
    }

    o(a aVar) {
        this.f12012a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z7 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f11824a != 8) {
                z7 = true;
            } else if (z7) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i7, a.b bVar, int i8, a.b bVar2) {
        int i9 = bVar.f11827d;
        int i10 = bVar2.f11825b;
        int i11 = i9 < i10 ? -1 : 0;
        int i12 = bVar.f11825b;
        if (i12 < i10) {
            i11++;
        }
        if (i10 <= i12) {
            bVar.f11825b = i12 + bVar2.f11827d;
        }
        int i13 = bVar2.f11825b;
        if (i13 <= i9) {
            bVar.f11827d = i9 + bVar2.f11827d;
        }
        bVar2.f11825b = i13 + i11;
        list.set(i7, bVar2);
        list.set(i8, bVar);
    }

    private void d(List<a.b> list, int i7, int i8) {
        a.b bVar = list.get(i7);
        a.b bVar2 = list.get(i8);
        int i9 = bVar2.f11824a;
        if (i9 == 1) {
            c(list, i7, bVar, i8, bVar2);
        } else if (i9 == 2) {
            e(list, i7, bVar, i8, bVar2);
        } else {
            if (i9 != 4) {
                return;
            }
            f(list, i7, bVar, i8, bVar2);
        }
    }

    void b(List<a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List<a.b> list, int i7, a.b bVar, int i8, a.b bVar2) {
        boolean z7;
        int i9 = bVar.f11825b;
        int i10 = bVar.f11827d;
        boolean z8 = false;
        if (i9 < i10) {
            if (bVar2.f11825b == i9 && bVar2.f11827d == i10 - i9) {
                z7 = false;
                z8 = true;
            } else {
                z7 = false;
            }
        } else if (bVar2.f11825b == i10 + 1 && bVar2.f11827d == i9 - i10) {
            z7 = true;
            z8 = true;
        } else {
            z7 = true;
        }
        int i11 = bVar2.f11825b;
        if (i10 < i11) {
            bVar2.f11825b = i11 - 1;
        } else {
            int i12 = bVar2.f11827d;
            if (i10 < i11 + i12) {
                bVar2.f11827d = i12 - 1;
                bVar.f11824a = 2;
                bVar.f11827d = 1;
                if (bVar2.f11827d == 0) {
                    list.remove(i8);
                    this.f12012a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f11825b;
        int i14 = bVar2.f11825b;
        a.b bVarB = null;
        if (i13 <= i14) {
            bVar2.f11825b = i14 + 1;
        } else {
            int i15 = bVar2.f11827d;
            if (i13 < i14 + i15) {
                bVarB = this.f12012a.b(2, i13 + 1, (i14 + i15) - i13, null);
                bVar2.f11827d = bVar.f11825b - bVar2.f11825b;
            }
        }
        if (z8) {
            list.set(i7, bVar2);
            list.remove(i8);
            this.f12012a.a(bVar);
            return;
        }
        if (z7) {
            if (bVarB != null) {
                int i16 = bVar.f11825b;
                if (i16 > bVarB.f11825b) {
                    bVar.f11825b = i16 - bVarB.f11827d;
                }
                int i17 = bVar.f11827d;
                if (i17 > bVarB.f11825b) {
                    bVar.f11827d = i17 - bVarB.f11827d;
                }
            }
            int i18 = bVar.f11825b;
            if (i18 > bVar2.f11825b) {
                bVar.f11825b = i18 - bVar2.f11827d;
            }
            int i19 = bVar.f11827d;
            if (i19 > bVar2.f11825b) {
                bVar.f11827d = i19 - bVar2.f11827d;
            }
        } else {
            if (bVarB != null) {
                int i20 = bVar.f11825b;
                if (i20 >= bVarB.f11825b) {
                    bVar.f11825b = i20 - bVarB.f11827d;
                }
                int i21 = bVar.f11827d;
                if (i21 >= bVarB.f11825b) {
                    bVar.f11827d = i21 - bVarB.f11827d;
                }
            }
            int i22 = bVar.f11825b;
            if (i22 >= bVar2.f11825b) {
                bVar.f11825b = i22 - bVar2.f11827d;
            }
            int i23 = bVar.f11827d;
            if (i23 >= bVar2.f11825b) {
                bVar.f11827d = i23 - bVar2.f11827d;
            }
        }
        list.set(i7, bVar2);
        if (bVar.f11825b != bVar.f11827d) {
            list.set(i8, bVar);
        } else {
            list.remove(i8);
        }
        if (bVarB != null) {
            list.add(i7, bVarB);
        }
    }

    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
