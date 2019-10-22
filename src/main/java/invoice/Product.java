/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author Dalfrak
 */
public class Product {
    
    private String name;
    private int ID;
    private int quantity;
    private float price;
    private float totalPrice;

    public Product(int ID, String name, float price, int qty) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.quantity = qty;
        this.totalPrice = this.price * this.quantity;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
    
}
