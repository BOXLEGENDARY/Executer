package ka;

import G9.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Base64;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import fa.c;
import io.noties.markwon.core.spans.LinkSpan;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0010*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "context", "LG9/e;", "b", "(Landroid/content/Context;)LG9/e;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "T", "", "Lfa/c;", "type", "Lkotlin/Function1;", "", "predicate", "a", "(Ljava/util/List;Lfa/c;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/widget/TextView;", "", Text.type, "", "c", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "d", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "LG9/e;", "markwon", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0726c {
    private static e a;

    public static final <T extends UiComponent> T a(@NotNull List<? extends UiComponent> list, @NotNull c<T> cVar, @NotNull Function1<? super T, Boolean> function1) {
        T t;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "type");
        Intrinsics.checkNotNullParameter(function1, "predicate");
        Iterator<? extends UiComponent> it = list.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (cVar.e(t2)) {
                Intrinsics.e(t2, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.findFirst");
                if (((Boolean) function1.invoke(t2)).booleanValue()) {
                    return t2;
                }
            } else if ((t2 instanceof UiComponentGroup) && (t = (T) a(((UiComponentGroup) t2).getChildren(), cVar, function1)) != null) {
                return t;
            }
        }
        return null;
    }

    private static final e b(Context context) {
        e eVar = a;
        if (eVar != null) {
            return eVar;
        }
        e eVarB = e.b(context);
        a = eVarB;
        Intrinsics.checkNotNullExpressionValue(eVarB, "also(...)");
        return eVarB;
    }

    public static final void c(@NotNull TextView textView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(str, Text.type);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e eVarB = b(context);
        Spanned spannedE = eVarB.e(str);
        Intrinsics.checkNotNullExpressionValue(spannedE, "toMarkdown(...)");
        eVarB.d(textView, spannedE);
        if (spannedE.getSpans(0, spannedE.length(), LinkSpan.class).length == 0 && spannedE.getSpans(0, spannedE.length(), URLSpan.class).length == 0) {
            textView.setMovementMethod(null);
        }
    }

    @NotNull
    public static final String d(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
        Intrinsics.d(strEncodeToString);
        return strEncodeToString;
    }
}
