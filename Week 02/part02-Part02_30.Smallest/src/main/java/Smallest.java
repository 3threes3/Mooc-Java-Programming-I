
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        int smallOne; 
        if (number1 > number2) {
            smallOne = number2;
        } else {
            smallOne = number1;
        }
        return smallOne;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
