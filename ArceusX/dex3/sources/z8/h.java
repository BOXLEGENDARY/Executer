package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import v8.C0824E;
import v8.C0825F;

public final class h implements j1.a {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final TextView b;

    @NonNull
    public final Button c;

    @NonNull
    public final ImageView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final ImageView f;

    @NonNull
    public final CardView g;

    @NonNull
    public final Pi2NavigationBar h;

    @NonNull
    public final TextView i;

    @NonNull
    public final ButtonWithLoadingIndicator j;

    private h(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.a = scrollView;
        this.b = textView;
        this.c = button;
        this.d = imageView;
        this.e = textView2;
        this.f = imageView2;
        this.g = cardView;
        this.h = pi2NavigationBar;
        this.i = textView3;
        this.j = buttonWithLoadingIndicator;
    }

    @NonNull
    public static h b(@NonNull View view) {
        CardView cardViewA;
        int i = C0824E.d;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null) {
            i = C0824E.r;
            Button button = (Button) j1.b.a(view, i);
            if (button != null) {
                i = C0824E.B;
                ImageView imageView = (ImageView) j1.b.a(view, i);
                if (imageView != null) {
                    i = C0824E.C;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null) {
                        i = C0824E.R;
                        ImageView imageView2 = (ImageView) j1.b.a(view, i);
                        if (imageView2 != null && (cardViewA = j1.b.a(view, (i = C0824E.S))) != null) {
                            i = C0824E.Y;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                            if (pi2NavigationBar != null) {
                                i = C0824E.D0;
                                TextView textView3 = (TextView) j1.b.a(view, i);
                                if (textView3 != null) {
                                    i = C0824E.G0;
                                    ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) j1.b.a(view, i);
                                    if (buttonWithLoadingIndicator != null) {
                                        return new h((ScrollView) view, textView, button, imageView, textView2, imageView2, cardViewA, pi2NavigationBar, textView3, buttonWithLoadingIndicator);
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
    public static h d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.i, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ScrollView a() {
        return this.a;
    }
}
