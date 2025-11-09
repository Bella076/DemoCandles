/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democandles;

/**
 *
 * @author Isabella Jordan ST10471010
 */
public class ScentedCandle extends Candle{
    
    // Done by Chaelen Kumar Student number: ST10476657
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    // Override methode to change price for a scented candle to $3 per inch.
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.price = height * 3;
    }
 
}
