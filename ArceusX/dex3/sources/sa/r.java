package Sa;

public abstract class r {
    private r a = null;
    private r b = null;
    private r c = null;
    private r d = null;
    private r e = null;

    public abstract void a(y yVar);

    public void b(r rVar) {
        rVar.l();
        rVar.j(this);
        r rVar2 = this.c;
        if (rVar2 == null) {
            this.b = rVar;
            this.c = rVar;
        } else {
            rVar2.e = rVar;
            rVar.d = rVar2;
            this.c = rVar;
        }
    }

    public r c() {
        return this.b;
    }

    public r d() {
        return this.c;
    }

    public r e() {
        return this.e;
    }

    public r f() {
        return this.a;
    }

    public r g() {
        return this.d;
    }

    public void h(r rVar) {
        rVar.l();
        r rVar2 = this.e;
        rVar.e = rVar2;
        if (rVar2 != null) {
            rVar2.d = rVar;
        }
        rVar.d = this;
        this.e = rVar;
        r rVar3 = this.a;
        rVar.a = rVar3;
        if (rVar.e == null) {
            rVar3.c = rVar;
        }
    }

    public void i(r rVar) {
        rVar.l();
        r rVar2 = this.d;
        rVar.d = rVar2;
        if (rVar2 != null) {
            rVar2.e = rVar;
        }
        rVar.e = this;
        this.d = rVar;
        r rVar3 = this.a;
        rVar.a = rVar3;
        if (rVar.d == null) {
            rVar3.b = rVar;
        }
    }

    protected void j(r rVar) {
        this.a = rVar;
    }

    protected String k() {
        return "";
    }

    public void l() {
        r rVar = this.d;
        if (rVar != null) {
            rVar.e = this.e;
        } else {
            r rVar2 = this.a;
            if (rVar2 != null) {
                rVar2.b = this.e;
            }
        }
        r rVar3 = this.e;
        if (rVar3 != null) {
            rVar3.d = rVar;
        } else {
            r rVar4 = this.a;
            if (rVar4 != null) {
                rVar4.c = rVar;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + k() + "}";
    }
}
