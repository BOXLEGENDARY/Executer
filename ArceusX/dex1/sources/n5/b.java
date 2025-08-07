package N5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1658c;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.a0;
import h7.l;
import j6.d;

public class b extends DialogInterfaceOnCancelListenerC1658c implements View.OnClickListener, DialogInterface.OnCancelListener {

    private a f2656d;

    private boolean f2657e = false;

    public interface a {
        void a();

        void b(boolean z7);

        void c(Context context);

        void d();
    }

    private void q() {
        dismiss();
    }

    private void s() {
        Window window = getDialog().getWindow();
        Point point = new Point();
        if (window != null) {
            window.getWindowManager().getDefaultDisplay().getSize(point);
            if (this.f2657e) {
                window.setLayout(Math.min(Math.min(point.x, point.y), 950), -2);
            } else {
                window.setLayout((int) (point.x * (a0.j0() ? 1.0f : 0.5f)), -2);
            }
            window.setGravity(17);
        }
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f2656d;
        if (aVar != null) {
            aVar.a();
        } else {
            l.d("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override
    public void onClick(View view) {
        if (this.f2656d == null) {
            l.d("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == J.f19539n) {
            this.f2656d.a();
        } else if (view.getId() == J.f19540o) {
            this.f2656d.d();
        } else if (view.getId() == J.f19541p) {
            this.f2656d.c(getContext());
        } else if (view.getId() == J.f19542q) {
            this.f2656d.b(false);
        }
        q();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setStyle(1, getTheme());
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (d.a().p()) {
            this.f2657e = new P7.d(P7.b.i().d("PlatformExcellence.QualityImprovement.App")).a();
        }
        View viewInflate = this.f2657e ? layoutInflater.inflate(K.f19565k, viewGroup, false) : layoutInflater.inflate(K.f19564j, viewGroup, false);
        viewInflate.findViewById(J.f19541p).setOnClickListener(this);
        viewInflate.findViewById(J.f19540o).setOnClickListener(this);
        viewInflate.findViewById(J.f19542q).setOnClickListener(this);
        viewInflate.findViewById(J.f19539n).setOnClickListener(this);
        return viewInflate;
    }

    @Override
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override
    public void onResume() {
        s();
        super.onResume();
    }

    public void t(a aVar) {
        this.f2656d = aVar;
    }
}
