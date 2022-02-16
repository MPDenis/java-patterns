package com;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Решение задач с Код Ворс
 */

public class Main {

    public static void main(String[] args) {
        getXO("ohjfePOxxOOocswxxoxtggx");
    }

    /**
     * Узнать колличество вхождение гласных букв, кроме "У" в подаваемом значении.
     * @param str
     * @return
     */

    public static int getCount(String str) {
        int vowelsCount = 0;
        //превращаем стоку в INTовый стрим где каждый int это char в кодировке, затем превращаем(mapToObj) int в char и коллетим это в список
        List<Character> characters = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        for (int i = 0; i < characters.size() ; i++) {
            Character current = characters.get(i);
            if(current == 'a' || current == 'o' || current == 'e'|| current == 'i' || current == 'U') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static long getCount2(String str) {
        var res = str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
        //indexOf(ch) возвращает -1, если значение ch не найдено в строке (в данном случае"aeiou"), иначе оно вернет позицию
        return res;
    }



    //------------------------------------------------------------------------------------------------------------------

    /**
     *  Узнать есть ли одинаковое колличество вхождений символов в строку
     *  "есть ли в строке одинаковое количество " x " и "o". Метод должен возвращать логическое значение
     *  и не учитывать регистр. Строка может содержать любой символ."
     *
     *  XO("ooxx") => true
     * XO("xooxx") => false
     * XO("ooxXm") => true
     * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
     * XO("zzoo") => false
     *
     * Примеры ввода/вывода:
     */


    public static boolean getXO (String str) {
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;

    }

    public static boolean getXO1 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }


    //------------------------------------------------------------------------------------------------------------------

}
