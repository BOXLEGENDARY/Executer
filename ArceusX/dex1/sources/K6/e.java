package K6;

import K6.f;
import android.database.Cursor;
import android.net.Uri;

public class e extends a {
    @Override
    public X5.a a(f.a aVar) {
        if (aVar == f.a.GET) {
            return X5.a.GetPing;
        }
        return null;
    }

    @Override
    public Cursor b(Uri uri) {
        return new J6.a();
    }
}
