package Product;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    static ArrayList<Product> cart = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- SHOPPING CART ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> viewCart();
                case 3 -> checkout();
                case 4 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    static void addProduct() {
        System.out.print("Product name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        cart.add(new Product(name, price));
        System.out.println("Product added.");
    }

    static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart empty.");
            return;
        }

        for (Product p : cart) {
            System.out.println(p.name + " - R" + p.price);
        }
    }

    static void checkout() {
        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        if (total > 500) {
            total *= 0.9;
            System.out.println("10% discount applied.");
        }

        System.out.println("Total to pay: R" + total);
        cart.clear();
    }
}

