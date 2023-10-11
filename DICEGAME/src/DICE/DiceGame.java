package DICE;

import java.util.Scanner;

public class DiceGame {
	User user1 = new User();
	User user2 = new User();
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	private int numberOfPlay;
	int i = 0;
	Scanner sc = new Scanner(System.in);

	public DiceGame(String name1, String name2, int numberOfPlay) {
		this.user1.setName(name1);
		this.user2.setName(name2);
		this.numberOfPlay = numberOfPlay;
	}

	public void playGame() {
		while (i < numberOfPlay) {
			System.out.println((i + 1) + "번째 게임\n" + "엔터를 누르십시오");
			sc.nextLine();
			dice1.roll();
			dice2.roll();
			System.out.println(user1.getName() + "\n----------\n첫번째 주사위: " + 
			dice1.getValue1() + "\n두번째 주사위: " + dice1.getValue2() + 
			"\n주사위의 합: " + dice1.getValue3() + "\n");
			System.out.println(user2.getName() + "\n----------\n첫번째 주사위: " + 
					dice2.getValue1() + "\n두번째 주사위: " + dice2.getValue2() + 
					"\n주사위의 합: " + dice2.getValue3() + "\n");
			updateResult(dice1, dice2);
			i++;
		}
		printGameResult(user1, user2);
	}

	private void updateResult(Dice dice1, Dice dice2) {
		if (dice1.getValue3() > dice2.getValue3()) {
			user1.setWin();
			user2.setLose();
		} else if (dice1.getValue3() < dice2.getValue3()) {
			user1.setLose();
			user2.setWin();
		} else {
			user1.setDraw();
			user2.setDraw();
		}
	}

	private void printGameResult(User user1, User user2) {
		user1.printResult();
		user2.printResult();
		if (user1.getWin() > user2.getWin())
			System.out.println(user1.getName() + "승!");
		else if (user1.getWin() < user2.getWin())
			System.out.println(user2.getName() + "승!");
		else
			System.out.println("무승부");
	}
}
