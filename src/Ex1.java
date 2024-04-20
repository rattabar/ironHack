import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        String coffeeType = "Latte";
        //Current type of coffee
        System.out.println("Current coffee type is : " +coffeeType);
        //Ask user for coffee type
        System.out.println("Please choose your coffee : ");
        Scanner in = new Scanner(System.in);
        coffeeType = in.nextLine();

        if (Objects.equals(coffeeType, "Espresso")) {
            System.out.println(coffeeType + " is strong !");
        }else if (Objects.equals(coffeeType, "Americano")) {
            System.out.println(coffeeType + " is a classic choice !");
        }else if (Objects.equals(coffeeType, "Latte")) {
            System.out.println(coffeeType+" is creamy and delicious");
        }else {
            System.out.println(coffeeType + " is not on the menu");

        }
    }

}
