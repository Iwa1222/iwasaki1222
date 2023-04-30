package yusya;

import java.util.Random;

public class Teki {
	
	String name = "スライム";
	int hp = new Random().nextInt(12)+10;
	int mp = 5;
	int point = new Random().nextInt(5)+1;
	char suffix;
	static int moneySlime;
	static int moneyDragon;
	int number;
	
	public static void setRandomMoney() {
		Teki.moneySlime = new Random().nextInt(50)+10;
		Teki.moneyDragon = new Random().nextInt(1000)+500;
	}
	 
	//Yusya y = new Yusya();
	//Yusya y1 = new Yusya();//勇者をnewして勇者にダメージを与えたいがエラーが出る。
	
	public int attackYusya(int number) {
		//y.hp -= new Random().nextInt(20)+10;
		System.out.println(this.name + "は攻撃した");
		System.out.println(number + "のダメージを与えた");
		//System.out.println(y1.toString());
		return number;
		
		
	}
}
