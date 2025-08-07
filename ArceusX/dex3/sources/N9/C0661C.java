package n9;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import ha.C0447F;
import ha.C0456d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p9.C0733a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Ln9/s0;", "uiComponentHelper", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Ln9/s0;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", "", "moveToPreviousEditText", "h", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V", "j", "(Landroid/widget/EditText;)V", "", "originalString", "g", "(Landroid/widget/EditText;Ljava/lang/String;)V", "code", "", "editTexts", "f", "(Ljava/lang/String;Ljava/util/List;)V", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0661C {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newText", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<String, Unit> {
        final InputConfirmationCodeComponent d;
        final q9.c e;
        final List<EditText> i;
        final EditText v;
        final EditText w;
        final EditText y;

        a(InputConfirmationCodeComponent inputConfirmationCodeComponent, q9.c cVar, List<? extends EditText> list, EditText editText, EditText editText2, EditText editText3) {
            super(1);
            this.d = inputConfirmationCodeComponent;
            this.e = cVar;
            this.i = list;
            this.v = editText;
            this.w = editText2;
            this.y = editText3;
        }

        public final void a(@NotNull String str) {
            Context context;
            EditText editText;
            EditText editText2;
            Intrinsics.checkNotNullParameter(str, "newText");
            com.squareup.workflow1.ui.r textController = this.d.getTextController();
            C0733a c0733a = C0733a.a;
            ConstraintLayout constraintLayoutA = this.e.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            textController.c(c0733a.a(constraintLayoutA));
            if (str.length() >= this.i.size()) {
                C0661C.f(str, this.i);
                return;
            }
            if (str.length() > 1) {
                C0661C.g(this.v, str);
                return;
            }
            if (StringsKt.Y(str) && (editText2 = this.w) != null) {
                editText2.requestFocus();
                return;
            }
            if (!StringsKt.Y(str) && (editText = this.y) != null) {
                editText.requestFocus();
                return;
            }
            if (StringsKt.Y(str)) {
                return;
            }
            this.d.getSubmitCodeHelper().a().invoke();
            EditText editText3 = this.e.d.getEditText();
            if (editText3 != null && (context = editText3.getContext()) != null) {
                C0456d.d(context);
            }
            EditText editText4 = this.e.d.getEditText();
            if (editText4 != null) {
                editText4.clearFocus();
            }
        }

        public Object invoke(Object obj) {
            a((String) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final EditText d;

        b(EditText editText) {
            super(0);
            this.d = editText;
        }

        public Object invoke() {
            m616invoke();
            return Unit.a;
        }

        public final void m616invoke() {
            this.d.requestFocus();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final q9.c d;
        final InputConfirmationCodeComponent e;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        public static final class a extends kotlin.jvm.internal.l implements Function1<Object, Boolean> {
            public static final a d = new a();

            public a() {
                super(1);
            }

            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof TextInputLayout);
            }
        }

        c(q9.c cVar, InputConfirmationCodeComponent inputConfirmationCodeComponent) {
            super(0);
            this.d = cVar;
            this.e = inputConfirmationCodeComponent;
        }

        public Object invoke() {
            m617invoke();
            return Unit.a;
        }

        public final void m617invoke() {
            ConstraintLayout constraintLayoutA = this.d.a();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
            Sequence<TextInputLayout> sequenceI = kotlin.sequences.g.i(androidx.core.view.e0.a(constraintLayoutA), a.d);
            Intrinsics.e(sequenceI, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            for (TextInputLayout textInputLayout : sequenceI) {
                InputTextBasedComponentStyle styles = this.e.e().getStyles();
                if (styles != null) {
                    s9.t.j(textInputLayout, styles);
                }
            }
        }
    }

    @NotNull
    public static final ConstraintLayout e(@NotNull InputConfirmationCodeComponent inputConfirmationCodeComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(inputConfirmationCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        q9.c cVarD = q9.c.d(s0Var.getLayoutInflater());
        List listM = CollectionsKt.m(new EditText[]{cVarD.b.getEditText(), cVarD.e.getEditText(), cVarD.g.getEditText(), cVarD.d.getEditText()});
        for (IndexedValue indexedValue : CollectionsKt.w0(listM)) {
            int iA = indexedValue.a();
            EditText editText = (EditText) indexedValue.b();
            EditText editText2 = (EditText) CollectionsKt.O(listM, iA - 1);
            EditText editText3 = (EditText) CollectionsKt.O(listM, iA + 1);
            if (editText != null) {
                C0447F.a(editText, new a(inputConfirmationCodeComponent, cVarD, listM, editText, editText2, editText3));
            }
            if (editText2 != null) {
                h(editText, new b(editText2));
            }
            j(editText);
        }
        s0Var.d(new c(cVarD, inputConfirmationCodeComponent));
        ConstraintLayout constraintLayoutA = cVarD.a();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutA, "getRoot(...)");
        return constraintLayoutA;
    }

    public static final void f(String str, List<? extends EditText> list) {
        if (str.length() >= list.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int length = (str.length() - list.size()) + i;
                EditText editText = list.get(i);
                if (editText != null) {
                    editText.setText(String.valueOf(str.charAt(length)));
                }
            }
        }
    }

    public static final void g(EditText editText, String str) {
        if (editText.getSelectionStart() == 1) {
            editText.setText(String.valueOf(StringsKt.X0(str)));
        } else {
            editText.setText(String.valueOf(StringsKt.Y0(str)));
        }
    }

    private static final void h(final EditText editText, final Function0<Unit> function0) {
        if (editText != null) {
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return C0661C.i(editText, function0, view, i, keyEvent);
                }
            });
        }
    }

    public static final boolean i(EditText editText, Function0 function0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(function0, "$moveToPreviousEditText");
        if (i == 67 && keyEvent.getAction() == 0) {
            Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0) {
                function0.invoke();
                return true;
            }
        }
        return false;
    }

    private static final void j(final EditText editText) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    C0661C.k(editText, view, z);
                }
            });
        }
    }

    public static final void k(EditText editText, View view, boolean z) {
        if (z) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }
}
