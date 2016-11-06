package JavaOOP.Lesson3.HomeWork.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Sentence {

    private List <Word> sentence = new ArrayList<>();

    public void addWord(String word) {
        sentence.add(new Word(word));
    }

    @Override
    public String toString() {
        String result = "";
        for (Word word : sentence){
            result += word.getWord() + " ";
        }
        return result;
    }
}
