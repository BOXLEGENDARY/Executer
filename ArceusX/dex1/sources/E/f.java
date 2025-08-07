package E;

import K0.wJ.BtcVLuo;
import U.Gw.oeVkjmfPcLbWm;
import android.location.Location;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import g1.kQwt.YGBtcyQ;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import z.C3043d0;

public final class f {

    private static final String f1009c = "f";

    private static final ThreadLocal<SimpleDateFormat> f1010d = new a();

    private static final ThreadLocal<SimpleDateFormat> f1011e = new b();

    private static final ThreadLocal<SimpleDateFormat> f1012f = new c();

    private static final List<String> f1013g = n();

    private static final List<String> f1014h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    private final L0.a f1015a;

    private boolean f1016b = false;

    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YGBtcyQ.JQVPNe, Locale.US);
        }
    }

    private static final class d {

        static final class a {

            final double f1017a;

            a(double d7) {
                this.f1017a = d7;
            }

            double a() {
                return this.f1017a / 2.23694d;
            }
        }

        static a a(double d7) {
            return new a(d7 * 0.621371d);
        }

        static a b(double d7) {
            return new a(d7 * 1.15078d);
        }

        static a c(double d7) {
            return new a(d7);
        }
    }

    private f(L0.a aVar) {
        this.f1015a = aVar;
    }

    private void a() throws NumberFormatException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strF = f(jCurrentTimeMillis);
        this.f1015a.i0("DateTime", strF);
        try {
            this.f1015a.i0("SubSecTime", Long.toString(jCurrentTimeMillis - d(strF).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date c(String str) throws ParseException {
        return f1010d.get().parse(str);
    }

    private static Date d(String str) throws ParseException {
        return f1012f.get().parse(str);
    }

    private static Date e(String str) throws ParseException {
        return f1011e.get().parse(str);
    }

    private static String f(long j7) {
        return f1012f.get().format(new Date(j7));
    }

    public static f h(File file) throws IOException {
        return i(file.toString());
    }

    public static f i(String str) throws IOException {
        return new f(new L0.a(str));
    }

    public static f j(androidx.camera.core.n nVar) throws IOException {
        ByteBuffer byteBufferC = nVar.s()[0].c();
        byteBufferC.rewind();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static f k(InputStream inputStream) throws IOException {
        return new f(new L0.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", KwdswzaUHE.xfgw, "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", tAjeAKSIqDqzNP.VRmiiNwjNItJZK, "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", BtcVLuo.iRG, "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", sMlEMqrxoGI.hmdV, "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", oeVkjmfPcLbWm.OsLhrDOvwaZSK, "Xmp", "NewSubfileType", "SubfileType");
    }

    private long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void A() throws Throwable {
        if (!this.f1016b) {
            a();
        }
        this.f1015a.d0();
    }

    public void b(Location location) throws NumberFormatException {
        this.f1015a.j0(location);
    }

    public void g(f fVar) throws NumberFormatException {
        ArrayList<String> arrayList = new ArrayList(f1013g);
        arrayList.removeAll(f1014h);
        for (String str : arrayList) {
            String strM = this.f1015a.m(str);
            String strM2 = fVar.f1015a.m(str);
            if (strM != null && !strM.equals(strM2)) {
                fVar.f1015a.i0(str, strM);
            }
        }
    }

    public void l() throws NumberFormatException {
        int i7;
        switch (r()) {
            case 2:
                i7 = 1;
                break;
            case 3:
                i7 = 4;
                break;
            case 4:
                i7 = 3;
                break;
            case 5:
                i7 = 6;
                break;
            case 6:
                i7 = 5;
                break;
            case 7:
                i7 = 8;
                break;
            case 8:
                i7 = 7;
                break;
            default:
                i7 = 2;
                break;
        }
        this.f1015a.i0("Orientation", String.valueOf(i7));
    }

    public void m() throws NumberFormatException {
        int i7;
        switch (r()) {
            case 2:
                i7 = 3;
                break;
            case 3:
                i7 = 2;
                break;
            case 4:
                i7 = 1;
                break;
            case 5:
                i7 = 8;
                break;
            case 6:
                i7 = 7;
                break;
            case 7:
                i7 = 6;
                break;
            case 8:
                i7 = 5;
                break;
            default:
                i7 = 4;
                break;
        }
        this.f1015a.i0("Orientation", String.valueOf(i7));
    }

    public String o() {
        return this.f1015a.m("ImageDescription");
    }

    public int p() {
        return this.f1015a.o(GObvYfBKohxpYX.OlbuCbhTUmPWu, 0);
    }

    public android.location.Location q() {
        throw new UnsupportedOperationException("Method not decompiled: E.f.q():android.location.Location");
    }

    public int r() {
        return this.f1015a.o("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() throws NumberFormatException {
        long jX = x(this.f1015a.m("DateTimeOriginal"));
        if (jX == -1) {
            return -1L;
        }
        String strM = this.f1015a.m("SubSecTimeOriginal");
        if (strM == null) {
            return jX;
        }
        try {
            long j7 = Long.parseLong(strM);
            while (j7 > 1000) {
                j7 /= 10;
            }
            return jX + j7;
        } catch (NumberFormatException unused) {
            return jX;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f1015a.o("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int iR = r();
        return iR == 4 || iR == 5 || iR == 7;
    }

    public void z(int i7) throws NumberFormatException {
        if (i7 % 90 != 0) {
            C3043d0.l(f1009c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i7)));
            this.f1015a.i0("Orientation", String.valueOf(0));
            return;
        }
        int i8 = i7 % 360;
        int iR = r();
        while (i8 < 0) {
            i8 += 90;
            switch (iR) {
                case 2:
                    iR = 5;
                    break;
                case 3:
                case 8:
                    iR = 6;
                    break;
                case 4:
                    iR = 7;
                    break;
                case 5:
                    iR = 4;
                    break;
                case 6:
                    iR = 1;
                    break;
                case 7:
                    iR = 2;
                    break;
                default:
                    iR = 8;
                    break;
            }
        }
        while (i8 > 0) {
            i8 -= 90;
            switch (iR) {
                case 2:
                    iR = 7;
                    break;
                case 3:
                    iR = 8;
                    break;
                case 4:
                    iR = 5;
                    break;
                case 5:
                    iR = 2;
                    break;
                case 6:
                    iR = 3;
                    break;
                case 7:
                    iR = 4;
                    break;
                case 8:
                    iR = 1;
                    break;
                default:
                    iR = 6;
                    break;
            }
        }
        this.f1015a.i0("Orientation", String.valueOf(iR));
    }
}
