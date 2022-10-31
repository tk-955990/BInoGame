package bingoGame;

import java.util.Scanner;

public class Game {

	static Machine machine = new Machine();
	static int bingoNumber ;
	public static void main(String args[]) {
		SheetBean   sheetBean   = new SheetBean();
		System.out.println("                                ");
		System.out.println("------ BingoGame Start !! ------");
		System.out.println("                                ");

		while(true) {
			int nextflag = 0;
			sheetBean.print(bingoNumber);
			int bingoNumber = machine.lotteryNumber();
			if(sheetBean.hit(bingoNumber) == true) {
				if(sheetBean.isBingo() == true) {
					sheetBean.print(bingoNumber);
					break;
				}
			}  
			sheetBean.print(bingoNumber);
			while(true ) {
				System.out.println("ゲームを続けますか？");
				System.out.println("　はい : 1   いいえ : 2 ");
				Scanner scanner = new Scanner(System.in);
				String next = scanner.next();
				char charNext = next.charAt(0);
				if((charNext =='1')||(charNext =='１')) {
					nextflag =1;
					break;
				}else if((charNext =='2')||(charNext =='２')) {
					nextflag =2;
					break;
				}else {
					continue;
				}
			}
			if(nextflag ==2) {
				break;
			}
			//	new SheetBean();
		}
		System.out.println("-------- ゲーム終了です --------");
		System.out.println("                                ");
		System.out.println("                                ");
	}
}