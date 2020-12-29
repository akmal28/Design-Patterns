package AbstractFactoryPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoFactoryException {
        AbstractFactory factory;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "RedCircle":
                    factory = new RedCircleFactory();
                    break;
                case "BlueSquare":
                    factory = new BlueSquareFactory();
                    break;
                case "GreenRectangle":
                    factory = new GreenRectangleFactory();
                    break;
                default:
                    throw new NoFactoryException("Unknown Factory");
            }

            App app = new App(factory);
            app.create();
            app.show();
        }


    }
}
