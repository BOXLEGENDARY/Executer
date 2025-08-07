package backtraceio.library.common;

import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import backtraceio.library.logger.BacktraceLogger;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

public class MultiFormRequestHelper {
    private static final String BOUNDARY = "*****";
    private static final String CRLF = "\r\n";
    private static final String ENCODING = "utf-8";
    private static final transient String LOG_TAG = "MultiFormRequestHelper";
    private static final String TWO_HYPHENS = "--";

    public static void addEndOfRequest(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            BacktraceLogger.w(LOG_TAG, "Output stream is null");
        } else {
            outputStream.write("--*****--\r\n".getBytes());
        }
    }

    private static void addFile(OutputStream outputStream, String str) throws IOException {
        if (str == null || outputStream == null) {
            BacktraceLogger.w(LOG_TAG, "Absolute path or output stream is null");
            return;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(FileHelper.getFileNameFromPath(str));
        outputStream.write("--*****\r\n".getBytes());
        outputStream.write(getFileInfo("attachment_" + FileHelper.getFileNameFromPath(str)).getBytes());
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Type: ");
        sb.append(strGuessContentTypeFromName);
        String str2 = KwdswzaUHE.yXlgcnfelS;
        sb.append(str2);
        outputStream.write(sb.toString().getBytes());
        outputStream.write(str2.getBytes());
        streamFile(outputStream, str);
        outputStream.write(str2.getBytes());
    }

    public static void addFiles(OutputStream outputStream, List<String> list) throws IOException {
        if (list == null || outputStream == null) {
            BacktraceLogger.w(LOG_TAG, "Attachments or output stream is null");
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addFile(outputStream, it.next());
        }
    }

    public static void addJson(OutputStream outputStream, String str) throws IOException {
        if (BacktraceStringHelper.isNullOrEmpty(str)) {
            BacktraceLogger.w(LOG_TAG, "JSON is null or empty");
            return;
        }
        if (outputStream == null) {
            BacktraceLogger.w(LOG_TAG, "Output stream is null");
            return;
        }
        outputStream.write("--*****\r\n".getBytes());
        outputStream.write(getFileInfo("upload_file").getBytes());
        outputStream.write(CRLF.getBytes());
        outputStream.write(str.getBytes(ENCODING));
        outputStream.write(CRLF.getBytes());
    }

    public static String getContentType() {
        return "multipart/form-data;boundary=*****";
    }

    private static String getFileInfo(String str) {
        return "Content-Disposition: form-data; name=\"" + str + "\";filename=\"" + str + "\"" + CRLF;
    }

    public static void streamFile(OutputStream outputStream, String str) throws IOException {
        if (outputStream == null || str == null) {
            BacktraceLogger.w(LOG_TAG, "Absolute path or output stream is null");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        byte[] bArr = new byte[4096];
        while (true) {
            int i7 = fileInputStream.read(bArr);
            if (i7 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }
}
