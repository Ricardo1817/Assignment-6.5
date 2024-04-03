import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3 numbers seperated by a space (1 2 3): ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        displaySortedNumbers( num1, num2, num3);

    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp; 

        if (num2 < num1 && num2 < num3){
            temp = num1;
            num1 = num2; 
            num2 = temp; 
        }
        else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
        }
    }
