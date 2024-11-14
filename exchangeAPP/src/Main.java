import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        PrintScreen print = new PrintScreen();

        String coinA = "";
        double valueA = 0;
        String coinB = "";
        double valueB = 0;

        String option = "";
        boolean optionValid = true;
        boolean menu1 = true;

        label:
        while (true) {

            if (menu1) {
                System.out.println(print.getScreen("MENU 1"));
                menu1 = false;
            } else {
                System.out.println(print.getScreen("MENU 2"));
            }

            System.out.println(print.getScreen("OPÇÃO"));

            try {
                option = scanner.next();
            } catch (Exception e) {
                System.out.println("\nERRO\n");
                throw new RuntimeException(e);
            }

            switch (option) {
                case "1":
                    coinA = "USD";
                    coinB = "ARS";

                    break;
                case "2":
                    coinA = "ARS";
                    coinB = "USD";

                    break;
                case "3":
                    coinA = "USD";
                    coinB = "BRL";

                    break;
                case "4":
                    coinA = "BRL";
                    coinB = "USD";

                    break;
                case "5":
                    coinA = "USD";
                    coinB = "CLP";

                    break;
                case "6":
                    coinA = "CLP";
                    coinB = "USD";

                    break;
                case "7":
                    coinA = "BRL";
                    coinB = "CLP";

                    break;
                case "8":
                    coinA = "CLP";
                    coinB = "BRL";

                    break;
                case "9":
                    System.out.println(print.getScreen("ADEUS"));
                    break label;

                default:
                    System.out.println(print.getScreen("OPÇÃO INVÁLIDA"));
                    optionValid = false;

                    break;
            }

            if (optionValid) {

                System.out.println(print.getScreen("VALOR"));

                try {
                    valueA = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("\nERRO\n");
                    throw new RuntimeException(e);
                }

                Request request = new Request(coinA);

                valueB = valueA * (request.gettingRequest().returnCoin(coinB));

                System.out.println(print.getScreenConvert(coinA, coinB, valueA, valueB));

            }
        }

    }
}