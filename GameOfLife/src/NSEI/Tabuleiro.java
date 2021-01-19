package NSEI;

public class Tabuleiro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tab = new char[10][10];
		
		int l=0,c=0;
			
			
		for(l=0;l<10;l++) {
			for(c=0;c<10;c++) {
				if(tab[l][c] == Character.MIN_VALUE) {
				tab[l][c] = '0';
				}
			}
		}
			
	
		System.out.println("\t---  ---  ---  ---  ---  ---  ---  ---  ---  --- ---  ---  ---  ---  ---  ---  ---  ---");
		for(l=0;l<10;l++) {
			System.out.print("\t|");
			//System.out.println("|");
			for(c=0;c<10;c++) {
				System.out.print("\t" + tab[l][c]);
			}
			System.out.println("\t|");
			System.out.println();
		}
		System.out.println("\t---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---");
	
	}
}



