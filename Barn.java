import animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
  @SuppressWarnings("FieldMayBeFinal")
  private static Scanner input = new Scanner(System.in);
  @SuppressWarnings("FieldMayBeFinal")
  private static ArrayList<Cow> cows = new ArrayList<>();
  @SuppressWarnings("FieldMayBeFinal")
  private static ArrayList<Chicken> chickens = new ArrayList<>();

  @SuppressWarnings("ConvertToStringSwitch")
  public static void main(String[] args) {
    System.out.print("How many animals in the barn? ");
    int count = Integer.parseInt(input.nextLine());

    for (int i = 0; i < count; i++) {
      System.out.print("\nEnter animal #" + (i + 1) + " type (cow/chicken): ");
      String type = input.nextLine().trim().toLowerCase();

      if (type.equals("cow")) {
        System.out.print("Enter milk per day for cow: ");
        int milk = Integer.parseInt(input.nextLine());
        Cow cow = new Cow("Cow", milk);
        cows.add(cow);
      } else if (type.equals("chicken")) {
        System.out.print("Enter egg color for chicken: ");
        String color = input.nextLine().trim();
        Chicken chicken = new Chicken("Chicken", color);
        chickens.add(chicken);
      } else {
        System.out.println("Invalid type. Skipping...");
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

    input.close();
  }
}
