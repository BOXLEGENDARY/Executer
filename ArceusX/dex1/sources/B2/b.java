package B2;

public interface b {

    public interface a<T> {
        T execute();
    }

    <T> T j(a<T> aVar);
}
