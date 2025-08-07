package Q4;

import n3.C2651i;

public class h extends Exception {
    @Deprecated
    protected h() {
    }

    public h(String str) {
        super(str);
        C2651i.g(str, "Detail message must not be empty");
    }
}
