package day3;

public class Test {
	public static void main(String[] args) {
		Army a = new Army(3);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		// a.addWeapon(new Tank());
		a.attackAll();
		a.moveAll();
	}
}
