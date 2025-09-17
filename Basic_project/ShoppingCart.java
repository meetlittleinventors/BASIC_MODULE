import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    cart.add(new Item(name, price));
                    System.out.println(name + " added to cart.");
                    break;
                case 2:
                    if(cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        System.out.print("Enter item name to remove: ");
                        String removeName = sc.nextLine();
                        boolean removed = false;
                        for(int i = 0; i < cart.size(); i++) {
                            if(cart.get(i).name.equalsIgnoreCase(removeName)) {
                                cart.remove(i);
                                removed = true;
                                System.out.println(removeName + " removed from cart.");
                                break;
                            }
                        }
                        if(!removed) System.out.println("Item not found in cart.");
                    }
                    break;
                case 3:
                    if(cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        double total = 0;
                        System.out.println("\n--- Bill ---");
                        for(Item item : cart) {
                            System.out.println(item.name + " - $" + item.price);
                            total += item.price;
                        }
                        System.out.println("Total Price: $" + total);
                    }
                    break;
                case 4:
                    System.out.println("Exiting shopping cart. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(choice != 4);

        sc.close();
    }
}
