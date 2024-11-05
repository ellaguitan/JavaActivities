package Laguitan_Exercise7;

import java.util.Scanner;

public class Laguitan_NutritionalInformation {
    enum Type {
        APPLE(95, 7.9),
        BANANA(105, 9.1),
        ORANGE(63, 53.2);
        
        private final int calories;
        private final double vitC;
        
        Type(int calories, double vitC) {
            this.calories = calories;
            this.vitC = vitC;
        }
        
        public int getCalories() {
            return calories;
        }
        
        public double getVitC() {
            return vitC;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a fruit name (Apple, Banana, Orange): ");
        String input = scn.nextLine();
        
        try {
            Type fruit = Type.valueOf(input.trim().toUpperCase());
            System.out.println("Nutritional Information for " + input + ":");
            System.out.println("Calories: " + fruit.getCalories());
            System.out.println("Vitamin C: " + fruit.getVitC() + " mg");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid fruit name entered.");
        }
        
        scn.close();
    }
}
