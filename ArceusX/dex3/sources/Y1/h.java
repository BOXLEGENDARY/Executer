package Y1;

import P1.k;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class h {

    @NonNull
    private final g a;

    @NonNull
    private final f b;

    public h(@NonNull g gVar, @NonNull f fVar) {
        this.a = gVar;
        this.b = fVar;
    }

    private P1.d a(@NonNull String str, String str2) {
        Pair<c, InputStream> pairA;
        if (str2 == null || (pairA = this.a.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        k<P1.d> kVarS = cVar == c.ZIP ? P1.e.s(new ZipInputStream(inputStream), str) : P1.e.i(inputStream, str);
        if (kVarS.b() != null) {
            return kVarS.b();
        }
        return null;
    }

    @NonNull
    private k<P1.d> b(@NonNull String str, String str2) throws IOException {
        b2.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.b.a(str);
                if (!dVarA.isSuccessful()) {
                    k<P1.d> kVar = new k<>(new IllegalArgumentException(dVarA.p0()));
                    try {
                        dVarA.close();
                    } catch (IOException e) {
                        b2.d.d("LottieFetchResult close failed ", e);
                    }
                    return kVar;
                }
                k<P1.d> kVarD = d(str, dVarA.w0(), dVarA.l0(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(kVarD.b() != null);
                b2.d.a(sb.toString());
                try {
                    dVarA.close();
                } catch (IOException e2) {
                    b2.d.d("LottieFetchResult close failed ", e2);
                }
                return kVarD;
            } catch (Exception e3) {
                k<P1.d> kVar2 = new k<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        b2.d.d("LottieFetchResult close failed ", e4);
                    }
                }
                return kVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    b2.d.d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @NonNull
    private k<P1.d> d(@NonNull String str, @NonNull InputStream inputStream, String str2, String str3) throws IOException {
        c cVar;
        k<P1.d> kVarF;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            b2.d.a("Handling zip response.");
            cVar = c.ZIP;
            kVarF = f(str, inputStream, str3);
        } else {
            b2.d.a("Received json response.");
            cVar = c.JSON;
            kVarF = e(str, inputStream, str3);
        }
        if (str3 != null && kVarF.b() != null) {
            this.a.e(str, cVar);
        }
        return kVarF;
    }

    @NonNull
    private k<P1.d> e(@NonNull String str, @NonNull InputStream inputStream, String str2) throws IOException {
        return str2 == null ? P1.e.i(inputStream, null) : P1.e.i(new FileInputStream(this.a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private k<P1.d> f(@NonNull String str, @NonNull InputStream inputStream, String str2) throws IOException {
        return str2 == null ? P1.e.s(new ZipInputStream(inputStream), null) : P1.e.s(new ZipInputStream(new FileInputStream(this.a.f(str, inputStream, c.ZIP))), str);
    }

    @NonNull
    public k<P1.d> c(@NonNull String str, String str2) {
        P1.d dVarA = a(str, str2);
        if (dVarA != null) {
            return new k<>(dVarA);
        }
        b2.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
