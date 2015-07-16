package day3;

public abstract class Weapon {
	public void attack() {
		System.out.println("����Ŀ��");
	}

	public void move() {
		System.out.println("�ƶ�");
	}
}
class Tank extends Weapon {
	public void attack() {
		System.out.println("̹�˹���Ŀ��");
	}

	public void move() {
		System.out.println("̹���ƶ�");
	}
}

class Flighter extends Weapon {
	public void attack() {
		System.out.println("�ɻ�����Ŀ��");
	}

	public void move() {
		System.out.println("�ɻ��ƶ�");
	}
}

class WarShip extends Weapon {
	public void attack() {
		System.out.println("ս������Ŀ��");
	}

	public void move() {
		System.out.println("ս���ƶ�");
	}
}



