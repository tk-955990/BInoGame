package bingoGame;

public class SheetCheck {

	//ビンゴしたかどうか
	public boolean isBingo() {
		SheetBean bean = new SheetBean();
		boolean bingoFlag = true;
		int countB = 0;
		int countI = 0;
		int countN = 0;
		int countG = 0;
		int countO = 0;

		int reachCount = 0;

		// 横のビンゴ判定
		for(int i = 0;i<5;i++) {
			reachCount = 0;
			if(bean.getListB()[i] == 99) {
				reachCount++;
			}if(bean.getListI()[i] == 99) {
				reachCount++;
			}if(bean.getListN()[i] == 99) {
				reachCount++;
			}if(bean.getListG()[i] == 99) {
				reachCount++;
			}if(bean.getListO()[i] == 99) {
				reachCount++;
			}
			if(reachCount == 5) {
				reachAndbingoCheck( reachCount, countB
						,countI,countN, countG, countO);
				bingoFlag = true;
				break;	
			}else if(reachCount == 4) {
				reachAndbingoCheck( reachCount, countB
						,countI,countN, countG, countO);
				bingoFlag = false;
				break;
			}
		}
		if(reachCount < 4)
			bingoFlag = false;
		System.out.println("reachCount = "+reachCount);
		// 縦のビンゴ判定

		for(int i = 0;i<5;i++) {
			if(bean.getListB()[i] == 99) {
				countB++;
			}if(bean.getListI()[i] == 99){
				countI++; 
			}if(bean.getListN()[i] == 99){
				countN++; 
			}if(bean.getListG()[i] == 99){
				countG++; 
			}if(bean.getListO()[i] == 99){
				countO++; 
			}	
		}
		if(
				(countB == 5)||	
				(countI == 5)||	
				(countN == 5)||	
				(countG == 5)||	
				(countO == 5)
				) {
			reachAndbingoCheck( reachCount, countB
					,countI,countN, countG, countO);
			bingoFlag = true;
		}else if(
				(countB == 4)||	
				(countI == 4)||	
				(countN == 4)||	
				(countG == 4)||	
				(countO == 4)
				) {
			reachAndbingoCheck( reachCount, countB
					,countI,countN, countG, countO);
			bingoFlag = false;
		}else
			bingoFlag = false;
		System.out.println("reachCount = "+reachCount);
		System.out.println("countB = "+countB);
		System.out.println("countI = "+countI);
		System.out.println("countN = "+countN);
		System.out.println("countG = "+countG);
		System.out.println("countO = "+countO);

		return bingoFlag;

	}

	// ビンゴとリーチ判定
	public void reachAndbingoCheck(int reachCount,int countB
			,int countI,int countN,int countG,int countO) {
		if((reachCount == 5)||(
				(countB == 5)||
				(countI == 5)||	
				(countN == 5)||	
				(countG == 5)||	
				(countO == 5))){
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
		}else if((reachCount == 4)||(
				(countB == 4)||	
				(countI == 4)||	
				(countN == 4)||	
				(countG == 4)||	
				(countO == 4))){
			System.out.println("☆☆☆☆☆   リーチ中  ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   リーチ中  ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   リーチ中  ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
		}
	}

}
