package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.activity.I;
import androidx.activity.r;
import androidx.fragment.app.B;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import ha.y;
import k9.C0612b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "g0", "(Landroid/os/Bundle;)V", "", "i0", "()Z", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "onCreate", "onPause", "onDestroy", "onResume", "Lcom/withpersona/sdk2/inquiry/internal/d;", "d", "LP9/h;", "e0", "()Lcom/withpersona/sdk2/inquiry/internal/d;", "args", "Lcom/withpersona/sdk2/inquiry/internal/h;", "e", "f0", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "viewModel", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class InquiryActivity extends androidx.appcompat.app.d {

    @NotNull
    private final P9.h args = P9.i.b(new a());

    @NotNull
    private final P9.h viewModel = new N(z.b(h.class), new c(this), new b(this), new d(null, this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/d;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/d;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<com.withpersona.sdk2.inquiry.internal.d> {
        a() {
            super(0);
        }

        @NotNull
        public final com.withpersona.sdk2.inquiry.internal.d invoke() {
            return new com.withpersona.sdk2.inquiry.internal.d(InquiryActivity.this.getIntent().getExtras());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/O$b;", "a", "()Landroidx/lifecycle/O$b;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class b extends kotlin.jvm.internal.l implements Function0<O.b> {
        final ComponentActivity d;

        public b(ComponentActivity componentActivity) {
            super(0);
            this.d = componentActivity;
        }

        public final O.b invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/Q;", "a", "()Landroidx/lifecycle/Q;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class c extends kotlin.jvm.internal.l implements Function0<Q> {
        final ComponentActivity d;

        public c(ComponentActivity componentActivity) {
            super(0);
            this.d = componentActivity;
        }

        public final Q invoke() {
            return this.d.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "LR0/a;", "a", "()LR0/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class d extends kotlin.jvm.internal.l implements Function0<R0.a> {
        final Function0 d;
        final ComponentActivity e;

        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.d = function0;
            this.e = componentActivity;
        }

        public final R0.a invoke() {
            R0.a aVar;
            Function0 function0 = this.d;
            return (function0 == null || (aVar = (R0.a) function0.invoke()) == null) ? this.e.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    private final com.withpersona.sdk2.inquiry.internal.d e0() {
        return (com.withpersona.sdk2.inquiry.internal.d) this.args.getValue();
    }

    private final h f0() {
        return (h) this.viewModel.getValue();
    }

    private final void g0(Bundle savedInstanceState) {
        if (i0()) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
            intent.putExtra("INQUIRY_ID_KEY", e0().k());
            intent.putExtra("SESSION_TOKEN_KEY", com.withpersona.sdk2.inquiry.internal.d.INSTANCE.a(e0().r()));
            Unit unit = Unit.a;
            setResult(0, intent);
            Integer numV = e0().v();
            if (numV != null) {
                setTheme(numV.intValue());
            }
            G8.b bVarD = G8.b.d(LayoutInflater.from(this));
            Intrinsics.checkNotNullExpressionValue(bVarD, "inflate(...)");
            setContentView(bVarD.a());
            if (savedInstanceState == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                B bP = supportFragmentManager.p();
                int i = y.b;
                f fVar = new f();
                fVar.setArguments(getIntent().getExtras());
                bP.n(i, fVar);
                bP.g();
            }
            getSupportFragmentManager().u1(e0().n(), this, new androidx.fragment.app.y() {
                public final void a(String str, Bundle bundle) {
                    InquiryActivity.h0(this.a, str, bundle);
                }
            });
        }
    }

    public static final void h0(InquiryActivity inquiryActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inquiryActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        Unit unit = Unit.a;
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }

    private final boolean i0() {
        String strR = e0().r();
        if (strR == null || !StringsKt.J(strR, '\n', false, 2, (Object) null)) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        ErrorCode errorCode = ErrorCode.y;
        Intrinsics.e(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
        Unit unit = Unit.a;
        setResult(0, intent);
        finish();
        return false;
    }

    protected void attachBaseContext(@NotNull Context base) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        C0612b.a(this);
    }

    protected void onCreate(Bundle savedInstanceState) throws Exception {
        r.b(this, (I) null, (I) null, 3, (Object) null);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        super/*androidx.fragment.app.h*/.onCreate(savedInstanceState);
        try {
            g0(savedInstanceState);
        } catch (Exception e) {
            if (!e0().b()) {
                throw e;
            }
            if (e0().e()) {
                H8.c.c(this).c(e);
            }
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            ErrorCode errorCode = ErrorCode.D;
            Intrinsics.e(errorCode, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) errorCode);
            Unit unit = Unit.a;
            setResult(0, intent);
            finish();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        f0().x();
    }

    protected void onPause() {
        super/*androidx.fragment.app.h*/.onPause();
        if (isFinishing()) {
            H8.c.e(this);
        }
    }

    protected void onResume() {
        super/*androidx.fragment.app.h*/.onResume();
        f0().y();
    }
}
