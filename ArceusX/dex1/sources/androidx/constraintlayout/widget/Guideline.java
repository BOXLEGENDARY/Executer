package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9822a = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9824b = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f9826c = f7;
        setLayoutParams(bVar);
    }

    @Override
    public void setVisibility(int i7) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
