package com.withpersona.sdk2.inquiry.nfc;

import P9.p;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import ha.C0456d;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.List;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBo\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Le/c;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "passportNfcReaderLauncher", "Landroid/content/Context;", "context", "LT8/c;", "sandboxFlags", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "LP8/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "theme", "<init>", "(Le/c;Landroid/content/Context;LT8/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "c", "Landroid/content/Context;", "d", "LT8/c;", "e", "Ljava/lang/String;", "f", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "g", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "h", "Ljava/util/List;", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "j", "Ljava/lang/Integer;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements o<PassportNfcReaderOutput> {

    @NotNull
    private final e.c<PassportNfcReaderConfig> passportNfcReaderLauncher;

    @NotNull
    private final Context context;

    @NotNull
    private final T8.c sandboxFlags;

    @NotNull
    private final String cardAccessNumber;

    @NotNull
    private final MrzKey mrzKey;

    @NotNull
    private final PassportNfcStrings passportNfcStrings;

    @NotNull
    private final List<P8.b> enabledDataGroups;

    private final StepStyles.UiStepStyle styles;

    private final Integer theme;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "LP8/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "theme", "Lcom/withpersona/sdk2/inquiry/nfc/b;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/nfc/b;", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        b a(@NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends P8.b> enabledDataGroups, StepStyles.UiStepStyle styles, Integer theme);
    }

    @f(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", f = "ScanNfcWorker.kt", l = {63, 86}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0142b extends k implements Function2<h<? super PassportNfcReaderOutput>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements h {
            final b d;
            final h<PassportNfcReaderOutput> e;

            @f(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1$1", f = "ScanNfcWorker.kt", l = {89, 91}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0143a extends d {
                Object d;
                Object e;
                Object i;
                final a<T> v;
                int w;

                C0143a(a<? super T> aVar, Continuation<? super C0143a> continuation) {
                    super(continuation);
                    this.v = aVar;
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    this.i = obj;
                    this.w |= Integer.MIN_VALUE;
                    return this.v.c(null, this);
                }
            }

            a(b bVar, h<? super PassportNfcReaderOutput> hVar) {
                this.d = bVar;
                this.e = hVar;
            }

            public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.nfc.b.C0142b.a.c(com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        C0142b(Continuation<? super C0142b> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super PassportNfcReaderOutput> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C0142b c0142b = b.this.new C0142b(continuation);
            c0142b.e = obj;
            return c0142b;
        }

        public final Object invokeSuspend(@NotNull Object obj) throws P9.d {
            Object objC = S9.b.c();
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    p.b(obj);
                    return Unit.a;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                throw new P9.d();
            }
            p.b(obj);
            h hVar = (h) this.e;
            if (!b.this.sandboxFlags.b()) {
                b.this.passportNfcReaderLauncher.b(new PassportNfcReaderConfig(b.this.cardAccessNumber, b.this.mrzKey, b.this.passportNfcStrings, b.this.enabledDataGroups, b.this.theme, b.this.styles));
                P8.h hVar2 = new P8.h();
                a aVar = new a(b.this, hVar);
                this.d = 2;
                if (hVar2.a(aVar, this) == objC) {
                    return objC;
                }
                throw new P9.d();
            }
            C0456d.c(b.this.context).mkdirs();
            File file = new File(C0456d.c(b.this.context), "fake_dg1");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                X9.h.k(file, "this_is_some_fake_dg1_data", (Charset) null, 2, (Object) null);
                Unit unit = Unit.a;
                X9.c.a(fileOutputStream, (Throwable) null);
                File file2 = new File(C0456d.c(b.this.context), "fake_dg2");
                fileOutputStream = new FileOutputStream(file2);
                try {
                    X9.h.k(file2, "this_is_some_fake_dg2_data", (Charset) null, 2, (Object) null);
                    X9.c.a(fileOutputStream, (Throwable) null);
                    File file3 = new File(C0456d.c(b.this.context), "fake_sod");
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        X9.h.k(file3, "this_is_some_fake_sod_data", (Charset) null, 2, (Object) null);
                        X9.c.a(fileOutputStream, (Throwable) null);
                        Toast.makeText(b.this.context, "Using simulated government ID NFC data", 0).show();
                        PassportNfcReaderOutput.Success success = new PassportNfcReaderOutput.Success(Uri.fromFile(file), Uri.fromFile(file2), Uri.fromFile(file3), P8.a.d);
                        this.d = 1;
                        if (hVar.c(success, this) == objC) {
                            return objC;
                        }
                        return Unit.a;
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public b(@NotNull e.c<PassportNfcReaderConfig> cVar, @NotNull Context context, @NotNull T8.c cVar2, @NotNull String str, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends P8.b> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        Intrinsics.checkNotNullParameter(cVar, "passportNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar2, "sandboxFlags");
        Intrinsics.checkNotNullParameter(str, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(list, "enabledDataGroups");
        this.passportNfcReaderLauncher = cVar;
        this.context = context;
        this.sandboxFlags = cVar2;
        this.cardAccessNumber = str;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = list;
        this.styles = uiStepStyle;
        this.theme = num;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof b;
    }

    @Override
    @NotNull
    public g<PassportNfcReaderOutput> run() {
        return i.v(new C0142b(null));
    }
}
