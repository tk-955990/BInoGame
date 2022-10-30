package bingoGame;

import java.util.Scanner;

public class Game {

	static Machine machine = new Machine();
	static SheetCheck check = new SheetCheck();
	static int bingoNumber ;
	public static void main(String args[]) {
		SheetBean   sheetBean   = new SheetBean();
		System.out.println("                                ");
		System.out.println("------ BingoGame Start !! ------");
		System.out.println("                                ");

		while(true) {
			sheetBean.print(bingoNumber);
			int bingoNumber = machine.lotteryNumber();
			if(sheetBean.hit(bingoNumber) == true) {
				if(check.isBingo() == true) {
					sheetBean.print(bingoNumber);
					break;
				}
			}  
			sheetBean.print(bingoNumber);

			System.out.println("ゲームを続けますか？");
			System.out.println("　はい : 1   いいえ : 2 ");
			Scanner scanner = new Scanner(System.in);
			int next = scanner.nextInt();
			if(next == 1) {
				continue;
			}else{
				break;
			}
			//	new SheetBean();
		}
		System.out.println("                                ");
		System.out.println("                                ");
	}
}