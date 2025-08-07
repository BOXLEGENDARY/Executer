package G0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    private int f1327B;

    private int f1328C;

    private LayoutInflater f1329D;

    @Deprecated
    public c(Context context, int i7, Cursor cursor, boolean z7) {
        super(context, cursor, z7);
        this.f1328C = i7;
        this.f1327B = i7;
        this.f1329D = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override
    public View q(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1329D.inflate(this.f1328C, viewGroup, false);
    }

    @Override
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1329D.inflate(this.f1327B, viewGroup, false);
    }
}
