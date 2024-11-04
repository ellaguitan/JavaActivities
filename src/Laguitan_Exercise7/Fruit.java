package Laguitan_Exercise7;

public class Fruit {
	enum Type {
		APPLE("Apple", 95, 7.9),
		BANANA("Banana", 105, 9.1),
		ORANGE("Orange", 63, 53.2);
		
		private String value;
		private int calories;
		private double vitC;
		
		Type(String value, int calories, double vitC) {
			this.value = value;
			this.calories = calories;
			this.vitC = vitC;
		}
		
		public String getValue() {
			return value;
		}
		
		public int getCalories() {
			return calories;
		}
		
		public double getVitC() {
			return vitC;
		}
	}	
}
