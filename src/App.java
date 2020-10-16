import java.io.IOException;

/**
* @author Pavel Konoplin
 */

public class App {

    public static void main(String[] args) throws IOException {
        App app = new App();

        Calculator.calculator();
        app.exitApp();

    }

    private void exitApp(){
        System.exit(0);
    }
}
