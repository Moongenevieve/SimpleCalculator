import java.text.NumberFormat;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        final byte varMonths = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = scanner.nextLine().trim();
        System.out.println(name + ", welcome");
        int varPrincipal = 0;
        boolean validInput = false;
            while (!validInput) {
                System.out.print("Principal: ");

                if (scanner.hasNextInt()) {
                    varPrincipal = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid Principal.");
                    scanner.next(); // Clear the invalid input
                }
            }

        float varRate = 0;
        boolean validInput2 = false;
            while (!validInput2) {
                System.out.print("Annual Interest Rate: ");

                if (scanner.hasNextFloat()) {
                    varRate = scanner.nextFloat();
                    validInput2 = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid Rate.");
                    scanner.next(); // Clear the invalid input
                }
            }



    int varPeriod = 0;
    boolean validInput3 = false;
            while (!validInput3) {
        System.out.print("Period (Years): ");

        if (scanner.hasNextInt()) {
            varPeriod = scanner.nextInt();
            validInput3 = true;
        } else {
            System.out.println("Invalid input. Please enter number of years.");
            scanner.next(); // Clear the invalid input
        }
    }

        double varRealRate = varRate / (varMonths * 100);
        double varRealPeriod = varPeriod * varMonths;
        double varMortage = varPrincipal * ((varRealRate * Math.pow((1 + varRealRate), varRealPeriod)) /
                (Math.pow((1 + varRealRate), varRealPeriod) - 1));

        String varFormattedMortgage = NumberFormat.getCurrencyInstance().format(varMortage);
        System.out.println("Your Mortgage is: " + varFormattedMortgage);


    }
}