package DICE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1, name2;
		int number;

		System.out.println("유저1의 이름>> ");
		name1 = sc.nextLine();
		System.out.println("유저2의 이름>> ");
		name2 = sc.nextLine();
		System.out.println("게임 횟수>>");
		number = sc.nextInt();
		DiceGame game = new DiceGame(name1, name2, number);
		game.playGame();
	}

}
