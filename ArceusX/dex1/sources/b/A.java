package B;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import z.T;

class A implements M.A<a, T.h> {

    static abstract class a {
        a() {
        }

        static a c(M.B<byte[]> b2, T.g gVar) {
            return new C0268d(b2, gVar);
        }

        abstract T.g a();

        abstract M.B<byte[]> b();
    }

    A() {
    }

    private static Uri b(File file, File file2) throws z.U {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new z.U(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri c(File file, T.g gVar) throws Throwable {
        Uri uriInsert;
        ContentResolver contentResolverA = gVar.a();
        Objects.requireNonNull(contentResolverA);
        ContentValues contentValues = gVar.b() != null ? new ContentValues(gVar.b()) : new ContentValues();
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                uriInsert = contentResolverA.insert(gVar.f(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (SecurityException e8) {
            e = e8;
        }
        try {
            if (uriInsert == null) {
                throw new z.U(1, "Failed to insert a MediaStore URI.", null);
            }
            e(file, uriInsert, contentResolverA);
            n(uriInsert, contentResolverA, 0);
            return uriInsert;
        } catch (IOException e9) {
            e = e9;
            uri = uriInsert;
            throw new z.U(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e10) {
            e = e10;
            uri = uriInsert;
            throw new z.U(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = uriInsert;
            if (uri != null) {
                n(uri, contentResolverA, 0);
            }
            throw th;
        }
    }

    private static void d(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i7 = fileInputStream.read(bArr);
                if (i7 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i7);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void e(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                d(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static File f(T.g gVar) throws z.U {
        try {
            File fileC = gVar.c();
            if (fileC == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(fileC.getParent(), "CameraX" + UUID.randomUUID().toString() + g(fileC));
        } catch (IOException e7) {
            throw new z.U(1, "Failed to create temp file.", e7);
        }
    }

    private static String g(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : BuildConfig.FLAVOR;
    }

    private static boolean h(T.g gVar) {
        return gVar.c() != null;
    }

    private static boolean i(T.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    private static boolean j(T.g gVar) {
        return gVar.e() != null;
    }

    static Uri k(File file, T.g gVar) throws z.U {
        Uri uriB = null;
        try {
            try {
                if (i(gVar)) {
                    uriB = c(file, gVar);
                } else if (j(gVar)) {
                    OutputStream outputStreamE = gVar.e();
                    Objects.requireNonNull(outputStreamE);
                    d(file, outputStreamE);
                } else if (h(gVar)) {
                    File fileC = gVar.c();
                    Objects.requireNonNull(fileC);
                    uriB = b(file, fileC);
                }
                file.delete();
                return uriB;
            } catch (IOException unused) {
                throw new z.U(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    private static void l(ContentValues contentValues, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i7));
        }
    }

    private static void m(File file, E.f fVar, T.g gVar, int i7) throws Throwable {
        try {
            E.f fVarH = E.f.h(file);
            fVar.g(fVarH);
            if (fVarH.s() == 0 && i7 != 0) {
                fVarH.z(i7);
            }
            T.d dVarD = gVar.d();
            if (dVarD.b()) {
                fVarH.l();
            }
            if (dVarD.c()) {
                fVarH.m();
            }
            if (dVarD.a() != null) {
                fVarH.b(dVarD.a());
            }
            fVarH.A();
        } catch (IOException e7) {
            throw new z.U(1, "Failed to update Exif data", e7);
        }
    }

    private static void n(Uri uri, ContentResolver contentResolver, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i7);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void o(File file, byte[] bArr) throws z.U, IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new K.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e7) {
            throw new z.U(1, "Failed to write to temp file", e7);
        }
    }

    @Override
    public T.h apply(a aVar) throws Throwable {
        M.B<byte[]> b2 = aVar.b();
        T.g gVarA = aVar.a();
        File fileF = f(gVarA);
        o(fileF, b2.c());
        E.f fVarD = b2.d();
        Objects.requireNonNull(fVarD);
        m(fileF, fVarD, gVarA, b2.f());
        return new T.h(k(fileF, gVarA));
    }
}
