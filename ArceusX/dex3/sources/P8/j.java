package P8;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import java.util.List;

public final class j {
    private final C9.h<e.c<PassportNfcReaderConfig>> a;
    private final C9.h<Context> b;
    private final C9.h<T8.c> c;

    public j(C9.h<e.c<PassportNfcReaderConfig>> hVar, C9.h<Context> hVar2, C9.h<T8.c> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static j a(C9.h<e.c<PassportNfcReaderConfig>> hVar, C9.h<Context> hVar2, C9.h<T8.c> hVar3) {
        return new j(hVar, hVar2, hVar3);
    }

    public static com.withpersona.sdk2.inquiry.nfc.b c(e.c<PassportNfcReaderConfig> cVar, Context context, T8.c cVar2, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return new com.withpersona.sdk2.inquiry.nfc.b(cVar, context, cVar2, str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }

    public com.withpersona.sdk2.inquiry.nfc.b b(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends b> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return c((e.c) this.a.get(), (Context) this.b.get(), (T8.c) this.c.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }
}
