public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        if(hasEqualSum(1,1,2)){
            System.out.println("Addition of number1 and number2 is equal to number3.");
        }else{
            System.out.println("Addition of number1 and number2 is not equal to number3.");
        }

    }
    public static boolean hasEqualSum(int number1, int number2, int number3){
        //addition of number1 and number2 is equal to number3, it returns true.
        int number = number1 + number2;
        if(number == number3){
            //if true.
            return true;
        }
        // if false.
        return false;
    }
}