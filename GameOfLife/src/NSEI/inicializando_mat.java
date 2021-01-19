package NSEI;

public class inicializando_mat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabuleiro exibe = new Tabuleiro();
		int l=0,c=0;
		System.out.println(exibe);
		
		System.out.println("\t---  ---  ---  ---  ---  ---  ---  ---  ---  --- ---  ---  ---  ---  ---  ---  ---  ---");
		for(l=0;l<10;l++) {
			System.out.print("\t|");
			//System.out.println("|");
			for(c=0;c<10;c++) {
				System.out.print("\t" + exibe[l][c]);
			}
			System.out.println("\t|");
			System.out.println();
		}
		System.out.println("\t---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---  ---");
	}

}
