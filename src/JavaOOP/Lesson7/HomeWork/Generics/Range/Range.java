package JavaOOP.Lesson7.HomeWork.Generics.Range;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Range<T extends Number> {
    private T range;

    public Range(T start, T end) {
        if (end.doubleValue() < start.doubleValue()) {
            System.out.println("Range is incorrect!!!");
        } else if (start instanceof Integer) this.range = (T) new Integer(end.intValue() - start.intValue());
        else if (start instanceof Long) this.range = (T) new Long(end.longValue() - start.longValue());
        else if (start instanceof Float) this.range = (T) new Float(end.floatValue() - start.floatValue());
        else this.range = (T) new Double(end.doubleValue() - start.doubleValue());
    }

    public T getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "range=" + range +
                '}';
    }
}
