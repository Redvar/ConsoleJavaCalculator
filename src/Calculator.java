import ArifmeticMethod.*;
import Logic.*;
import Logic.Error;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static String consoleValue;
    static  String[] stringArrayConsoleValue;
    static int result;
    static void calculator() throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        Data data = new Data();

        consoleValue = consoleReader.readLine();    //считываем данные с консоли
        Check.valueIsEmpty(consoleValue); //Проверка строку на пустоту

        stringArrayConsoleValue = Converter.convertConsoleValueToArrayString(consoleValue); //делим строку по пробелам и помещаем в массив

                //Проверяем арифмитический оператор на корректность.
        try {
            if (Check.correctTypeOperation(stringArrayConsoleValue[1])) {
                data.setTypeOperation(stringArrayConsoleValue[1]);
            } else {
                Error.errorValue();
            }
        } catch (ArrayIndexOutOfBoundsException e ) {
            Error.errorValue();
        }
                    //Проверяем тип чисел, диапазон и добавляем в DATA.
        int firstValue;
        int secondValue;

        if (Check.numberTypeArabic(stringArrayConsoleValue[0], stringArrayConsoleValue[2])){//если числа арабские
            firstValue = Converter.convertStringToInteger(stringArrayConsoleValue[0]);
            secondValue = Converter.convertStringToInteger(stringArrayConsoleValue[2]);
            data.setTypeValueRomanian(false);
            if (Check.checkRangeNumbers(firstValue, secondValue)) { //Проверка диапазона
                data.setFirstValue(firstValue);
                data.setSecondValue(secondValue);
            }
        } else if (Check.numberTypeRoman(stringArrayConsoleValue[0], stringArrayConsoleValue[2])){ //если числа римские
            firstValue = Converter.convertRomanToArabic(stringArrayConsoleValue[0]);
            secondValue = Converter.convertRomanToArabic(stringArrayConsoleValue[2]);
            data.setTypeValueRomanian(true);
            if (Check.checkRangeNumbers(firstValue, secondValue)) { //Проверка диапазона
                data.setFirstValue(firstValue);
                data.setSecondValue(secondValue);
            }
        } else {
            Error.errorValue();
        }
                    //Проверка арифмитического оператора и вычесление результата.

        try {
            switch (data.getTypeOperation()) {
                case "+":
                    result = Addition.addition(data.getFirstValue(), data.getSecondValue());
                    break;
                case "-":
                    result = Subtraction.subtraction(data.getFirstValue(), data.getSecondValue());
                    break;
                case "*":
                    result = Multiplication.multiplication(data.getFirstValue(), data.getSecondValue());
                    break;
                default:
                    result = Division.division(data.getFirstValue(), data.getSecondValue());
                    break;
            }
        } catch (ArithmeticException e) {
            Error.errorValue();
        } catch (NullPointerException e){
            System.out.println("Деление на ноль ЗАПРЕЩЕНО.");
        }
                //Если числа были введены в римских цифра, ковретирует в такой же формат.
        if (data.getTypeValueRomanian()){
            System.out.println(Converter.convertArabicToRoman(result));
        }else {
            System.out.println(result);
        }

    }
}
