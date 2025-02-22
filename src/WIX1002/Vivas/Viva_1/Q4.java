package WIX1002.Vivas.Viva_1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int menu, pizzaSubMenu, drinksSubMenu, dessertSubMenu;
        double price = 0, totalPrice = 0, discountPrice = 0;
        int countPizza = 0, countDrinks = 0, countDessert = 0;

        mainMenu: while (true) {
            System.out.println("""
                    Welcome to Manori's Pizza!
                    1. Pizza
                    2. Drinks
                    3. Dessert
                    4. CHECKOUT
                    """);
            System.out.print("Pick an option: ");
            menu = keyboard.nextInt();

            if (menu == 1) {
                pizzaMenu: while (true) {
                    System.out.println("""

                            PIZZA
                            1 Chicken Peperoni - RM15
                            2 Chicken Supreme - RM18
                            3 Vegan indulgence - Rm12
                            4 Beef Delight - RM22
                            5 Margherita - RM9
                            6 BACK TO MAIN MENU
                            """);
                    System.out.print("Pick an option: ");
                    pizzaSubMenu = keyboard.nextInt();

                    if (pizzaSubMenu == 1) {
                        price = 15;
                        System.out.println("Added Chicken Peperoni");
                    } else if (pizzaSubMenu == 2) {
                        price = 18;
                        System.out.println("Added Chicken Supreme");
                    } else if (pizzaSubMenu == 3) {
                        price = 12;
                        System.out.println("Added Vegan Indulgence");
                    } else if (pizzaSubMenu == 4) {
                        price = 22;
                        System.out.println("Added Beef Delight");
                    } else if (pizzaSubMenu == 5) {
                        price = 9;
                        System.out.println("Added Margherita");
                    } else if (pizzaSubMenu == 6) {
                        System.out.println("\n");
                        break;
                    } else {
                        System.out.println("Invalid input. Please reenter your option.");
                        continue pizzaMenu;
                    }
                    countPizza += 1;
                    totalPrice = totalPrice + price;
                    System.out.printf("Current total : RM%.1f\n", totalPrice);
                }
            } else if (menu == 2) {
                drinksMenu: while (true) {
                    System.out.println("""

                            DRINKS
                            1 Strawberry Smoothie - RM8
                            2 Banana Smoothie - RM8
                            3 Mocktail - RM12
                            4 Soft Drink - RM5
                            5 Mineral Water - RM3
                            6 BACK TO MAIN MENU
                            """);
                    System.out.print("Pick an option: ");
                    drinksSubMenu = keyboard.nextInt();

                    if (drinksSubMenu == 1) {
                        price = 8;
                        System.out.println("Added Strawberry Smoothie");
                    } else if (drinksSubMenu == 2) {
                        price = 8;
                        System.out.print("Added Banana Smoothie");
                    } else if (drinksSubMenu == 3) {
                        price = 12;
                        System.out.print("Added Mocktail");
                    } else if (drinksSubMenu == 4) {
                        price = 5;
                        System.out.print("Added Soft Drink");
                    } else if (drinksSubMenu == 5) {
                        price = 3;
                        System.out.print("Added Mineral Water");
                    } else if (drinksSubMenu == 6) {
                        System.out.println("\n");
                        break;
                    } else {
                        System.out.println("Invalid input. Please reenter your option.");
                        continue drinksMenu;
                    }
                    countDrinks += 1;
                    totalPrice = totalPrice + price;
                    System.out.printf("Current total : RM%.1f\n", totalPrice);
                }
            } else if (menu == 3) {
                dessertMenu: while (true) {
                    System.out.println("""

                            DESSERT
                            1 Tiramisu - RM7
                            2 Strawberry Shortcake - RM10
                            3 Green Jello - RM4
                            4 Creme Brulee - RM15
                            5 Raspberry Pie - RM20
                            6 BACK TO MAIN MENU
                            """);
                    System.out.print("Pick an option: ");
                    dessertSubMenu = keyboard.nextInt();

                    if (dessertSubMenu == 1) {
                        price = 7;
                        System.out.println("Added Tiramisu");
                    } else if (dessertSubMenu == 2) {
                        price = 10;
                        System.out.println("Added Strawberry Shortcake");
                    } else if (dessertSubMenu == 3) {
                        price = 4;
                        System.out.println("Added Green Jello");
                    } else if (dessertSubMenu == 4) {
                        price = 15;
                        System.out.println("Added Creme Brulee");
                    } else if (dessertSubMenu == 5) {
                        price = 20;
                        System.out.println("Added Raspberry Pie");
                    } else if (dessertSubMenu == 6) {
                        System.out.println("\n");
                        break;
                    } else {
                        System.out.println("Invalid input. Please reenter your option.");
                        continue dessertMenu;
                    }
                    countDessert += 1;
                    totalPrice = totalPrice + price;
                    System.out.printf("Current total : RM%.1f\n", totalPrice);
                }
            } else if (menu == 4) {
                System.out.printf("\nYour total is RM%.1f", totalPrice);

                if ((countPizza >= 1) && (countDrinks >= 1) && (countDessert >= 1)) {
                    System.out.println("\nYou've availed the One of each offer. You get a 20% discount!");
                    discountPrice = totalPrice * 0.80;
                    System.out.printf("Your new total is RM%.1f!\n", discountPrice);
                }
                System.out.println("\nHave a nice day!");
                break;
            } else {
                System.out.println("Invalid input. Reenter you option.\n");
                continue mainMenu;
            }
        }

        keyboard.close();
    }
}