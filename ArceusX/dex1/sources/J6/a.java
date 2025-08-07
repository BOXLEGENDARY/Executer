package J6;

import android.database.AbstractCursor;

public class a extends AbstractCursor {
    @Override
    public String[] getColumnNames() {
        return new String[]{"Payload"};
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public double getDouble(int i7) {
        return 0.0d;
    }

    @Override
    public float getFloat(int i7) {
        return 0.0f;
    }

    @Override
    public int getInt(int i7) {
        return 0;
    }

    @Override
    public long getLong(int i7) {
        return 0L;
    }

    @Override
    public short getShort(int i7) {
        return (short) 0;
    }

    @Override
    public String getString(int i7) {
        return null;
    }

    @Override
    public boolean isNull(int i7) {
        return false;
    }
}
