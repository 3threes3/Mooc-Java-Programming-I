

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber (int times){
        for (int i = 0; i < times; i++){
            System.out.println(i + 1);
        }
    }

}
