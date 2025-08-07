package d4;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class C2393f extends Property<ImageView, Matrix> {

    private final Matrix f20321a;

    public C2393f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f20321a = new Matrix();
    }

    @Override
    public Matrix get(ImageView imageView) {
        this.f20321a.set(imageView.getImageMatrix());
        return this.f20321a;
    }

    @Override
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
