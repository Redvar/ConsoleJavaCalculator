package Logic;

public class Error {

    static void exitApp(){
        System.exit(0);
    }

    static void stringIsEmpty(){
        System.out.print("Вы ввели пустую строку!");
        exitApp();
    }

    public static void errorValue(){
        System.out.println("Введено не верное значение!");
        exitApp();
    }
}
