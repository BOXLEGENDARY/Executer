package C4;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

final class k implements m {

    final Set f841a;

    final u f842b;

    final ZipFile f843c;

    k(o oVar, Set set, u uVar, ZipFile zipFile) {
        this.f841a = set;
        this.f842b = uVar;
        this.f843c = zipFile;
    }

    @Override
    public final void a(n nVar, File file, boolean z7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.f841a.add(file);
        if (z7) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f842b.b(), nVar.f844a, this.f842b.a().getAbsolutePath(), nVar.f845b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f843c;
        ZipEntry zipEntry = nVar.f845b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.m(file);
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i7);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }
}
