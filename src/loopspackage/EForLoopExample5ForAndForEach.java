package loopspackage;

public class EForLoopExample5ForAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {1,2,3,4,5,6,7};
		
		for (int num : array1) { //for each -> advanced
		System.out.println(num);
			
		}
	
		for (int i = 0; i < array1.length; i++) { //regular 
			System.out.println(array1[i]);
		}
		
	

	}

}
