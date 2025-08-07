package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

public final class a implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button b;

    @NonNull
    public final Camera2PreviewView c;

    @NonNull
    public final View d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView f;

    @NonNull
    public final ProgressBar g;

    @NonNull
    public final Pi2NavigationBar h;

    @NonNull
    public final Barrier i;

    @NonNull
    public final FrameLayout j;

    @NonNull
    public final PreviewView k;

    @NonNull
    public final SelfieOverlayView l;

    @NonNull
    public final TextView m;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull SelfieOverlayView selfieOverlayView, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.b = button;
        this.c = camera2PreviewView;
        this.d = view;
        this.e = textView;
        this.f = textView2;
        this.g = progressBar;
        this.h = pi2NavigationBar;
        this.i = barrier;
        this.j = frameLayout;
        this.k = previewView;
        this.l = selfieOverlayView;
        this.m = textView3;
    }

    @NonNull
    public static a b(@NonNull View view) {
        View viewA;
        Barrier barrierA;
        PreviewView previewViewA;
        int i = V8.g.e;
        Button button = (Button) j1.b.a(view, i);
        if (button != null) {
            i = V8.g.f;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) j1.b.a(view, i);
            if (camera2PreviewView != null && (viewA = j1.b.a(view, (i = V8.g.g))) != null) {
                i = V8.g.k;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null) {
                    i = V8.g.o;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null) {
                        i = V8.g.t;
                        ProgressBar progressBar = (ProgressBar) j1.b.a(view, i);
                        if (progressBar != null) {
                            i = V8.g.x;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                            if (pi2NavigationBar != null && (barrierA = j1.b.a(view, (i = V8.g.A))) != null) {
                                i = V8.g.B;
                                FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
                                if (frameLayout != null && (previewViewA = j1.b.a(view, (i = V8.g.C))) != null) {
                                    i = V8.g.H;
                                    SelfieOverlayView selfieOverlayView = (SelfieOverlayView) j1.b.a(view, i);
                                    if (selfieOverlayView != null) {
                                        i = V8.g.M;
                                        TextView textView3 = (TextView) j1.b.a(view, i);
                                        if (textView3 != null) {
                                            return new a((ConstraintLayout) view, button, camera2PreviewView, viewA, textView, textView2, progressBar, pi2NavigationBar, barrierA, frameLayout, previewViewA, selfieOverlayView, textView3);
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
    public static a d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static a e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }
}
