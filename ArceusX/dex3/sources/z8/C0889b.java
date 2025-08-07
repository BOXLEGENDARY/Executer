package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class C0889b implements j1.a {

    @NonNull
    public final LottieAnimationView A;

    @NonNull
    public final ScanningView B;

    @NonNull
    public final SpotlightView C;

    @NonNull
    public final TextView D;

    @NonNull
    public final Space E;

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final Space b;

    @NonNull
    public final Camera2PreviewView c;

    @NonNull
    public final ProgressBar d;

    @NonNull
    public final ConstraintLayout e;

    @NonNull
    public final Button f;

    @NonNull
    public final Space g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final LinearLayout j;

    @NonNull
    public final ToggleButton k;

    @NonNull
    public final TextView l;

    @NonNull
    public final FrameLayout m;

    @NonNull
    public final Pi2NavigationBar n;

    @NonNull
    public final View o;

    @NonNull
    public final ImageView p;

    @NonNull
    public final ConstraintLayout q;

    @NonNull
    public final ThemeableLottieAnimationView r;

    @NonNull
    public final ConstraintLayout s;

    @NonNull
    public final TextView t;

    @NonNull
    public final Barrier u;

    @NonNull
    public final FrameLayout v;

    @NonNull
    public final View w;

    @NonNull
    public final Barrier x;

    @NonNull
    public final PreviewView y;

    @NonNull
    public final ProgressBar z;

    private C0889b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull ToggleButton toggleButton, @NonNull TextView textView3, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView4, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull TextView textView5, @NonNull Space space3) {
        this.a = frameLayout;
        this.b = space;
        this.c = camera2PreviewView;
        this.d = progressBar;
        this.e = constraintLayout;
        this.f = button;
        this.g = space2;
        this.h = textView;
        this.i = textView2;
        this.j = linearLayout;
        this.k = toggleButton;
        this.l = textView3;
        this.m = frameLayout2;
        this.n = pi2NavigationBar;
        this.o = view;
        this.p = imageView;
        this.q = constraintLayout2;
        this.r = themeableLottieAnimationView;
        this.s = constraintLayout3;
        this.t = textView4;
        this.u = barrier;
        this.v = frameLayout3;
        this.w = view2;
        this.x = barrier2;
        this.y = previewView;
        this.z = progressBar2;
        this.A = lottieAnimationView;
        this.B = scanningView;
        this.C = spotlightView;
        this.D = textView5;
        this.E = space3;
    }

    @NonNull
    public static C0889b b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        View viewA;
        ConstraintLayout constraintLayoutA2;
        ConstraintLayout constraintLayoutA3;
        Barrier barrierA;
        View viewA2;
        Barrier barrierA2;
        PreviewView previewViewA;
        int i = C0824E.h;
        Space space = (Space) j1.b.a(view, i);
        if (space != null) {
            i = C0824E.i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) j1.b.a(view, i);
            if (camera2PreviewView != null) {
                i = C0824E.k;
                ProgressBar progressBar = (ProgressBar) j1.b.a(view, i);
                if (progressBar != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.m))) != null) {
                    i = C0824E.n;
                    Button button = (Button) j1.b.a(view, i);
                    if (button != null) {
                        i = C0824E.o;
                        Space space2 = (Space) j1.b.a(view, i);
                        if (space2 != null) {
                            i = C0824E.p;
                            TextView textView = (TextView) j1.b.a(view, i);
                            if (textView != null) {
                                i = C0824E.x;
                                TextView textView2 = (TextView) j1.b.a(view, i);
                                if (textView2 != null) {
                                    i = C0824E.z;
                                    LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
                                    if (linearLayout != null) {
                                        i = C0824E.E;
                                        ToggleButton toggleButton = (ToggleButton) j1.b.a(view, i);
                                        if (toggleButton != null) {
                                            i = C0824E.I;
                                            TextView textView3 = (TextView) j1.b.a(view, i);
                                            if (textView3 != null) {
                                                i = C0824E.U;
                                                FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
                                                if (frameLayout != null) {
                                                    i = C0824E.Y;
                                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                                                    if (pi2NavigationBar != null && (viewA = j1.b.a(view, (i = C0824E.Z))) != null) {
                                                        i = C0824E.a0;
                                                        ImageView imageView = (ImageView) j1.b.a(view, i);
                                                        if (imageView != null && (constraintLayoutA2 = j1.b.a(view, (i = C0824E.b0))) != null) {
                                                            i = C0824E.c0;
                                                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                                                            if (themeableLottieAnimationView != null && (constraintLayoutA3 = j1.b.a(view, (i = C0824E.d0))) != null) {
                                                                i = C0824E.e0;
                                                                TextView textView4 = (TextView) j1.b.a(view, i);
                                                                if (textView4 != null && (barrierA = j1.b.a(view, (i = C0824E.i0))) != null) {
                                                                    i = C0824E.j0;
                                                                    FrameLayout frameLayout2 = (FrameLayout) j1.b.a(view, i);
                                                                    if (frameLayout2 != null && (viewA2 = j1.b.a(view, (i = C0824E.k0))) != null && (barrierA2 = j1.b.a(view, (i = C0824E.l0))) != null && (previewViewA = j1.b.a(view, (i = C0824E.m0))) != null) {
                                                                        i = C0824E.o0;
                                                                        ProgressBar progressBar2 = (ProgressBar) j1.b.a(view, i);
                                                                        if (progressBar2 != null) {
                                                                            i = C0824E.t0;
                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) j1.b.a(view, i);
                                                                            if (lottieAnimationView != null) {
                                                                                i = C0824E.u0;
                                                                                ScanningView scanningView = (ScanningView) j1.b.a(view, i);
                                                                                if (scanningView != null) {
                                                                                    i = C0824E.w0;
                                                                                    SpotlightView spotlightView = (SpotlightView) j1.b.a(view, i);
                                                                                    if (spotlightView != null) {
                                                                                        i = C0824E.D0;
                                                                                        TextView textView5 = (TextView) j1.b.a(view, i);
                                                                                        if (textView5 != null) {
                                                                                            i = C0824E.E0;
                                                                                            Space space3 = (Space) j1.b.a(view, i);
                                                                                            if (space3 != null) {
                                                                                                return new C0889b((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayoutA, button, space2, textView, textView2, linearLayout, toggleButton, textView3, frameLayout, pi2NavigationBar, viewA, imageView, constraintLayoutA2, themeableLottieAnimationView, constraintLayoutA3, textView4, barrierA, frameLayout2, viewA2, barrierA2, previewViewA, progressBar2, lottieAnimationView, scanningView, spotlightView, textView5, space3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0889b d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static C0889b e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.b, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public FrameLayout a() {
        return this.a;
    }
}
