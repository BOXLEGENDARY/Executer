package G9;

import Sa.y;
import androidx.annotation.NonNull;

public interface l extends y {

    public interface a {
        void a(@NonNull l lVar, @NonNull Sa.r rVar);

        void b(@NonNull l lVar, @NonNull Sa.r rVar);
    }

    public interface b {
        @NonNull
        <N extends Sa.r> b a(@NonNull Class<N> cls, c<? super N> cVar);

        @NonNull
        l b(@NonNull g gVar, @NonNull q qVar);
    }

    public interface c<N extends Sa.r> {
        void a(@NonNull l lVar, @NonNull N n);
    }

    @NonNull
    q A();

    boolean c(@NonNull Sa.r rVar);

    void e(int i, Object obj);

    void g(@NonNull Sa.r rVar);

    void l(@NonNull Sa.r rVar);

    int length();

    @NonNull
    t n();

    @NonNull
    g q();

    void s();

    <N extends Sa.r> void t(@NonNull N n, int i);

    void u(@NonNull Sa.r rVar);

    void x();
}
