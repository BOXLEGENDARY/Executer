package V6;

import P.c;
import R.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.AbstractC1694h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.C1604f;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.J;
import com.roblox.client.K;
import f6.ck.ZJZXBWla;
import ha.H;
import ha.c0;
import ha.q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q5.C2735b;
import q5.C2736c;
import q5.InterfaceC2734a;
import r5.C2756a;
import x0.InterfaceC2984a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LV6/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lha/H;", "mainDispatcher", "workerDispatcher", "Landroidx/camera/view/f;", "w", "(Landroid/content/Context;Lha/H;Lha/H;)Landroidx/camera/view/f;", BuildConfig.FLAVOR, "success", BuildConfig.FLAVOR, "urlString", BuildConfig.FLAVOR, "v", "(ZLjava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "d", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends Fragment {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"LV6/h$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "fontPath", "LV6/h;", "a", "(Ljava/lang/String;)LV6/h;", "TAG", "Ljava/lang/String;", "FONT_PATH_MESSAGE", "RESULT_REQUEST_KEY", "BUNDLE_KEY_SUCCESS", "BUNDLE_KEY_URL_STRING", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String fontPath) {
            Intrinsics.checkNotNullParameter(fontPath, "fontPath");
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putString("FONT_PATH_MESSAGE", fontPath);
            hVar.setArguments(bundle);
            return hVar;
        }

        private Companion() {
        }
    }

    public static final h t(String str) {
        return INSTANCE.a(str);
    }

    public static final void u(h hVar, View view) {
        hVar.v(false, BuildConfig.FLAVOR);
    }

    private final void v(boolean success, String urlString) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("BundleKey_success", success);
        bundle.putString("BundleKey_urlString", urlString);
        getParentFragmentManager().t1("QrCode_requestKey", bundle);
    }

    private final C1604f w(Context context, H mainDispatcher, H workerDispatcher) {
        C1604f c1604f = new C1604f(context);
        final InterfaceC2734a interfaceC2734aA = C2736c.a(new C2735b.a().b(256, new int[0]).a());
        AbstractC1694h lifecycle = getLifecycle();
        Intrinsics.d(interfaceC2734aA);
        lifecycle.a(interfaceC2734aA);
        Intrinsics.checkNotNullExpressionValue(interfaceC2734aA, "also(...)");
        c1604f.D(q0.a(workerDispatcher), new R.c(CollectionsKt.d(interfaceC2734aA), 1, q0.a(mainDispatcher), new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                h.y(interfaceC2734aA, this, (c.a) obj);
            }
        }));
        c1604f.E(new c.a().f(new P.d(new Size(1280, 720), 0)).a());
        return c1604f;
    }

    static C1604f x(h hVar, Context context, H h7, H h8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            h7 = c0.c();
        }
        if ((i7 & 4) != 0) {
            h8 = c0.b().A1(1);
        }
        return hVar.w(context, h7, h8);
    }

    public static final void y(InterfaceC2734a interfaceC2734a, h hVar, c.a aVar) {
        List list = (List) aVar.c(interfaceC2734a);
        C2756a c2756a = list != null ? (C2756a) CollectionsKt.firstOrNull(list) : null;
        Throwable thB = aVar.b(interfaceC2734a);
        if (c2756a != null) {
            Log.d("CustomCaptureFrag", "Barcode scanning succeeded.");
            hVar.v(true, c2756a.d());
        } else {
            if (thB == null) {
                Log.d("CustomCaptureFrag", "No barcode detected.");
                return;
            }
            Log.w("CustomCaptureFrag", "Barcode scanning failed: " + thB.getMessage(), thB);
            hVar.v(false, ZJZXBWla.fblfLPD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(K.f19566l, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.findViewById(J.f19524f).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                h.u(this.f7606d, view2);
            }
        });
        AssetManager assets = view.getContext().getApplicationContext().getAssets();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("FONT_PATH_MESSAGE") : null;
        if (string == null) {
            throw new IllegalStateException("FONT_PATH_MESSAGE not set");
        }
        if (j6.d.a().r2()) {
            h7.d.a("FONT_PATH_MESSAGE");
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assets, string);
        TextView textView = (TextView) view.findViewById(J.f19505R);
        TextView textView2 = (TextView) view.findViewById(J.f19510W);
        textView.setTypeface(typefaceCreateFromAsset);
        textView2.setTypeface(typefaceCreateFromAsset);
        PreviewView previewView = (PreviewView) view.findViewById(J.f19506S);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C1604f c1604fX = x(this, context, null, null, 6, null);
        c1604fX.W(getViewLifecycleOwner());
        previewView.setController(c1604fX);
    }
}
