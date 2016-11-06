package JavaOOP.Lesson3.HomeWork.Text;

/**
 * Created by Anatoliy on 09.10.2016.
 */
/*
Создать  объект  класса Текст,  используя  классы  Предложение,  Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class TextRunner {

    public static void main(String[] args) {

        Text header = new Text();
        Text text = new Text();

        header.addText("Great Britain");

        text
                .addText("The British Isles lie in the north-west of Europe.")
                .addText("They consist of two large islands, Great Britain and Ireland, and many smaller ones.")
                .addText("Great Britain, the largest island in Europe, includes England, Scotland, and Wales.")
                .addText("It is separated from Ireland by the Irish Sea, and from the Continent by the English Channel and the Straits of Dover.")
                .addText("Great Britain and Northern Ireland form the United Kingdom (UK).");

        System.out.println(header.printHeader());
        System.out.println(text);
    }
}
