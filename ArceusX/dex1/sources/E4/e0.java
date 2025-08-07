package E4;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

class e0 extends X509Certificate {

    private final X509Certificate f1118d;

    public e0(X509Certificate x509Certificate) {
        this.f1118d = x509Certificate;
    }

    @Override
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.f1118d.checkValidity();
    }

    @Override
    public final int getBasicConstraints() {
        return this.f1118d.getBasicConstraints();
    }

    @Override
    public final Set getCriticalExtensionOIDs() {
        return this.f1118d.getCriticalExtensionOIDs();
    }

    @Override
    public final byte[] getExtensionValue(String str) {
        return this.f1118d.getExtensionValue(str);
    }

    @Override
    public final Principal getIssuerDN() {
        return this.f1118d.getIssuerDN();
    }

    @Override
    public final boolean[] getIssuerUniqueID() {
        return this.f1118d.getIssuerUniqueID();
    }

    @Override
    public final boolean[] getKeyUsage() {
        return this.f1118d.getKeyUsage();
    }

    @Override
    public final Set getNonCriticalExtensionOIDs() {
        return this.f1118d.getNonCriticalExtensionOIDs();
    }

    @Override
    public final Date getNotAfter() {
        return this.f1118d.getNotAfter();
    }

    @Override
    public final Date getNotBefore() {
        return this.f1118d.getNotBefore();
    }

    @Override
    public final PublicKey getPublicKey() {
        return this.f1118d.getPublicKey();
    }

    @Override
    public final BigInteger getSerialNumber() {
        return this.f1118d.getSerialNumber();
    }

    @Override
    public final String getSigAlgName() {
        return this.f1118d.getSigAlgName();
    }

    @Override
    public final String getSigAlgOID() {
        return this.f1118d.getSigAlgOID();
    }

    @Override
    public final byte[] getSigAlgParams() {
        return this.f1118d.getSigAlgParams();
    }

    @Override
    public final byte[] getSignature() {
        return this.f1118d.getSignature();
    }

    @Override
    public final Principal getSubjectDN() {
        return this.f1118d.getSubjectDN();
    }

    @Override
    public final boolean[] getSubjectUniqueID() {
        return this.f1118d.getSubjectUniqueID();
    }

    @Override
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f1118d.getTBSCertificate();
    }

    @Override
    public final int getVersion() {
        return this.f1118d.getVersion();
    }

    @Override
    public final boolean hasUnsupportedCriticalExtension() {
        return this.f1118d.hasUnsupportedCriticalExtension();
    }

    @Override
    public final String toString() {
        return this.f1118d.toString();
    }

    @Override
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f1118d.verify(publicKey);
    }

    @Override
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.f1118d.checkValidity(date);
    }

    @Override
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f1118d.verify(publicKey, str);
    }
}
