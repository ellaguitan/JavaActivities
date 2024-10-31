package Laguitan_L13Activity1;

public class Dog {
	enum Size {
		SMALL,
		MEDIUM,
		LARGE,
		XLARGE,
		TINY;
	}
	
	private Size dogSize;
	
	public Dog(Size dogSize) {
		this.dogSize = dogSize;
	}
	
	public void selectDogSize() {
		switch (this.dogSize) {
			case SMALL:
				System.out.println("I am a small doggy");
				break;
			case MEDIUM:
				System.out.println("I am a medium doggy");
				break;
			case LARGE:
				System.out.println("I am a large doggy");
				break;
			case XLARGE:
				System.out.println("I am an extra large doggy");
				break;
			case TINY:
				System.out.println("I don't know which you like");
				break;
		}
	}
}
