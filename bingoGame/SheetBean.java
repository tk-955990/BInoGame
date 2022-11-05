package bingoGame;

import java.util.Random;
public class SheetBean {
	private int[] listB;
	private int[] listI;
	private int[] listN;
	private int[] listG;
	private int[] listO;

	public int[] getListB() {
		return listB;
	}
	public void setListB(int[] listB) {
		this.listB = listB;
	}

	public int[] getListI() {
		return listI;
	}
	public void setListI(int[] listI) {
		this.listI = listI;
	} 

	public int[] getListN() {
		return listN;
	}
	public void setListN(int[] listN) {
		this.listN = listN;
	}

	public int[] getListG() {
		return listG;
	}
	public void setListG(int[] listG) {
		this.listG = listG;
	}

	public int[] getListO() {
		return listO;
	}
	public void setListO(int[] listO) {
		this.listO = listO;
	} 


	// コンストラクタ
	public SheetBean() {

		Random rand = new Random();
		boolean isUnique = true;

		listB = new int[5];
		listI = new int[5];
		listN = new int[5];
		listG = new int[5];
		listO = new int[5];  

		int count = 0;

		while (count < 5) {

			int valueB = rand.nextInt(15)+1;
			int valueI = rand.nextInt(15)+15;
			int valueN = rand.nextInt(15)+31;
			int valueG = rand.nextInt(15)+46;
			int valueO = rand.nextInt(15)+61;

			for (int i = 0; i < count; i++) {
				if( 
						(listB[i] != valueB)&&
						(listI[i] != valueI)&&
						(listN[i] != valueN)&&
						(listG[i] != valueG)&&
						(listO[i] != valueO)
						) {
					isUnique = true; 
				} else {
					isUnique = false; 
					break; 
				}
			}
			if (isUnique == true) {
				listB[count] = valueB;
				listI[count] = valueI;
				listN[count] = valueN;
				listG[count] = valueG;
				listO[count] = valueO;
				count++;
			}
		}	
		// 真ん中のマスの処理
		listN[2] = 99;
	}

	// 穴あけメソッド
	public boolean hit(int bingoNumber) {
		boolean hitFlag = true;
		int check = 0;
		for(int i = 0;i<5;i++) {
			if(listB[i] == bingoNumber) {
				listB[i] = 99;	
				check++;
			}else if(listI[i] == bingoNumber) {
				listI[i] = 99;
				check++;
			}else if(listG[i] == bingoNumber) {
				listG[i] = 99;	
				check++;
			}else if(listG[i] == bingoNumber) {
				listG[i] = 99;	
				check++;
			}else if(listG[i] == bingoNumber) {
				listG[i] = 99;	
				check++;
			}else if(listO[i] == bingoNumber) {
				listO[i] = 99;	
				check++;
			}
		}if(check >0) {
			hitFlag = true;
			System.out.println("☆☆☆☆   あたりです   ☆☆☆☆");

		}else {
			hitFlag = false;
			System.out.println("。。　残念… ハズレです   。。。");
		}
		return hitFlag;
	}

	// ヒットしたマスのカウント
	public boolean isBingo() {
		boolean bingoFlag = true;
		
		// 縦のカウント
		int countB = 0;
		int countI = 0;
		int countN = 0;
		int countG = 0;
		int countO = 0;
		
		// 横のカウント
		int reachCount = 0;
		
		// クロスのカウント
		int crossA = 0;
		int crossB = 0;

		for(int i = 0;i<5;i++) {

			reachCount = 0;
			crossA = 0;
			crossB = 0;

			if(listB[i] == 99) {
				countB++;
				reachCount++;
			}if(listI[i] == 99) {
				countI++;
				reachCount++;
			}if(listN[i] == 99) {
				countN++;
				reachCount++;
			}if(listG[i] == 99) {
				countG++;
				reachCount++;
			}if(listO[i] == 99) {
				countO++;
				reachCount++;
			}if(listB[0] == 99) {
				crossA++;
			}if(listI[1] == 99) {
				crossA++;
			}if(listN[2] == 99) {
				crossA++;
			}if(listG[3] == 99) {
				crossA++;
			}if(listO[4] == 99) {
				crossA++;
			}if(listB[4] == 99) {
				crossB++;
			}if(listI[3] == 99) {
				crossB++;
			}if(listN[2] == 99) {
				crossB++;
			}if(listG[1] == 99) {
				crossB++;
			}if(listO[0] == 99) {
				crossB++;

			}if(reachAndbingoCheck( reachCount, countB
					, countI, countN, countG, countO
					, crossA, crossB) == true) {
				bingoFlag = true;
				return bingoFlag;
			}else if(reachAndbingoCheck( reachCount, countB
					, countI, countN, countG, countO
					, crossA, crossB) == false) {
				bingoFlag = false;
			}else {
				bingoFlag = false;
			}
		}
		return bingoFlag;
	}

	// ビンゴとリーチ判定
	public boolean reachAndbingoCheck(int reachCount,int countB
			,int countI,int countN,int countG,int countO
			,int crossA,int crossB) {
		boolean checkFlg = true;
		if((reachCount == 5)||
				(countB == 5)||
				(countI == 5)||	
				(countN == 5)||	
				(countG == 5)||	
				(countO == 5)||
				(crossA == 5)||
				(crossB == 5) 
				) {
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			System.out.println("☆☆☆☆☆   BINGO!!   ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			checkFlg = true;
		}else if((reachCount == 4)||
				(countB == 4)||	
				(countI == 4)||	
				(countN == 4)||	
				(countG == 4)||	
				(countO == 4)||
				(crossA == 4)||
				(crossB == 4) 
				) {
			System.out.println("☆☆☆☆☆   リーチ中  ☆☆☆☆☆");
			System.out.println("　　　　　　　　　　　　　　　　");
			checkFlg = false;
		}else {
			checkFlg = false;
		}
		return checkFlg;
	}

	// 表示メソッド
	public void print(int bingoNumber) {
		System.out.println("   B   I   N   G   O ");
		System.out.println(" ┏━┳━┳━┳━┳━┓");

		for(int j = 0;j<5;j++) {
			System.out.print(" ┃");
			if(listB[j] == 99) {
				System.out.print("★");
			}else {
				String str = String.format("%2d", this.listB[j]);
				System.out.print(str);
			}System.out.print("┃");
			if(listI[j] == 99) {
				System.out.print("★");
			}else {
				System.out.print(this.listI[j]);
			}System.out.print("┃");
			if(listN[j] == 99) {
				System.out.print("★");
			}else {
				System.out.print(this.listN[j]);
			}System.out.print("┃");
			if(listG[j] == 99) {
				System.out.print("★");
			}else {
				System.out.print(this.listG[j]);
			}System.out.print("┃");
			if(listO[j] == 99) {
				System.out.print("★");
			}else {
				System.out.print(this.listO[j]);
			}System.out.print("┃");
			System.out.println("");
			if(j<4) {
				System.out.println(" ┣━╋━╋━╋━╋━┫");	
			}else{
				System.out.println(" ┗━┻━┻━┻━┻━┛");
			}
		}
	}


}
