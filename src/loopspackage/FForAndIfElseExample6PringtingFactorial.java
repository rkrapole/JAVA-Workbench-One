package loopspackage;

public class FForAndIfElseExample6PringtingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int fact = 1;
		/*
		 * for (int i=5;i>=1;i--) { fact = fact*i;//5//20//60//120//120 //fact=1*5
		 * //fact=5*4 //fact=20*3 //fact=60*2 //fact=120*1
		 * 
		 * 
		 * } System.out.println("factorial value is: "+fact);
		 */
		
		fact=fact(n);
		/// fact(4)
		System.out.println(fact);
	}
	
	public static int fact(int num) {
		if (num==0) {
			return 1;
		}else {
			
			return num*fact(num-1);//****recursive method
			
			//return 4 * fact(3)
			
		}
		
		
		
	}
	

}
