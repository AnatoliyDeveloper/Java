package JavaOOP.Lesson10.HomeWork.common;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class StringJoiner {

    private final String delimiter;

    public StringJoiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(Object... elems) {
        StringBuilder res = new StringBuilder();
        for (Object elem : elems) {
            res.append(elem).append(delimiter);
        }
        deleteLastDelimiter(res);

        return res.toString();
    }

    private StringBuilder deleteLastDelimiter(StringBuilder res) {
        return res.delete(res.length() - delimiter.length(), res.length());
    }
}
