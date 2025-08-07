package a1;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0001\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroid/database/Cursor;", "c", "a", "(Landroid/database/Cursor;)Landroid/database/Cursor;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "(Landroid/database/Cursor;Ljava/lang/String;)I", "d", "cursor", "b", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final Cursor a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i7 = 0; i7 < columnCount; i7++) {
                    int type = cursor.getType(i7);
                    if (type == 0) {
                        objArr[i7] = null;
                    } else if (type == 1) {
                        objArr[i7] = Long.valueOf(cursor.getLong(i7));
                    } else if (type == 2) {
                        objArr[i7] = Double.valueOf(cursor.getDouble(i7));
                    } else if (type == 3) {
                        objArr[i7] = cursor.getString(i7);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i7] = cursor.getBlob(i7);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            X9.c.a(cursor, (Throwable) null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor cursor, String str) {
        Intrinsics.checkNotNullParameter(cursor, "c");
        Intrinsics.checkNotNullParameter(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int d(Cursor cursor, String str) {
        String strL;
        Intrinsics.checkNotNullParameter(cursor, "c");
        Intrinsics.checkNotNullParameter(str, "name");
        int iC = c(cursor, str);
        if (iC >= 0) {
            return iC;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            strL = i.L(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            strL = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strL);
    }
}
