package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import w7.Jld.EZYiRMRTxKdo;

final class F {
    F() {
    }

    private final G b(Context context, String str, G g7, boolean z7) throws IOException {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing ID to properties file");
        }
        Properties properties = new Properties();
        properties.setProperty("id", g7.b());
        properties.setProperty("cre", String.valueOf(g7.f19023b));
        File fileQ = q(context, str);
        try {
            fileQ.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileQ, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z7 && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            G gE = e(channel);
                            k(null, channel);
                            j(null, randomAccessFile);
                            return gE;
                        } catch (H | IOException e7) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf = String.valueOf(e7);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
                                sb.append("Tried reading ID before writing new one, but failed with: ");
                                sb.append(strValueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                        }
                    }
                    channel.truncate(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    k(null, channel);
                    j(null, randomAccessFile);
                    return g7;
                } finally {
                }
            } finally {
            }
        } catch (IOException e8) {
            String strValueOf2 = String.valueOf(e8);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 21);
            sb2.append("Failed to write key: ");
            sb2.append(strValueOf2);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private static G c(SharedPreferences sharedPreferences, String str) throws H {
        long jL = l(sharedPreferences, str);
        String string = sharedPreferences.getString(k.c(str, "id"), null);
        if (string == null) {
            String string2 = sharedPreferences.getString(k.c(str, "|P|"), null);
            if (string2 == null) {
                return null;
            }
            string = a5.j.d(f(string2));
        }
        return new G(string, jL);
    }

    private final G d(File file) throws H, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                G gE = e(channel);
                k(null, channel);
                i(null, fileInputStream);
                return gE;
            } finally {
            }
        } finally {
        }
    }

    private static G e(FileChannel fileChannel) throws H, IOException, NumberFormatException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long j7 = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 == null) {
                    throw new H(EZYiRMRTxKdo.BlVGUEsLxIcsI);
                }
                property = a5.j.d(f(property2));
            }
            return new G(property, j7);
        } catch (NumberFormatException e7) {
            throw new H(e7);
        }
    }

    private static PublicKey f(String str) throws H {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e7) {
                String strValueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new H(e7);
            }
        } catch (IllegalArgumentException e8) {
            throw new H(e8);
        }
    }

    static void g(Context context) {
        for (File file : n(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final void h(Context context, String str, G g7) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (g7.equals(c(sharedPreferences, str))) {
                return;
            }
        } catch (H unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(k.c(str, "id"), g7.b());
        editorEdit.putString(k.c(str, "cre"), String.valueOf(g7.f19023b));
        editorEdit.commit();
    }

    private static void i(Throwable th, FileInputStream fileInputStream) throws IOException {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            L3.l.b(th, th2);
        }
    }

    private static void j(Throwable th, RandomAccessFile randomAccessFile) throws IOException {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            L3.l.b(th, th2);
        }
    }

    private static void k(Throwable th, FileChannel fileChannel) throws IOException {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            L3.l.b(th, th2);
        }
    }

    private static long l(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(k.c(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private static File n(Context context) {
        File fileI = androidx.core.content.a.i(context);
        if (fileI != null && fileI.isDirectory()) {
            return fileI;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private final G o(Context context, String str) throws H, IOException {
        G gP;
        try {
            gP = p(context, str);
        } catch (H e7) {
            e = e7;
        }
        if (gP != null) {
            h(context, str, gP);
            return gP;
        }
        e = null;
        try {
            G gC = c(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (gC != null) {
                b(context, str, gC, false);
                return gC;
            }
        } catch (H e8) {
            e = e8;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private final G p(Context context, String str) throws H {
        File fileQ = q(context, str);
        if (!fileQ.exists()) {
            return null;
        }
        try {
            return d(fileQ);
        } catch (H | IOException e7) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return d(fileQ);
            } catch (IOException e8) {
                String strValueOf2 = String.valueOf(e8);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(strValueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new H(e8);
            }
        }
    }

    private static File q(Context context, String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            string = "com.google.InstanceId.properties";
        } else {
            try {
                String strEncodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(strEncodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(strEncodeToString);
                sb.append(".properties");
                string = sb.toString();
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        }
        return new File(n(context), string);
    }

    final G a(Context context, String str) throws H, IOException {
        G gO = o(context, str);
        return gO != null ? gO : m(context, str);
    }

    final G m(Context context, String str) throws IOException {
        G g7 = new G(a5.j.d(a5.m.a().getPublic()), System.currentTimeMillis());
        G gB = b(context, str, g7, true);
        if (gB != null && !gB.equals(g7)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return gB;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        h(context, str, g7);
        return g7;
    }
}
