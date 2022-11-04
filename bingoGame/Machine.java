package bingoGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Machine {
	public int lotteryNumber() {

		ArrayList<Integer> bingoNumber = new ArrayList<Integer>();

		for(int i = 1 ; i <= 75 ; i++) {
			bingoNumber.add(i);
		}	

		Collections.shuffle(bingoNumber);

		String str = String.format("%2d", bingoNumber.get(1));

		System.out.println("☆☆☆　当選番号は " + str + " です☆☆☆");
		return bingoNumber.get(1);



	}
}
