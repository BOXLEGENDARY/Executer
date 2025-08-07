package V5;

public enum k {
    ALL("all"),
    f7596i("none"),
    MORE_ONLY("more");


    private String f7599d;

    k(String str) {
        this.f7599d = str;
    }

    public static k e(String str) {
        String lowerCase = str.toLowerCase();
        k kVar = ALL;
        if (lowerCase.contains(kVar.f())) {
            return kVar;
        }
        k kVar2 = MORE_ONLY;
        return lowerCase.contains(kVar2.f()) ? kVar2 : f7596i;
    }

    public String f() {
        return this.f7599d;
    }
}
