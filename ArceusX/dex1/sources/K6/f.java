package K6;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public interface f {

    public enum a {
        GET,
        POST
    }

    X5.a a(a aVar);

    Cursor b(Uri uri);

    void c(Uri uri, ContentValues contentValues);
}
