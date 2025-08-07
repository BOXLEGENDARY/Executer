package u5;

import com.roblox.client.personasdk.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001\u001eB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b/\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b-\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b+\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b)\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010\u0016¨\u0006<"}, d2 = {"Ll8/A;", "", "", "rawText", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "getIdClass", "c", "getNameFirst", "d", "getNameMiddle", "e", "getNameLast", "f", "getSex", "g", "getAddressStreet1", "h", "getAddressCity", "getAddressState", "j", "getAddressPostalCode", "k", "l", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "m", "n", "o", "getIssuingCountry", "p", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class MrzExtraction {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Regex q = new Regex("([A|C|I][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");

    @NotNull
    private static final Regex r = new Regex("([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");

    @NotNull
    private static final Regex s = new Regex("([A-Z0-9<]+?)<<([A-Z0-9<]+?)<<+");

    @NotNull
    private static final Regex t = new Regex("([A|C|I][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");

    @NotNull
    private static final Regex u = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");

    @NotNull
    private static final Regex v = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");

    @NotNull
    private static final Regex w = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");

    @NotNull
    private static final Regex x = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([M|F|X|<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");

    @NotNull
    private final String rawText;

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Ll8/A$a;", "", "<init>", "()V", "", "cleanText", "Ll8/A;", "d", "(Ljava/lang/String;)Ll8/A;", "e", "name", "b", "(Ljava/lang/String;)Ljava/lang/String;", "date", "Ljava/util/Date;", "a", "(Ljava/lang/String;)Ljava/util/Date;", "rawText", "c", "Lkotlin/text/Regex;", "TD1_LINE1", "Lkotlin/text/Regex;", "TD1_LINE2", "TD1_LINE3", "TD2_LINE1", "TD2_LINE2", "TD2_LINE3", "TD3_LINE1", "TD3_LINE2", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "it", "", "a", "(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0239a extends l implements Function1<MatchResult, CharSequence> {
            public static final C0239a d = new C0239a();

            C0239a() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull MatchResult matchResult) {
                Intrinsics.checkNotNullParameter(matchResult, "it");
                return matchResult.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/MatchResult;", "it", "", "a", "(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<MatchResult, CharSequence> {
            public static final b d = new b();

            b() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull MatchResult matchResult) {
                Intrinsics.checkNotNullParameter(matchResult, "it");
                return matchResult.getValue();
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date a(String date) {
            if (date == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyMMdd", Locale.US).parse(new Regex("G").replace(new Regex("S").replace(new Regex("O").replace(new Regex("D").replace(new Regex("L").replace(new Regex("I").replace(date, "1"), "1"), "0"), "0"), "5"), "6"));
            } catch (ParseException unused) {
                return null;
            }
        }

        private final String b(String name) {
            if (name == null) {
                return null;
            }
            return StringsKt.Q0(StringsKt.z(name, "<", " ", false, 4, (Object) null)).toString();
        }

        private final MrzExtraction d(String cleanText) {
            MatchResult matchResultB;
            MatchResult matchResultB2;
            MatchResult matchResultB3 = Regex.b(MrzExtraction.q, cleanText, 0, 2, (Object) null);
            if (matchResultB3 == null || (matchResultB = Regex.b(MrzExtraction.r, cleanText, 0, 2, (Object) null)) == null || (matchResultB2 = Regex.b(MrzExtraction.s, StringsKt.z(StringsKt.z(cleanText, matchResultB3.getValue(), "", false, 4, (Object) null), matchResultB.getValue(), "", false, 4, (Object) null), 0, 2, (Object) null)) == null) {
                return null;
            }
            return new MrzExtraction(CollectionsKt.U(CollectionsKt.m(new MatchResult[]{matchResultB3, matchResultB, matchResultB2}), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0239a.d, 30, (Object) null), null, b((String) matchResultB2.a().get(2)), null, b((String) matchResultB2.a().get(1)), (String) matchResultB.a().get(3), null, null, null, null, (String) matchResultB3.a().get(3), null, a((String) matchResultB.a().get(4)), a((String) matchResultB.a().get(1)), (String) matchResultB3.a().get(2), 3018, null);
        }

        private final MrzExtraction e(String cleanText) {
            MatchResult matchResultB;
            MatchResult matchResultB2 = Regex.b(MrzExtraction.w, cleanText, 0, 2, (Object) null);
            if (matchResultB2 == null || (matchResultB = Regex.b(MrzExtraction.x, cleanText, 0, 2, (Object) null)) == null) {
                return null;
            }
            return new MrzExtraction(CollectionsKt.U(CollectionsKt.m(new MatchResult[]{matchResultB2, matchResultB}), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.d, 30, (Object) null), null, b((String) matchResultB2.a().get(4)), null, b((String) matchResultB2.a().get(3)), (String) matchResultB.a().get(6), null, null, null, null, (String) matchResultB.a().get(1), null, a((String) matchResultB.a().get(7)), a((String) matchResultB.a().get(4)), (String) matchResultB2.a().get(2), 3018, null);
        }

        public final MrzExtraction c(String rawText) {
            if (rawText == null) {
                return null;
            }
            String strReplace = new Regex("(\r|\t| )").replace(rawText, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strReplace.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            MrzExtraction mrzExtractionD = d(upperCase);
            return mrzExtractionD == null ? e(upperCase) : mrzExtractionD;
        }

        private Companion() {
        }
    }

    public MrzExtraction(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12) {
        Intrinsics.checkNotNullParameter(str, "rawText");
        this.rawText = str;
        this.idClass = str2;
        this.nameFirst = str3;
        this.nameMiddle = str4;
        this.nameLast = str5;
        this.sex = str6;
        this.addressStreet1 = str7;
        this.addressCity = str8;
        this.addressState = str9;
        this.addressPostalCode = str10;
        this.identificationNumber = str11;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzExtraction)) {
            return false;
        }
        MrzExtraction mrzExtraction = (MrzExtraction) other;
        return Intrinsics.b(this.rawText, mrzExtraction.rawText) && Intrinsics.b(this.idClass, mrzExtraction.idClass) && Intrinsics.b(this.nameFirst, mrzExtraction.nameFirst) && Intrinsics.b(this.nameMiddle, mrzExtraction.nameMiddle) && Intrinsics.b(this.nameLast, mrzExtraction.nameLast) && Intrinsics.b(this.sex, mrzExtraction.sex) && Intrinsics.b(this.addressStreet1, mrzExtraction.addressStreet1) && Intrinsics.b(this.addressCity, mrzExtraction.addressCity) && Intrinsics.b(this.addressState, mrzExtraction.addressState) && Intrinsics.b(this.addressPostalCode, mrzExtraction.addressPostalCode) && Intrinsics.b(this.identificationNumber, mrzExtraction.identificationNumber) && Intrinsics.b(this.issueDate, mrzExtraction.issueDate) && Intrinsics.b(this.expirationDate, mrzExtraction.expirationDate) && Intrinsics.b(this.birthdate, mrzExtraction.birthdate) && Intrinsics.b(this.issuingCountry, mrzExtraction.issuingCountry);
    }

    public final Date getBirthdate() {
        return this.birthdate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public int hashCode() {
        int iHashCode = this.rawText.hashCode() * 31;
        String str = this.idClass;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameFirst;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode12 = (iHashCode11 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode13 = (iHashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode14 = (iHashCode13 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public final String getRawText() {
        return this.rawText;
    }

    @NotNull
    public String toString() {
        return "MrzExtraction(rawText=" + this.rawText + ", idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public MrzExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : date, (i & 4096) != 0 ? null : date2, (i & 8192) != 0 ? null : date3, (i & 16384) == 0 ? str12 : null);
    }
}
