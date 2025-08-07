package D4;

import Za.qhkq.dHkZSUxHu;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class G {
    static final P a(XmlPullParser xmlPullParser, N n7) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String strB = b("name", xmlPullParser, n7);
                                    if (strB != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String strB2 = b(dHkZSUxHu.GRGVfhyJNDhG, xmlPullParser, n7);
                                                                String strB3 = b("split", xmlPullParser, n7);
                                                                c(xmlPullParser, n7);
                                                                if (strB2 != null && strB3 != null) {
                                                                    n7.a(strB, strB2, strB3);
                                                                }
                                                            } else {
                                                                c(xmlPullParser, n7);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c(xmlPullParser, n7);
                                                }
                                            }
                                        }
                                    } else {
                                        c(xmlPullParser, n7);
                                    }
                                } else {
                                    c(xmlPullParser, n7);
                                }
                            }
                        }
                    } else {
                        c(xmlPullParser, n7);
                    }
                }
            } catch (IOException e7) {
                e = e7;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            } catch (IllegalStateException e8) {
                e = e8;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            } catch (XmlPullParserException e9) {
                e = e9;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        return n7.b();
    }

    private static final String b(String str, XmlPullParser xmlPullParser, N n7) {
        for (int i7 = 0; i7 < xmlPullParser.getAttributeCount(); i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    private static final void c(XmlPullParser xmlPullParser, N n7) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }
}
