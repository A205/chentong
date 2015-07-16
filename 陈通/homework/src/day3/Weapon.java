package day3;

public abstract class Weapon {
	public void attack() {
		System.out.println("攻击目标");
	}

	public void move() {
		System.out.println("移动");
	}
}
class Tank extends Weapon {
	public void attack() {
		System.out.println("坦克攻击目标");
	}

	public void move() {
		System.out.println("坦克移动");
	}
}

class Flighter extends Weapon {
	public void attack() {
		System.out.println("飞机攻击目标");
	}

	public void move() {
		System.out.println("飞机移动");
	}
}

class WarShip extends Weapon {
	public void attack() {
		System.out.println("战舰攻击目标");
	}

	public void move() {
		System.out.println("战舰移动");
	}
}



