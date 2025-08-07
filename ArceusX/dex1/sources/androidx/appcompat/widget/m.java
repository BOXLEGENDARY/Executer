package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

final class m {

    private TextView f9301a;

    private TextClassifier f9302b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    m(TextView textView) {
        this.f9301a = (TextView) x0.g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f9302b;
        return textClassifier == null ? a.a(this.f9301a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f9302b = textClassifier;
    }
}
