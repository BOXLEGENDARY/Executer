package C3;

public enum b implements com.google.android.gms.fido.fido2.api.common.a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    private final int f819d;

    b(int i7) {
        this.f819d = i7;
    }

    @Override
    public int c() {
        return this.f819d;
    }
}
