package n9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import c9.C0487e;
import c9.C0488f;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import ha.C0356g;
import ha.C0361l;
import ha.C0458f;
import ha.C0476u;
import ha.C0877b;
import ha.EnumC0477v;
import ha.InterfaceC0883h;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import n9.g0;
import okio.C0325r;
import okio.h;
import okio.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0019\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "Ln9/s0;", "uiComponentHelper", "Landroid/view/View;", "i", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Ln9/s0;)Landroid/view/View;", "j", "k", "Landroid/widget/ImageView;", "imageView", "", "uri", "", "f", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "g", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "originalSvg", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)Ljava/lang/String;", "originalHex", "newHex", "fallbackColor", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g0 {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[RemoteImage.ContentType.values().length];
            try {
                iArr[RemoteImage.ContentType.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteImage.ContentType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteImage.ContentType.SVG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final RemoteImageComponent e;

        b(C0487e c0487e, RemoteImageComponent remoteImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = remoteImageComponent;
        }

        public Object invoke() throws P9.m {
            m670invoke();
            return Unit.a;
        }

        public final void m670invoke() throws P9.m {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            s9.e.e(appCompatImageView, this.e.e());
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final RemoteImageComponent e;
        final int i;

        c(C0488f c0488f, RemoteImageComponent remoteImageComponent, int i) {
            super(0);
            this.d = c0488f;
            this.e = remoteImageComponent;
            this.i = i;
        }

        public Object invoke() throws P9.m {
            m671invoke();
            return Unit.a;
        }

        public final void m671invoke() throws P9.m {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s9.e.e(imageView, this.e.e());
            this.d.b.setImageResource(this.i);
            this.d.b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.d.b.setAdjustViewBounds(true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final RemoteImageComponent e;
        final kotlin.jvm.internal.v i;
        final Context v;
        final int w;

        d(C0488f c0488f, RemoteImageComponent remoteImageComponent, kotlin.jvm.internal.v vVar, Context context, int i) {
            super(0);
            this.d = c0488f;
            this.e = remoteImageComponent;
            this.i = vVar;
            this.v = context;
            this.w = i;
        }

        public static final okio.h b(RemoteImageComponent remoteImageComponent, C0488f c0488f, E1.m mVar, C0361l c0361l, InterfaceC0883h interfaceC0883h) {
            Intrinsics.checkNotNullParameter(remoteImageComponent, "$this_remoteImageFromBundledResource");
            Intrinsics.checkNotNullParameter(c0488f, "$this_apply");
            Intrinsics.checkNotNullParameter(mVar, "result");
            Intrinsics.checkNotNullParameter(c0361l, "options");
            Intrinsics.checkNotNullParameter(interfaceC0883h, "<anonymous parameter 2>");
            byte[] bArrO = mVar.getSource().e().O();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = g0.e(new String(bArrO, charset), remoteImageComponent.e().getStyles()).getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            okio.e eVarP1 = new okio.e().p1(bytes);
            Context context = c0488f.b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new okio.w(C0325r.e(eVarP1, context), c0361l, false, 4, null);
        }

        public Object invoke() throws Resources.NotFoundException, P9.m {
            m672invoke();
            return Unit.a;
        }

        public final void m672invoke() throws Resources.NotFoundException, P9.m {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s9.e.e(imageView, this.e.e());
            if (this.i.d) {
                Context context = this.d.b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InterfaceC0883h interfaceC0883hD = new InterfaceC0883h.a(context).d();
                String resourcePackageName = this.v.getResources().getResourcePackageName(this.w);
                String lowerCase = EnumC0477v.i.toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Uri uri = Uri.parse("android.resource://" + resourcePackageName + "/" + lowerCase + "/" + this.v.getResources().getResourceEntryName(this.w));
                ImageView imageView2 = this.d.b;
                Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
                final RemoteImageComponent remoteImageComponent = this.e;
                final C0488f c0488f = this.d;
                C0356g.a aVarS = new C0356g.a(imageView2.getContext()).d(uri).s(imageView2);
                aVarS.e(new h.a() {
                    @Override
                    public final okio.h a(E1.m mVar, C0361l c0361l, InterfaceC0883h interfaceC0883h) {
                        return g0.d.b(remoteImageComponent, c0488f, mVar, c0361l, interfaceC0883h);
                    }
                });
                interfaceC0883hD.a(aVarS.a());
            } else {
                this.d.b.setImageResource(this.w);
            }
            this.d.b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.d.b.setAdjustViewBounds(true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final RemoteImageComponent e;
        final RemoteImage.Attributes i;

        e(C0488f c0488f, RemoteImageComponent remoteImageComponent, RemoteImage.Attributes attributes) {
            super(0);
            this.d = c0488f;
            this.e = remoteImageComponent;
            this.i = attributes;
        }

        public Object invoke() throws P9.m {
            m673invoke();
            return Unit.a;
        }

        public final void m673invoke() throws P9.m {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s9.e.e(imageView, this.e.e());
            String url = this.i.getUrl();
            C0488f c0488f = this.d;
            RemoteImageComponent remoteImageComponent = this.e;
            ImageView imageView2 = c0488f.b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            g0.g(imageView2, url, remoteImageComponent.e().getStyles());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0487e d;
        final RemoteImageComponent e;

        f(C0487e c0487e, RemoteImageComponent remoteImageComponent) {
            super(0);
            this.d = c0487e;
            this.e = remoteImageComponent;
        }

        public Object invoke() throws P9.m {
            m674invoke();
            return Unit.a;
        }

        public final void m674invoke() throws P9.m {
            AppCompatImageView appCompatImageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "lottieView");
            s9.e.e(appCompatImageView, this.e.e());
            this.d.b.setRepeatMode(1);
            this.d.b.setRepeatCount(-1);
            this.d.b.s();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final C0488f d;
        final RemoteImageComponent e;
        final RemoteImage.Attributes i;

        g(C0488f c0488f, RemoteImageComponent remoteImageComponent, RemoteImage.Attributes attributes) {
            super(0);
            this.d = c0488f;
            this.e = remoteImageComponent;
            this.i = attributes;
        }

        public Object invoke() throws P9.m {
            m675invoke();
            return Unit.a;
        }

        public final void m675invoke() throws P9.m {
            ImageView imageView = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            s9.e.e(imageView, this.e.e());
            RemoteImage.Attributes attributes = this.i;
            String url = attributes != null ? attributes.getUrl() : null;
            ImageView imageView2 = this.d.b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            g0.f(imageView2, url);
        }
    }

    public static final String e(String str, RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Integer originalStrokeColorValue;
        String strG;
        Integer originalBackgroundColorValue;
        String strG2;
        Integer originalHighlightColorValue;
        String strG3;
        Integer originalFillColorValue;
        String strG4;
        Integer originalStrokeColorValue2;
        Integer originalBackgroundColorValue2;
        Integer originalHighlightColorValue2;
        Integer originalFillColorValue2;
        if (remoteImageComponentStyle != null && (originalFillColorValue2 = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue = originalFillColorValue2.intValue();
            Integer newFillColorValue = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue != null && C0458f.g(newFillColorValue.intValue()) != null) {
                str = StringsKt.z(str, C0458f.g(iIntValue), "{{ fill_color }}", false, 4, (Object) null);
            }
        }
        String strZ = str;
        if (remoteImageComponentStyle != null && (originalHighlightColorValue2 = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue2 = originalHighlightColorValue2.intValue();
            Integer newHighlightColorValue = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue != null && C0458f.g(newHighlightColorValue.intValue()) != null) {
                strZ = StringsKt.z(strZ, C0458f.g(iIntValue2), "{{ highlight_color }}", false, 4, (Object) null);
            }
        }
        String strZ2 = strZ;
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue2 = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue3 = originalBackgroundColorValue2.intValue();
            Integer newBackgroundColorValue = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue != null && C0458f.g(newBackgroundColorValue.intValue()) != null) {
                strZ2 = StringsKt.z(strZ2, C0458f.g(iIntValue3), "{{ background_color }}", false, 4, (Object) null);
            }
        }
        String strL = strZ2;
        if (remoteImageComponentStyle != null && (originalStrokeColorValue2 = remoteImageComponentStyle.getOriginalStrokeColorValue()) != null) {
            int iIntValue4 = originalStrokeColorValue2.intValue();
            Integer newStrokeColorValue = remoteImageComponentStyle.getNewStrokeColorValue();
            if (newStrokeColorValue != null && C0458f.g(newStrokeColorValue.intValue()) != null) {
                strL = StringsKt.z(strL, C0458f.g(iIntValue4), "{{ stroke_color }}", false, 4, (Object) null);
            }
        }
        if (remoteImageComponentStyle != null && (originalFillColorValue = remoteImageComponentStyle.getOriginalFillColorValue()) != null) {
            int iIntValue5 = originalFillColorValue.intValue();
            Integer newFillColorValue2 = remoteImageComponentStyle.getNewFillColorValue();
            if (newFillColorValue2 != null && (strG4 = C0458f.g(newFillColorValue2.intValue())) != null) {
                strL = l(strL, "{{ fill_color }}", strG4, C0458f.g(iIntValue5));
            }
        }
        if (remoteImageComponentStyle != null && (originalHighlightColorValue = remoteImageComponentStyle.getOriginalHighlightColorValue()) != null) {
            int iIntValue6 = originalHighlightColorValue.intValue();
            Integer newHighlightColorValue2 = remoteImageComponentStyle.getNewHighlightColorValue();
            if (newHighlightColorValue2 != null && (strG3 = C0458f.g(newHighlightColorValue2.intValue())) != null) {
                strL = l(strL, "{{ highlight_color }}", strG3, C0458f.g(iIntValue6));
            }
        }
        if (remoteImageComponentStyle != null && (originalBackgroundColorValue = remoteImageComponentStyle.getOriginalBackgroundColorValue()) != null) {
            int iIntValue7 = originalBackgroundColorValue.intValue();
            Integer newBackgroundColorValue2 = remoteImageComponentStyle.getNewBackgroundColorValue();
            if (newBackgroundColorValue2 != null && (strG2 = C0458f.g(newBackgroundColorValue2.intValue())) != null) {
                strL = l(strL, "{{ background_color }}", strG2, C0458f.g(iIntValue7));
            }
        }
        if (remoteImageComponentStyle == null || (originalStrokeColorValue = remoteImageComponentStyle.getOriginalStrokeColorValue()) == null) {
            return strL;
        }
        int iIntValue8 = originalStrokeColorValue.intValue();
        Integer newStrokeColorValue2 = remoteImageComponentStyle.getNewStrokeColorValue();
        return (newStrokeColorValue2 == null || (strG = C0458f.g(newStrokeColorValue2.intValue())) == null) ? strL : l(strL, "{{ stroke_color }}", strG, C0458f.g(iIntValue8));
    }

    public static final void f(ImageView imageView, String str) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC0883h.a aVar = new InterfaceC0883h.a(context);
        C0877b.a aVar2 = new C0877b.a();
        aVar2.a(new w.b(false, 1, null));
        aVar.h(aVar2.e()).j(true).i(500).d().a(new C0356g.a(imageView.getContext()).d(str).s(imageView).a());
    }

    public static final void g(final ImageView imageView, String str, final RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC0883h interfaceC0883hD = new InterfaceC0883h.a(context).j(true).i(500).d();
        C0356g.a aVarS = new C0356g.a(imageView.getContext()).d(str).s(imageView);
        aVarS.e(new h.a() {
            @Override
            public final okio.h a(E1.m mVar, C0361l c0361l, InterfaceC0883h interfaceC0883h) {
                return g0.h(remoteImageComponentStyle, imageView, mVar, c0361l, interfaceC0883h);
            }
        });
        interfaceC0883hD.a(aVarS.a());
    }

    public static final okio.h h(RemoteImage.RemoteImageComponentStyle remoteImageComponentStyle, ImageView imageView, E1.m mVar, C0361l c0361l, InterfaceC0883h interfaceC0883h) {
        Intrinsics.checkNotNullParameter(imageView, "$imageView");
        Intrinsics.checkNotNullParameter(mVar, "result");
        Intrinsics.checkNotNullParameter(c0361l, "options");
        Intrinsics.checkNotNullParameter(interfaceC0883h, "<anonymous parameter 2>");
        byte[] bArrO = mVar.getSource().e().O();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = e(new String(bArrO, charset), remoteImageComponentStyle).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        okio.e eVarP1 = new okio.e().p1(bytes);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new okio.w(C0325r.e(eVarP1, context), c0361l, false, 4, null);
    }

    @NotNull
    public static final View i(@NotNull RemoteImageComponent remoteImageComponent, @NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(remoteImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(s0Var, "uiComponentHelper");
        View viewJ = j(remoteImageComponent, s0Var);
        return viewJ == null ? k(remoteImageComponent, s0Var) : viewJ;
    }

    private static final View j(RemoteImageComponent remoteImageComponent, s0 s0Var) throws Resources.NotFoundException, P9.m {
        Integer numG;
        C0487e c0487e;
        RemoteImage.Attributes attributes = remoteImageComponent.e().getAttributes();
        String localAssetName = attributes != null ? attributes.getLocalAssetName() : null;
        RemoteImage.ContentType localAssetContentType = attributes != null ? attributes.getLocalAssetContentType() : null;
        Context context = s0Var.getContext();
        if (localAssetName != null && localAssetContentType != null) {
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            int[] iArr = a.a;
            int i = iArr[localAssetContentType.ordinal()];
            if (i == 1) {
                numG = C0476u.g(context, localAssetName, EnumC0477v.i);
            } else if (i == 2) {
                numG = C0476u.g(context, localAssetName, EnumC0477v.e);
            } else {
                if (i != 3) {
                    throw new P9.m();
                }
                numG = C0476u.g(context, localAssetName, EnumC0477v.i);
                if (numG != null) {
                    vVar.d = true;
                } else {
                    numG = C0476u.g(context, localAssetName, EnumC0477v.e);
                }
            }
            if (numG != null) {
                int iIntValue = numG.intValue();
                int i2 = iArr[localAssetContentType.ordinal()];
                if (i2 == 1) {
                    C0487e c0487eD = C0487e.d(s0Var.getLayoutInflater());
                    s0Var.d(new b(c0487eD, remoteImageComponent));
                    c0487eD.b.setAnimation(iIntValue);
                    c0487e = c0487eD;
                } else if (i2 == 2) {
                    C0488f c0488fD = C0488f.d(s0Var.getLayoutInflater());
                    s0Var.d(new c(c0488fD, remoteImageComponent, iIntValue));
                    c0487e = c0488fD;
                } else {
                    if (i2 != 3) {
                        throw new P9.m();
                    }
                    C0488f c0488fD2 = C0488f.d(s0Var.getLayoutInflater());
                    s0Var.d(new d(c0488fD2, remoteImageComponent, vVar, context, iIntValue));
                    c0487e = c0488fD2;
                }
                return c0487e.a();
            }
        }
        return null;
    }

    private static final View k(RemoteImageComponent remoteImageComponent, s0 s0Var) {
        C0487e c0487e;
        RemoteImage.Attributes attributes = remoteImageComponent.e().getAttributes();
        RemoteImage.ContentType contentType = attributes != null ? attributes.getContentType() : null;
        int i = contentType == null ? -1 : a.a[contentType.ordinal()];
        if (i == 1) {
            C0487e c0487eD = C0487e.d(s0Var.getLayoutInflater());
            s0Var.d(new f(c0487eD, remoteImageComponent));
            c0487eD.b.D(attributes.getUrl());
            c0487e = c0487eD;
        } else if (i != 3) {
            C0488f c0488fD = C0488f.d(s0Var.getLayoutInflater());
            s0Var.d(new g(c0488fD, remoteImageComponent, attributes));
            c0487e = c0488fD;
        } else {
            C0488f c0488fD2 = C0488f.d(s0Var.getLayoutInflater());
            s0Var.d(new e(c0488fD2, remoteImageComponent, attributes));
            c0487e = c0488fD2;
        }
        View viewA = c0487e.a();
        Intrinsics.checkNotNullExpressionValue(viewA, "getRoot(...)");
        return viewA;
    }

    private static final String l(String str, String str2, String str3, String str4) {
        try {
            Color.parseColor(str3);
            return StringsKt.z(str, str2, str3, false, 4, (Object) null);
        } catch (IllegalArgumentException unused) {
            return StringsKt.z(str, str2, str4, false, 4, (Object) null);
        }
    }
}
