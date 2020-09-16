
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        // Reading of input stops when the user enters the number -1. Numbers that are not within 
        // the interval [0-100] should not be taken into account when calculating the statistics.
        
        int newOne = 0; 
        int total = 0; 
        int count = 0;
        int totalPassing = 0;
        int countPassing = 0;
        double avg; 
        double avgPassing;
        double passPercentage;
        int zero = 0; 
        int one = 0; 
        int two = 0; 
        int three = 0; 
        int four = 0; 
        int five = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true){ 
            newOne = Integer.valueOf(scan.nextLine());
            if(newOne >= 0 && newOne <= 100){
                total += newOne;
                count++;
                if(newOne >= 50 && newOne <= 100){
                    totalPassing += newOne;
                    countPassing++;
                }
                if(newOne >= 0 && newOne <= 49){
                    zero++;
                } else if (newOne >= 50 && newOne <= 59){ 
                    one++;
                } else if (newOne >= 60 && newOne <= 69){ 
                    two++;
                } else if (newOne >= 70 && newOne <= 79){ 
                    three++;
                } else if (newOne >= 80 && newOne <= 89){ 
                    four++;
                } else {
                    five++;
                }
            } else if (newOne == -1){ 
                break;
            }
        }
        
        avg = 1.0 * total / count;
        avgPassing = 1.0 * totalPassing / countPassing;
        passPercentage = 100.0 * countPassing / count;
        
        
        System.out.println("Point average (all): " + avg);
        
        if (countPassing > 0){ 
            System.out.println("Point average (passing): " + avgPassing);
        } else { 
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + passPercentage);
        
        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(five));
        System.out.println("4: " + printStars(four));
        System.out.println("3: " + printStars(three));
        System.out.println("2: " + printStars(two));
        System.out.println("1: " + printStars(one));
        System.out.println("0: " + printStars(zero));
       
    }
    
    public static String printStars (int starsToPrint){
        String stars = "";
        for (int i = 0; i < starsToPrint; i++){ 
            stars += "*";
        }
        return stars;
    }
    
    
}
