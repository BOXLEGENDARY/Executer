package K0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {

    private final b f1750a;

    private static class a extends b {

        private final TextView f1751a;

        private final d f1752b;

        private boolean f1753c = true;

        a(TextView textView) {
            this.f1751a = textView;
            this.f1752b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f1752b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f1752b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArrayG.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f1751a.setFilters(a(this.f1751a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f1753c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override
        public boolean b() {
            return this.f1753c;
        }

        @Override
        void c(boolean z7) {
            if (z7) {
                l();
            }
        }

        @Override
        void d(boolean z7) {
            this.f1753c = z7;
            l();
            k();
        }

        @Override
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f1753c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z7) {
            this.f1753c = z7;
        }

        void l() {
            this.f1751a.setTransformationMethod(e(this.f1751a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z7) {
            throw null;
        }

        void d(boolean z7) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    private static class c extends b {

        private final a f1754a;

        c(TextView textView) {
            this.f1754a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.h();
        }

        @Override
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f1754a.a(inputFilterArr);
        }

        @Override
        public boolean b() {
            return this.f1754a.b();
        }

        @Override
        void c(boolean z7) {
            if (f()) {
                return;
            }
            this.f1754a.c(z7);
        }

        @Override
        void d(boolean z7) {
            if (f()) {
                this.f1754a.i(z7);
            } else {
                this.f1754a.d(z7);
            }
        }

        @Override
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f1754a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z7) {
        x0.g.h(textView, "textView cannot be null");
        if (z7) {
            this.f1750a = new a(textView);
        } else {
            this.f1750a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1750a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1750a.b();
    }

    public void c(boolean z7) {
        this.f1750a.c(z7);
    }

    public void d(boolean z7) {
        this.f1750a.d(z7);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f1750a.e(transformationMethod);
    }
}
