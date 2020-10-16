package Logic;


import java.util.HashMap;
import java.util.Map;

public class Check {


        //Проверка строки на пустоту
    public static void valueIsEmpty(String value) {
        if (value.length() == 0)
            Error.stringIsEmpty();
    }

                    //Проверка значения на римский тип.
    public static Boolean numberTypeRoman(String firstValue, String secondValue) {
        HashMap<Integer, String> romanNumbers = Romanian.romanian();
        String[] consoleValueArray = new String[]{firstValue, secondValue};
        int numbersFound = 0;

        for (int i = 0; i < 2; i ++){
            for (Map.Entry<Integer, String> romanMap: romanNumbers.entrySet()){
                if (consoleValueArray[i].equals(romanMap.getValue())){
                    numbersFound++;
                }
            }
        }

        if (numbersFound == 2) {
            return true;
        } else{
            return false;
        }
    }

                //Проверка значений на арабский тип.
    public static Boolean numberTypeArabic(String firstValue, String secondValue){
        String[] arabicStringArray = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] consoleValueArray = new String[]{firstValue, secondValue};
        int numberFound = 0;

        for (String c : consoleValueArray){
            for (String a : arabicStringArray) {
                if (c.equals(a)) {
                    numberFound++;
                }
            }
        }

        if (numberFound == 2){
            return true;
        } else {
            return false;
        }
    }

                //Проверка арифмитического оператора.
    public static Boolean correctTypeOperation(String typeOperation) {
        if (typeOperation.equals("+")) {
            return true;
        } else if (typeOperation.equals("-")) {
            return true;
        } else if (typeOperation.equals("*")) {
            return true;
        } else if (typeOperation.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

            //Проверка диапазона чисел от 0 до 10
    public static Boolean checkRangeNumbers (int firstValue, int secondValue){
        if (firstValue >= 0 & firstValue < 11 & secondValue >=0 & secondValue < 11){
            return true;
        } else {
            return false;
        }
    }

}
