package practice;

public class PrintArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {11,13,14,17,16};
		
		System.out.println("print using for--> ");
		for (int i = 0; i <= ar1.length-1; i++) {
			System.out.println(ar1[i]);
		}
		System.out.println("print using for - in reverse --> ");
		for (int i = ar1.length-1; i >= 0; i--) {
			System.out.println(ar1[i]);
		}
		System.out.println("print using while --> ");
		int[] ar2 = {11,13,14,17,16};
		int j = 0;
		while (j <= ar2.length-1) {
			System.out.println(ar2[j]);
			j++;
		}
		System.out.println("print in while - in reverse --> ");
		int[] ar3 = {11,13,14,17,16};
		int k = ar3.length-1;
		while (k >= 0) {
			System.out.println(ar2[k]);
			k--;

	}

}
}
