package Sa;

public abstract class a extends r {
    @Override
    protected void j(r rVar) {
        if (!(rVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(rVar);
    }

    @Override
    public a f() {
        return (a) super.f();
    }
}
