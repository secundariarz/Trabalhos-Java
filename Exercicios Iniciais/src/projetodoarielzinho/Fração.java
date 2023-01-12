package projetodoarielzinho;

public class Fração {
	public static void main(String[] args) {
		double res = 6 * (3 + 2);
		double res1FL = Math.pow(res, 2);
		double res1 = 6;
		double res1F = res1FL / res1;
		
		
		double res2 = (1 - 5) * (2 - 7) / 2;
		double res2L = Math.pow(res2, 2);
	
		double resFinal = res1F - res2L;
		double resFinalL = resFinal * resFinal * resFinal;
		double resFinDiv = resFinalL / 1000;
		
		System.out.println(resFinDiv);
	
	}
}


//25 //100