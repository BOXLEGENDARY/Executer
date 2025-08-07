package J9;

import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

public class j {
    private final WeakReference<TextView> a;

    public j(@NonNull TextView textView) {
        this.a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        j[] jVarArr = (j[]) spannable.getSpans(0, spannable.length(), j.class);
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                spannable.removeSpan(jVar);
            }
        }
        spannable.setSpan(new j(textView), 0, spannable.length(), 18);
    }
}
