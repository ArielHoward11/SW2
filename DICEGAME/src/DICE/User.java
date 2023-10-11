package DICE;

public class User {
	private String name;
	private int win=0;
	private int lose=0;
	private int draw=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin() {
		this.win++;
	}

	public int getLose() {
		return lose;
	}

	public void setLose() {
		this.lose++;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw() {
		this.draw++;
	}

	public void printResult() {
		System.out.println(name +"\n승: " + win + "번\n" + "패: " + lose + "번\n" +
							"무승부: " + draw + "번");
	}
}
