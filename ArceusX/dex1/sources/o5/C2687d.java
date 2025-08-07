package o5;

import java.util.concurrent.Executor;

public class C2687d {

    private final c5.b f22436a;

    public C2687d(c5.b bVar) {
        this.f22436a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f22436a.get();
    }
}
