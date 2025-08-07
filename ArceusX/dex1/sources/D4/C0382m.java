package D4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

public final class C0382m implements E4.Z {

    private final E4.Z f970a;

    public C0382m(E4.Z z7) {
        this.f970a = z7;
    }

    @Override
    public final Object zza() {
        String string;
        Context contextA = ((C0380k) this.f970a).a();
        try {
            Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextA.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
