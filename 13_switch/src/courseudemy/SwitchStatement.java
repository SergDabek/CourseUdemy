package courseudemy;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
        }

        char charValue = 'C';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "JuNE";
        switch (month.toLowerCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;

            case "JUNE":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}

