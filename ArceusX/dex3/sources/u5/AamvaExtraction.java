package u5;

import com.roblox.client.personasdk.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 72\u00020\u0001:\u0001\u001dB¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001e\u001a\u0004\b:\u0010\u0015¨\u0006;"}, d2 = {"Ll8/a;", "", "", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIdClass", "b", "getNameFirst", "c", "getNameMiddle", "d", "getNameLast", "e", "getSex", "f", "getAddressStreet1", "g", "getAddressCity", "h", "getAddressState", "i", "getAddressPostalCode", "j", "getIdentificationNumber", "k", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "l", "o", "m", "n", "getIssuingCountry", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AamvaExtraction {

    @NotNull
    private static final Regex A;

    @NotNull
    private static final Regex B;

    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Regex p;

    @NotNull
    private static final Regex q;

    @NotNull
    private static final Regex r;

    @NotNull
    private static final Regex s;

    @NotNull
    private static final Regex t;

    @NotNull
    private static final Regex u;

    @NotNull
    private static final Regex v;

    @NotNull
    private static final Regex w;

    @NotNull
    private static final Regex x;

    @NotNull
    private static final Regex y;

    @NotNull
    private static final Regex z;

    private final String idClass;

    private final String nameFirst;

    private final String nameMiddle;

    private final String nameLast;

    private final String sex;

    private final String addressStreet1;

    private final String addressCity;

    private final String addressState;

    private final String addressPostalCode;

    private final String identificationNumber;

    private final Date issueDate;

    private final Date expirationDate;

    private final Date birthdate;

    private final String issuingCountry;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Ll8/a$a;", "", "<init>", "()V", "", "key", "Lkotlin/text/Regex;", "c", "(Ljava/lang/String;)Lkotlin/text/Regex;", "rawText", "fieldPattern", "e", "(Ljava/lang/String;Lkotlin/text/Regex;)Ljava/lang/String;", "value", "Ljava/util/Date;", "b", "(Ljava/lang/String;)Ljava/util/Date;", "barcodeText", "", "f", "(Ljava/lang/String;)Z", "Ll8/a;", "d", "(Ljava/lang/String;)Ll8/a;", "BIRTH_DATE", "Lkotlin/text/Regex;", "CITY", "EXPIRY_DATE", "FIRST_NAME", "GENDER", "ISSUE_DATE", "ISSUING_COUNTRY", "LAST_NAME", "LICENSE_NUMBER", "MIDDLE_NAME", "STATE", "STREET", "ZIP", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date b(String value) {
            if (value == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("MMddyyyy", Locale.US).parse(value);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Regex c(String key) {
            return new Regex("\n" + key + "(.+?)(\n|$)");
        }

        private final String e(String rawText, Regex fieldPattern) {
            List listA;
            MatchResult matchResultB = Regex.b(fieldPattern, rawText, 0, 2, (Object) null);
            if (matchResultB == null || (listA = matchResultB.a()) == null) {
                return null;
            }
            return (String) CollectionsKt.O(listA, 1);
        }

        private final boolean f(String barcodeText) {
            return (!new Regex("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", j.A).d(StringsKt.Q0(barcodeText).toString()) || e(barcodeText, AamvaExtraction.v) == null || e(barcodeText, AamvaExtraction.z) == null) ? false : true;
        }

        public final AamvaExtraction d(String rawText) {
            if (rawText == null || !f(rawText)) {
                return null;
            }
            return new AamvaExtraction(null, e(rawText, AamvaExtraction.v), e(rawText, AamvaExtraction.B), e(rawText, AamvaExtraction.z), e(rawText, AamvaExtraction.w), e(rawText, AamvaExtraction.r), e(rawText, AamvaExtraction.p), e(rawText, AamvaExtraction.q), e(rawText, AamvaExtraction.s), e(rawText, AamvaExtraction.A), b(e(rawText, AamvaExtraction.x)), b(e(rawText, AamvaExtraction.u)), b(e(rawText, AamvaExtraction.t)), e(rawText, AamvaExtraction.y), 1, null);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        p = companion.c("DAI");
        q = companion.c("DAJ");
        r = companion.c("DAG");
        s = companion.c("DAK");
        t = companion.c("DBB");
        u = companion.c("DBA");
        v = companion.c("DAC");
        w = companion.c("DBC");
        x = companion.c("DBD");
        y = companion.c("DCG");
        z = companion.c("DCS");
        A = companion.c("DAQ");
        B = companion.c("DAD");
    }

    public AamvaExtraction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AamvaExtraction)) {
            return false;
        }
        AamvaExtraction aamvaExtraction = (AamvaExtraction) other;
        return Intrinsics.b(this.idClass, aamvaExtraction.idClass) && Intrinsics.b(this.nameFirst, aamvaExtraction.nameFirst) && Intrinsics.b(this.nameMiddle, aamvaExtraction.nameMiddle) && Intrinsics.b(this.nameLast, aamvaExtraction.nameLast) && Intrinsics.b(this.sex, aamvaExtraction.sex) && Intrinsics.b(this.addressStreet1, aamvaExtraction.addressStreet1) && Intrinsics.b(this.addressCity, aamvaExtraction.addressCity) && Intrinsics.b(this.addressState, aamvaExtraction.addressState) && Intrinsics.b(this.addressPostalCode, aamvaExtraction.addressPostalCode) && Intrinsics.b(this.identificationNumber, aamvaExtraction.identificationNumber) && Intrinsics.b(this.issueDate, aamvaExtraction.issueDate) && Intrinsics.b(this.expirationDate, aamvaExtraction.expirationDate) && Intrinsics.b(this.birthdate, aamvaExtraction.birthdate) && Intrinsics.b(this.issuingCountry, aamvaExtraction.issuingCountry);
    }

    public int hashCode() {
        String str = this.idClass;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameFirst;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode11 = (iHashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode12 = (iHashCode11 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode13 = (iHashCode12 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public final Date getBirthdate() {
        return this.birthdate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public String toString() {
        return "AamvaExtraction(idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11) {
        this.idClass = str;
        this.nameFirst = str2;
        this.nameMiddle = str3;
        this.nameLast = str4;
        this.sex = str5;
        this.addressStreet1 = str6;
        this.addressCity = str7;
        this.addressState = str8;
        this.addressPostalCode = str9;
        this.identificationNumber = str10;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str11;
    }

    public AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : date, (i & 2048) != 0 ? null : date2, (i & 4096) != 0 ? null : date3, (i & 8192) == 0 ? str11 : null);
    }
}
