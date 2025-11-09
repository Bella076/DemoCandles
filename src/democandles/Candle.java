/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democandles;

/**
 *
 * @author Isabella Jordan ST10471010
 */
public class Candle {
    
    // Done by Isabella Jordan Student number: ST10471010
    // Protected fields to allow inheritance and controlled access.
    protected String color;
    protected int  height;
    protected double price;

    // Getter methods.
    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods.
    public void setColor(String color) {
        this.color = color;
    }

    // calculation for price $2 per inch.
    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2;
    }

}
