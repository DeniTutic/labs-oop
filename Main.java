
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        myName();
        helloWorld();
        int seconds = secondsInOneYear();
        System.out.println("In 1 year there are " + seconds + " seconds");
        int day = secondsInOneDay();
        System.out.println("In 1 day there are " + day + " seconds");
        sumaDvaBrojaOdUsera();
        pozIliNeg();
        veciBrojevi();
    }
// moje ime
    public static void myName() {
        System.out.println("My name is Deni Tutic");
    }
    // hello world
    public static void helloWorld() {
        System.out.println("Hello World!");
        System.out.println(" (And all the people of the World!");
    }
    // sekunde u godini
    public static int secondsInOneYear() {
        int secsInMin = 60;
        int minsInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        int total = secsInMin * minsInHour * hoursInDay * daysInYear;

        return total;
    }
    // dodatno sekunde u danu
    public static int secondsInOneDay() {
        int secsInMin = 60;
        int minsInHour = 60;
        int hoursInDay = 24;

        int perDay = secsInMin * minsInHour * hoursInDay;
        return perDay;
    }
    //2 inputa od usera i sum
    public static void sumaDvaBrojaOdUsera() {
        Scanner scanner = new Scanner(System.in);

        //prvi broj
    System.out.println("Enter the first integer: ");
    int prvi = scanner.nextInt();

    // drugi broj
        System.out.println("Enter the second integer: ");
    int drugi = scanner.nextInt();

    // suma
    int sum = prvi + drugi;

    // Print sumu
        System.out.println("The sum of the two integers is: " + sum);
    }
 // jel broj pozitivan ili negativan
    public static void pozIliNeg() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int broj = scanner.nextInt();
        //kondicional
        if (broj > 0) {
            System.out.println("The number is positive");
        } else if (broj < 0) {
            System.out.println("The number is negative");
        } else {
                System.out.println("The number is zero");
            }
    }
    // veci broj od 2 data od usera
    public static void veciBrojevi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int prvi = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int drugi = scanner.nextInt();
        if (drugi > prvi) {
            System.out.println("The bigger number is " + drugi);
        } else if (drugi < prvi) {
            System.out.println("The smaller number is " + prvi);
        } else {
            System.out.println("The numbers are equal");
        }

    }
}


//provjeravam github desktop sa profesorom
// proba opet