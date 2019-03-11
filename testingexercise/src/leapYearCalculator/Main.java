package leapYearCalculator;

public class Main {

    public static void main(String[] args) {


        LeapYear.isLeapYear(-1600);
        System.out.println("False");
        LeapYear.isLeapYear(1600);
        System.out.println("True");
        LeapYear.isLeapYear(2017);
        System.out.println("False");
        LeapYear.isLeapYear(2000);
        System.out.println("True");
    }
}
