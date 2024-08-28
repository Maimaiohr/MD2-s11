package Baitap;

import java.util.Scanner;

public class Product implements Iproduct{
    private int id;
    private String name;
    private int price;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, int price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Enter product id: ");
        this.id = scanner.nextInt();
        System.out.println("Enter product name: ");
        this.name = scanner.next();
        System.out.println("Enter product price: ");
        this.price = scanner.nextInt();
        System.out.println("Enter product status: ");
        this.status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Status: " + (this.status? "sold" : "unsold"));
    }
}
