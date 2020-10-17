package Logic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Converter {
    private final static TreeMap<Integer, String> romanMap = new TreeMap<>();

    static {
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }

    //деление строки на слова и конвертирование в массив строк.
    public static String[] convertConsoleValueToArrayString(String consoleValue) {
        return consoleValue.split(" ");
    }

    //конвертирование строки в число
    public static Integer convertStringToInteger(String value) {
        return Integer.valueOf(value);
    }

    //конвертирование римских цифр в арабские.
    public static int convertRomanToArabic(String value) {
        HashMap<Integer, String> romanNumbers = Romanian.romanian();
        int i = 0;

        for (Map.Entry<Integer, String> romanMap : romanNumbers.entrySet()) {
            if (value.equals(romanMap.getValue())) {
                i = romanMap.getKey();
            }
        }

        return i;
    }
         //конвертирование арабских в римские
    public static String convertArabicToRoman(int number) {
        int l =  romanMap.floorKey(number);
        if ( number == l ) {
            return romanMap.get(number);
        }
        return romanMap.get(l) + convertArabicToRoman(number-l);
    }
}
