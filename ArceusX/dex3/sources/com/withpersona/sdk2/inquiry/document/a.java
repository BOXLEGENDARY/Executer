package com.withpersona.sdk2.inquiry.document;

import P9.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.roblox.client.personasdk.R;
import ha.C0369A;
import ha.L;
import ha.N;
import ha.W;
import ha.r0;
import java.io.File;
import java.io.FileOutputStream;
import k9.C0611a;
import ka.g;
import ka.h;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/document/a$a;", "Le/c;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", "context", "<init>", "(Le/c;Landroid/content/Context;)V", "Ljava/io/File;", "g", "()Ljava/io/File;", "", "errorMessage", "", "f", "(Ljava/lang/String;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "c", "Landroid/content/Context;", "", "d", "I", "index", "a", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a implements o<AbstractC0081a> {

    @NotNull
    private final e.c<Uri> pictureLauncher;

    @NotNull
    private final Context context;

    private int index;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$a;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/a$a$a;", "Lcom/withpersona/sdk2/inquiry/document/a$a$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0081a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$a$a;", "Lcom/withpersona/sdk2/inquiry/document/a$a;", "<init>", "()V", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0082a extends AbstractC0081a {

            @NotNull
            public static final C0082a a = new C0082a();

            private C0082a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$a$b;", "Lcom/withpersona/sdk2/inquiry/document/a$a;", "", "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends AbstractC0081a {

            @NotNull
            private final String absoluteFilePath;

            public b(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "absoluteFilePath");
                this.absoluteFilePath = str;
            }

            @NotNull
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }
        }

        public AbstractC0081a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0081a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$launchTakePicture$1", f = "DocumentCameraWorker.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                this.d = 1;
                if (W.a(500L, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(a.this.g());
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                X9.c.a(fileOutputStream, (Throwable) null);
                new C0369A().b(true);
                return Unit.a;
            } finally {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lka/g;", "Lka/h;", "collector", "", "a", "(Lka/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements g<AbstractC0081a> {
        final g d;
        final a e;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0083a<T> implements h {
            final h d;
            final a e;

            @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", f = "DocumentCameraWorker.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class C0084a extends kotlin.coroutines.jvm.internal.d {
                Object d;
                int e;

                public C0084a(Continuation continuation) {
                    super(continuation);
                }

                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0083a.this.c(null, this);
                }
            }

            public C0083a(h hVar, a aVar) {
                this.d = hVar;
                this.e = aVar;
            }

            public final java.lang.Object c(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.a.c.C0083a.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(g gVar, a aVar) {
            this.d = gVar;
            this.e = aVar;
        }

        public Object a(h hVar, Continuation continuation) {
            Object objA = this.d.a(new C0083a(hVar, this.e), continuation);
            return objA == S9.b.c() ? objA : Unit.a;
        }
    }

    public a(@NotNull e.c<Uri> cVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(cVar, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.pictureLauncher = cVar;
        this.context = context;
    }

    public final File g() {
        return new File(this.context.getExternalFilesDir(""), "document_camera_photo_time.jpg");
    }

    @Override
    public boolean a(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    public final boolean f(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            if (C0611a.a()) {
                ha.g.d(r0.d, (CoroutineContext) null, (N) null, new b(null), 3, (Object) null);
            } else {
                Context context = this.context;
                Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", g());
                e.c<Uri> cVar = this.pictureLauncher;
                Intrinsics.d(uriForFile);
                cVar.b(uriForFile);
            }
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override
    @NotNull
    public g<AbstractC0081a> run() {
        return new c(new C0369A(), this);
    }
}
