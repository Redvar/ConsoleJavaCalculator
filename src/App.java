import Logic.Error;

import java.io.IOException;

/**
* @author Pavel Konoplin
 */

public class App {

    public static void main(String[] args) throws IOException {
            //Запуск приложения
        System.out.println("Данная программа принимает, как римские так и арабские цифры.");
        System.out.println("При вводе у вас обязательно должны стоять пробелы. Пример: 5 + 3 , VI + III .");
        Calculator.calculator();
            //Выход из приложения
        Error.exitApp();

    }
}
