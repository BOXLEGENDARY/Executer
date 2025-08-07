package N9;

import android.content.Context;
import androidx.annotation.NonNull;

public class b {
    private final float a;

    public b(float f) {
        this.a = f;
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i) {
        return (int) ((i * this.a) + 0.5f);
    }
}
