package yusya;

import java.util.Random;

public class Yusya {

	String name;
	int hp;
	int mp;
	static int point;
	static int money;

	
	
	public String toString() {
		return "名前:" + this.name + "/HP :" + this.hp + "/MP :" + this.mp;
		       
	}
	
	public static void setRandomMoney() {
		Yusya.money = (int)(Math.random() * 500+1000);//なぜRandom小文字？？
	}

	public static boolean setPoint() {
		for (int i = 0; i >= 32; i++) {
			System.out.println(i);
			point += i;
		}
		return false;//合計経験値によってレベルを呼び出したい
	}
	
	
	Teki s = new Teki();
	Teki s1 = new Teki();


	public int mera(Teki s) {
		System.out.println(this.name + "は攻撃した");
		System.out.println("MPを12消費しメラの呪文を唱えた");

		this.mp -= 12;

		int attack = new Random().nextInt(31)+10;
		int attackActual = Math.min(s.hp, attack);
		s.hp -= attackActual;

		System.out.println(attackActual + "のダメージを与えた");
		
		return attackActual;

	}

	public int kougeki(int number) {
		System.out.println(s.name + "は攻撃した");
		int attack = new Random().nextInt(11)+number;
		int attackActual = Math.min(s.hp, attack);
		s.hp -= attackActual;

		System.out.println(attackActual + "のダメージを与えた");
		return attackActual;
	}
	
}
