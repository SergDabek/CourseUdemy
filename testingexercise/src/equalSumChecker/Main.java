package equalSumChecker;

public class Main {

    public static void main(String[] args) {

        EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println("False");
        EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println("True");
        EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println("True");
    }
}
