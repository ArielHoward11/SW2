package DICE;
import java.util.Random;
public class Dice {
	private int value1;
	private int value2;
	private int value3;
	Random rand = new Random();
	
	public void roll() {
		value1=rand.nextInt(6)+1;
		value2=rand.nextInt(6)+1;
		value3=value1+value2;
	}

	public int getValue1() {
		return value1;
	}

	public int getValue2() {
		return value2;
	}
	public int getValue3() {
		return value3;
	}
}
