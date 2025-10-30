/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package democandles;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabella Jordan ST10471010
 */
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instatiate the parent and child class.
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();

        //Done by Daven Pillay Student number: ST10471601
        // Prompt the user for which type of candle they want
        String choice = JOptionPane.showInputDialog(
            "Would type of candle would you like:\n1. Normal Candle\n2. Scented Candle");

        String color = JOptionPane.showInputDialog("What color would you like your candle to be?");
        int height = Integer.parseInt(JOptionPane.showInputDialog(
            "What height would you like the candle to be (measurements are in inches)?"));

        if (choice.equals("2")) { // Scented Candle
            // Done by Hannah Cerfontyne Student number: ST10473919
            String scent = JOptionPane.showInputDialog(
                "What scent would you like?\nWe have Gardenia, Roses, Sunflowers, Tiger Lilies, Orchids and more.");

            scentedCandle.setScent(scent);
            scentedCandle.setColor(color);
            scentedCandle.setHeight(height);

            // Displays results for scented candle.
            JOptionPane.showMessageDialog(null, "Scented Candle Details\nScent: " + scentedCandle.getScent()
                + "\nColor: " + scentedCandle.getColor()
                + "\nHeight: " + scentedCandle.getHeight() + " inches"
                + "\nPrice: $" + scentedCandle.getPrice());
            
        } else { // Normal Candle
            // Done by Daven Pillay.
            candle.setColor(color);
            candle.setHeight(height);

            //Display reults for normal candle.
            JOptionPane.showMessageDialog(null, "Normal Candle Details\nColor: " + candle.getColor()
                + "\nHeight: " + candle.getHeight() + " inches"
                + "\nPrice: $" + candle.getPrice());
        }

    }
    
}
