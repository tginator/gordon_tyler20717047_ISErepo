import java.util.*;

public class Converters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Please choose a function: ");
        System.out.println("1. Convert text to upper case or lower case");
        System.out.println("2. Identify whether numeric values are in a given string.");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Please choose to convert to upper or lower case: ");
            System.out.println("1. Lower case to upper case.");
            System.out.println("2. Upper case to lower case.");
            int select;
            select = sc.nextInt();

            if (select == 1) {
                String txt;
                txt = lowerCase();

                System.out.println(txt.toUpperCase());
            }

            if (select == 2) {
                String txt2;
                txt2 = upperCase();

                System.out.println(txt2.toLowerCase());
            }
        }
        if (choice == 2) {

            if(isNumeric()) {
                System.out.println("String is numeric!");

            } else {
                System.out.println("String is not numeric.");
            }
        }
    }

    public static String lowerCase() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to upper case.");

        String txt;
        txt = sc.nextLine();
        return txt;

    }

    public static String upperCase() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a text that you wish to be converted to lower case: ");


        String txt2;
        txt2 = sc.nextLine();
        return txt2;

    }

    public static boolean isNumeric() {
        int intValue;
        Scanner sc = new Scanner(System.in);

        String string;
        string = sc.nextLine();

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if (string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}


