package Logic;

public class Error {

                //Ошибка пустой строки
    static void stringIsEmpty(){
        System.out.print("Вы ввели пустую строку!");
        exitApp();
    }
                //Ошибка при введение не коректного значения.
    public static void errorValue(){
        System.out.println("Введено не верное значение!");
        exitApp();
    }
                //выход из приложения
    public static void exitApp(){
        System.exit(0);
    }
}
