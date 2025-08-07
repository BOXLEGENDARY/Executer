package n9;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n9.Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln9/i0;", "Landroid/text/method/PasswordTransformationMethod;", "", "mask", "<init>", "(Ljava/lang/String;)V", "", "source", "Landroid/view/View;", "view", "getTransformation", "(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;", "d", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "a", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class i0 extends PasswordTransformationMethod {

    @NotNull
    private final String mask;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ln9/i0$a;", "", "", "mask", "source", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "d", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "e", "Ljava/lang/CharSequence;", "getSource", "()Ljava/lang/CharSequence;", "b", "()I", "length", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a implements CharSequence {

        @NotNull
        private final String mask;

        @NotNull
        private final CharSequence source;

        public a(@NotNull String str, @NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(str, "mask");
            Intrinsics.checkNotNullParameter(charSequence, "source");
            this.mask = str;
            this.source = charSequence;
        }

        public char a(int index) {
            if (index >= this.mask.length()) {
                return (char) 8226;
            }
            Z zA = Z.INSTANCE.a(this.mask.charAt(index));
            if (zA instanceof Z.Literal) {
                return ((Z.Literal) zA).getChar();
            }
            return (char) 8226;
        }

        public int b() {
            return this.source.length();
        }

        @Override
        public final char charAt(int i) {
            return a(i);
        }

        @Override
        public final int length() {
            return b();
        }

        @Override
        @NotNull
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.source.subSequence(startIndex, endIndex);
        }
    }

    public i0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "mask");
        this.mask = str;
    }

    @Override
    @NotNull
    public CharSequence getTransformation(CharSequence source, View view) {
        return source == null ? "" : new a(this.mask, source);
    }
}
