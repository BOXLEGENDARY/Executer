package a1;

import Q6.QtA.QXojhh;
import Y0.l;
import c1.g;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0005\u0017\u0019\u001b\u001d\u001eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"La1/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "La1/e$a;", "columns", BuildConfig.FLAVOR, "La1/e$c;", "foreignKeys", "La1/e$e;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "Ljava/util/Set;", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    public static final Companion INSTANCE = new Companion(null);

    public final String name;

    public final Map<String, a> columns;

    public final Set<c> foreignKeys;

    public final Set<C0064e> indices;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 \"2\u00020\u0001:\u0001\rB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"La1/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "type", BuildConfig.FLAVOR, "notNull", BuildConfig.FLAVOR, "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "a", "(Ljava/lang/String;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "c", "Z", "d", "I", "e", "f", "g", "getAffinity$annotations", "()V", "affinity", "h", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        public static final Companion INSTANCE = new Companion(null);

        public final String name;

        public final String type;

        public final boolean notNull;

        public final int primaryKeyPosition;

        public final String defaultValue;

        public final int createdFrom;

        public final int affinity;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La1/e$a$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "current", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)Z", "other", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String current) {
                if (current.length() == 0) {
                    return false;
                }
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < current.length()) {
                    char cCharAt = current.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i8++;
                    } else if (cCharAt == ')' && i8 - 1 == 0 && i9 != current.length() - 1) {
                        return false;
                    }
                    i7++;
                    i9 = i10;
                }
                return i8 == 0;
            }

            public final boolean b(String current, String other) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.b(current, other)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.b(StringsKt.Q0(strSubstring).toString(), other);
            }

            private Companion() {
            }
        }

        public a(String str, String str2, boolean z7, int i7, String str3, int i8) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "type");
            this.name = str;
            this.type = str2;
            this.notNull = z7;
            this.primaryKeyPosition = i7;
            this.defaultValue = str3;
            this.createdFrom = i8;
            this.affinity = a(str2);
        }

        private final int a(String type) {
            if (type == null) {
                return 5;
            }
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "US");
            String upperCase = type.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.K(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.K(upperCase, "CHAR", false, 2, (Object) null) || StringsKt.K(upperCase, "CLOB", false, 2, (Object) null) || StringsKt.K(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.K(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (StringsKt.K(upperCase, "REAL", false, 2, (Object) null) || StringsKt.K(upperCase, "FLOA", false, 2, (Object) null) || StringsKt.K(upperCase, QXojhh.EMVvJRLRtRw, false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object other) {
            String str;
            String str2;
            String str3;
            if (this == other) {
                return true;
            }
            if (!(other instanceof a) || this.primaryKeyPosition != ((a) other).primaryKeyPosition) {
                return false;
            }
            a aVar = (a) other;
            if (!Intrinsics.b(this.name, aVar.name) || this.notNull != aVar.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && aVar.createdFrom == 2 && (str3 = this.defaultValue) != null && !INSTANCE.b(str3, aVar.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && aVar.createdFrom == 1 && (str2 = aVar.defaultValue) != null && !INSTANCE.b(str2, this.defaultValue)) {
                return false;
            }
            int i7 = this.createdFrom;
            return (i7 == 0 || i7 != aVar.createdFrom || ((str = this.defaultValue) == null ? aVar.defaultValue == null : INSTANCE.b(str, aVar.defaultValue))) && this.affinity == aVar.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"La1/e$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lc1/g;", "database", BuildConfig.FLAVOR, "tableName", "La1/e;", "a", "(Lc1/g;Ljava/lang/String;)La1/e;", BuildConfig.FLAVOR, "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return f.f(database, tableName);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"La1/e$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "referenceTable", "onDelete", "onUpdate", BuildConfig.FLAVOR, "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/util/List;", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        public final String referenceTable;

        public final String onDelete;

        public final String onUpdate;

        public final List<String> columnNames;

        public final List<String> referenceColumnNames;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            Intrinsics.checkNotNullParameter(str, "referenceTable");
            Intrinsics.checkNotNullParameter(str2, "onDelete");
            Intrinsics.checkNotNullParameter(str3, "onUpdate");
            Intrinsics.checkNotNullParameter(list, "columnNames");
            Intrinsics.checkNotNullParameter(list2, "referenceColumnNames");
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            if (Intrinsics.b(this.referenceTable, cVar.referenceTable) && Intrinsics.b(this.onDelete, cVar.onDelete) && Intrinsics.b(this.onUpdate, cVar.onUpdate) && Intrinsics.b(this.columnNames, cVar.columnNames)) {
                return Intrinsics.b(this.referenceColumnNames, cVar.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"La1/e$d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", "sequence", BuildConfig.FLAVOR, "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "c", "(La1/e$d;)I", "d", "I", "f", "()I", "e", "getSequence", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "v", "g", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Comparable<d> {

        private final int id;

        private final int sequence;

        private final String from;

        private final String to;

        public d(int i7, int i8, String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "from");
            Intrinsics.checkNotNullParameter(str2, "to");
            this.id = i7;
            this.sequence = i8;
            this.from = str;
            this.to = str2;
        }

        @Override
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i7 = this.id - other.id;
            return i7 == 0 ? this.sequence - other.sequence : i7;
        }

        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTo() {
            return this.to;
        }
    }

    public e(String str, Map<String, a> map, Set<c> set, Set<C0064e> set2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(map, "columns");
        Intrinsics.checkNotNullParameter(set, "foreignKeys");
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    public static final e a(g gVar, String str) {
        return INSTANCE.a(gVar, str);
    }

    public boolean equals(Object other) {
        Set<C0064e> set;
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        if (!Intrinsics.b(this.name, eVar.name) || !Intrinsics.b(this.columns, eVar.columns) || !Intrinsics.b(this.foreignKeys, eVar.foreignKeys)) {
            return false;
        }
        Set<C0064e> set2 = this.indices;
        if (set2 == null || (set = eVar.indices) == null) {
            return true;
        }
        return Intrinsics.b(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"La1/e$e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "unique", BuildConfig.FLAVOR, "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "c", "Ljava/util/List;", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0064e {

        public final String name;

        public final boolean unique;

        public final List<String> columns;

        public List<String> orders;

        public C0064e(String str, boolean z7, List<String> list, List<String> list2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(list, "columns");
            Intrinsics.checkNotNullParameter(list2, "orders");
            this.name = str;
            this.unique = z7;
            this.columns = list;
            this.orders = list2;
            List<String> arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(l.ASC.name());
                }
            }
            this.orders = (List) arrayList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0064e)) {
                return false;
            }
            C0064e c0064e = (C0064e) other;
            if (this.unique == c0064e.unique && Intrinsics.b(this.columns, c0064e.columns) && Intrinsics.b(this.orders, c0064e.orders)) {
                return StringsKt.F(this.name, "index_", false, 2, (Object) null) ? StringsKt.F(c0064e.name, "index_", false, 2, (Object) null) : Intrinsics.b(this.name, c0064e.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.F(this.name, "index_", false, 2, (Object) null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }

        public C0064e(String str, boolean z7, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(list, "columns");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(l.ASC.name());
            }
            this(str, z7, list, arrayList);
        }
    }
}
