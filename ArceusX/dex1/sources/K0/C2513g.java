package k0;

class C2513g<T> implements InterfaceC2512f<T> {

    private final Object[] f21205a;

    private int f21206b;

    C2513g(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21205a = new Object[i7];
    }

    @Override
    public boolean a(T t7) {
        int i7 = this.f21206b;
        Object[] objArr = this.f21205a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = t7;
        this.f21206b = i7 + 1;
        return true;
    }

    @Override
    public T b() {
        int i7 = this.f21206b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f21205a;
        T t7 = (T) objArr[i8];
        objArr[i8] = null;
        this.f21206b = i7 - 1;
        return t7;
    }

    @Override
    public void c(T[] tArr, int i7) {
        if (i7 > tArr.length) {
            i7 = tArr.length;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            T t7 = tArr[i8];
            int i9 = this.f21206b;
            Object[] objArr = this.f21205a;
            if (i9 < objArr.length) {
                objArr[i9] = t7;
                this.f21206b = i9 + 1;
            }
        }
    }
}
