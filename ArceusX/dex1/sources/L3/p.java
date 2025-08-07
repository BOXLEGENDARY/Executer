package L3;

final class p extends o {

    private final n f2059b = new n();

    p() {
    }

    @Override
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f2059b.a(th, true).add(th2);
    }
}
