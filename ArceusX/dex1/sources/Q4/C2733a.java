package q4;

import android.content.ContentResolver;
import android.provider.Settings;

public class C2733a {
    public float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
