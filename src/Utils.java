import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner((System.in));

    public static String getInput(String prompt) {
        System.out.print(prompt);
        String response = sc.nextLine();

        return response;
    }

    public static int getNumber(String prompt) {
        int number = 0;
        String response = getInput(prompt);
        do {
            try {
                number = Integer.parseInt(response);
                System.out.println(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        while (true);
        return number;
    }

    public static int getNumber(String prompt, int maxValue) {
        int number;
        do {
            number = getNumber(prompt);
        }
        while (number > maxValue || number < 0);

        return number;
    }


    public static void main(String[] args) {

        int menuOption = getNumber("Enter menu option: ");
        switch (menuOption) {

        }
    }
}