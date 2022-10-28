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
	public void setlistB(int[] listB) {
		this.listB = listB;
	}

	public int[] getListI() {
		return listI;
	}
	public void setlistI(int[] listI) {
		this.listI = listI;
	} 

	public int[] getListN() {
		return listN;
	}
	public void setlistN(int[] listN) {
		this.listN = listN;
	}

	public int[] getListG() {
		return listG;
	}
	public void setlistG(int[] listG) {
		this.listG = listG;
	}

	public int[] getListO() {
		return listO;
	}
	public void setlistO(int[] listB) {
		this.listB = listB;
	} 

	public SheetBean() {

		Random rand = new Random();
		boolean isUnique = true;

		int[] listB = new int[5];
		int[] listI = new int[5];
		int[] listN = new int[5];
		int[] listG = new int[5];
		int[] listO = new int[5];

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



		System.out.println("   B   I   N   G   O ");
		System.out.println(" ┏━┳━┳━┳━┳━┓");

		for(int j = 0;j<5;j++) {
			System.out.print(" ┃");
			String str = String.format("%2d", listB[j]);
			System.out.print(str);
			System.out.print("┃");
			System.out.print(listI[j]);
			System.out.print("┃");
			if(j == 2) {
				System.out.print("☆");
			}else {
				System.out.print(listN[j]);
			}System.out.print("┃");
			System.out.print(listG[j]);
			System.out.print("┃");
			System.out.print(listO[j]);
			System.out.print("┃");
			System.out.println("");
			if(j<4) {
				System.out.println(" ┣━╋━╋━╋━╋━┫");	
			}else{
				System.out.println(" ┗━┻━┻━┻━┻━┛");
			}
		}

	}
}
