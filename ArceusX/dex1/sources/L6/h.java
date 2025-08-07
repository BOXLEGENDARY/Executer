package L6;

import com.github.luben.zstd.BuildConfig;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class h {
    public static String a(int i7) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(BuildConfig.FLAVOR);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        numberInstance.setMaximumFractionDigits(0);
        return numberInstance.format(i7);
    }
}
