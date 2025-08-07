package com.google.gson.internal.sql;

import com.google.gson.A;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.z;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends z<Timestamp> {
    static final A FACTORY = new A() {
        @Override
        public <T> z<T> create(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(fVar.n(Date.class));
            }
            return null;
        }
    };
    private final z<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(z<Date> zVar) {
        this.dateTypeAdapter = zVar;
    }

    @Override
    public Timestamp read(JsonReader jsonReader) throws IOException {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
