package V4;

import U4.d;
import V4.b;

public interface b<T extends b<T>> {
    <U> T a(Class<U> cls, d<? super U> dVar);
}
