package j9;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "", "a", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0608k {
    public static final void a(@NotNull TextInputLayout textInputLayout) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        try {
            Field declaredField = textInputLayout.getClass().getDeclaredField("placeholderTextView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textInputLayout);
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } catch (Exception unused) {
        }
    }
}
