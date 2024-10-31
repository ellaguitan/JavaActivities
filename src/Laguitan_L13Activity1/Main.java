package Laguitan_L13Activity1;

public class Main {

	public static void main(String[] args) {
		Dog dog1 = new Dog(Dog.Size.SMALL);
		Dog dog2 = new Dog(Dog.Size.MEDIUM);
		Dog dog3 = new Dog(Dog.Size.LARGE);
		Dog dog4 = new Dog(Dog.Size.XLARGE);
		Dog dog5 = new Dog(Dog.Size.TINY);
		
		dog1.selectDogSize();
		dog2.selectDogSize();
		dog3.selectDogSize();
		dog4.selectDogSize();
		dog5.selectDogSize();
	}

}
