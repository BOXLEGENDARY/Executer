package com.squareup.workflow1.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import ha.L;
import ha.z0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/squareup/workflow1/ui/r;", "Landroid/widget/EditText;", "view", "", "b", "(Lcom/squareup/workflow1/ui/r;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "handler", "", "c", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class s {

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", f = "TextControllerControlEditText.kt", l = {47}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        private Object e;
        final r i;
        final EditText v;

        @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", f = "TextControllerControlEditText.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "textValue", ""}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        static final class C0074a extends kotlin.coroutines.jvm.internal.k implements Function2<String, Continuation<? super Unit>, Object> {
            int d;
            Object e;
            final EditText i;

            C0074a(EditText editText, Continuation<? super C0074a> continuation) {
                super(2, continuation);
                this.i = editText;
            }

            public final Object invoke(@NotNull String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                C0074a c0074a = new C0074a(this.i, continuation);
                c0074a.e = obj;
                return c0074a;
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
                String str = (String) this.e;
                if (!Intrinsics.b(str, this.i.getText().toString())) {
                    this.i.setText(str);
                }
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "updatedText", "", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<CharSequence, Unit> {
            final r d;

            b(r rVar) {
                super(1);
                this.d = rVar;
            }

            public final void a(CharSequence charSequence) {
                r rVar = this.d;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = "";
                }
                rVar.c(string);
            }

            public Object invoke(Object obj) {
                a((CharSequence) obj);
                return Unit.a;
            }
        }

        a(r rVar, EditText editText, Continuation<? super a> continuation) {
            super(2, continuation);
            this.i = rVar;
            this.v = editText;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.i, this.v, continuation);
            aVar.e = obj;
            return aVar;
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws P9.d {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                P9.p.b(obj);
                ka.i.y(ka.i.C(this.i.a(), new C0074a(this.v, null)), (L) this.e);
                EditText editText = this.v;
                b bVar = new b(this.i);
                this.d = 1;
                if (s.c(editText, bVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P9.p.b(obj);
            }
            throw new P9.d();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", f = "TextControllerControlEditText.kt", l = {91}, m = "listenForTextChangesUntilCancelled")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.v |= Integer.MIN_VALUE;
            return s.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class c extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        final TextView d;
        final d e;

        c(TextView textView, d dVar) {
            super(1);
            this.d = textView;
            this.e = dVar;
        }

        public final void a(Throwable th) {
            this.d.removeTextChangedListener(this.e);
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"com/squareup/workflow1/ui/s$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class d implements TextWatcher {
        final Function1<CharSequence, Unit> d;

        d(Function1<? super CharSequence, Unit> function1) {
            this.d = function1;
        }

        @Override
        public void afterTextChanged(@NotNull Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            this.d.invoke(s);
        }
    }

    public static final void b(@NotNull r rVar, @NotNull EditText editText) {
        z0 subscription;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(editText, "view");
        int i = o.a;
        Object tag = editText.getTag(i);
        v vVar = tag instanceof v ? (v) tag : null;
        if ((vVar == null ? null : vVar.getController()) == rVar && vVar.getSubscription().b()) {
            return;
        }
        if (vVar != null && (subscription = vVar.getSubscription()) != null) {
            z0.a.a(subscription, (CancellationException) null, 1, (Object) null);
        }
        editText.setText(rVar.b());
        editText.setTag(i, new v(rVar, B.c(editText, null, new a(rVar, editText, null), 1, null)));
    }

    public static final java.lang.Object c(android.widget.TextView r4, kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> r5, kotlin.coroutines.Continuation<?> r6) throws P9.d {
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.workflow1.ui.s.c(android.widget.TextView, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
