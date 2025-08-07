package E4;

import android.util.Pair;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import e2.vb.oyfFwvPUKctyaG;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f0 {
    public static X509Certificate[][] a(String str) throws c0, IOException, SecurityException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = g0.c(randomAccessFile);
            if (pairC == null) {
                throw new c0("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j7 = (-20) + jLongValue;
            if (j7 >= 0) {
                randomAccessFile.seek(j7);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new c0("ZIP64 APK not supported");
                }
            }
            long jA = g0.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new c0("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (g0.b(byteBuffer) + jA != jLongValue) {
                throw new c0("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new c0("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new c0("No APK Signing Block before ZIP Central Directory");
            }
            int i7 = 0;
            long j8 = byteBufferAllocate.getLong(0);
            if (j8 < byteBufferAllocate.capacity() || j8 > 2147483639) {
                throw new c0("APK Signing Block size out of range: " + j8);
            }
            int i8 = (int) (8 + j8);
            long j9 = jA - i8;
            if (j9 < 0) {
                throw new c0("APK Signing Block offset out of range: " + j9);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i8);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j9);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j10 = byteBufferAllocate2.getLong(0);
            if (j10 != j8) {
                throw new c0("APK Signing Block sizes in header and footer do not match: " + j10 + " vs " + j8);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j9));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i7++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new c0("Insufficient data to read size of APK Signing Block entry #" + i7);
                    }
                    long j11 = byteBufferSlice.getLong();
                    if (j11 < 4 || j11 > 2147483647L) {
                        throw new c0("APK Signing Block entry #" + i7 + " size out of range: " + j11);
                    }
                    int i9 = (int) j11;
                    int iPosition2 = byteBufferSlice.position() + i9;
                    if (i9 > byteBufferSlice.remaining()) {
                        throw new c0("APK Signing Block entry #" + i7 + " size out of range: " + i9 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new b0(e(byteBufferSlice, i9 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrL;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new c0("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int b(int i7) {
        if (i7 == 1) {
            return 32;
        }
        if (i7 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i7);
    }

    private static int c(int i7) {
        if (i7 == 513) {
            return 1;
        }
        if (i7 == 514) {
            return 2;
        }
        if (i7 == 769) {
            return 1;
        }
        switch (i7) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
        }
    }

    private static String d(int i7) {
        if (i7 == 1) {
            return "SHA-256";
        }
        if (i7 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i7);
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i7) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i8 = i7 + iPosition;
        if (i8 < iPosition || i8 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i8);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i8);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            return e(byteBuffer, i7);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i7 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i7, byte[] bArr, int i8) {
        bArr[1] = (byte) (i7 & 255);
        bArr[2] = (byte) ((i7 >>> 8) & 255);
        bArr[3] = (byte) ((i7 >>> 16) & 255);
        bArr[4] = (byte) (i7 >> 24);
    }

    private static void h(Map map, FileChannel fileChannel, long j7, long j8, long j9, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        X x7 = new X(fileChannel, 0L, j7);
        X x8 = new X(fileChannel, j8, j9 - j8);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        g0.d(byteBufferDuplicate, j7);
        C0395a c0395a = new C0395a(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Integer) it.next()).intValue();
            i7++;
        }
        try {
            byte[][] bArrK = k(iArr, new InterfaceC0416w[]{x7, x8, c0395a});
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = iArr[i8];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i9)), bArrK[i8])) {
                    throw new SecurityException(d(i9).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e7) {
            throw new SecurityException("Failed to compute digest(s) of contents", e7);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IOException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i7 + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, SecurityException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrI = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrI2 = null;
        byte[] bArrI3 = null;
        int i7 = -1;
        int i8 = 0;
        while (byteBufferF2.hasRemaining()) {
            i8++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i9 = byteBufferF3.getInt();
                arrayList.add(Integer.valueOf(i9));
                if (i9 != 513 && i9 != 514 && i9 != 769) {
                    switch (i9) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i7 != -1) {
                    int iC = c(i9);
                    int iC2 = c(i7);
                    if (iC != 1 && iC2 == 1) {
                    }
                }
                bArrI3 = i(byteBufferF3);
                i7 = i9;
            } catch (IOException e7) {
                e = e7;
                throw new SecurityException("Failed to parse signature record #" + i8, e);
            } catch (BufferUnderflowException e8) {
                e = e8;
                throw new SecurityException("Failed to parse signature record #" + i8, e);
            }
        }
        if (i7 == -1) {
            if (i8 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i7 == 513 || i7 == 514) {
            str = "EC";
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            str = "DSA";
        }
        if (i7 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i7 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrI));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrI3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (byteBufferF4.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i7) {
                        bArrI2 = i(byteBufferF5);
                    }
                } catch (IOException e9) {
                    e = e9;
                    throw new IOException("Failed to parse digest record #" + i10, e);
                } catch (BufferUnderflowException e10) {
                    e = e10;
                    throw new IOException("Failed to parse digest record #" + i10, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException(JmBUOGMwkkxg.jKa);
            }
            int iC3 = c(i7);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC3), bArrI2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrI2)) {
                throw new SecurityException(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (byteBufferF6.hasRemaining()) {
                i12++;
                byte[] bArrI4 = i(byteBufferF6);
                try {
                    arrayList3.add(new d0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI4)), bArrI4));
                } catch (CertificateException e11) {
                    throw new SecurityException("Failed to decode certificate #" + i12, e11);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrI, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e12) {
            e = e12;
            throw new SecurityException(oyfFwvPUKctyaG.PbWiAzHGnHoN + str2 + " signature", e);
        } catch (InvalidKeyException e13) {
            e = e13;
            throw new SecurityException(oyfFwvPUKctyaG.PbWiAzHGnHoN + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            throw new SecurityException(oyfFwvPUKctyaG.PbWiAzHGnHoN + str2 + " signature", e);
        } catch (SignatureException e15) {
            e = e15;
            throw new SecurityException(oyfFwvPUKctyaG.PbWiAzHGnHoN + str2 + " signature", e);
        } catch (InvalidKeySpecException e16) {
            e = e16;
            throw new SecurityException(oyfFwvPUKctyaG.PbWiAzHGnHoN + str2 + " signature", e);
        }
    }

    private static byte[][] k(int[] iArr, InterfaceC0416w[] interfaceC0416wArr) throws DigestException {
        long j7;
        int i7;
        int length;
        int i8 = 0;
        long j8 = 0;
        int i9 = 0;
        long jZza = 0;
        while (true) {
            j7 = 1048576;
            if (i9 >= 3) {
                break;
            }
            jZza += (interfaceC0416wArr[i9].zza() + 1048575) / 1048576;
            i9++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i10 = 0;
        while (true) {
            length = iArr.length;
            if (i10 >= length) {
                break;
            }
            int i11 = (int) jZza;
            byte[] bArr2 = new byte[(b(iArr[i10]) * i11) + 5];
            bArr2[0] = 90;
            g(i11, bArr2, 1);
            bArr[i10] = bArr2;
            i10++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String strD = d(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(strD);
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(strD.concat(" digest not supported"), e7);
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (i7 = 3; i13 < i7; i7 = 3) {
            InterfaceC0416w interfaceC0416w = interfaceC0416wArr[i13];
            long j9 = j8;
            long jZza2 = interfaceC0416w.zza();
            while (jZza2 > j8) {
                int iMin = (int) Math.min(jZza2, j7);
                g(iMin, bArr3, 1);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                long j10 = j9;
                try {
                    interfaceC0416w.a(messageDigestArr, j10, iMin);
                    byte[] bArr4 = bArr3;
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        InterfaceC0416w interfaceC0416w2 = interfaceC0416w;
                        byte[] bArr5 = bArr[i16];
                        int iB = b(i17);
                        int i18 = length;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i14 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i16++;
                        interfaceC0416w = interfaceC0416w2;
                        length = i18;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j11 = iMin;
                    long j12 = j10 + j11;
                    jZza2 -= j11;
                    i14++;
                    j8 = 0;
                    j7 = 1048576;
                    bArr3 = bArr4;
                    j9 = j12;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e8) {
                    throw new DigestException("Failed to digest chunk #" + i14 + " of section #" + i8, e8);
                }
            }
            i8++;
            i13++;
            j8 = 0;
            j7 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr7 = bArr[i19];
            String strD2 = d(i20);
            try {
                bArr6[i19] = MessageDigest.getInstance(strD2).digest(bArr7);
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(strD2.concat(" digest not supported"), e9);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, b0 b0Var) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(b0Var.f1109a);
                int i7 = 0;
                while (byteBufferF.hasRemaining()) {
                    i7++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e7) {
                        throw new SecurityException("Failed to parse/verify signer #" + i7 + " block", e7);
                    }
                }
                if (i7 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(map, fileChannel, b0Var.f1110b, b0Var.f1111c, b0Var.f1112d, b0Var.f1113e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }
}
