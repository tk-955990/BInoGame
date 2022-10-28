package bingoGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Machine {
	public void lotteryNumber() {

		ArrayList<Integer> bingoNumber = new ArrayList<Integer>();

		for(int i = 1 ; i <= 75 ; i++) {
			bingoNumber.add(i);
		}	

		Collections.shuffle(bingoNumber);

		System.out.println("☆☆☆　当選番号は " + bingoNumber.get(1) + " です☆☆☆");



	}
}
