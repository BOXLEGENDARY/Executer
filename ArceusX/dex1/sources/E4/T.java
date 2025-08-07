package E4;

import S9.Gvmm.CAqKeu;
import com.github.luben.zstd.BuildConfig;
import java.io.File;

public final class T {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException(CAqKeu.wDGatRykGmHUGZ);
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
        return (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) ? BuildConfig.FLAVOR : strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", BuildConfig.FLAVOR).replace(".config.main", BuildConfig.FLAVOR);
    }
}
