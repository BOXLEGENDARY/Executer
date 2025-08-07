package R1;

import W1.i;
import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
public class l implements m, j {
    private final String d;
    private final W1.i f;
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<m> e = new ArrayList();

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[i.a.values().length];
            a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(W1.i iVar) {
        this.d = iVar.c();
        this.f = iVar;
    }

    private void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).getPath());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            m mVar = this.e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> listI = dVar.i();
                for (int size2 = listI.size() - 1; size2 >= 0; size2--) {
                    Path path = listI.get(size2).getPath();
                    path.transform(dVar.j());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> listI2 = dVar2.i();
            for (int i = 0; i < listI2.size(); i++) {
                Path path2 = listI2.get(i).getPath();
                path2.transform(dVar2.j());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(mVar2.getPath());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b(list, list2);
        }
    }

    @Override
    public void e(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof m) {
                this.e.add((m) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override
    public Path getPath() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            d(Path.Op.UNION);
        } else if (i == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            d(Path.Op.INTERSECT);
        } else if (i == 5) {
            d(Path.Op.XOR);
        }
        return this.c;
    }
}
