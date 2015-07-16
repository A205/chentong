package day3;

public class Army {
	private Weapon[] w = null;
	private int i = 0;

	public Army(int i) {
		w = new Weapon[i];
	}

	public void addWeapon(Weapon we) {
		if (i >= w.length) {
			System.out.println("ÎäÆ÷Á¿×ã¹»");
			return;
		} else {
			w[i] = we;
			i++;
		}
	}

	public void attackAll() {
		for (Weapon we : w) {
			if (we != null) {
				we.attack();
			}
		}
	}

	public void moveAll() {
		for (Weapon we : w) {
			if (we != null) {
				we.move();
			}
		}
	}
}


