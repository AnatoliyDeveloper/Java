package JavaOOP.Lesson2.Record;

import java.util.Date;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public final class Record {

    private final String name;
    private final Date date = new Date();

    public Record(String name) {
        this.name = name;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Record{");
        sb.append("name='").append(name).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}

class RecordRunner {
    public static void main(String[] args) {
        Record record = new Record("Hello");
        System.out.println(record);

        Date date = record.getDate();
        date.setTime(0L);

        System.out.println(record);
    }
}
