package PRACTICE;

public class P_0331_Star13 {
	/*
	 * 오랜만에 별찍어보기~ 옛날에 4개썻느데 3개로도 되네 ㅎㅎ 
	 **
	 ***
	 **
	 */
	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int k=3; k>0; k--) {
			System.out.print("*");
			if(k==2) {
				System.out.println("");
			}
		}
	
		
	}

}
