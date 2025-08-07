package a4;

final class x implements Runnable {

    final y f8340d;

    x(y yVar) {
        this.f8340d = yVar;
    }

    @Override
    public final void run() {
        synchronized (this.f8340d.f8342b) {
            try {
                y yVar = this.f8340d;
                if (yVar.f8343c != null) {
                    yVar.f8343c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
