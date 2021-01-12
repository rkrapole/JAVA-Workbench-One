package operaterspackage;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
	    System.out.println(!(x > 3 && x < 10));// he x is greater than 3 and less than 10 which is True and ! will reverse the result, so should print "False"
	    int y = 2;
	    System.out.println(!(y > 3 && y < 10));// he y is is not greater than 3 and is less than 10 which is False and ! will reverse the result, so should print "True"
	}

}
