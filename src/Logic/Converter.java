package Logic;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    static Data data = new Data();

        //деление строки на слова и конвертирование в массив строк.
    public static String[] convertConsoleValueToArrayString(String consoleValue){
        return consoleValue.split(" ");
    }

        //конвертирование строки в число
    public static Integer convertStringToInteger(String value){
        return Integer.valueOf(value);
    }

        //конвертирование римских цифр в арабские.
    public static int convertRomanToArabic(String value){
        HashMap<Integer, String> romanNumbers = Romanian.romanian();
        int i = 0;

        for (Map.Entry<Integer, String> romanMap: romanNumbers.entrySet()){
            if (value.equals(romanMap.getValue())){
                i = romanMap.getKey();
            }
        }

        return i;
    }
        //конвертирование арабских в римские.
    public static String convertArabicToRoman(int value){
        HashMap<Integer, String> romanNumbers = Romanian.romanian();
        return romanNumbers.get(value);
    }

     /*   //конвертирует символ арифмитекой операции в вызов нужной функции.
    public static int convertCharToArithmeticOperation(String typeOperation, int firstValue, int secondValue){
        if (data.getTypeOperation().equals("+")){

        } else if (data.getTypeOperation().equals("-")){

        } else if (data.getTypeOperation().equals("*")){

        } else {

        }

    }
    */
}
