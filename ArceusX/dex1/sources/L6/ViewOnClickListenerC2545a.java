package l6;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.X;
import com.roblox.client.a0;
import d8.t;
import h7.l;

public class ViewOnClickListenerC2545a extends X implements View.OnClickListener {

    private long f21809F;

    private String f21810G;

    private String f21811H;

    private String f21812I;

    @Override
    public void onClick(View view) {
        if (getDialog() != null) {
            if (view.getId() == J.f19528h) {
                getDialog().dismiss();
                return;
            }
            if (view.getId() == J.f19549x) {
                getDialog().dismiss();
                String strG = a0.g(this.f21809F);
                l.i("rbx.catalog", "assetPath:" + strG);
                g6.i iVar = new g6.i("CATALOG_TAG");
                iVar.i(strG);
                Wa.c.d().j(iVar);
            }
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        Dialog dialog;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f21809F = arguments.getLong("assetId", -1L);
        this.f21810G = arguments.getString("title");
        this.f21811H = arguments.getString("description");
        this.f21812I = arguments.getString("thumbnail");
        if (this.f21809F != -1 || (dialog = getDialog()) == null) {
            return;
        }
        dialog.dismiss();
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(K.f19563i, viewGroup, false);
        ((TextView) viewInflate.findViewById(J.f19515a0)).setText(this.f21810G);
        ((TextView) viewInflate.findViewById(J.f19536l)).setText(this.f21811H);
        viewInflate.findViewById(J.f19549x).setOnClickListener(this);
        viewInflate.findViewById(J.f19528h).setOnClickListener(this);
        t.p(getContext()).k(this.f21812I).c((ImageView) viewInflate.findViewById(J.f19513Z));
        return viewInflate;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.6f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }
}
