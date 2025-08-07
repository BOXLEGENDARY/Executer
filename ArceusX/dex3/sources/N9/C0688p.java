package n9;

import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Ln9/p;", "", "Lcom/google/android/material/textfield/TextInputLayout;", "cardAccessNumber", "documentNumber", "Lq9/f;", "dateOfBirthBinding", "expirationDateBinding", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "launchButton", "Landroid/widget/TextView;", "errorLabel", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lq9/f;Lq9/f;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/TextView;)V", "a", "Lcom/google/android/material/textfield/TextInputLayout;", "()Lcom/google/android/material/textfield/TextInputLayout;", "b", "c", "Lq9/f;", "()Lq9/f;", "d", "e", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "f", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "ui-step-renderer_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0688p {

    @NotNull
    private final TextInputLayout cardAccessNumber;

    @NotNull
    private final TextInputLayout documentNumber;

    @NotNull
    private final q9.f dateOfBirthBinding;

    @NotNull
    private final q9.f expirationDateBinding;

    @NotNull
    private final ButtonWithLoadingIndicator launchButton;

    @NotNull
    private final TextView errorLabel;

    public C0688p(@NotNull TextInputLayout textInputLayout, @NotNull TextInputLayout textInputLayout2, @NotNull q9.f fVar, @NotNull q9.f fVar2, @NotNull ButtonWithLoadingIndicator buttonWithLoadingIndicator, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textInputLayout, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(textInputLayout2, "documentNumber");
        Intrinsics.checkNotNullParameter(fVar, "dateOfBirthBinding");
        Intrinsics.checkNotNullParameter(fVar2, "expirationDateBinding");
        Intrinsics.checkNotNullParameter(buttonWithLoadingIndicator, "launchButton");
        Intrinsics.checkNotNullParameter(textView, "errorLabel");
        this.cardAccessNumber = textInputLayout;
        this.documentNumber = textInputLayout2;
        this.dateOfBirthBinding = fVar;
        this.expirationDateBinding = fVar2;
        this.launchButton = buttonWithLoadingIndicator;
        this.errorLabel = textView;
    }

    @NotNull
    public final TextInputLayout getCardAccessNumber() {
        return this.cardAccessNumber;
    }

    @NotNull
    public final q9.f getDateOfBirthBinding() {
        return this.dateOfBirthBinding;
    }

    @NotNull
    public final TextInputLayout getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    public final TextView getErrorLabel() {
        return this.errorLabel;
    }

    @NotNull
    public final q9.f getExpirationDateBinding() {
        return this.expirationDateBinding;
    }

    @NotNull
    public final ButtonWithLoadingIndicator getLaunchButton() {
        return this.launchButton;
    }
}
