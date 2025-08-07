package E4;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

final class d0 extends e0 {

    private final byte[] f1117e;

    public d0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f1117e = bArr;
    }

    @Override
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f1117e;
    }
}
