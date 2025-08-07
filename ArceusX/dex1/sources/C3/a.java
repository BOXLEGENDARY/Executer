package C3;

public enum a implements com.google.android.gms.fido.fido2.api.common.a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    private final int f809d;

    a(int i7) {
        this.f809d = i7;
    }

    @Override
    public int c() {
        return this.f809d;
    }
}
