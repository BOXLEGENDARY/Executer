package f5;

import H3.QdLC.QcdySgfdST;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    private final File f20509a;

    private final Q4.c f20510b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        f20513i,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(Q4.c cVar) {
        this.f20509a = new File(cVar.h().getFilesDir(), "PersistedInstallation." + cVar.l() + ".json");
        this.f20510b = cVar;
    }

    private JSONObject b() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f20509a);
            while (true) {
                try {
                    int i7 = fileInputStream.read(bArr, 0, 16384);
                    if (i7 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d a(d dVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f20510b.h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(this.f20509a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d c() throws IOException {
        JSONObject jSONObjectB = b();
        String strOptString = jSONObjectB.optString("Fid", null);
        int iOptInt = jSONObjectB.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectB.optString(QcdySgfdST.JwSJ, null);
        String strOptString3 = jSONObjectB.optString("RefreshToken", null);
        long jOptLong = jSONObjectB.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectB.optLong("ExpiresInSecs", 0L);
        return d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectB.optString("FisError", null)).a();
    }
}
