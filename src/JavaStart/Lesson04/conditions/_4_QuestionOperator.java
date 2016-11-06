package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_QuestionOperator {
    public static void main(String[] args) {
        int x = 10;

        // (условие) ? (значение-да) : (значение-нет)
        String message = (x < 100) ? "Yes" : "No";
        System.out.println(message);

        //--------------------------------------------------

        if (x < 100) {
            message = "Yes";
        } else {
            message = "No";
        }
        System.out.println(message);
    }

}
