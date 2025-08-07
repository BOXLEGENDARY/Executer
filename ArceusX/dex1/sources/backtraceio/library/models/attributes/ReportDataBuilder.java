package backtraceio.library.models.attributes;

import backtraceio.library.common.TypeHelper;
import java.util.Map;

public class ReportDataBuilder {
    public static ReportDataAttributes getReportAttributes(Map<String, Object> map) {
        return getReportAttributes(map, false);
    }

    public static ReportDataAttributes getReportAttributes(Map<String, Object> map, boolean z7) {
        ReportDataAttributes reportDataAttributes = new ReportDataAttributes();
        if (map == null) {
            return reportDataAttributes;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                if (!z7) {
                    reportDataAttributes.addAttribute(key, null);
                }
            } else if (TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(value.getClass())) {
                reportDataAttributes.addAttribute(key, value.toString());
            } else {
                reportDataAttributes.addAnnotation(key, value);
            }
        }
        return reportDataAttributes;
    }
}
