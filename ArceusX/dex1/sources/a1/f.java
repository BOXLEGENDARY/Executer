package a1;

import a1.e;
import android.database.Cursor;
import c1.g;
import com.github.luben.zstd.BuildConfig;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lc1/g;", "database", BuildConfig.FLAVOR, "tableName", "La1/e;", "f", "(Lc1/g;Ljava/lang/String;)La1/e;", BuildConfig.FLAVOR, "La1/e$c;", "c", "(Lc1/g;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", BuildConfig.FLAVOR, "La1/e$d;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", BuildConfig.FLAVOR, "La1/e$a;", "a", "(Lc1/g;Ljava/lang/String;)Ljava/util/Map;", "La1/e$e;", "e", "name", BuildConfig.FLAVOR, "unique", "d", "(Lc1/g;Ljava/lang/String;Z)La1/e$e;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    private static final Map<String, e.a> a(g gVar, String str) {
        Cursor cursorQ0 = gVar.q0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQ0.getColumnCount() <= 0) {
                Map<String, e.a> mapH = F.h();
                X9.c.a(cursorQ0, (Throwable) null);
                return mapH;
            }
            int columnIndex = cursorQ0.getColumnIndex("name");
            int columnIndex2 = cursorQ0.getColumnIndex("type");
            int columnIndex3 = cursorQ0.getColumnIndex("notnull");
            int columnIndex4 = cursorQ0.getColumnIndex("pk");
            int columnIndex5 = cursorQ0.getColumnIndex("dflt_value");
            Map mapC = F.c();
            while (cursorQ0.moveToNext()) {
                String string = cursorQ0.getString(columnIndex);
                String string2 = cursorQ0.getString(columnIndex2);
                boolean z7 = cursorQ0.getInt(columnIndex3) != 0;
                int i7 = cursorQ0.getInt(columnIndex4);
                String string3 = cursorQ0.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(string, "name");
                Intrinsics.checkNotNullExpressionValue(string2, "type");
                mapC.put(string, new e.a(string, string2, z7, i7, string3, 2));
            }
            Map<String, e.a> mapB = F.b(mapC);
            X9.c.a(cursorQ0, (Throwable) null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                X9.c.a(cursorQ0, th);
                throw th2;
            }
        }
    }

    private static final List<e.d> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = CollectionsKt.c();
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i8 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i7, i8, string, string2));
        }
        return CollectionsKt.j0(CollectionsKt.a(listC));
    }

    private static final Set<e.c> c(g gVar, String str) {
        Cursor cursorQ0 = gVar.q0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQ0.getColumnIndex("id");
            int columnIndex2 = cursorQ0.getColumnIndex(YGBtcyQ.kOnMSnViKRtvmC);
            int columnIndex3 = cursorQ0.getColumnIndex("table");
            int columnIndex4 = cursorQ0.getColumnIndex("on_delete");
            int columnIndex5 = cursorQ0.getColumnIndex("on_update");
            List<e.d> listB = b(cursorQ0);
            cursorQ0.moveToPosition(-1);
            Set setB = L.b();
            while (cursorQ0.moveToNext()) {
                if (cursorQ0.getInt(columnIndex2) == 0) {
                    int i7 = cursorQ0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).getId() == i7) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.getFrom());
                        arrayList2.add(dVar.getTo());
                    }
                    String string = cursorQ0.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorQ0.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorQ0.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<e.c> setA = L.a(setB);
            X9.c.a(cursorQ0, (Throwable) null);
            return setA;
        } finally {
        }
    }

    private static final e.C0064e d(g gVar, String str, boolean z7) {
        Cursor cursorQ0 = gVar.q0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQ0.getColumnIndex("seqno");
            int columnIndex2 = cursorQ0.getColumnIndex("cid");
            int columnIndex3 = cursorQ0.getColumnIndex("name");
            int columnIndex4 = cursorQ0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQ0.moveToNext()) {
                    if (cursorQ0.getInt(columnIndex2) >= 0) {
                        int i7 = cursorQ0.getInt(columnIndex);
                        String string = cursorQ0.getString(columnIndex3);
                        String str2 = cursorQ0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i7);
                        Intrinsics.checkNotNullExpressionValue(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listR0 = CollectionsKt.r0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                e.C0064e c0064e = new e.C0064e(str, z7, listR0, CollectionsKt.r0(collectionValues2));
                X9.c.a(cursorQ0, (Throwable) null);
                return c0064e;
            }
            X9.c.a(cursorQ0, (Throwable) null);
            return null;
        } finally {
        }
    }

    private static final Set<e.C0064e> e(g gVar, String str) {
        Cursor cursorQ0 = gVar.q0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQ0.getColumnIndex("name");
            int columnIndex2 = cursorQ0.getColumnIndex("origin");
            int columnIndex3 = cursorQ0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = L.b();
                while (cursorQ0.moveToNext()) {
                    if (Intrinsics.b("c", cursorQ0.getString(columnIndex2))) {
                        String string = cursorQ0.getString(columnIndex);
                        boolean z7 = true;
                        if (cursorQ0.getInt(columnIndex3) != 1) {
                            z7 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(string, "name");
                        e.C0064e c0064eD = d(gVar, string, z7);
                        if (c0064eD == null) {
                            X9.c.a(cursorQ0, (Throwable) null);
                            return null;
                        }
                        setB.add(c0064eD);
                    }
                }
                Set<e.C0064e> setA = L.a(setB);
                X9.c.a(cursorQ0, (Throwable) null);
                return setA;
            }
            X9.c.a(cursorQ0, (Throwable) null);
            return null;
        } finally {
        }
    }

    public static final e f(g gVar, String str) {
        Intrinsics.checkNotNullParameter(gVar, "database");
        Intrinsics.checkNotNullParameter(str, "tableName");
        return new e(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
