package E4;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0407m {

    private final C4.b f1149a;

    private XmlPullParser f1150b;

    public C0407m(C4.b bVar) {
        this.f1149a = bVar;
    }

    public final long a() throws XmlPullParserException, IOException, NumberFormatException {
        if (this.f1150b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.f1150b.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.f1150b.getName().equals("manifest")) {
                String attributeValue = this.f1150b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f1150b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i7 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i7;
                    }
                    try {
                        return (Integer.parseInt(attributeValue2) << 32) | (i7 & 4294967295L);
                    } catch (NumberFormatException e7) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e7.getMessage()));
                    }
                } catch (NumberFormatException e8) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e8.getMessage()));
                }
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) throws IOException {
        this.f1150b = assetManager.openXmlResourceParser(C4.b.c(assetManager, file), "AndroidManifest.xml");
    }
}
