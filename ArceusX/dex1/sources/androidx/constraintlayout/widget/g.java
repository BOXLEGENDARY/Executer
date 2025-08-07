package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l0.e;

public class g extends View {

    private int f10028d;

    private View f10029e;

    private int f10030i;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f10029e == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f10029e.getLayoutParams();
        bVar2.f9849n0.W0(0);
        e.b bVarA = bVar.f9849n0.A();
        e.b bVar3 = e.b.FIXED;
        if (bVarA != bVar3) {
            bVar.f9849n0.X0(bVar2.f9849n0.T());
        }
        if (bVar.f9849n0.Q() != bVar3) {
            bVar.f9849n0.y0(bVar2.f9849n0.x());
        }
        bVar2.f9849n0.W0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f10028d == -1 && !isInEditMode()) {
            setVisibility(this.f10030i);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f10028d);
        this.f10029e = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f9825b0 = true;
            this.f10029e.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f10029e;
    }

    public int getEmptyVisibility() {
        return this.f10030i;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i7) {
        View viewFindViewById;
        if (this.f10028d == i7) {
            return;
        }
        View view = this.f10029e;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f10029e.getLayoutParams()).f9825b0 = false;
            this.f10029e = null;
        }
        this.f10028d = i7;
        if (i7 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i7)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i7) {
        this.f10030i = i7;
    }
}
