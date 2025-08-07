package ha;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "", "", "listener", "a", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0447F {

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"a9/F$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "", "d", "Ljava/lang/String;", "oldText", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements TextWatcher {

        private String oldText;
        final Function1<String, Unit> e;

        a(Function1<? super String, Unit> function1) {
            this.e = function1;
        }

        @Override
        public void afterTextChanged(Editable s) {
            String strValueOf = String.valueOf(s);
            String str = this.oldText;
            if (str == null) {
                Intrinsics.v("oldText");
                str = null;
            }
            if (Intrinsics.b(strValueOf, str)) {
                return;
            }
            this.e.invoke(String.valueOf(s));
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            this.oldText = String.valueOf(s);
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    public static final void a(@NotNull TextView textView, @NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(function1, "listener");
        int i = C0470o.k;
        Object tag = textView.getTag(i);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        a aVar = new a(function1);
        textView.addTextChangedListener(aVar);
        textView.setTag(i, aVar);
    }
}
