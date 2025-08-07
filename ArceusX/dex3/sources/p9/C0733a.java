package p9;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l9.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp9/a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)Ljava/lang/String;", "", "b", "(Landroid/view/View;)Z", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0733a {

    @NotNull
    public static final C0733a a = new C0733a();

    private C0733a() {
    }

    @NotNull
    public final String a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextInputLayout textInputLayoutFindViewById = view.findViewById(d.G);
        TextInputLayout textInputLayoutFindViewById2 = view.findViewById(d.u0);
        TextInputLayout textInputLayoutFindViewById3 = view.findViewById(d.B0);
        TextInputLayout textInputLayoutFindViewById4 = view.findViewById(d.L);
        EditText editText = textInputLayoutFindViewById.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayoutFindViewById2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayoutFindViewById3.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayoutFindViewById4.getEditText();
        return CollectionsKt.U(CollectionsKt.m(new String[]{strValueOf, strValueOf2, strValueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final boolean b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return a(view).length() == 4;
    }
}
