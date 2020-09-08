
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int cookingTime = -1;
        int counter = 0;
        String tempIngredient;
        ArrayList<String> ingredients = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                if (counter == 0) {
                    name = scan.nextLine();
                    counter++;
                } else if (counter == 1) {
                    cookingTime = Integer.valueOf(scan.nextLine());
                    counter++;
                } else if (counter > 1) {
                    tempIngredient = scan.nextLine();
                    if (tempIngredient.equals("")) {
                        ArrayList<String> temp = (ArrayList<String>) ingredients.clone();
                        recipes.add(new Recipe(name, cookingTime, temp));
                        name = "";
                        cookingTime = -1;
                        ingredients.clear();
                        tempIngredient = "";
                        counter = 0;
                    } else {
                        ingredients.add(tempIngredient);
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        ArrayList<String> temp = (ArrayList<String>) ingredients.clone();
        recipes.add(new Recipe(name, cookingTime, temp));

        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        String command = "";
        while (!(command.equals("stop"))) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            if (command.equalsIgnoreCase("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe iterator : recipes) {
                    System.out.println(iterator);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String lookingFor = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe iterator : recipes) {
                    if (iterator.getName().contains(lookingFor)) {
                        System.out.println(iterator);
                    }
                }
            } else if (command.equals("find cooking time")){ 
                System.out.print("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe iterator : recipes) {
                    if (iterator.getCookingTime() <= max) {
                        System.out.println(iterator);
                    }
                }
            } else if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingToFind = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe iterator : recipes) {
                    if (iterator.getIngredients().contains(ingToFind)) {
                        System.out.println(iterator);
                    }
                }
            }
            System.out.println("");
        }

    }

}
