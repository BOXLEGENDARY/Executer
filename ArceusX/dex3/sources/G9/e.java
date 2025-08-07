package G9;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

public abstract class e {

    public interface a {
        @NonNull
        e a();

        @NonNull
        a b(@NonNull i iVar);
    }

    public interface b {
    }

    @NonNull
    public static a a(@NonNull Context context) {
        return new f(context).b(H9.a.r());
    }

    @NonNull
    public static e b(@NonNull Context context) {
        return a(context).b(H9.a.r()).a();
    }

    public abstract void c(@NonNull TextView textView, @NonNull String str);

    public abstract void d(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    public abstract Spanned e(@NonNull String str);
}
