package Pa;

import Sa.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class s implements Va.a {
    private final char a;
    private int b = 0;
    private LinkedList<Va.a> c = new LinkedList<>();

    s(char c) {
        this.a = c;
    }

    private Va.a g(int i) {
        Iterator<Va.a> it = this.c.iterator();
        while (it.hasNext()) {
            Va.a next = it.next();
            if (next.d() <= i) {
                return next;
            }
        }
        return this.c.getFirst();
    }

    @Override
    public char a() {
        return this.a;
    }

    @Override
    public void b(w wVar, w wVar2, int i) {
        g(i).b(wVar, wVar2, i);
    }

    @Override
    public int c(Va.b bVar, Va.b bVar2) {
        return g(bVar.length()).c(bVar, bVar2);
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public char e() {
        return this.a;
    }

    void f(Va.a aVar) {
        int iD = aVar.d();
        ListIterator<Va.a> listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            int iD2 = listIterator.next().d();
            if (iD > iD2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iD == iD2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iD);
            }
        }
        this.c.add(aVar);
        this.b = iD;
    }
}
