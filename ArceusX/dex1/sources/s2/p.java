package s2;

import java.util.Set;

final class p implements q2.g {

    private final Set<q2.b> f23642a;

    private final o f23643b;

    private final s f23644c;

    p(Set<q2.b> set, o oVar, s sVar) {
        this.f23642a = set;
        this.f23643b = oVar;
        this.f23644c = sVar;
    }

    @Override
    public <T> q2.f<T> a(String str, Class<T> cls, q2.b bVar, q2.e<T, byte[]> eVar) {
        if (this.f23642a.contains(bVar)) {
            return new r(this.f23643b, str, bVar, eVar, this.f23644c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f23642a));
    }
}
