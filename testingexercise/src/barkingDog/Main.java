package barkingDog;

public class Main {

    public static void main(String[] args) {


        BarkingDog.shouldWakeUp(true,1);
        System.out.println("True");
        BarkingDog.shouldWakeUp(false,2);
        System.out.println("Dog is not bakring");
        BarkingDog.shouldWakeUp(true,8);
        System.out.println("False");
        BarkingDog.shouldWakeUp(true,1);
        System.out.println("False");
        BarkingDog.shouldWakeUp(false,-5);
        System.out.println("False");
    }
}
