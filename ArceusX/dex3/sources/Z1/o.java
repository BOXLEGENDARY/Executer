package Z1;

import android.graphics.Color;
import java.util.List;

public class o implements M<W1.d> {
    private int a;

    public o(int i) {
        this.a = i;
    }

    private void b(W1.d dVar, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < dVar.c(); i3++) {
            int i4 = dVar.a()[i3];
            dVar.a()[i3] = Color.argb(c(dVar.b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    private int c(double d, double[] dArr, double[] dArr2) {
        double dJ;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                dJ = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d2 = dArr[i2];
            double d3 = dArr[i];
            if (d3 >= d) {
                dJ = b2.g.j(dArr2[i2], dArr2[i], b2.g.b((d - d2) / (d3 - d2), 0.0d, 1.0d));
                break;
            }
            i++;
        }
        return (int) (dJ * 255.0d);
    }

    @Override
    public W1.d a(a2.c r13, float r14) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: Z1.o.a(a2.c, float):W1.d");
    }
}
