package X6;

import ka.oik.UJEa;

public enum c {
    HOME("HOME_TAG"),
    GAMES("GAMES_TAG"),
    AVATAR("AVATAR_EDITOR_TAG"),
    MORE(UJEa.doMxaDGIEsqiRC),
    GAME_DETAILS("GAME_DETAILS_TAG", new String[]{"gameId"}),
    PROFILE("PROFILE_TAG", new String[]{"userId"}),
    CATALOG("CATALOG_TAG"),
    FRIENDS("FRIENDS_TAG"),
    UNKNOWN("unknown");


    private final String f7997d;

    private final String[] f7998e;

    c(String str, String[] strArr) {
        this.f7997d = str;
        this.f7998e = strArr;
    }

    public String e() {
        return this.f7997d;
    }

    public int f() {
        return this.f7998e.length;
    }

    public String[] g() {
        return this.f7998e;
    }

    c(String str) {
        this(str, new String[0]);
    }
}
