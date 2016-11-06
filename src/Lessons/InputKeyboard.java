package Lessons;

import java.util.Scanner;

/**
 * Created by Anatoliy on 27.08.2016.
 */
public class InputKeyboard
{
/*
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String name = bufferedReader.readLine(); //читаем строку с клавиатуры
    String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
    int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
*/
    /*
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    String sAge = reader.readLine();
    int nAge = Integer.parseInt(sAge);
*/
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int age = scanner.nextInt();

    System.out.println("My name is " + name + "." + "\n" + "Me " + age + " years old.");
}

}
