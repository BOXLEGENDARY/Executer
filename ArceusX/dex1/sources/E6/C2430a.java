package e6;

import S9.Gvmm.CAqKeu;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import h7.l;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public class C2430a {

    public static class C0185a {

        private final String f20427a;

        private final String f20428b;

        public C0185a(String str, String str2) {
            this.f20427a = str;
            this.f20428b = str2;
        }

        public String a() {
            return this.f20428b;
        }

        public String b() {
            return this.f20427a;
        }
    }

    public static String a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            try {
                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("encryption_alias", null);
                if (secretKeyEntry == null) {
                    l.a("Encryption", CAqKeu.ALzttrGHlSxjNuK);
                    return null;
                }
                SecretKey secretKey = secretKeyEntry.getSecretKey();
                byte[] bArrDecode = Base64.decode(str2, 0);
                if (bArrDecode == null) {
                    l.a("Encryption", "Error getting encryption IV.");
                    return null;
                }
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKey, new GCMParameterSpec(128, bArrDecode));
                    return new String(cipher.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e7) {
                    l.a("Encryption", e7.getMessage());
                    return null;
                }
            } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e8) {
                l.a("Encryption", e8.getMessage());
                return null;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e9) {
            l.a("Encryption", e9.getMessage());
            return null;
        }
    }

    public static C0185a b(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKeyD = d();
        if (secretKeyD == null) {
            l.a("Encryption", "Error getting secret key");
            return null;
        }
        Cipher cipherC = c(secretKeyD);
        if (cipherC == null) {
            l.a("Encryption", "Error getting encrypt cipher.");
            return null;
        }
        try {
            return new C0185a(new String(Base64.encode(cipherC.getIV(), 0)), new String(Base64.encode(cipherC.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0)));
        } catch (BadPaddingException | IllegalBlockSizeException e7) {
            l.a("Encryption", e7.getMessage());
            return null;
        }
    }

    private static Cipher c(SecretKey secretKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e7) {
            l.a("Encryption", e7.getMessage());
            return null;
        }
    }

    private static SecretKey d() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            try {
                keyGenerator.init(new KeyGenParameterSpec.Builder("encryption_alias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                return keyGenerator.generateKey();
            } catch (InvalidAlgorithmParameterException e7) {
                l.a("Encryption", e7.getLocalizedMessage());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException e8) {
            l.a("Encryption", e8.getMessage());
            return null;
        }
    }
}
