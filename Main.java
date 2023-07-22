package yusya;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Yusya y = new Yusya();
		y.name = "かほちん";
		y.hp = 100;
		y.mp = 50;
		y.point = 0;

		Yusya y1 = new Yusya();
		y1.name = "そうまん";
		y1.hp = 150;
		y1.mp = 30;
		y1.point = 0;

		Teki s = new Teki();
		s.suffix = 'A';
		s.number = new Random().nextInt(10)+10;

		Teki s1 = new Teki();
		s1.suffix = 'B';
		s1.number = new Random().nextInt(10)+10;

		Teki d = new Teki();
		d.name = "ドラゴン";
		d.hp = new Random().nextInt(50)+100;
		d.mp = 50;
		d.point = new Random().nextInt(100)+50;
		d.suffix = 'B';
		d.number = new Random().nextInt(80)+100;

		System.out.println("勇者" + y.name + "降臨!!");
		System.out.println(y.toString());
		System.out.println("勇者" + y1.name + "降臨!!");
		System.out.println(y1.toString());
		Yusya.setRandomMoney();
		Teki.setRandomMoney();
		Yusya.setPoint();
		System.out.println("所持金は\\" + Yusya.money + "になった");
		System.out.println(s.name + s.suffix + "が現れた!!");
		System.out.println(s.name + s.suffix + "のHPは" + s.hp);
		System.out.println(s1.name + s1.suffix + "が現れた!!");
		System.out.println(s1.name + s1.suffix + "のHPは" + s1.hp);
		System.out.println(d.name + "が現れた!!");
		System.out.println(d.name + "のHPは" + d.hp);
		System.out.println(Yusya.setPoint());
		
		y.kougeki(s.number);
		y.mera(s);
		
		

		if(s.hp == 0) {
			System.out.println(s.name + s.suffix + "を倒した");
			System.out.println(s.point + "の経験値を獲得した");
			Yusya.money += s.moneySlime;
			System.out.println("合計マネーは\\" + s.moneySlime + "獲得し、\\"+ Yusya.money + "になった");
			y.point += s.point;
			
			System.out.println(y.name + "の経験値の合計は" + y.point + "になった");
			System.out.println(y.toString());//攻撃1回ごとに表示させたい
		}else {
			System.out.println(s.name + s.suffix + "の残りHPは" + s.hp);
			s.attackYusya(s.number);
			y.hp -= s.number;
			if(y1.hp >= 0) {
				System.out.println(y.name + "は" + s.name + "に負けた。。。");
			}else {
			System.out.println(y.toString());
			}
		}

		y.mera(s1);
		
		if(s1.hp == 0) {
			System.out.println(s1.name + s1.suffix + "を倒した");
			System.out.println(s1.point + "の経験値を獲得した");
			Yusya.money += s1.moneySlime;
			System.out.println("合計マネーは\\" + s1.moneySlime + "獲得し、\\" + Yusya.money + "になった");
			y.point += s1.point;
			
			System.out.println(y.name + "の経験値の合計は" + y.point + "になった");
			System.out.println(y.toString());//攻撃1回ごとに表示させたい
		}else {
			System.out.println(s1.name + s1.suffix + "の残りHPは" + s1.hp);
			s.attackYusya(s1.number);
			y.hp -= s1.number;
			if(y.hp >= 0) {
				System.out.println(y.name + "は" + s1.name + "に負けた。。。");
			}else {
			System.out.println(y.toString());
			}
		}
		
		y1.mera(d);
		
		if(d.hp == 0) {
			System.out.println(d.name + "を倒した");
			System.out.println(d.point + "の経験値を獲得した");
			Yusya.money += d.moneyDragon;
			System.out.println("合計マネーは\\" + d.moneyDragon + "獲得し、\\" + Yusya.money + "になった");
			y1.point += d.point;
			
			System.out.println(y1.name + "の経験値の合計は" + y1.point + "になった");
			System.out.println(y1.toString());
		}else {
			System.out.println(d.name + "の残りHPは" + d.hp);
			d.attackYusya(d.number);
			y1.hp -= d.number;
			
			if(y1.hp <= 0) {
				System.out.println(y1.name + "は" + d.name + "に負けた。。。");
			}else {
			System.out.println(y1.toString());
		
			}
		}
		//d.attackYusya(10);
		
	}

}
