package G6;

import com.roblox.client.e0;

public class g extends h {

    private int f1467h;

    public g(e0 e0Var, String str) {
        super(e0Var);
        this.f1467h = f(str);
    }

    private int f(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "groups":
            case "group":
                return 5;
            case "player":
            case "players":
                return 1;
            default:
                return super.c();
        }
    }

    @Override
    public int c() {
        return this.f1467h;
    }
}
