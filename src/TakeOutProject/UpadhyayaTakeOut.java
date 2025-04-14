package TakeOutProject;
// Shashangka Upadhyaya 04/14/2025
// Take out program project
// CSC 151 MON01
// I abide by GTCC’s academic integrity policy. This work is my own original work.

import java.util.*;
public class UpadhyayaTakeOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double TAX_RATE = 0.07;
        final double TIP_RATE = 0.15;

        System.out.print("Enter number of people ordering (10 to 100): ");
        int people = sc.nextInt();

        if (people < 10 || people > 100) {
            System.out.println("Invalid number of people. Exiting.");
            return;
        }

        displayMainMenu();
        int foodType = sc.nextInt();

        int trayFeeds = 0;
        double trayPrice = 0.0;

        switch (foodType) {
            case 1:
                displayItalianFoodMenu();
                int italianChoice = sc.nextInt();
                switch (italianChoice) {
                    case 1: trayFeeds = 5; trayPrice = 17.99; break;
                    case 2: trayFeeds = 7; trayPrice = 15.99; break;
                    case 3: trayFeeds = 4; trayPrice = 12.99; break;
                    default: System.out.println("Invalid Italian food choice."); return;
                }
                break;
            case 2:
                displayChineseFoodMenu();
                int chineseChoice = sc.nextInt();
                switch (chineseChoice) {
                    case 1: trayFeeds = 7; trayPrice = 18.99; break;
                    case 2: trayFeeds = 7; trayPrice = 18.99; break;
                    case 3: trayFeeds = 5; trayPrice = 10.99; break;
                    default: System.out.println("Invalid Chinese food choice."); return;
                }
                break;
            case 3:
                displayAmericanFoodMenu();
                int americanChoice = sc.nextInt();
                switch (americanChoice) {
                    case 1: trayFeeds = 8; trayPrice = 21.99; break;
                    case 2: trayFeeds = 5; trayPrice = 22.99; break;
                    case 3: trayFeeds = 10; trayPrice = 26.99; break;
                    default: System.out.println("Invalid American food choice."); return;
                }
                break;
            default:
                System.out.println("Invalid meal type.");
                return;
        }

        int trays = determineTrays(people, trayFeeds);
        double subtotal = getSubtotal(trayPrice, trays);
        double tax = getTax(subtotal, TAX_RATE);
        double tip = getTip(subtotal, TIP_RATE);
        double total = getGrandTotal(subtotal, tax, tip);
        double perPerson = pricePerPerson(total, people);
        int leftovers = determineLeftOvers(trayFeeds, trays, people);

        System.out.println("\nYou need " + trays + " trays");
        System.out.println("Feeds: " + trayFeeds);
        System.out.printf("Price for %d people (%d trays): $%.2f\n", people, trays, subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Tip: $%.2f\n", tip);
        System.out.printf("Total (food, tax, tip): $%.2f\n", total);
        System.out.printf("Price per person: $%.2f\n", perPerson);
        System.out.println("Leftover servings for the delivery person: " + leftovers);

        sc.close();
    }

    public static void displayMainMenu() {
        System.out.println("CHOOSE TYPE OF MEAL\n_____________");
        System.out.println("1. Italian\n2. Chinese\n3. American");
        System.out.print("Choose what type of food you'd like to order: ");
    }

    public static void displayItalianFoodMenu() {
        System.out.println("\nCHOOSE ONE\n__________");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
        System.out.print("Enter Choice: ");
    }

    public static void displayChineseFoodMenu() {
        System.out.println("\nCHOOSE ONE\n__________");
        System.out.println("1. Chicken and Broccoli Tray - Feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray - Feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray - Feeds 5 - 10.99");
        System.out.print("Enter Choice: ");
    }

    public static void displayAmericanFoodMenu() {
        System.out.println("\nCHOOSE ONE\n__________");
        System.out.println("1. Hamburger and Hot Dog Tray - Feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich Tray - Feeds 5 - 22.99");
        System.out.println("3. Barbeque Tray - Feeds 10 - 26.99");
        System.out.print("Enter Choice: ");
    }

    public static int determineTrays(int people, int feeds) {
        return (int) Math.ceil((double) people / feeds);
    }

    public static double getSubtotal(double price, int trays) {
        return price * trays;
    }

    public static double getTax(double subtotal, double taxrate) {
        return subtotal * taxrate;
    }

    public static double getTip(double subtotal, double tipRate) {
        return subtotal * tipRate;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip) {
        return subtotal + tax + tip;
    }

    public static double pricePerPerson(double grandTotal, int people) {
        return grandTotal / people;
    }

    public static int determineLeftOvers(int feeds, int trays, int people) {
        return feeds * trays - people;
    }
}

