package Y1;

import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class g {

    @NonNull
    private final e a;

    public g(@NonNull e eVar) {
        this.a = eVar;
    }

    private static String b(String str, c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? cVar.c() : cVar.d);
        return sb.toString();
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(d(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File d() {
        File fileA = this.a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    Pair<c, InputStream> a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            c cVar = fileC.getAbsolutePath().endsWith(".zip") ? c.ZIP : c.JSON;
            b2.d.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void e(String str, c cVar) {
        File file = new File(d(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        b2.d.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        b2.d.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File f(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(d(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
