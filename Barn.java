import animal.Cow;
import animal.Chicken;

import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Cow> cows = new ArrayList<>();
            ArrayList<Chicken> chickens = new ArrayList<>();
            
            System.out.print("How many animals in the barn? ");
            int num = Integer.parseInt(scanner.nextLine());
            
            for (int i = 1; i <= num; i++) {
                System.out.print("\nEnter animal #" + i + " type (cow/chicken): ");
                String type = scanner.nextLine().trim().toLowerCase();
                
                switch (type) {
                    case "cow" -> {
                        System.out.print("Enter milk per day for cow: ");
                        int milk = Integer.parseInt(scanner.nextLine());
                        cows.add(new Cow(milk));
                    }
                    case "chicken" -> {
                        System.out.print("Enter egg color for chicken: ");
                        String color = scanner.nextLine();
                        chickens.add(new Chicken(color));
                    }
                    default -> System.out.println("Invalid animal type. Skipping...");
                }
            }
            
            System.out.println("\n--- All Cows ---");
            for (Cow cow : cows) {
                System.out.println(cow.getDetails());
            }
            
            System.out.println("\n--- All Chickens ---");
            for (Chicken chicken : chickens) {
                System.out.println(chicken.getDetails());
            }
        }
    }
}