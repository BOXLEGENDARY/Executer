package y8;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Ly8/e;", "", "", "helpButtonText", Title.type, "prompt", "tips", "buttonText", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "d", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CaptureTipsViewModel {

    @NotNull
    private final String helpButtonText;

    @NotNull
    private final String title;

    @NotNull
    private final String prompt;

    @NotNull
    private final String tips;

    @NotNull
    private final String buttonText;

    @NotNull
    private final IdConfig.b side;

    public CaptureTipsViewModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull IdConfig.b bVar) {
        Intrinsics.checkNotNullParameter(str, "helpButtonText");
        Intrinsics.checkNotNullParameter(str2, Title.type);
        Intrinsics.checkNotNullParameter(str3, "prompt");
        Intrinsics.checkNotNullParameter(str4, "tips");
        Intrinsics.checkNotNullParameter(str5, "buttonText");
        Intrinsics.checkNotNullParameter(bVar, "side");
        this.helpButtonText = str;
        this.title = str2;
        this.prompt = str3;
        this.tips = str4;
        this.buttonText = str5;
        this.side = bVar;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    @NotNull
    public final String getPrompt() {
        return this.prompt;
    }

    @NotNull
    public final IdConfig.b getSide() {
        return this.side;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureTipsViewModel)) {
            return false;
        }
        CaptureTipsViewModel captureTipsViewModel = (CaptureTipsViewModel) other;
        return Intrinsics.b(this.helpButtonText, captureTipsViewModel.helpButtonText) && Intrinsics.b(this.title, captureTipsViewModel.title) && Intrinsics.b(this.prompt, captureTipsViewModel.prompt) && Intrinsics.b(this.tips, captureTipsViewModel.tips) && Intrinsics.b(this.buttonText, captureTipsViewModel.buttonText) && this.side == captureTipsViewModel.side;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.helpButtonText.hashCode() * 31) + this.title.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.side.hashCode();
    }

    @NotNull
    public String toString() {
        return "CaptureTipsViewModel(helpButtonText=" + this.helpButtonText + ", title=" + this.title + ", prompt=" + this.prompt + ", tips=" + this.tips + ", buttonText=" + this.buttonText + ", side=" + this.side + ")";
    }
}
