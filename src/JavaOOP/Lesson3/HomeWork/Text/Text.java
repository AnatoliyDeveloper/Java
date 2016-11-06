package JavaOOP.Lesson3.HomeWork.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Text {

    List <Sentence> text = new ArrayList<>();

    public Text addText(String input) {
        String[] divide = input.split(" ");
        Sentence sentence = new Sentence();
        for (String string : divide) {
            sentence.addWord(string);
        }
        text.add(sentence);
        return this;
    }

    public String printHeader() {
        return text.get(0).toString().toUpperCase();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < text.size(); i++) {
            result += text.get(i).toString() + "\n";
        }
        return result;
    }
}
