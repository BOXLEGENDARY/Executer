package Sa;

public class w extends r {
    private String f;

    public w() {
    }

    @Override
    public void a(y yVar) {
        yVar.h(this);
    }

    @Override
    protected String k() {
        return "literal=" + this.f;
    }

    public String m() {
        return this.f;
    }

    public void n(String str) {
        this.f = str;
    }

    public w(String str) {
        this.f = str;
    }
}
