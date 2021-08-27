import java.io.*;
import java.util.Scanner;

public class CCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String c[] = { "Espresso Tea", "Cappucino Tea", "Latte Tea" };
        String[] t = { "Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom tea", "Masala Tea", "Lemon Tea", "Green Tea",
                "Organic Darjeeling Tea" };
        String[] s = { "Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup" };
        String[] b = { "Hot xocolate Drink", "Badam Drink", "Badam-Pista Drink" };
        char x = scn.next().charAt(0);
        int op = scn.nextInt();
        op -= 1;
        System.out.println(c[op]);

        if (x == 'c' || x == 't' || x == 's' || x == 'b') {
            System.out.println("Welcome to CCD!");
            if (x == 'c') {

                System.out.println("Enjoy your : " + c[0]);

            } else if (x == 't') {
                System.out.println("Enjoy your : " + t[op]);
            } else if (x == 's') {
                System.out.println("Enjoy your : " + s[op]);
            } else if (x == 'b') {
                System.out.println("Enjoy your : " + b[op]);
            }
        } else {
            System.out.println("Invalid Output");
        }
    }
}
