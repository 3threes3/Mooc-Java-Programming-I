
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String team; 
        String home; 
        String road; 
        int homePoints; 
        int roadPoints; 
        int gamesPlayed = 0;
        int wins = 0; 
        int losses = 0;
        
        String splitData []; 
        
        System.out.println("File: ");
        String file = scanner.nextLine(); 
        System.out.println("Team: ");
        team = scanner.nextLine();
        
        try (Scanner scanner2 = new Scanner (Paths.get(file))){
            
            while (scanner2.hasNextLine()){ 
                splitData = scanner2.nextLine().split(","); 
                home = splitData[0];
                road = splitData[1];
                homePoints = Integer.valueOf(splitData[2]);
                roadPoints = Integer.valueOf(splitData[3]);
                if(home.equals(team)){
                    gamesPlayed++;
                    if (homePoints > roadPoints){ 
                        wins++;
                    } else { 
                        losses++;
                    }
                } else if(road.equals(team)){
                    gamesPlayed++;
                    if (roadPoints > homePoints){
                        wins++;
                    } else { 
                        losses++;
                    }
                }
            }
            
        } catch (Exception e){ 
            
        }
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
