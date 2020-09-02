
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int aux = size;
        for (int i = 0; i < size; i++){ 
            printSpaces(aux - 1);
            aux--; 
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = 1;
        int spaces = height -1;
        for (int i = 0; i < height; i++){
            printSpaces(spaces);
            printStars(stars);
            spaces = spaces - 1;
            stars = stars + 2;            
        }
        printSpaces(height-2); 
        printStars(3);
        printSpaces(height-2); 
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
