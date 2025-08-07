package b7;

import java.util.regex.Pattern;

public class c extends a {

    private Pattern f12652b;

    public c(String str) {
        super(str);
    }

    public boolean d(String str) {
        if (this.f12652b == null) {
            this.f12652b = Pattern.compile("(?:(?:http|https):\\/\\/)?(?:[^.]+\\.)?(?:facebook\\.com|twitter\\.com|twitch\\.tv|youtube\\.com|discord\\.gg)(?:\\/.*)?");
        }
        return this.f12652b.matcher(str).matches();
    }
}
