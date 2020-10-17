import java.io.IOException;

/**
* @author Pavel Konoplin
 */

public class App {

    public static void main(String[] args) throws IOException {
        App app = new App();
            //Запуск приложения
        Calculator.calculator();
            //Выход из приложения
        app.exitApp();

    }

    private void exitApp(){
        System.exit(0);
    }
}
