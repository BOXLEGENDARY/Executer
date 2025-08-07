package o2;

import org.xml.sax.SAXException;

public class j extends SAXException {
    j(String str) {
        super(str);
    }

    j(String str, Exception exc) {
        super(str, exc);
    }
}
